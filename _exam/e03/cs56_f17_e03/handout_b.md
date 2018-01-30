---
layout: examHandoutNoName
num: e03
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

The classes `java.lang.String` and `java.lang.Double` implement `Comparable<String>` and `Comparable<Double>`, each in the
way that you would expect.

# Other potentially useful methods

In `java.lang.Double`:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">


|`public static int` | `compare(double d1, double d2)` |  Compares the two specified double values. <br> The sign of the integer value returned <br>is the same as that of the integer that <br>would be returned by the call: <br> `new Double(d1).compareTo(new Double(d2))` |

</div>
