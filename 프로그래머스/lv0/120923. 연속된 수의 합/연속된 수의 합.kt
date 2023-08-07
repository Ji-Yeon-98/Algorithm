class Solution {
    fun solution(num: Int, total: Int): IntArray {
        
        //중앙에 있는 값이 total//num
        var avg = total / num

        var answer = intArrayOf()

        for (i in avg - (num-1)/2 until  avg+(num+2)/2){
            answer = answer.plus(i)
        }
        
        return answer
        
    }
}