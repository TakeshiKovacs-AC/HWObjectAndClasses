package attachments

class DocAttachment(
    override val type: Doc,
    override val id: Int,
    override val albumID: Int,
    override val ownerID: Int,
    override val userID: Int
): Attachments