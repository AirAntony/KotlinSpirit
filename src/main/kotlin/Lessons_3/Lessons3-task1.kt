package Lessons_3

fun main() {
    val numberOfStudents: Int = 4
    val firstStudentScore: Float = 3.0F
    val secondStudentScore: Float = 4.0F
    val thirdStudentScore: Float = 3.0F
    val fourthStudentScore: Float = 5.0F

    val gradePintAverage =
        (firstStudentScore + secondStudentScore + thirdStudentScore + fourthStudentScore) / numberOfStudents

    println(gradePintAverage)
}