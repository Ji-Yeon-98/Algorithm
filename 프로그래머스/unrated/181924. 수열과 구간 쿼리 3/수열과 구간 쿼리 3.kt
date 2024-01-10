class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(q in queries){
            val first = arr[q[0]]
            arr[q[0]] = arr[q[1]]
            arr[q[1]] = first
        }

        answer = arr
        
        return arr
    }
}