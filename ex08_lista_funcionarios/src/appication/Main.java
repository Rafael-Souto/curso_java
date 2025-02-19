package appication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

//Programa para calcular o almento de um funcion�rio
public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>(); //Instancia��o da lista
				
		System.out.print("How many employees will be registered? ");
		int func = sc.nextInt();
		
//La�o de repeti��o for para entrada  e armazenamento dos dados dos funcion�rios		
		for (int i = 1; i <= func; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
//La�o de repeti��o while para garantir que seja digitado um "Id" diferente dos que j� existem			
			while (hasId(list, id)) {
				System.out.println("Id Already taken.Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
				
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
//Teste l�gico para almento de sal�rio do funcion�rio		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double almento = sc.nextDouble(); 
			
			emp.increaseSalary(almento);
		}
		
		System.out.println("\nList of employees: ");
		
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}