package br.com.gamaaula.aulas;

import java.util.Scanner;
public class Menu {


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Conta conta = new Conta();


            double  valor;

                System.out.println("===================================================");
                System.out.println("Seja bem vindo ao Sistema Bancário");
                System.out.println("---------------------------------------------------");

            int operacao;
            do{
                System.out.println("----- * Menu * -----");
                System.out.println("1- Consultar Saldo");
                System.out.println("2- Depositar");
                System.out.println("3- Sacar");
                System.out.println("0 - Sair ---------------------------");
                operacao = sc.nextInt();
                switch(operacao){

                    case 0:
                        break;

                    case 1 :
                        conta.mostrardados();
                        conta.mostrarsaldo();
                        break;
                    case 2 :
                        System.out.println("Entre com o valor a ser depositado: ");
                        valor = sc.nextDouble();
                        conta.depositar(valor);
                        break;

                    case 3 :
                        conta.mostrarsaldo();
                        System.out.println("Valor a ser sacado: ");
                        valor = sc.nextDouble();
                        conta.sacar(valor);
                        break;

                }
            }while(operacao != 0);
        }
    }




