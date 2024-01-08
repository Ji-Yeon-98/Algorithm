import java.util.*

class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0

        for(i in 0..discount.size-10){
            val slice = discount.sliceArray(i..i+9)

            var count: Int = 0


            if(slice.toMutableList().containsAll(want.toMutableList())){

                for(j in 0 .. want.size-1){
                    if( slice.count { it == want.get(j) } >= number.get(j)){
                        count += 1
                    }
                }
            }

            if(count == want.size){
                answer += 1
            }
        }
        
        return answer
    }
}