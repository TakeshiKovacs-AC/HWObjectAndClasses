package attachments

data class Note (
    override val id: Int,
    override val albumID: Int,
    override val ownerID: Int,
    override val userID: Int
): Type