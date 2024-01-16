class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var result : Int = 0
        var answer: IntArray = IntArray(2){0}

        for(l in lottos){

            if(win_nums.contains(l)){
                result += 1
            }

        }

        fun win(result : Int) : Int{
            when(result){
                6 -> return 1
                5 -> return 2
                4 -> return 3
                3 -> return 4
                2 -> return 5
                else -> return 6
            }
        }

        val result2 = result + lottos.filter { it -> it == 0 }.count()

        answer[0] = win(result2)
        answer[1] = win(result)
        
        return answer
    }
}