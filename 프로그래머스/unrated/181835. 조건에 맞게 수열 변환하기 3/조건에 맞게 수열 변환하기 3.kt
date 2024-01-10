class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        if(k % 2 == 1){
            arr.forEachIndexed{index, it -> arr[index] = arr[index]*k}
        }else{
            arr.forEachIndexed{index, it -> arr[index] = arr[index]+k}
        }
        return arr
    }
}