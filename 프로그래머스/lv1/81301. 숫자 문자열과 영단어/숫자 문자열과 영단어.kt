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


// class Solution {
//     fun solution(s: String): Int = s
//         .replace("one", "1")
//         .replace("two", "2")
//         .replace("three", "3")
//         .replace("four", "4")
//         .replace("five", "5")
//         .replace("six", "6")
//         .replace("seven", "7")
//         .replace("eight", "8")
//         .replace("nine", "9")
//         .replace("zero", "0")
//         .toInt()
// }