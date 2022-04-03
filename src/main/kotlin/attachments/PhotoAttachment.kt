package attachments

class PhotoAttachment(
    override val type: Photo,
    override val id: Int,
    override val albumID: Int,
    override val ownerID: Int,
    override val userID: Int
): Attachments