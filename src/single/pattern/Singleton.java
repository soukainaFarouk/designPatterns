package single.pattern;

public final class Singleton {
	private static Singleton singleton = new Singleton( );
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Singleton(){
	}
	public static Singleton getInstance(){
		return singleton;
        }
       
	 protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }
}
