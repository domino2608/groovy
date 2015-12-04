package cw8

/**
 * @author domino
 * */

/*
Na liście słów z http://www.puzzlers.org/pub/wordlists/unixdict.txt znaleźć wszystkie anagramy.
a) wypisać je dla wszystkich słów w porządku liczby  anagramów danego słowa
b) dla słowa podanego w dialogu wypisać anagramy w porządku alfabetycznym.

Uwaga: lista słów jest tylko angielska.

Pomoc:
wczytywanie calego tekstu z URL:
def txt = new URL(... adres ...).text
lista wierszy:
def llist = new URL(... adres ...).readLines()

anagramy = słowa składające się z tych samych znaków

*/

//def lines = new URL("http://www.puzzlers.org/pub/wordlists/unixdict.txt").readLines()

def comp = [compare: {MapEntry a, MapEntry b ->
	a.value.size().compareTo(b.value.size())
}] as Comparator

