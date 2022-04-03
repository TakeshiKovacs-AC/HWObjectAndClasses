package postMembers

data class Geo (
    val type: String,    // тип места
    val coordinates: String,  // координаты
    val place: String       // описание места
        ) {
}