package cw8

/**
 * @author domino
 * */

/*
 Posortuj listę liczb w porządku malejącym.
 a) napisz własny komparator
 b) zajrzyj do klasy Collections i zobacz czy nie ma tam cos ciekawego nt. odwrotnego porządku sortowania
 */

def nums = [4, 2, 10, 8, 5, 1, -5, 2, -4]

def comp = [compare: {a, b -> -1 * a.compareTo(b)}] as Comparator

nums.sort(comp)
println nums
