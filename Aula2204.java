//Exercicio aula 24/04 5-11; 3 e 4 foram feitos testes de mesa.

import java.util.Scanner;

//5)

//public class Aula2204 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		
//		System.out.println("Insira um numero: ");
//       num = sc.nextInt();
//       System.out.println("o antecessor de : "+ num +" é:" + (num-1));
//	
//	}
//}

//6)

//public class Aula2204 {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	float base, altura;
//	
//	System.out.println("Insira a base: ");
//    base = sc.nextFloat();
//    
//    System.out.println("Insira a altura: ");
//    altura = sc.nextFloat();
//   
//   
//   
//   System.out.println("o perimetro é: " +base*altura);
//
//}
//}

//7)

//public class Aula2204 {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int ano, mes, dias, idade;
//	
//	System.out.println("Insira quantos anos você tem:: ");
//    ano = sc.nextInt();
//    
//    System.out.println("Insira quantos meses: ");
//    mes= sc.nextInt();
//   
//    System.out.println("Insira quantos dias: ");
//    dias = sc.nextInt();
//   
//   idade= ((ano*365)+ (mes*30)+dias);
//   System.out.println("O seu total de dias é: " + idade);
//
//}
//}
//



//8)

//public class Aula2204 {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int qntEleitores, vtBrancos, vtNulos, vtValidos;
//	double percentual;
//	
//	System.out.println("Insira o numero de eleitores do municipio: ");
//	qntEleitores = sc.nextInt();
//    
//    System.out.println("Insira o numero de votos Brancos: ");
//    vtBrancos= sc.nextInt();
//   
//    System.out.println("Insira o numero de votos Nulos: ");
//    vtNulos = sc.nextInt();
//    
//    System.out.println("Insira o numero de votos Válidos: ");
//    vtValidos = sc.nextInt();
//   
//    percentual= ((float)vtBrancos/(float)qntEleitores)*100 ;
//    
//   System.out.printf("O percentual de votos Brancos é %.2f ", percentual);
//   System.out.println("%");
//   percentual= ((float)vtNulos/(float)qntEleitores)*100 ;
//   System.out.printf("O percentual de votos Nulos é %.2f",percentual );
//   System.out.println("%");
//   percentual= ((float)vtValidos/(float)qntEleitores)*100 ;
//   System.out.printf("O percentual de votos Válidos é %.2f", percentual);
//   System.out.println("%");
//  
//
//}
//}



//9)

//public class Aula2204 {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	double salario, percentual;
//	
//	System.out.println("Insira o salario atual:: ");
//	salario = sc.nextDouble();
//  
//	System.out.println("Insira o percentual de ajuste: ");
//	percentual= sc.nextDouble();
// 
// System.out.printf("O novo sálario é %.2f: " , (salario+(salario*(percentual/100))));
//
//}
//}

//10)

//public class Aula2204 {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		double custo_fabrica;
//		
//		System.out.println("Insira o custo de fabrica: ");
//		custo_fabrica = sc.nextDouble();
//		
//		System.out.printf("O custo final ao consumidor é: %.2f: " , (custo_fabrica +(custo_fabrica * 0.28) + (custo_fabrica * 0.45)));
//	 
//
//}
//}

//11)

public class Aula2204 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double salario_fixo,comissao_fixa,valor_total_vendas,salario_total;
	int numero_carros;
	System.out.println("Insira o número de carros vendido: ");
	numero_carros = sc.nextInt();

	System.out.println("Insira o valor total das vendas: ");
	valor_total_vendas= sc.nextDouble();

	System.out.println("Insira o slário fixo: ");
	salario_fixo= sc.nextDouble();
	
	System.out.println("Insira o valor da comissão fixa para cada carro vendido: ");
	comissao_fixa= sc.nextDouble();

	salario_total = (salario_fixo+ (comissao_fixa*numero_carros)+(0.05*valor_total_vendas));

System.out.printf("O novo sálario é %.2f: " , salario_total);

}
}

