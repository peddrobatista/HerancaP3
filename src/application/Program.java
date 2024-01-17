package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.getDefault());
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Digite o numero de produtos: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do produto #" + i + ":");
			System.out.print("Comum, usado, importado (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			if (type == 'c') {
				list.add(new Produto(name, price));
			}
			else if (type == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new ProdutoUsado(name, price, date));
			}
			else {
				System.out.print("Taxa de importação: ");
				double customsFee = sc.nextDouble();
				list.add(new ProdutoImportado(name, price, customsFee));
			}
		}

		System.out.println();
		System.out.println("ETIQUETAS DE PREÇO:");
		for (Produto prod : list) {
			System.out.println(prod.etiqueta());
		}
		
		sc.close();
	}

}
