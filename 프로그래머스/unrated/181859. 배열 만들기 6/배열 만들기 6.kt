class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var stk: MutableList<Int> = mutableListOf()
        
        for(i in 0..arr.size-1){
            if(stk.isEmpty()){
                stk.add(arr[i])
            }else{
                if(stk[stk.size-1] == arr[i]){
                    stk.removeAt(stk.size-1)
                }else{
                    stk.add(arr[i])
                }
            }
        }
        
        if(stk.isEmpty()){
            stk.add(-1)
        }
        
        answer = stk.toIntArray()
        
        return answer
    }
}