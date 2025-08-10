package valid_Idade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade;
		Pessoa pessoa = new Pessoa();
		
		System.out.println("DIGITE SEU NOME:");
		String nome = sc.nextLine();
		System.out.println("AGORA DIGITE A SUA IDADE:");
		idade = sc.nextInt();
		
		while (idade < 1) {
			System.out.println("Valor incorreto, insira um valor acima de 0");
			System.out.println("AGORA DIGITE A SUA IDADE:");
			idade = sc.nextInt();
		}
		
		String nomeMaiusculo = nome.substring(0, 1).toUpperCase() + nome.substring(1);
		
		pessoa.setIdade(idade);
		pessoa.setNome(nomeMaiusculo);
		System.out.println("Seu nome é " + pessoa.getNome() + " e você tem " + pessoa.getIdade() + " Ano(s)");
		
		sc.close();
	}
}