import java.util.*

class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        
        var person: CharArray = charArrayOf('R', 'T', 'C', 'F', 'J', 'M', 'A', 'N')
        var score: IntArray = IntArray(8) { 0 }

        for (i in survey.indices) {
            score[person.indexOf(survey[i][1])] += choices[i] - 4
        }

        for (i in 0..7 step 2) {
            if (score[i] >= score[i + 1]) answer += person[i]
            else answer += person[i + 1]
        }
        return answer
    }
}

// class Solution {
//     fun solution(survey: Array<String>, choices: IntArray): String {
//         var answer: String = ""
//         var resultTable = mutableMapOf('R' to 0, 'T' to 0, 'C' to 0, 'F' to 0, 'J' to 0,  'M' to 0, 'A' to 0, 'N' to 0)

//         for(i in 0 .. survey.size-1){

//             var type : Char = 'Z'
//             var score : Int = 0

//             if(choices[i] < 4){

//                 type = survey[i][0]
//                 score = 4-choices[i]

//                 val pre = resultTable.get(survey[i][0]) ?: 0

//                 resultTable[survey[i][0]] = pre + (4-choices[i])

//             }else if(choices[i] > 4){

//                 type = survey[i][1]
//                 score = choices[i]-4

//             }else{
//                 continue
//             }

//             val pre = resultTable.get(type) ?: 0
//             resultTable[type] = pre + (score)
//         }

//         val stack = Stack<Pair<Char, Int>>()

//         for( r in resultTable){
//             stack.push(r.key to r.value)

//             if(stack.size == 2){

//                 if(stack[stack.size -1].second > stack[stack.size -2].second){
//                     answer += stack[stack.size -1].first
//                 }else{
//                     answer += stack[stack.size -2].first
//                 }

//                 repeat(2){stack.pop()}
//             }
//         }
//         return answer
//     }
// }