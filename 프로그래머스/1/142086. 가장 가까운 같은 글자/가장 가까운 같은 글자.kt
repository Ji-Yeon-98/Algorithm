class Solution {
    fun solution(s: String): IntArray {
        val answer : MutableList<Int> = mutableListOf()

        for(i in 0..s.length -1){
            val result = mutableListOf<Int>()
            s.toMutableList().forEachIndexed { index, it -> if(it == s[i]) result.add(index)}

            if(result.size == 1 || result.indexOf(i) == 0){
                answer.add(-1)
            }else{
                answer.add(result[result.indexOf(i)] - result[result.indexOf(i) -1])
            }
        }

        return answer.toIntArray()
    }
}

// class NearestSameLetter {
//     fun solution(s: String): IntArray {
//         val prevIndexMap = hashMapOf<Char, Int>()
//         return s.mapIndexed { index, c ->
//             val prevIndex = prevIndexMap[c]
//             prevIndexMap[c] = index
//             if (prevIndex == null) -1 else index - prevIndex
//         }.toIntArray()
//     }
// }