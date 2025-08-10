package patterns.common

fun List<String?>.headWords(): List<String?> {
    val listStrings: MutableList<String?> = mutableListOf()
    for (str in this) {
        if (str.isNullOrEmpty()) {
            continue
        }

        val words = str.split(" ")

        if (words.size > 1) {
            words.map { word ->
                word.lowercase().replaceFirstChar { it.uppercase() }
            }.forEach { listStrings.add(it) }
        } else {
            listStrings.add(str.lowercase().replaceFirstChar { it.uppercase() })
        }
    }

    return listStrings.toList()
}