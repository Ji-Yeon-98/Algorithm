class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        
        var result : MutableList<Int> = MutableList(included.size){ 0 }

        for(i in 0 .. included.size-1){

            if(i == 0){
                result[i] = a
            }else{
                result[i] = result[i-1] + d
            }

            if(included[i] == true){
                answer += result[i]
            }
        }
        
        return answer
    }
}