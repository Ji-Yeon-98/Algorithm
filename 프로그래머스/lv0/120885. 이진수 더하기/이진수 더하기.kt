class Solution {
    fun solution(bin1: String, bin2: String): String {
        val maxLength = maxOf(bin1.length, bin2.length)
        val c_bin1 = bin1.padStart(maxLength, '0').toCharArray()
        val c_bin2 = bin2.padStart(maxLength, '0').toCharArray()

        var result = mutableListOf<Int>()
        var c = 0

        for (i in c_bin1.size - 1 downTo 0) {
            var a = Integer.parseInt(c_bin1[i].toString())
            var b = Integer.parseInt(c_bin2[i].toString())

            if (a + b + c == 0) {
                result.add(0)
                c = 0
            } else if (a + b + c == 1) {
                result.add(1)
                c = 0
            } else if (a + b + c == 2) {
                result.add(0)
                c = 1
            } else if (a + b + c == 3) {
                result.add(1)
                c = 1
            }

            if(i == 0 && c ==1){
                result.add(1)
            }

        }

        return result.reversed().joinToString ("")
    }
}

//Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2))