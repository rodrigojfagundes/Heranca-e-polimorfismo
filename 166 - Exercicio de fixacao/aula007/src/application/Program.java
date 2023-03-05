package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 List<TaxPayer> list = new ArrayList<TaxPayer>();
		 
		 System.out.print("enter the number of taxpayers: ");
		 int N = sc.nextInt();
		 
		 for (int i = 1; i <= N; i ++) {
			 
			 System.out.println("Taxpayer #" + i + "data: ");
			 System.out.print("individual ou company (i/c) fisico ou juridico");
			 char type = sc.next().charAt(0);
			 System.out.print("name: ");
			 String name = sc.next();
			 System.out.print("anual income: ");
			 Double anualIncome = sc.nextDouble();
			 
			 if (type == 'i') {
			
				 System.out.print("Health expenditures: ");
				 Double healthExpenditures = sc.nextDouble();
				 list.add(new Individual(name, anualIncome, healthExpenditures));
			 }
			
			 else {
				 System.out.println("number of employees: ");
				 Integer numberOfEmployees = sc.nextInt();
				 list.add(new Company(name, anualIncome, numberOfEmployees));
			 }
		 }
		 
		 System.out.println();
		 System.out.println("TAXES PAID");
		 
		 for (TaxPayer tp : list) {
			 System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		 }
		 
		 
		 System.out.println();
		 double sum = 0.0;
		 for(TaxPayer tp : list) {
			 sum += tp.tax();
		 }
		 System.out.println("Total taxes: $ " + String.format("%.2f", sum));
		 
		 sc.close();
	}

}
