---
num: "Lecture 11"
desc: "-Xlint:unchecked, sockets, ports"
ready: false
date: 2017-11-07 09:30:00.00-7:00
---

Today we reviewed code from this repo:

* <https://github.com/UCSB-CS56-pconrad/hfj-chap15>

We discussed the `-Xlint:unchecked` issue 

* See also: <https://ucsb-cs56-pconrad.github.io/topics/java_unchecked/>

We mentioned briefly how you can compile and run the code in the repo using plain old java commands.

To find classes that have a main method, use the `grep` command with `-r` (recursive) flag on the `src`
directory:

```
grep -r `public static void main` src
```

Then:

```
ant compile
java -cp build chap15.NameOfClassGoesHere
```

We discussed that the chap15 refers to the "package" in which the code is located.

We also started a discussion of the port number issue, as discussed here:

* <https://ucsb-cs56-pconrad.github.io/topics/sockets/>


