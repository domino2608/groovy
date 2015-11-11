//check how to do it in groovy way

String reverseWords(String s){
	
	def result = ""
	
	def tmp = s.split(" ")
	
	(tmp.length - 1).downto(0){
		result += tmp[it] + " "
	}
		
	result
}

def napis = "abc def ghi"

println reverseWords(/ala ma kota/)