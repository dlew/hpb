private val SOLD_BY_REGEX = Regex("<span class=\"mkt-sold-by\"><a href=\"/(\\w+)\">([\\w ]+)</a></span>")

fun parse(html: String): List<Store> {
    return SOLD_BY_REGEX.findAll(html)
        .map { Store(name = it.groupValues[2], storeNumber = it.groupValues[1]) }
        .distinct() // Stores can have multiple instances, but we only care if it exists in the system at all
        .toList()
}