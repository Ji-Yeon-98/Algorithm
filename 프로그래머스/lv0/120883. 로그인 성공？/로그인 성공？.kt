class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = ""
        var db_filter = db.filter { it -> it[0] == id_pw[0]}
    
        if(db_filter.isEmpty()){
            answer = "fail"
        }else{
            for(db in db_filter){
                if(db[1] == id_pw[1]){
                    answer = "login"
                }else if(db[1] != id_pw[1]){
                    answer = "wrong pw"
                }
            }
        }
        
        return answer
    }
}