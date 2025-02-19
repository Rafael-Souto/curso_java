package application;

import java.util.Scanner;

//Programa para criar uma matriz e localizar os n�meros na diagonal e a quantidade de n�meros negativos
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //Escolha do usu�rio no tamanho da matriz
		int [][] mat = new int [n] [n]; //Declara��o da Matriz
		
//La�o de repeti��o for duplo para percorrer as linhas e colunas vazias e permitir que o usu�rio insira valores		
		for (int i = 0; i < mat.length; i++) { //Percorre as linhas
			for (int j = 0; j < mat[i].length; j++) { //Percorre as colunas
				mat[i][j] = sc.nextInt(); //Entrada dos valores pelo usu�rio
			}
		}
		
		System.out.println("Main diagonal: ");

//La�o de repeti��o for para localizar  e imprimir os valores armazenados na diagonal principal		
		for (int i = 0; i < mat.length; i++) { //Percorre as linhas
			System.out.print(mat[i][i] + " "); //Imprime os valores na diagonal principal
		}
		
		System.out.println();
		
		int count = 0;

//La�o de repeti��o for para percorrer as linhas e colunas 		
		for (int i = 0; i < mat.length; i++) { //Percorre as linhas
			for (int j = 0; j < mat[i].length; j++) { //Percorre as colunas
				
//Condi��o if para buscar os numeros negativos
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
	
		System.out.println("Negative numbres = " + count); //Imprime os n�meros negativos na tela	
		
		sc.close();
	}
}