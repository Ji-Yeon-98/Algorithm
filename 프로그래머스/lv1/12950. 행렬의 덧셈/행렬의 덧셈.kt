class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
            for(i in 0 until arr1.size){
            var result = intArrayOf()
            for(j in 0 until arr1[i].size){
                result = result.plus(arr1[i][j] + arr2[i][j])
            }
            answer = answer.plus(result)
        }
        return answer
    }
}