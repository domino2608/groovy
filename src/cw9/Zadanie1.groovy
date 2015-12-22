package cw9

import groovy.swing.SwingBuilder

import java.awt.event.ActionEvent;

import javax.swing.JFrame

/**
 * @author domino
 * */

/*
 * Stworzyć okno ramowe frame z tytułem "Prosty edytor",
 * zawierające komponent textArea (wielowierszowe pole edycyjne).
 * Zapewnić możliwość ustawiania na początku  programu rodzaju 
 * i rozmiaru pisma oraz kolorów tła i pisma.
 */

//new SwingBuilder().edt{
//	dialog(title:"Choose font properties and colors", visible:true, pack:true){
//		panel(){ button(text:"test") }
//	}
//}


new SwingBuilder().edt{
	frame(title: "Prosty edytor", pack:true, visible:true, defaultCloseOperation:JFrame.EXIT_ON_CLOSE){
		textArea(rows:15, columns:15)

		menuBar(){
			menu("options"){
				menuItem("font", actionPerformed:{e ->menuItemClicked(e)})

				menuItem("colors", actionPerformed:{e -> menuItemClicked(e)})
			}
		}
	}
}


def menuItemClicked(e){

	if(e.source.text == "font"){
		
		//TODO show dialog
		
	} else if(e.source.text == "colors"){
	
		//TODO show dialog
	}
}
