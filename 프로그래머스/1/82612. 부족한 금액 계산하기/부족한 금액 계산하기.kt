import java.util.*

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var resultArray : MutableList<Long> = mutableListOf(0)

        for(i in 0..count-1){
            resultArray.add(resultArray[i] + price)
        }

        answer = resultArray.sum() - money
        
        if(answer <= 0){
            return 0
        }else{
            return answer
        }
        
    }
}