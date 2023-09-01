class Solution {
    fun solution(s: String): Int {
        val estring = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var answer = s
        
        for(i in 0 until estring.size){
            if(s.contains(estring[i])){
                answer = answer.replace(estring[i], i.toString())
            }
        }
        return Integer.parseInt(answer)
    }
}