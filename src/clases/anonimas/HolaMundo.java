package clases.anonimas;

public class HolaMundo {

	interface HelloWorld {
		public void greet();
		public void greetSomeone(String someone);
	}
	
	public void sayHello() {
		
		// Clase local
		class EnglishGreeting implements HelloWorld {
			String name = "world";
			
			@Override
			public void greet() {
				greetSomeone(name);
			}

			@Override
			public void greetSomeone(String someone) {
				System.out.printf("Hello %s\n", someone);				
			}
		}
		
		HelloWorld englishGreeting = new EnglishGreeting();
		
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";
			
			@Override
			public void greet() {
				greetSomeone(name);
			}

			@Override
			public void greetSomeone(String someone) {
				System.out.printf("Salut %s\n", someone);				
			}
		};
		
		englishGreeting.greet();
		frenchGreeting.greet();
		
		new HelloWorld() {
			String name = "a to cristo";
			
			@Override
			public void greet() {
				greetSomeone(name);
			}

			@Override
			public void greetSomeone(String someone) {
				System.out.printf("Hola %s\n", someone);				
			}
		}.greet();
		
	}
	
	public static void main(String[] args) {
		new HolaMundo().sayHello();
	}
	
}
