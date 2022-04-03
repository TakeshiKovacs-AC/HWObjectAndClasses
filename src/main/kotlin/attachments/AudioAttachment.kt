package attachments

class AudioAttachment(
    override val type: Audio,
    override val id: Int,
    override val albumID: Int,
    override val ownerID: Int,
    override val userID: Int
): Attachments {
}