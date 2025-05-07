package com.friday.javabase.demos;

import java.util.concurrent.Semaphore;

/**
 * @author Friday
 * @description: 使用Semaphore控制资源并发访问
 * 模拟停车场系统，10辆车竞争5个停车位（Semaphore限制为5）
 * 每辆车停1秒后离开，观察信号量如何控制并发
 * @date 2025/5/7 19:45
 */
public class Demo1 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5); //5个停车位
        for (int i = 1; i <= 10; i++) {
            new Thread(()->{
                try {
                    semaphore.acquire();//获取车位
                    System.out.println(Thread.currentThread().getName()+"停车中,剩余车位："+semaphore.availablePermits());
                    Thread.sleep(800);
                    System.out.println(Thread.currentThread().getName()+"离开，释放车位");
                    semaphore.release();//释放车位
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            },"汽车"+i).start();
        }
    }
}
