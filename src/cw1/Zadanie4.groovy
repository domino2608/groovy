package cw1

import javax.swing.JOptionPane

/**
 * @author Domino
 * */

/*
 Napisać pogram przekształcający liczby na ich słowne odpowiedniki.
 Np. po wprowadzeniu liczby 147 winniśmy uzyskać jeden - cztery - siedem.
 */


def num = JOptionPane.showInputDialog("number:")

try{
	num as int
}catch(Exception e){
	return
}

def result = ""

for(char c in num){
	switch(c){
		case '1':
			result +="jeden-"
			break;
		case '2':
			result +="dwa-"
			break;
		case '3':
			result +="trzy-"
			break;
		case '4':
			result +="cztery-"
			break;
		case '5':
			result +="piec-"
			break;
		case '6':
			result +="szesc-"
			break;
		case '7':
			result +="siedem-"
			break;
		case '8':
			result +="osiem-"
			break;
		case '9':
			result +="dziewiec-"
			break;
		case '0':
			result +="zero-"
			break;
	}
}

println result[0..-2]
