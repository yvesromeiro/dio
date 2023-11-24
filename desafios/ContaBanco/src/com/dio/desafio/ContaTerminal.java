package com.dio.desafio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Ola Seja Bem-Vindo ao Banco Digital Y !");
        System.out.println("Agora vamos criar suas contas com algumas informacoes:");

        System.out.println("Por favor, digite seu Nome:");
        String nome = sc.next();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o saldo da Conta:");
        float saldo = sc.nextFloat();

        System.out.println("==================Processando=================");

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
