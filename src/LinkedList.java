public class LinkedList<Item> {

	private Node first;
	private int size;
	private Node aux;
	private Node auxCheckRepeat;

	public LinkedList() {
		first = null;
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public void addFirst(String name) {
		if (first == null) {
			Node newNode = new Node(name, null);
			first = newNode;
		} else {
			Node newNode = new Node(name);
			newNode.setNext(first);
			first = newNode;
		}
		this.size++;
	}

	public void addLast(String name) {
		Node newNode = new Node(name);
		if (first == null) {
			addFirst(name);
			return;
		} else {
			aux = first;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(newNode);
		}
		newNode.setNext(null);
		this.size++;
	}

	public void changeName(String newName, String oldName) {
		if (first == null) {
			System.out.println("\nNão é possível alterar nomes em uma lista vazia.");
			return;
		} else {
			aux = first;
			while (aux != null) {
				if (aux.getName().equals(oldName)) {
					if (!checkRepeat(newName)) {
						aux.setName(newName);
						return;
					}else {
						System.out.println("\nNão é possível alterar o nome para um nome já existente na lista.");
						return;
					}
				}
				aux = aux.getNext();
			}
			System.out.println("\nErro. O nome que se deseja alterar não faz parte da lista.");
		}
	}

	public void removeName(String name) {
		if (first == null) {
			System.out.println("\nNão é possível remover nomes de uma lista vazia.");
			return;
		} else {
			aux = first;
			if (aux.getNext() == null && aux.getName().equals(name)) {
				first = aux.getNext();
				this.size--;
				return;
			} else {
				if (aux.getNext() == null) {
					System.out.println("\nErro. Não é possível remover um nome inexistente na lista.");
					return;
				} else {
					Node auxTemp = new Node(null);
					auxTemp = first;
					aux = first.getNext();
					if (auxTemp.getName().equals(name)) {
						first = aux;
						this.size--;
						return;
					} else {
						while (!(aux.getName().equals(name)) && aux.getNext() != null) {
							aux = aux.getNext();
							auxTemp = auxTemp.getNext();
						}
						if (aux.getName().equals(name)) {
							auxTemp.setNext(aux.getNext());
							this.size--;
							return;
						} else {
							System.out.println("\nErro. Não é possível remover um nome inexistente na lista.");
							return;
						}
					}
				}
			}
		}
	}

	public String showNamesAndQuantity() {
		String nameList;
		if (first == null) {
			return "Lista vazia.\n";
		} else {
			nameList = "\nA lista possui " + size + " nome(s):\n";
			aux = first;
			for (int i = 0; i < this.size; i++) {
				nameList += aux.getName() + "\n";
				aux = aux.getNext();
			}
		}
		return nameList;
	}

	public boolean checkRepeat(String name) {
		if (first == null) {
			return false;
		} else {
			auxCheckRepeat = first;
			do {
				if (auxCheckRepeat.getName().equals(name)) {
					return true;
				} else {
					auxCheckRepeat = auxCheckRepeat.getNext();
				}
			} while (auxCheckRepeat != null);
			return false;
		}
	}

	/*@Override
	public String toString() {
		return "ListaEncadeada [first=" + first + "]";
	}*/

}
