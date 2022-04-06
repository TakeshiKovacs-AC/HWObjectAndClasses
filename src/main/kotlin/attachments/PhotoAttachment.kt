package attachments

data class PhotoAttachment(
    override val type: String = "photo",
    override val currentType: Photo = Photo(0,0,0,0)
): Attachments