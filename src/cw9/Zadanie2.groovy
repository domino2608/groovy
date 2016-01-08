package cw9

import groovy.swing.SwingBuilder

import java.awt.Color

import javax.swing.JFrame


/**
 * @author Domino
 * */

/*
 Przycisk umieszczony w oknie zmienia kolory swojego t³a na skutek klikniêæ. Ustaliæ dowoln¹ sekwencjê kolorów, po jej wyczerpaniu zacz¹æ od pierwszego
 */

def colors = [
	Color.red,
	Color.CYAN,
	Color.yellow,
	Color.blue,
	Color.orange
]
def lastColor = 0;

new SwingBuilder().edt{
	frame(title:"colorChanger", visible:true, pack:true, defaultCloseOperation:JFrame.EXIT_ON_CLOSE, locationRelativeTo:null){
		button(text:"click me :)", actionPerformed:{e ->
			if(lastColor == colors.size){
				lastColor = 0
			}
			e.source.background = colors[lastColor++];
		})
	}
}
