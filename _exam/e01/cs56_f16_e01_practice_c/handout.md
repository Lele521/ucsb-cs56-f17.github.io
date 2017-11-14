---
layout: examHandout
num: e01c
ready: true
desc: "Handout for Practice Exam 'e01c'"
exam_date: 2016-10-17 12:30:00.00-7
---
<div style="display:none;">
https://ucsb-cs56-f17.github.io/exam/e01/cs56_f16_e01_practice_c/handout/
</div>

<h2>CODE FOR QUESTION 1</h2>

<div style="font-size:80%;">

## Product.java

{% highlight java linenos %}

	/** something that can be sold */
	public abstract class Product {

	/** get the price (in cents) */
	public abstract int getPrice();

	}
{% endhighlight %}

## Shippable.java

{% highlight java linenos %}
	/** something that can be shipped */
	public interface Shippable {

	/** get the shipping weight in pounds */
	public double getWeight();
	}
{% endhighlight %}


## Book.java

{% highlight java linenos %}
/** A Book */
public class Book extends Product implements Shippable {

  private int price;
  private double weight;
  private String author;
  private String title;

  public Book(String author, String title, int price,
      double weight) {
    this.author = author;
    this.title = title;
    this.price = price;
    this.weight = weight;
  }

  public int getPrice() {return this.price;}
  public String getTitle() {return this.title;}
  public String getAuthor() {return this.author;}
  public double getWeight() {return this.weight;}
}
{% endhighlight %}


## Song.java

{% highlight java linenos %}
/** A downloadable Song */
public class Song extends Product {

  private int price;
  private String artist;
  private String title;

  public Song(String artist, String title, int price) {
    this.artist = artist;
    this.title = title;
    this.price = price;
  }

  public Song(String artist, String title) {
    this(artist,title,99);
  }

  public int getPrice() {return this.price;}
  public String getTitle() {return this.title;}
  public String getArtist() {return this.artist;}

}
{% endhighlight %}

</div>
