package cw7

/**
 * @author Domino
 * */

/*
 Plik MenuPl.txt zawiera menu w postaci:
 nazwa_dania cena
 Ceny sa w PLN.
 Na podstawie pliku wejsciowego stworzyc plik MenuEur.txt majacy te sama postac, ale z cenami w EUR.
 */

def menuPlFile = new File("MenuPl.txt")
def menuEurFile = new File("MenuEur.txt")
double kursEur = 4.34


menuPlFile.eachLine {line ->
	def tmp = line.tokenize()

	def cashInEur = (tmp[1] as double) * kursEur

	menuEurFile << tmp[0] + "\t" + cashInEur + "\n"
}