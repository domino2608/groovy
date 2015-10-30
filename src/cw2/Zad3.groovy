package cw2

List apply(List l, Closure c){
	List list = [];
	
	l.each {list += c(it)};
	
	list
	
}

List l = [1, 2, 3, 23, 2];
println apply(l) {it * 2}