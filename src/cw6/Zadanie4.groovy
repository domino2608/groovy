package cw6;

/**
 * @author domino
 */
/*
 a) Napisać wyrażenie regularne, za pomoca którego mozna odnaleźć w tekście dowolne liczby rzeczywiste.
 b) zastosować je do przetwarzania tekstu zawierającego (posród innych) napisy w postaci liczba PLN, w taki sposób, aby zamienić te fragmenty na liczba EUR (po aktualnym kursie)
 */

def text = "This product cost 23 PLN, when you buy 3 you need to pay 60 PLN for it."

def regex = "(\\d+) PLN"
def matcher = text =~ regex

text = text.replaceAll(regex) { all, kwota ->
	String.format("%.2f", kwota.toBigDecimal() / 4.32) + " EUR"
}

println text