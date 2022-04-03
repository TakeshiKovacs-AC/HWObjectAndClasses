package attachments

class NoteAttachment(
    override val type: Note,
    override val id: Int,
    override val albumID: Int,
    override val ownerID: Int,
    override val userID: Int
): Attachments {
}