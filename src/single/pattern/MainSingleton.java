package single.pattern;

public class MainSingleton {

	public static void main(String[] args) {
		Singleton s= Singleton.getInstance();		
		Singleton h= Singleton.getInstance();
		
		h.setName( "coucou");
		System.out.println(h.getName());
		System.out.println(s.getName());
		
		s.setName( "nounou");
		System.out.println(h.getName());
		System.out.println(s.getName());

	}

}
