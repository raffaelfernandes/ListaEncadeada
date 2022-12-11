import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteLinkedList {

	@Test
	public void testaAddFirst() {

		LinkedList<String> lista = new LinkedList<>();

		lista.addFirst("João");
		lista.addLast("Maria");
		lista.addLast("Pedro");
		assertEquals(3, lista.getSize());
		//System.out.println(lista);
	}

	@Test
	public void testaAddLast() {
		LinkedList<String> lista2 = new LinkedList<>();

		lista2.addLast("Teresa");

	}

	@Test
	public void testaCheckRepeat() {
		LinkedList<String> lista = new LinkedList<>();
		lista.checkRepeat("Mara");
		lista.addFirst("Mara");
		lista.addFirst("Julia");
		lista.checkRepeat("Mara");
		lista.checkRepeat("Tadeu");
		//System.out.println(lista);
	}

	@Test
	public void testaChangeName() {
		LinkedList<String> lista = new LinkedList<>();
		lista.changeName("Pietro", "Raffael");
		lista.addFirst("Juliana");
		lista.addLast("Mauro");
		lista.addLast("Raffael");
		lista.changeName("Ian", "Juliana");
		lista.changeName("Pietro", "Raffael");
		lista.changeName("Claudio", "Yve");
		System.out.println(lista);
		 
	}
	
	@Test
	public void testaRemoveName() {
		LinkedList<String> lista = new LinkedList<>();
		lista.removeName("Marcos");
		lista.addFirst("Marcos");
		lista.addFirst("Júlia");
		lista.addLast("Donatela");
		lista.removeName("Marcos");
		System.out.println(lista);
		
		LinkedList<String> lista2 = new LinkedList<>();
		lista2.addFirst("Marcos");
		lista2.removeName("Marcos");
		System.out.println(lista2);
		
		LinkedList<String> lista3 = new LinkedList<>();
		lista3.addFirst("Gael");
		lista3.addFirst("Felipe");
		lista3.addFirst("Laura");
		lista3.addFirst("Valéria");
		lista3.removeName("Felipe");
		System.out.println(lista3);
		
		LinkedList<String> lista4 = new LinkedList<>();
		lista4.addFirst("Gael");
		lista4.removeName("Gael");
		
		LinkedList<String> lista5 = new LinkedList<>();
		lista5.addFirst("Gael");
		lista5.removeName("Marcos");
		
		LinkedList<String> lista6 = new LinkedList<>();
		lista6.addFirst("Gael");
		lista6.addFirst("Henrique");
		lista6.removeName("Marcos");
		System.out.println(lista6.showNamesAndQuantity());
	}
	
	@Test
	public void TestaShowNamesAndQuantity() {
		LinkedList<String> lista7 = new LinkedList<>();
		lista7.addFirst("Aabrão");
		lista7.addFirst("Marcelo");
		lista7.addFirst("Antônia");
		lista7.addLast("Tony");
		System.out.println(lista7.showNamesAndQuantity());
		
		LinkedList<String> lista8 = new LinkedList<>();
		System.out.println(lista8.showNamesAndQuantity());
	}
	
	@Test
	public void testeDaMain() {
		LinkedList<String> list = new LinkedList<>();
		list.addLast("Pedro");
		System.out.println(list.showNamesAndQuantity());
		list.removeName("Pedro");
		list.addFirst("Hael");
		list.addLast("Pedro");
		list.changeName("Jota", "Hael");
		list.removeName("Jota");
		System.out.println(list.showNamesAndQuantity());
	}

}