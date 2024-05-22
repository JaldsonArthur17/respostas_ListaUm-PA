caixa magica
import java.util.scanner;
import.java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	ArrayList<String> caixaMagica = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	while (true) {
	System.out.println("<<<<< ESCOLHA UMA DAS OPCOES ABAIXO >>>>> \n");
	System.out.println("1- adicionar um item ");
	System.out.println("2- remover um item ");
	System.out.println("3- listar os itens ");
	System.out.println("4- procurar um item especifico ");
	System.out.println("5- sair ");
	int escolha = scanner.nextInt();
	scanner.nextLine();

	switch (escolha) {
		case 1:
			System.out.println("\n insira o nome do item: ");
			String adItem = scanner.nextLine();
			caixaMagica.add(adItem);
			System.out.println("o item foi armazenado.");	
			break;
		case 2:
			System.out.println("\n insira o nome do item a ser removido: ");
			String remItem = scanner.nextLine();
			caixaMagica.add(remItem);
			System.out.println("o item foi removido.");	
			break;
		case 3:
			System.out.println("\n exibindo itens armazenados. ");
			for (String item : caixaMagica) {
				System.out.println(item);
			}
			break;
		case 4:
			System.out.println("\n insira o nome do item a ser localizado ");
			String procItem = scanner.nextLine();
			if (caixaMagica.contains(procItem)) {
				System.out.println("o item foi localizado.");
			} else {
				System.out.println("o item nao foi localizado.");
			}
			break;
		case 5:
			System.out.println("saindo.");
			System.exit(1);
			break;
		default:
			System.out.println("\n opcao invalida.");
			break;

			}
		}
	}
}
