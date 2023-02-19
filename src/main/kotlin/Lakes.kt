data class Lakes (
    var count: Int, //количество лайков
    val userLikes: Boolean = true, //наличие отметки мне нравиться
    val canLike: Boolean = true, // может ли текущий пользователь поставить отметку мне нравиться
    val canPublish:Boolean = true //может ли текущий пользователь сделать репост записи
)