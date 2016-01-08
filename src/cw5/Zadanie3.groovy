package cw5;

/**
 * @author Domino
 * */

/*
 Napisać funkcję String join(List l, String sep) zwracająca napis zawierający elmenty listy l rozdzielone separatorami sep.
 */


String join(List l, String sep){
	StringBuilder strBuilder = new StringBuilder()

	l.each { elem ->
		strBuilder << elem
		strBuilder << sep
	}

	strBuilder.toString()[0..-2]
}

def list = ["a", "b", "c", "d"]

println join(list, "-")