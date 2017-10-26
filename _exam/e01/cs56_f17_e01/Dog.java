public class Dog {

    private static Dog bestInShow = null;
    private String name;

    public static void setBestInShow(Dog b) {
	bestInShow = b;
    }

    public static Dog getBestInShow() {
	return bestInShow;
    }

    public Dog(String name) { this.name = name;}

    public void finalize() { System.out.println(this.name); }

    public static void main(String [] args) {

	Dog d1 = new Dog("Alf");
	Dog d2 = new Dog("Bella");
	Dog d3 = new Dog("Charlie");
	Dog d4 = new Dog("Davy");
	Dog d5 = d3;
	
	setBestInShow(d1);       gc(35);    
	d2 = d3;                 gc(36);                   
	d4 = d5;                 gc(37);                   
	d1 = null;               gc(38);                 
	d2 = null;               gc(39);
 	d3 = null;               gc(40);
 	d4 = null;               gc(41);
	setBestInShow(null);	 gc(42);
	d5 = null;               gc(43);
    }                              

    public static void gc(int ln) {
    	   System.out.println("line: " + ln);
	   System.gc(); System.runFinalization();
 	   System.gc(); System.runFinalization();	
     // ... encourage garbage collection
     
    }     

}
