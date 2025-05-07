package com.friday.javabase.common;

/**
 * @author Friday
 * @description: TODO
 * @date 2025/5/7 20:11
 */
public class BankAccount {
    public int accountNumber;
    public String ownerName;
    public double balance;

    public BankAccount(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存款方法
    public void deposit(double amount){
        setBalance(amount+getBalance());
    }
    //取款方法
    public void withdraw(double amount){
        setBalance(getBalance()-amount);
    }
    //转账方法
    public void transfer(BankAccount target,double amount){
        //当前账号需要减少金额
        setBalance(getBalance()-amount);
        //目标账号需要增加金额
        target.setBalance(target.getBalance()+amount);
    }
    //获取账户信息
    public void getAccountInfo(){
        System.out.println("账号号："+accountNumber+" 户主姓名："+ownerName+" 余额："+balance);
    }


}
