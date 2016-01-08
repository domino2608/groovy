package cw9

import groovy.swing.SwingBuilder

import java.awt.BorderLayout
import java.awt.Dimension

import javax.swing.JOptionPane
import javax.swing.WindowConstants

/**
 * @author Domino
 * */

/*
 Napisać skrypt - przeglądarkę obrazków z podanego katalogu.
 Na etykiecie w oknie  maja być pokazywane obrazki z katalogu wybranego po uruchomieniu programu.
 Na poczatku pokazywany jest piewrszy obrazek, przyciśnięcia przycisku "Next" pokazują następne.
 Pomoc:
 a) przegladanie katalogow i uzyskiwanie nazw plikow - znamy,
 b) metoda imageIcon(nazwa_pliku) zwraca ikone = obraz z pliku (typy: png i jpg)
 b) metoda setIcon pozwala na ustalenie ikony (obrazka) na etykiecie label
 */


def path = JOptionPane.showInputDialog(null, "Path to dir:", /C:\Users\Domino\eclipse workspaces\groovy_workspace\Groovy\photos/)

if(!path)
	return


def photos = []
def lastPhoto = 1

new File(path).eachFileMatch(~/[^\s]+.[jpeg|jpg|png]/){photos << it}


new SwingBuilder().edt{
	fr = frame(title:"photos", visible:true, defaultCloseOperation:WindowConstants.EXIT_ON_CLOSE , size:new Dimension(600, 600)){
		photoLabel = label(icon:imageIcon(photos[0].path))

		button(text:"next", constraints:BorderLayout.SOUTH, actionPerformed:{e ->
			if(lastPhoto == photos.size){
				lastPhoto = 0
			}

			def photo = imageIcon(photos[lastPhoto++].path)

			photoLabel.size = new Dimension(photo.getImage().getWidth(), photo.getImage().getHeight());

			photoLabel.icon = photo
		})
	}
}



