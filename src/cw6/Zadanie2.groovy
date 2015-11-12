package cw6
/**
 * @author domino
 * */
/*
 Firma software'owa prowadzi projekty w:
 Groovy, Grails, Java, JEE
 Do każdego projektu przypisani są programiści, co pokazuje poniższa mapa:
 def pmap = [ Groovy: [ 'Asia', 'Jan' ],
 Grails: [ 'Asia', 'Jan', 'Stefan', 'Mirek' ],
 Java: [ 'Asia', 'Stefan', 'Mirek' ],
 JEE: [ 'Slawek', 'Stefan', 'Janusz' ]
 ]
 Wypisać:
 a) ile osób pracuje w każdym z projektów  (3 p)
 b) projekty, które mają więcej niż dwóch programistów (3p )
 c)  w jakich projektach biorą udzial poszczególni programisci (6 p.)
 */

def pmap = [ Groovy: ['Asia', 'Jan'],
	Grails: [
		'Asia',
		'Jan',
		'Stefan',
		'Mirek'
	],
	Java: ['Asia', 'Stefan', 'Mirek'],
	JEE: [
		'Slawek',
		'Stefan',
		'Janusz' ]
]

println "projekt -> ilosc osob"

pmap.each{ key, val ->
	println key + " " + val.size()
}

println "========================"
println "projekt liczba osob > 2"

pmap.each{
	if(it.value.size() > 2)
		println it.key
}

println "========================"
def personProjectsMap = [:]

pmap.each{ key, value ->
	value.each {
		def list = personProjectsMap[it]
		
		if(!list)
			personProjectsMap[it] = (list = [])
			
		list << key
	}
}

println personProjectsMap