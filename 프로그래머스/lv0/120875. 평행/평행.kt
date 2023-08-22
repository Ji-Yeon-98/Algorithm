class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var count = 0

        for ( i in 1 until dots.size){

            var xarray = dots.filterIndexed{ index, _ -> index == 0 || index == i}.map{ it[0] }
            var yarray = dots.filterIndexed{ index, _ -> index == 0 || index == i}.map{ it[1] }
            var result : Double = (yarray[1] - yarray[0]).toDouble()/(xarray[1] - xarray[0]).toDouble()

            var xresult = dots.filterIndexed{ index, _ -> index != 0 && index != i}.map{ it[0] }
            var yresult = dots.filterIndexed{ index, _ -> index != 0 && index != i}.map{ it[1] }
            var result2 : Double = (yresult[1] - yresult[0]).toDouble()/(xresult[1] - xresult[0]).toDouble()

            if(result == result2){
                count = 1
            }

        }
        
        return count
    }
}


// var answer: Int = 0

// var slopes = mutableListOf<Double>()

// dots.forEachIndexed { index, value ->
//     for (i in (index + 1)..(dots.size - 1)) {
//         slopes.add(abs(value[1].toDouble() - dots[i][1]) / abs(value[0].toDouble() - dots[i][0]))
//     }
// }

// return if (slopes.size == slopes.distinct().size) 0 else 1