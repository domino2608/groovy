import javax.lang.model.element.VariableElement;

def maximum(list){
	def max = list[0]
	
	for(int i = 1; i < list.size; i++){
		max = (max < list[i])? list[i] : max 
	}
	
	def indexes = []
	
	list.eachWithIndex {elem, index -> if(max == elem) indexes.add(index)}
	
	[max, indexes]
}

(maxVal, indList) = maximum( [5, 3, 5, 5, 1, 5] )
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"