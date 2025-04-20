fun main() {

    val secondsInSpace: Int = 6480
    val hour = secondsInSpace / 3600
    val minutes = secondsInSpace / 60 - 60

    print("0$hour:$minutes:00")
}