package clases.internas;

public class MiColeccion {
	private final static int TAM = 15;
	private int[] array = new int[TAM];
	
	public MiColeccion() {
		for(int i = 0; i < TAM; i++) {
			array[i] = i;
		}
	}
	
	public void imprimirPares() {
		IteradorPares iterEven = this.new IteradorPares();
		while(iterEven.hasNext()) {
			System.out.println(iterEven.getNext() + " ");
		}
	}
	
	
	public void imprimirImpares() {
		IteradorImpares iterOdd = this.new IteradorImpares();
		while(iterOdd.hasNext()) {
			System.out.println(iterOdd.getNext() + " ");
		}
	}
	
	private class IteradorPares {
		private int siguiente = 0;
		
		public boolean hasNext() {
			return (siguiente <= TAM - 1);
		}
		
		public int getNext() {
			int val = array[siguiente];
			siguiente += 2;
			return val;
		}
	}
	
	private class IteradorImpares {
		private int siguiente = 1;
		
		public boolean hasNext() {
			return (siguiente <= TAM - 1);
		}
		
		public int getNext() {
			int val = array[siguiente];
			siguiente += 2;
			return val;
		}
	}
}
