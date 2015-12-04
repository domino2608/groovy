package cw8

import javax.swing.JOptionPane

/**
 * @author domino
 */

/*
 Wypisać listę liczb posortowanych w porządku rosnącym. Z listy wejściowej  utworzyć oddzielną listę liczb mniejszych od zera.
 Pomoc: zastosuj  sort i findAll
 */

def nums = JOptionPane.showInputDialog("Lista:").tokenize()*.toInteger()
println "przed sortowaniem: " +  nums
nums.sort()
println "po sortowaniu: " + nums

def selectedNums = nums.findAll {it < 10}
println selectedNums