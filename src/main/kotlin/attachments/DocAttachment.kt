package attachments

data class DocAttachment(
    override val type: String = "doc",
    override val currentType: Doc = Doc(0,0,0,0)
): Attachments