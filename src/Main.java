import java.util.Scanner;

public class Main {

	final static String menu = "\nSelecione uma das seguintes opções:\n\n" + "1. Inserir nome no início da lista\n"
			+ "2. Inserir nome no final da lista\n" + "3. Alterar nome na lista\n" + "4. Excluir nome da lista\n"
			+ "5. Exibir todos os nomes da lista\n" + "6 (ou outro valor). Sair da aplicação\n";

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int opc = 1;
		while (opc < 6 && opc > 0) {
			System.out.println(menu);
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1: {
				System.out.print("\nDigite um nome para inserir no início da lista: ");
				String name = sc.nextLine();
				if (!list.checkRepeat(name)) {
					list.addFirst(name);
				} else {
					System.out.println("Não é possível inserir um nome repetido na lista.");
				}
				break;
			}
			case 2: {
				System.out.print("\nDigite um nome para inserir no final da lista: ");
				String name = sc.nextLine();
				if (!list.checkRepeat(name)) {
					list.addLast(name);
				} else {
					System.out.println("Não é possível inserir um nome repetido na lista.");
				}
				break;
			}
			case 3: {
				System.out.print("\nDigite o antigo nome da lista que deseja alterar: ");
				String oldName = sc.nextLine();
				System.out.print("Digite o novo nome da lista que deseja alterar: ");
				String newName = sc.nextLine();
				list.changeName(newName, oldName);
				break;
			}
			case 4: {
				System.out.print("\nDigite o nome que deseja excluir da lista: ");
				String name = sc.nextLine();
				list.removeName(name);
				break;
			}
			case 5: {
				System.out.print(list.showNamesAndQuantity());
				break;
			}
			default:
				return;
			}
		}
		sc.close();
	}

}
