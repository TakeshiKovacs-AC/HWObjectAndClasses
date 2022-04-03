package attachments

class VideoAttachment(
    override val type: Video,
    override val id: Int,
    override val albumID: Int,
    override val ownerID: Int,
    override val userID: Int
): Attachments {
}