package cw6;
/**
 * @author domino
 * */

/*
 Dla poniższych definicji list:
 def list1 = [ 'a', 'b', 'c']
 def list2 = [ 1, 8, 23 ]
 za pomocą metody each(Closure)
 a) wypisać wszystkie elementy (2 p.),
 b) stworzyć nowe listy list11 i list12 zawierające podwojone wartości list oryginalnych (3 p.).
 */

def list1 = ['a', 'b', 'c']
def list2 = [1, 8, 23]

list1.each{ println it }

list2.each{ println it }

def list11 = []
def list12 = []

list1.each{ list11 << it * 2 }

list2.each{ list12 << it * 2 }

println list11
println list12
