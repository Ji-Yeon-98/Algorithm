class Solution {
    fun solution(numbers: Array<IntArray>): Int {
        val arraySize = 200
        var array = IntArray(arraySize)
        var answer = 0

        for(i in 0 until numbers.size){
            for ( num in numbers[i][0] + 100 until numbers[i][1] + 100){
                array[num]++
            }
        }

        for(i in 0 until arraySize){
            if(array[i] > 1){
                answer++;
            }
        }
    
        return answer
    }
}