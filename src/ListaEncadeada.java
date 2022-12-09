public class ListaEncadeada<Item> {

	private Node first;
	private int size;
	private Node aux;

	public ListaEncadeada() {
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
			System.out.println("Não é possível alterar nomes em uma lista vazia.");
			return;
		} else {
			aux = first;
			while (aux.getNext() != null) {
				aux = aux.getNext();
				if (aux.getName() == oldName) {
					aux.setName(newName);
					aux.setNext(null);
					return;
				}
			}
			System.out.println("O nome que se deseja alterar não faz parte da lista.");
		}
	}
	
	public void removeName(String name) {
		if(first == null) {
			return;
		}else {
			aux = first;
			if(aux.getNext() == null && aux.getName() == name) {
				first = aux.getNext();
			}else {
				Node auxTemp = new Node(null);
				auxTemp = first;
				aux = first.getNext();
				while(aux.getName() != name && aux != null) {
					aux = aux.getNext();
					auxTemp = auxTemp.getNext();
				}
				if(aux.getName() == name) {
					auxTemp.setNext(aux.getNext());
					this.size--;
				}
			}
		}
	}
	
	public String showNamesAndQuantity() {
		String nameList;
		if(first == null) {
			return "Lista vazia.";
		}else {
			nameList = "A lista possui "+size+" nomes:\n";
			aux = first;
			for(int i = 0; i < this.size; i++) {
				nameList += aux.getName()+"\n";
				aux = aux.getNext();
			}
		}
		return nameList;
	}

	public boolean checkRepeat(String name) {
		if (first == null) {
			return false;
		} else {
			aux = first;
			do {
				if (aux.getName() == name) {
					return true;
				} else {
					aux = aux.getNext();
				}
			} while (aux != null);
			return false;
		}
	}

	@Override
	public String toString() {
		return "ListaEncadeada [first=" + first + "]";
	}

}
