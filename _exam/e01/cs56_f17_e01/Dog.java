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

    public static void main(String [] args) {

	Dog d1 = new Dog("Alf");
	Dog d2 = new Dog("Bella");
	Dog d3 = new Dog("Charlie");
	Dog d4 = new Dog("Davy");
	Dog d5 = d3;   gc(22);    
	
	setBestInShow(d1);       gc(24);    
	d2 = d3;                 gc(25);                   
	d4 = d5;                 gc(26);                   
	d1 = null;               gc(27);                 
	d2 = null;               gc(28);
 	d3 = null;               gc(29);
 	d4 = null;               gc(30);
	setBestInShow(null);	 gc(31);
	d5 = null;               gc(32);
    }                              

    public static void gc(int ln) {
    	   System.out.println("line: " + ln);
	   System.gc(); System.runFinalization();
 	   System.gc(); System.runFinalization();	
     // ... encourage garbage collection
     
    }     

    public void finalize() { System.out.println(this.name); }
	
}
