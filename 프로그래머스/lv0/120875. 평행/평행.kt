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