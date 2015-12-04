package cw8

/**
 * @author domino
 * */

/*
 Utwórz posortowany zbiór słów z pliku. Słowa mają być uporządkowane według ich długości, jeśli długość jest taka sama należy zastosować porządek alfabetyczny.
 Pomoc:
 uzyj TreeSet z włąsciwie zdefiniowanym komparatorem
 */

def file = new File("toSort.txt")

def comp = [compare: {a, b ->
		if(a.size().compareTo(b.size()) == 0){
			return a.compareTo(b)
		} else{
			return a.size().compareTo(b.size())
		}
	}] as Comparator

def treeSet = new TreeSet(comp)

file.eachLine {line ->
	line.tokenize().each {treeSet << it}
}

println treeSet