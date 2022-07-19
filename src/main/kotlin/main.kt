fun main() {
    val likes = 62
    val ending = if ((likes % 100) !== 11 && (likes % 10) == 1) "человеку" else "людям"

    println("Понравилось $likes $ending")
}
