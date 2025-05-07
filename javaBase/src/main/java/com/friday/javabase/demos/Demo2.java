package com.friday.javabase.demos;

import com.friday.javabase.common.BankAccount;

/**
 * @author Friday
 * @description: 设计一个完整的银行账户类，要求体现类和对象的完整使用方法
 * 具体要求如下：
 * 创建一个BankAccount类，包含成员变量：accountNumber(账户号)、ownerName(户主姓名)、balance(余额)
 * 为BankAccount类定义下列成员方法：
 * deposit(double amount): 存款方法，增加余额
 * withdraw(double amount): 取款方法，减少余额，需检查余额是否充足
 * transfer(BankAccount target, double amount): 转账方法，向另一个账户转账
 * getAccountInfo(): 获取账户信息
 * 在main方法中创建多个BankAccount对象，测试转账、存款、取款功能
 * @date 2025/5/7 20:10
 */
public class Demo2 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1001, "张三", 4888.88);
        BankAccount b2 = new BankAccount(1002, "李四", 18888);
        BankAccount b3 = new BankAccount(1003, "王五", 8888);
        BankAccount b4 = new BankAccount(1004, "陈六", 12888);
        //1.测试转账：
        //转账之前
        b1.getAccountInfo();//账号号：1001 户主姓名：张三 余额：4888.88
        b2.getAccountInfo();//账号号：1002 户主姓名：李四 余额：18888.0
        b1.transfer(b2,2000);//向李四账号转账2000元
        //转账之后
        b1.getAccountInfo();//账号号：1001 户主姓名：张三 余额：2888.88
        b2.getAccountInfo();//账号号：1002 户主姓名：李四 余额：20888.0
        //2.测试存款
        b3.getAccountInfo();//账号号：1003 户主姓名：王五 余额：8888.0
        b3.deposit(3000);
        b3.getAccountInfo();//账号号：1003 户主姓名：王五 余额：11888.0
        //3.测试取款
        b4.getAccountInfo();;//账号号：1004 户主姓名：陈六 余额：12888.0
        b4.withdraw(3800);
        b4.getAccountInfo();//账号号：1004 户主姓名：陈六 余额：9088.0
    }
}
