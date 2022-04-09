import attachments.Attachments

data class Comment(
    val ownerId: Int, //идентификатор пользователя, на чьей стене комментируют
    val postId: Int,   //идентификатор записи на стене
    val message: String,  //сообщение
    val attachments: Attachments,   //вложение
    val guid: Int   //идентификатор коммента
)
