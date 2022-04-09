class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        if (posts.isEmpty()) {
            post.id = 1
        } else {
            post.id = posts.last().id + 1
        }
        posts += post
        return post
    }

    fun update(post: Post): Boolean {
        for ((index, element) in posts.withIndex()) {
            if (element.id == post.id) {
                posts[index] = post.copy(ownerID = element.ownerID, date = element.date)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
            }
        }
        if (!comments.contains(comment)) {
            throw PostNotFoundException("Поста с id ${comment.postId} не существует, комментарий не может быть добавлен!")
        }
    }
}








