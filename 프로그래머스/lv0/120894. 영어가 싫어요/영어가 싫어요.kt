class Solution {
    fun solution(numbers: String): Long {
        var alphabet = listOf<String>( "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var num = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

        var result = ""
        var answer = ""

        for(n in numbers){
            result = result + n
            if(result in alphabet){
                var idx = alphabet.indexOf(result)
                answer = answer + num[idx]
                result = ""
            }
        }
        
        return answer.toLong()
        
    }
}