class Solution {
    fun solution(num: Int, k: Int): Int {
        
        var numChar = num.toString().toCharArray()
        var answer:Int = 0

        val result = numChar.filter { i -> Integer.parseInt(i.toString()) == k}

        if (result.size > 0){
            answer = numChar.indexOf(result[0]) + 1
            return answer
        }else{
            return -1
        }
    }
}

// var numChar = num.toString()
// answer = numChar.indexOf(k.toString())
    
// if (answer >= 0){
//     return answer + 1
// }else{
//     answer
// }