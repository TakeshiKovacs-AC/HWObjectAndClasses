package attachments

data class NoteAttachment(
    override val type: String = "note",
    override val currentType: Note = Note(0,0,0,0)
): Attachments