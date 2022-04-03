import attachments.Attachments
import postMembers.*

data class Post(
    val id: Int = 0,  //идентификатор записи
    val ownerID: Int,   //идентификатор владельца стены
    val fromID: Int,   //идентификатор автора записи
    val date: Long,     //время публикации
    val text: String,   //текст
    val replyOwnerID: Int,    //Идентификатор владельца записи, в ответ на которую была оставлена текущая
    val replyPostID: Int,    //Идентификатор записи, в ответ на которую была оставлена текущая
    val friendsOnly: Boolean,   //Идентификатор, если запись только для друзей
    val comments: Comments?,    //инфо о комментах к записи
    val copyright: Copyright,    //источник материала
    val likes: Likes?,          //инфо о лайках
    val reposts: Reposts?,      //инфо о репостах
    val views: Int?,           //инфо о просмотрах записи
    val postType: PostType,    //тип записи
    val postSource: PostSource,  //способ размещения записи на стене
    val geo: Geo,              // местоположение
    val signerID: Int,      // идентификатор автора при публикации от имени сообщества
    val attachment: Attachments,   // вложения
    val canPin: Boolean,       //Информация о том, может ли текущий пользователь закрепить запись
    val canDelete: Boolean,    //Информация о том, может ли текущий пользователь удалить запись
    val canEdit: Boolean,      //Информация о том, может ли текущий пользователь редактировать запись
    val isPinned: Boolean,     //закреплена ли запись
    val markedAsAds: Boolean,  //содержит ли запись рекламу
    val isFavorite: Boolean,   //добавлен ли объект в закладки
)
