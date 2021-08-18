package clases.anidadas;

public class Externa {

	private int n;
	
	public Externa(int n) {		
		this.n = n;
	}

	/**
	 * @return the n
	 */
	public int getN() {
		return n;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(int n) {
		this.n = n;
	}
	
	public class Anidada {
		private String s;
		
		public Anidada(String s) {
			this.s = s;
		}

		/**
		 * @return the s
		 */
		public String getS() {
			return s;
		}

		/**
		 * @param s the s to set
		 */
		public void setS(String s) {
			this.s = s;
		}
		
		// Como clase anidada, puede acceder a los atributos de la clase externa
		
		/**
		 * @return the n
		 */
		public int getN() {
			return n;
		}
	}
	
	public static class AnidadaEstatica {
		private String str;
		
		public AnidadaEstatica(String s) {
			this.str = s;
		}

		/**
		 * @return the s
		 */
		public String getStr() {
			return str;
		}

		/**
		 * @param s the s to set
		 */
		public void setStr(String s) {
			this.str = s;
		}
		
		// Solo puedo acceder a variables estaticas de la clase externa
		
		/**
		 * @return the n
		 */
//		public int getN() {
//			return n;
//		}
	}
	
}