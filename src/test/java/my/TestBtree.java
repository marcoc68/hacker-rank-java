package my;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestBtree {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testInsertInt(){
		Btree<Integer> tree = new Btree<Integer>();
		int entrada [] = {1,4,3,6,4,8,5,2,5,20,11,40,10,25,21,32};
		int esperado[] = {1,2,3,4,4,5,5,6,8,10,11,20,21,25,32,40};
		
		// inserindo na arvore...
		for(int i : entrada){ tree.inserir(i); }
		
		// obtendo as chaves em ordem crescente...
		ArrayList<Integer> vet = tree.getKeys();
		
		// passando para o formado de array fixo...
		int calculado[] = new int[vet.size()];
		int i = 0;
		for(int key: vet) {	calculado[i++] = key; }
		
		// comparando com a asaida esperada...
//		printArray(calculado);
		assertArrayEquals( esperado, calculado);
	}
	
	private static void printArray(int arr[]) {
		for(int i: arr) { System.out.printf("%d ",i); }
		System.out.println();
	}

}
