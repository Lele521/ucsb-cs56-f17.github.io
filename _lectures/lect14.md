---
num: "Lecture 14"
desc: "Parsing lab overview"
ready: true
date: 2017-11-21 09:30:00.00-7:00
---

Github repo for today:

* <https://github.com/pconrad/parsing-starter-01-LECTURE-11.21.17>

What we are doing today:

* Going over what you need to understand for the parsing lab (lab08) by:
* Doing an alternative change to the arithmetic expression parser, namely, adding the `%` operator (with same precedence as `*` and `/`)

This will give you SOME of what you need for the parsing lab.  
* It will not give you all of it.  
* BY DESIGN, some of the parts you have to *figure out on your own*
* Specifically: there are several places where there are at least two possible designs, neither of which is clearly better than the other.
   * One token type with variations for relational operator?   A base class extended several times? An interface?  Separate token types with no class or interface relationship?
   * Tokens for multi-character operators: new type? Or change the base type of operator scaffold to wrap a String instead of a char?
   
