package de.ait.homework48;

public class Mainrun {
    public static void main(String[] args) {
        BankAccount bk=new BankAccount("zuz777",
                "Mueller",1000.0);
        System.out.println(bk.getBalance());
        bk.withdrawal(1200.00);

    }
}
