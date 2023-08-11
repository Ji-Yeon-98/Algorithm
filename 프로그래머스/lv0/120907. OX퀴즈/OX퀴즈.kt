class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for(i in 0 until quiz.size){

            var q = quiz[i].split(" ")
            if( q[1] == "+") {
                var result = Integer.parseInt(q[0]) + Integer.parseInt(q[2])
                if (result == Integer.parseInt(q[4])){
                    answer = answer.plus("O")
                }else{
                    answer = answer.plus("X")
                }
            }else if(q[1] == "-"){

                var result = Integer.parseInt(q[0]) - Integer.parseInt(q[2])
                if (result == Integer.parseInt(q[4])){
                    answer = answer.plus("O")
                }else{
                    answer = answer.plus("X")
                }
            }

        }
        return answer
    }
}