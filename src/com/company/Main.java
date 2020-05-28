package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "еинещбоос еонаворфишаз ьтыб онжлод туТ";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nЗашифрованое сообщение: " + str);
        System.out.println("Разшифрованое сообщение: " + reverse);
    }
}
