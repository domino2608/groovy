package cw7
/**
 * @author domino
 * */

/*
 Firma software'owa prowadzi projekty w:
 Groovy, Grails, Java, JEE
 Plik Projekty.txt zawiera informacje o składzie osobowym każdego z projektów w postaci:
 nazwaprojektu<TAB>Nazwisko imie(1)<TAB>Nazwiskoimie(2)<TAB> itd
 Utworzyc pliki:
 ProjektyDuze.txt - zawierający spis projektów w którym pracuje > niż 3 osoby
 Programisci.txt - zawierajacy spis programistow w postaci:
 nazwisko imie<tab>proj1<tab>proj2<tab> itd.
 */

file = new File("Projekty.txt")

def projectMap = [:]
def personProjectMap = [:]
def bigProjectsList = []

file.eachLine { line ->

	def splittedLine = line.split("\t")

	splittedLine[1..-1].each {
		def list = projectMap[splittedLine[0]]

		if(list == null)
			projectMap[splittedLine[0]] = (list = [])
		list << it

		list = personProjectMap[it]

		if(list == null)
			personProjectMap[it] = (list = [])

		list << splittedLine[0]
	}
}

println projectMap
println personProjectMap

def largeProjectsFile = new File("ProjektyDuze.txt")

projectMap.each {key, value ->
	if(value.size() > 3){
		largeProjectsFile.withPrintWriter { writer -> writer.println key }
	}
}

def programmersFile = new File("Programisci.txt")

programmersFile.withPrintWriter { writer ->
	personProjectMap.each { key, value ->
		writer.print(key + "\t")

		value.each {
			writer.print(it + "\t")
		}
		writer.println()
	}
}