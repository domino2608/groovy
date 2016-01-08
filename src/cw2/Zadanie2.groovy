package cw2

import javax.swing.JOptionPane;

/**
 * @author Domino
 * */

/*
 Napisać funkcję List getInts(), która prosi o podanie szeregu liczb całkowitych w dialogu wejściowym i zwraca listę wprowadzonych liczb (jako obiektów typu Integer). Nie dopuścić do wprowadzenia wadliwych danych (ponowienie dialogu do poprawki).
 Pomoc (ew. pokazanie wadliwych danych w dialogu do poprawki):
 public static String showInputDialog(Component parentComponent,
 Object message,
 Object initialSelectionValue)
 Shows a question-message dialog requesting input from the user and parented to parentComponent. The input value will be initialized to initialSelectionValue. The dialog is displayed on top of the Component's frame, and is usually positioned below the Component.
 Parameters:
 parentComponent - the parent Component for the dialog (podamy null)
 message - the Object to display (komunikat)
 initialSelectionValue - the value used to initialize the input field (co się pokazuje w polu tekstowym dialogu)
 */

def List getInts(){
	//	def input = JOptionPane.showInputDialog(null, "Podaj szereg liczb", "");

	def input;
	boolean isNotOk = true;
	while(isNotOk){
		input = JOptionPane.showInputDialog(null, "Podaj szereg liczb", input);

		if(!input)
			return null

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