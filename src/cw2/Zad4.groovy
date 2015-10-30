package cw2

import javax.swing.JOptionPane

def getData(Class clas = String, Closure... closure){
	//TODO
	
	
	while(1){
		input = JOptionPane.showInputDialog("getData");

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
			continue;
		}

		println "isOk: ${isOk}"
	}

	input
}

getData(Integer) { it > 0 }            // liczby ca�kowite wi�ksze od 0
println getData() { it.size() > 3 }   // s�owa o d�ugo�ci wi�kszej od 3 (domy�lny typ: String)
println getData()                          // dowolne napisy (s�owa)
println getData(BigDecimal)         // dowolne liczby