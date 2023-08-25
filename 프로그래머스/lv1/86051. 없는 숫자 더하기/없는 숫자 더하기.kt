class Solution {
    fun solution(numbers: IntArray): Int {
        var answer = 0
        for (i in 0..9){
            if(numbers.contains(i)){
            }else{
                answer += i
            }
        }

        return answer
    }
}