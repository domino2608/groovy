package cw6;
/*
 Daty w tekście maja postać YYYY-MM-DD (rok- miesiac- dzien). Wypisać wszystkie poprawne daty.
 czyli: po wyróznieniu wszytskicgh fragmentów, które mogą być datami sprawdizc ich poprawnośc (np. czy właściwa jest liczba dni w miesiącu)
 */

def text = "1994-02-012003-13-12 abs20a3002-q-wj 3029-30-01"
def regex = "\\d{4}-\\d{2}-\\d{2}" //TODO change regex



def matcher = text =~ regex

//pierwszy sposob
println 'pierwszy sposob'
matcher.each{ println it }

//drugi sposob
println 'drugi sposob'
for(match in matcher){
	println match
}

//trzeci sposob
println 'trzeci sposob'
text.eachMatch(regex){println it}