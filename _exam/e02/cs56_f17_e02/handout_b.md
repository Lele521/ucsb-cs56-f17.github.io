---
layout: examHandoutNoName
num: e02
ready: true
desc: "Handout B"
qtr: F17
---

<style>
 body { font-size: 109%; }
</style>

<h2>Handout B, p. 1: Useful Reference Items</h2>

Here are a few reminders of things we discussed in class, but that you might
reasonably need a "reference" for if you were using them in the real world.

The interface `java.util.Comparator<T>` includes the following
method signature:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| `int` | `compare(T o1, T o2)` | Compares this object with the specified object for order. <br>Returns a negative integer, zero, or a positive integer <br>as this object is less than, equal to, or greater than the specified object. |

</div>

The interface `java.lang.Comparable<T>` includes the following
method signature:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| `int` | `compareTo(T o)` |  Compares its two arguments for order. <br>Returns a negative integer, zero, or a positive integer <br>as the first argument is less than, equal to, or greater than the second. |

</div>


The class `java.util.ArrayList<E>` includes this method:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| `void` | `sort(Comparator<? super E> c)` | Sorts this list according to the order induced by the specified `Comparator`. |

</div>




<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

The class `java.util.Collections` contains the following static method:

|`static <T extends Comparable<? super T>> void` |  `sort(List<T> list)` | Sorts the specified list into ascending order, <br>according to the natural ordering of its elements. |

</div>

And finally, `java.lang.String` implements `Comparable<String>` in the
way that you would expect.


<h2 class="page-break-before">Handout B, p. 2: Sample Output</h2>

<div style="clear:both;">
&nbsp;
</div>

```
$ java StudentMain
Student(6234567,"Bob",3.25,CMPSC)
Student(7152353,"Charlie",3.96,CMPSC)
Student(2352353,"Alice",3.97,CMPEN)
Student(2888888,"Danielle",4.00,CMPSC)
Student(1152353,"Ed",2.90,CMPEN)
$ java StudentMain name
Student(2352353,"Alice",3.97,CMPEN)
Student(6234567,"Bob",3.25,CMPSC)
Student(7152353,"Charlie",3.96,CMPSC)
Student(2888888,"Danielle",4.00,CMPSC)
Student(1152353,"Ed",2.90,CMPEN)
$ java StudentMain perm
Student(1152353,"Ed",2.90,CMPEN)
Student(2352353,"Alice",3.97,CMPEN)
Student(2888888,"Danielle",4.00,CMPSC)
Student(6234567,"Bob",3.25,CMPSC)
Student(7152353,"Charlie",3.96,CMPSC)
$
```

