def array = new int[] {1,3,4,5,1,5,4}
println array
//println(array[0])     //получение значения по ключу

def arrayMap = [:]

    for (int x : array) {
        if(arrayMap.containsKey(x)){
            def y = arrayMap[x]
            arrayMap[x]=y+1
        } else {
            arrayMap[x]=1
        }
    }
println arrayMap

