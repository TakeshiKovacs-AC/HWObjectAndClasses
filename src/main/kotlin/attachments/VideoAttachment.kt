package attachments

data class VideoAttachment(
    override val type: String = "video",
    override val currentType: Video = Video(0,0,0,0)
): Attachments