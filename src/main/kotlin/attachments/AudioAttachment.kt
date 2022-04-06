package attachments

data class AudioAttachment(
    override val type: String = "audio",
    override val currentType: Audio = Audio(0,0,0,0)
): Attachments