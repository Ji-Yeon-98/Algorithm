class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        
        var rspCharr = rsp.toCharArray()
        println(rspCharr)

        for (i in 0 until rsp.length){
            when(rspCharr[i]){
                '2' -> {answer += "0"}
                '0' -> {answer += "5"}
                '5' -> {answer += "2"}
            }

        }
        
        return answer
    }
}