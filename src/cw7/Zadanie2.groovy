package cw7

def menuPlFile = new File("MenuPl.txt")
def menuEurFile = new File("MenuEur.txt")
double kursEur = 4.34


menuPlFile.eachLine {line ->
	def tmp = line.tokenize()
	
	def cashInEur = (tmp[1] as double) * kursEur
	
	menuEurFile << tmp[0] + "\t" + cashInEur + "\n"
	
}