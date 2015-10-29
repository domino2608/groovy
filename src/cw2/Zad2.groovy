import javax.swing.JOptionPane;

def List getInts(){
	//	def input = JOptionPane.showInputDialog(null, "Podaj szereg liczb", "");

	def input;
	boolean isNotOk = true;
	while(isNotOk){
		input = JOptionPane.showInputDialog(null, "Podaj szereg liczb", "");
		try{
			input = input.tokenize() as int[];
			isNotOk = false;
		}catch(NumberFormatException e){
			isNotOk = true;
		}
	}
	
	return input
}


println getInts()