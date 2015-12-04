package cw8

import javax.swing.JOptionPane

/**
 * @author domino
 */
/*
 W dialogu wprowadzany jest ciąg liczb. Stworzyć  listę zawierającą ich podwojone wartości. Przedstawić możliwie najkrótszy kod realizujący to zadanie.
 Pomoc: zastosuj spread-dot i collect.
 */

def input = JOptionPane.showInputDialog("Number list:")
def nums = input.tokenize()*.toInteger()*.multiply(2);

println nums