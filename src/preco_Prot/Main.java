package preco_Prot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Selecione o produto que irá comprar: Shape de marfim [1] (150R$) - Shape de maple [2] (300R$) - Trucks [3] (200R$) - Rodas [4] (175R$)  ");
		System.out.println("Você tem direito à um desconto de 30% em sua primeira compra.");
		int opcoes = sc.nextInt();
		double porcentagem = 30;
		double valor;
			
		// obj 1
		Produto marfim = new Produto();
		marfim.setPreco(150);

		// obj 2
		Produto maple = new Produto();
		maple.setPreco(300);

		// obj 3
		Produto truck = new Produto();
		truck.setPreco(200);

		// obj 4
		Produto rodas = new Produto();
		rodas.setPreco(175);

		switch (opcoes) {
		case 1:
			valor = porcentagem / 100 * marfim.getPreco();
			System.out.println("Você irá comprar o Shape de marfim. O total do seu shape com desconto será de: "
					+ (marfim.getPreco() - valor));
			break;
		case 2:
			valor = porcentagem / 100 * maple.getPreco();
			System.out.println("Você irá comprar o Shape de maple. O total do seu shape com desconto será de: "
					+ (maple.getPreco() - valor));
			break;
		case 3:
			valor = porcentagem / 100 * truck.getPreco();
			System.out.println("Você irá comprar os Trucks. O total do seus Trucks com desconto será de: "
					+ (truck.getPreco() - valor));
			break;
		case 4:
			valor = porcentagem / 100 * rodas.getPreco();
			System.out.println("Você irá comprar as Rodas. O total das suas rodas com desconto será de: "
					+ (rodas.getPreco() - valor));
			break;
			default:
				System.out.println("Valor Inválido, Utilize um dos números listados para escolher o produto desejado. (Reinicie o programa)");
		}
		sc.close();
	}
	
}
