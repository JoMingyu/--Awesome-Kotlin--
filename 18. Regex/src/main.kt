fun main(args: Array<String>) {
    val s: String = "abd211zsd"
    println(s.matches(Regex("\\w\\w+")))

    val regex: Regex = Regex("[a-z]+")
    val result: MatchResult? = regex.find(s)

    if(result != null) {
        val groups: MatchGroupCollection = result.groups
        for(group: MatchGroup? in groups) {
            println(group.)
        }
    }
}
