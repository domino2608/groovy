import javax.swing.JOptionPane;

map = [:]

while(1){
	input = JOptionPane.showInputDialog("pozycja=koszt / end")
	
	if(input == "end" || input == null)
		break
	
	tmp = input.split("=")
	int koszt = tmp[1] as int
	
	map[tmp[0]] = (map[tmp[0]] == null)? koszt : map[tmp[0]] + koszt
	
}

println map