class WallService {
    private var posts = emptyArray<Post>()

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
}







