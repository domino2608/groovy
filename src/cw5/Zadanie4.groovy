import javax.swing.JOptionPane;

/**
 * @author Domino
 * */

/*
 Napisy wprowadzane w kolejnych dialogach mają formę:  pozycja = koszt.
 Zsumuj wszystkie koszty dla tych samych pozycji (np. mleko, chleb).
 */


def map = [:]

while(input = JOptionPane.showInputDialog("pozycja=koszt")){
	def tokens = input.tokenize("=")

	if(map[tokens[0]] == null)
		map[tokens[0]] = 0

	map[tokens[0]] += Integer.parseInt(tokens[1])
}

println map