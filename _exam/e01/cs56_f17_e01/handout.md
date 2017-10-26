---
layout: examHandoutNoName
num: e01
ready: true
desc: "Midterm Exam E01 Handout"
exam_date: 2017-10-26 09:30:00.00-7
---

## `Dog.java`

{% highlight java linenos %}
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
	Dog d5 = d3;
	
	setBestInShow(d1);       gc();    
	d2 = d3;                 gc();                   
	d4 = d5;                 gc();                   
	d1 = null;               gc();                 
	d2 = null;               gc();
 	d3 = null;               gc();
 	d4 = null;               gc();
	setBestInShow(null);	 gc();
    }                              

    public static void gc(int ln) {
      // ... encourage garbage collection
    }     

}
{% endhighlight %}
