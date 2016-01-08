package cw2

/**
 * @author Domino
 * */

/*
 Napisać funkcję List apply(List l, Closure c), która każdy element listy l 
 transformuje za pomocą domknięcie c i zwraca listę transformowanych wartości.
 Przetestować dla różnych list i różnych domknięć
 */


List apply(List l, Closure c){
	List list = [];

	l.each {list += c(it)};

	list
}

List l = [1, 2, 3, 23, 2];
println apply(l) {it * 2}