class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()

        for(i in 0 until strings.size){
            val text = strings.map{it -> it.toCharArray()[n]}.sorted()
            strings.sorted().filter { it -> it.toCharArray()[n] == text[i] }.forEach{it -> answer = answer.plus(it)}
        }

        return answer.distinct().toTypedArray()
    }
}