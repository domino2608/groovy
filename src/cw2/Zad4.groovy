package cw2

import javax.swing.JOptionPane

def getData(Class clas = String, Closure... closure){

	while(1){
		input = JOptionPane.showInputDialog("getData");

		if(input == null)
			break;

		boolean isOk = true;

		try{
			input = input.tokenize();

			input.each {
				it = it.asType(clas)
				println "it: ${it.class}"
				if(closure.length > 0 && !closure[0](it))
					throw new Exception();
			}

			break;
		}catch(Exception e){
//			e.printStackTrace()
			continue;
		}

		println "isOk: ${isOk}"
	}

	input
}

println getData(Integer) { it > 0 }            // liczby całkowite większe od 0
println getData() { it.size() > 3 }   // słowa o długości większej od 3 (domyślny typ: String)
println getData()                          // dowolne napisy (słowa)
println getData(BigDecimal)         // dowolne liczby