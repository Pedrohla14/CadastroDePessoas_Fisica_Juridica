/*Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
bem como o total de imposto arrecadado.
Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
seguintes:
Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
destes gastos são abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
fica: (50000 * 25%) - (2000 * 50%) = 11500.00
Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00*/

package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import etities.Fisica;
import etities.Juridica;
import etities.Pessoa;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		List<Pessoa> list= new ArrayList<Pessoa>();
	
		
		System.out.println("Enter the number of tax payers:");
		int n =sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.printf("Tax payer #%d data:",i);
			
			System.out.println("Individual or company (i/c)?");
			char tipo= sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("name:");
			String nome= sc.nextLine();
			
			System.out.print("Anual income:");
			Double rendaAnual=sc.nextDouble();
			
			if(tipo=='i') {
				System.out.print("Health expenditures: ");
				Double gastoSaude= sc.nextDouble();
				Pessoa pessoa= new Fisica(nome, rendaAnual,gastoSaude);
				list.add(pessoa);
			}
			else if(tipo=='c') {
				System.out.print("Number of employees:");
				int numFuncionarios =sc.nextInt();
				Pessoa pessoa= new Juridica(nome, rendaAnual, numFuncionarios);
				list.add(pessoa);
			}
	
		}
		
		//imprimir 
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Pessoa pessoa: list) {
			System.out.printf("%s : $ %.2f %n",pessoa.getNome(),pessoa.imposto());
		}
		
	// somando os impostos 
		double taxes=0.0;
		for(Pessoa pessoa: list) {
			taxes+= pessoa.imposto();
			
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f",taxes);
		
		
		
		
		
		
		sc.close();

	}

}
