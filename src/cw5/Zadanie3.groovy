String join(List l, String sep){
	StringBuilder strBuilder = new StringBuilder()
	
	0.upto(l.size() - 2){
		strBuilder.append(l[it] + sep)
	}
	
	strBuilder.append(l.last())
	
	strBuilder.toString()
}

def list = ["a", "b", "c", "d"]

println join(list, "-")