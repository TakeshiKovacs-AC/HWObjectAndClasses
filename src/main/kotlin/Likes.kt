data class Likes(
    val count: Int,           //кол-во лайков
    val userLikes: Boolean,   //наличие лайка от текущего польз-ля
    val canLike: Boolean,     //может ли текущий пользователь лайкать
    val canPublish: Boolean   //может ли текущий пользователь репостить
)
