fun main(args: Array<String>) {

    val s1=Student(name = "Ahmed", roll = 2346546)
    val p1=Person(name = "Abir", nid = 231524654)

    println(s1)
    println(p1)

}

class Student(val name:String, val roll:Int){
    fun getInfo() = ""
    override fun toString(): String {
        return "Student(name='$name', roll=$roll)"
    }

}

data class  Person(val name:String, val nid:Int)
