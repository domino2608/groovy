//check how to do it in groovy way

String reverseChars(String s){
	
	def result = ""
	for(int i = s.length() - 1; i >= 0; i--){
		result += s[i]
	}
	
	result
}


println reverseChars("piesek")