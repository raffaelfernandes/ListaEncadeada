import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteLinkedList {

	@Test
	public void testaAddFirst() {

		ListaEncadeada<String> lista = new ListaEncadeada<>();

		lista.addFirst("João");
		lista.addLast("Maria");
		lista.addLast("Pedro");
		assertEquals(3, lista.getSize());
		//System.out.println(lista);
	}

	@Test
	public void testaAddLast() {
		ListaEncadeada<String> lista2 = new ListaEncadeada<>();

		lista2.addLast("Teresa");

	}

	@Test
	public void testaCheckRepeat() {
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		lista.checkRepeat("Mara");
		lista.addFirst("Mara");
		lista.addFirst("Julia");
		lista.checkRepeat("Mara");
		lista.checkRepeat("Tadeu");
		//System.out.println(lista);
	}

	@Test
	public void testaChangeName() {
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		lista.changeName("Kauã", "Ana");
		lista.addLast("Teresa");
		lista.addFirst("Marcos");
		//System.out.println(lista);
		lista.changeName("Dony", "Bruna");
		if (lista.checkRepeat("Teresa")) {
			lista.changeName("Tiago", "Teresa");
			if (lista.checkRepeat("João") == false) {
				lista.addFirst("João");
			}
		}
		//System.out.println(lista);
		/*
		 * lista.checkRepeat("Teresa"); lista.changeName("Teresa", "João");
		 * System.out.println(lista); }
		 */
	}
	
	@Test
	public void testaRemoveName() {
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		lista.removeName("Marcos");
		lista.addFirst("Marcos");
		lista.addFirst("Júlia");
		lista.addLast("Donatela");
		lista.removeName("Marcos");
		System.out.println(lista);
		
		ListaEncadeada<String> lista2 = new ListaEncadeada<>();
		lista2.addFirst("Marcos");
		lista2.removeName("Marcos");
		System.out.println(lista2);
		
		ListaEncadeada<String> lista3 = new ListaEncadeada<>();
		lista3.addFirst("Gael");
		lista3.addFirst("Felipe");
		lista3.addFirst("Laura");
		lista3.addFirst("Valéria");
		lista3.removeName("Felipe");
		System.out.println(lista3);
	}
	
	@Test
	public void TestaShowNamesAndQuantity() {
		ListaEncadeada<String> lista4 = new ListaEncadeada<>();
		lista4.addFirst("Aabrão");
		lista4.addFirst("Marcelo");
		lista4.addFirst("Antônia");
		lista4.addLast("Tony");
		System.out.println(lista4.showNamesAndQuantity());
	}

}