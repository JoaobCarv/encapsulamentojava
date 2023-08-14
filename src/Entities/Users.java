package Entities;

public class Users {

    private String name;
    private int userNumber;
    private double balance;

    public Users (String name, int userNumber,double initialDeposit) {
        this.name = name;
        this.userNumber = userNumber;
        depositar(initialDeposit);
    }
    public Users (String name, int userNumber) {
        this.name = name;
        this.userNumber = userNumber;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void depositar (double balance) {
        this.balance += balance;
    }

    public void sacar (double balance) {
        if (this.balance>balance){
            this.balance -= balance + 5;
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public String toString() {
        return "Nome: " + name +
                "\nNúmero da conta: " + userNumber +
                String.format("\nSaldo: %.2f",balance);
    }
}
