package cw8

import java.text.Collator


/**
 * @author domino
 * */

/*
 Policz liczbę wystąpień poszczególnych słów w pliku.
 Wypisz słowa alfabetycznie wraz z informacją o liczbie wystąpień każdego słowa
 Uwagi:
 a) co to są słowa? - uwzględnić znaki interpunkcji (+1 p.)
 b) co to jest alfabetycznie? - uwzględnić porządek alfabetyczny dla danego języka (+2 p.)
 Pomoc:
 uzyj TreeMap
 tokenize(sep) pozwala podać zestaw separatorów
 komparator alfabetyczny dla danego języka uzsykujemy przez: Collator.getInstance(new Locale(kod_języka))
 */

def treeMap = new TreeMap(Collator.getInstance(new Locale("PL")))

def file = new File("cw8_z5.txt")

file.eachLine{line ->
	line.tokenize(' \t+=*/~\\\'"[]{}()@!,;,.?:').each { word ->
		int count = treeMap.get(word, 0)
		treeMap[word] = count + 1
	}
}

println treeMap