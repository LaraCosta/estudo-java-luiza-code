//Larissa Rodrigues 20/04
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3;
        int  num_faltas;
        
        System.out.println("Insira a primeira nota do aluno: ");
        nota1 = sc.nextFloat();
        
       
        System.out.println("Insira a segunda nota do aluno: ");
        nota2 = sc.nextFloat();
        
        
        System.out.println("Insira a terceira nota do aluno: ");
        nota3 = sc.nextFloat();
        
        System.out.println("Insira o numero de faltas do aluno: ");
        num_faltas = sc.nextInt();
        
        double media = (nota1+nota2+nota3)/3.0;
        
        if (num_faltas > (68*0.25)) {
        
        	System.out.println("Reprovado por falta "); 
        }
        else {
        	
        		if (media <7.0) {
            	
            	System.out.printf("Reprovado por nota %.1f ", media); // Método printf especifica o formato dos dados e a qunt de casas %.1f (float com 1 casa dec de precisão) 
            	}
        	
        		else {
        		System.out.printf("Aprovado %.1f " , media);}
        	}
        
        
}

        	  

        
        
        
}