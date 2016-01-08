package cw8

import javax.swing.JOptionPane

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


def alphabetize = {
	char[] chars = it.toCharArray()
	Arrays.sort(chars);

	new String(chars);
}


def anagramMap = new HashMap<String, TreeSet<String>>();

def lines = new URL("http://www.puzzlers.org/pub/wordlists/unixdict.txt").readLines();

lines.each{ word ->
	def alpha = alphabetize(word)

	def anagramSet = anagramMap.get(alpha, new TreeSet<String>())
	anagramSet << word;

	anagramMap[alpha] = anagramSet
};

anagramMap = anagramMap.sort({-it.value.size()})
anagramMap.each {key, val ->
	if(val.size() > 2)
		println "$key $val"
}

//b)
String input = JOptionPane.showInputDialog("Word to show angrams:");

def anagramsForWord = anagramMap.get(alphabetize(input));
anagramsForWord.remove(input)

println "======================================"
println "anagrams for $input: $anagramsForWord"