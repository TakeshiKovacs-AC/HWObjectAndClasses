package postMembers

data class PostSource(
    val type: Type,
    val platform: Platform,
    val data: Data,
    val url: String
) {

    enum class Type {
        VK, WIDGET, API, RSS, SMS
    }

    enum class Platform {
        ANDROID, IPHONE, WPHONE
    }

    enum class Data {
        PROFILE_ACTIVITY, PROFILE_PHOTO, COMMENTS, LIKE, POLL
    }
}

