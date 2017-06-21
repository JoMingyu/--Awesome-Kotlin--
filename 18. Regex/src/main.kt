fun main(args: Array<String>) {
    val s: String = "abd211zsd"
    println(s.matches(Regex("\\w\\w+")))

    val regex: Regex = Regex("[a-z]+")
    val result = regex.findAll(s)

    for(res: MatchResult in result) {
        println(res.value)
    }
}
