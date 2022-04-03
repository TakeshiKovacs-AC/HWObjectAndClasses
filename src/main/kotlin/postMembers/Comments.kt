package postMembers

data class Comments(
    val count: Int,            //кол-во комментов
    val canPost: Boolean,      //может ли текущий пользователь коммент запись
    val groupsCanPost: Boolean,   //могут ли сообщества коммент запись
    val canClose: Boolean,    //может ли текущий пользователь закрыть комментарии к записи
    val canOpen: Boolean      //может ли текущий пользователь открыть комментарии к записи;
)