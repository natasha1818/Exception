import java.lang.Thread

data class Comment(
    val id: Int,  //Идентификатор комментария
    val fromId: Int, //Идентификатор автора комментария
    val date: String, //Дата комментария
    val text: String, //Текс комментария
    val replyToUser: Int, //Идентификатор пользователя или сообщества, где оставлен комментарий
    val thread: Thread
    )
object Thread {
    val count: Int = 0     //количество комментариев
    val canPost: Boolean = false  //может ли текущий пользователь комментировать запись
    val groupsCanPost: Boolean = false //могут ли сообщества комментировать запись
    val canClose: Boolean = false //может ли текущий пользователь закрыть комментарии к записи
    val canOpen: Boolean = false //может ли текущий пользователь открыть комментарии к записи
}