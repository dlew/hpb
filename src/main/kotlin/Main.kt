fun main() {
    val booksAtStores = BOOKS.associateWith {
        println("Downloading/parsing ${it.name}...")
        parse(download(it.url))
    }
    val storesWithBooks = invert(booksAtStores)
    val results = storesWithBooks.map { (store, books) -> StoreWithBooks(store, books) }
        .sortedByDescending { it.books.size }

    println("### Local Hits ###")
    printResults(results.filter { it.store.storeNumber in LOCAL_STORES })
    println()

    println("### All Results ###")
    printResults(results)
}

private fun printResults(results: List<StoreWithBooks>) {
    results.forEach {
        val bookList = it.books.map { it.name }.joinToString(", ")
        println("${it.store.name}: ${it.books.size} ($bookList)")
    }
}

private data class StoreWithBooks(
    val store: Store,
    val books: List<Book>
)

// Workaround for Gradle application plugin
class Main