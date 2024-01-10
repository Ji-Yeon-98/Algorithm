class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for(q in queries){
            arr.forEachIndexed { index, i -> if(index >= q[0] && index <= q[1] && index%q[2] == 0) arr[index] = arr[index]+1 }
        }
        
        return arr
    }
}