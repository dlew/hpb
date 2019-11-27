fun invert(data: Map<Book, List<Store>>): Map<Store, List<Book>> {
    return data.flatMap { (book, stores) -> stores.map { it to book } }
        .groupBy(
            keySelector = { (store) -> store },
            valueTransform = { (_, book) -> book }
        )
}
