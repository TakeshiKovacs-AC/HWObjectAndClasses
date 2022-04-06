package attachments

data class Video (
    override val id: Int,
    override val albumID: Int,
    override val ownerID: Int,
    override val userID: Int
   ): Type