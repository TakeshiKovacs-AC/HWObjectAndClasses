data class Donut(
    val isDonut: Boolean,    //запись доступна только платным подписчикам VK Donut
    val payedDuration: payedDurationTypes,   //время, в течение которого запись будет доступна только платным подписчикам
    val placeHolder: Boolean,   //оформлена ли подписка
    val canPublishFreeCopy: Boolean,   //можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    val editMode: EditModeTypes,     // информация о том, какие значения VK Donut можно изменить в записи
) {
enum class EditModeTypes{
    ALL, DURATION
}
    enum class payedDurationTypes {
        NONE, DAY, WEEK, MONTH, YEAR
    }
}
