def array = new int[] {1,3,4,5,1,5,4}
println array
//println(array[0])     //получение значения по ключу

def arrayMap = [:]

    for (i in array) {
        if(arrayMap.containsKey(i)){
            def y = arrayMap[i]
            arrayMap[i]=y+1
        } else {
            arrayMap[i]=1
        }
    }




println arrayMap

