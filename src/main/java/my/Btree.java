package my;

import java.util.ArrayList;

public class Btree<T extends Comparable<T>>{

//	public static void main(String[] args) {
//		Btree tree = new Btree();
//		int values[] = {1,4,3,6,4,8,5,2,5, 20, 11, 40, 10, 25, 21, 32};
//		
//		// inserindo na arvore...
//		for(int i : values){
//			tree.inserir(i);
//		}
//		
//		// passeando pela arvore
//		tree.passearEmOrdem();
//	}
	
	private No<T> root;
	private int size = 0;
	
	public Btree() { root = new No<T>(); }
	public void inserir(T key) { root.inserir(key); size++;}
	public void passearEmOrdem() {root.passearEmOrdem();}
	public String toString() { return root.toString(); }
	public ArrayList<T> getKeys() { 
		ArrayList<T> keys = new ArrayList<T>();
		root.getKeys(keys);
		return keys;
	}
}

class No<T extends Comparable<T>>{
	private No<T> pai;
	private No<T> esq;
	private No<T> dir;
	private T key;
	private int depth;
	
	public No(T key, No<T> pai){ this.key=key; this.pai=pai; this.depth=pai.depth+1;}
	public No() {}
	
	public String toString() {return key.toString();}

	// inserindo um nó...
	public void inserir(T key){
		if(this.key == null){
			this.key = key;
			this.depth = 0;
//			System.err.println(key + " é o nó raiz");
			return;
		}
		
		if(key.compareTo(this.key) < 0){
			if(esq == null) {
				esq = new No<T>(key, this );
//				System.err.println(key + " inserido a esquerda de " + this + " profundidade=" + esq.depth );
				return;
			}
			esq.inserir(key);
		}else{
			if(dir == null){
				dir = new No<T>(key, this);
//				System.err.println(key + " inserido a direita de " + this  + " profundidade=" + dir.depth);
				return;
			}
			dir.inserir(key);
		}
	}

	// passeando em ordem...
	public void passearEmOrdem() {
		if( esq != null ) esq.passearEmOrdem();
		visitar();
		if( dir != null ) dir.passearEmOrdem();
	}
	
	// fazendo um processamento com o dado do nó...
	private void visitar() { System.out.printf("%d ",key); }

    // passa as chaves da arvore oara array, em ordem crescente... 
	public void getKeys(ArrayList<T> keys) {
		if( esq != null ) esq.getKeys(keys);
		keys.add(key);
		if( dir != null ) dir.getKeys(keys);
	}
}

