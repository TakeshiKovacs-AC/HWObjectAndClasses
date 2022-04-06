package attachments

data class Photo (
    override val id: Int,
    override val albumID: Int,
    override val ownerID: Int,
    override val userID: Int
): Type