class WallService {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return post
    }

    fun update(post: Post): Boolean {
        for ((index, element) in posts.withIndex()) {
            if (element.id == post.id) {
                posts[index] = element.copy(
                    id = post.id, fromID = post.fromID, text = post.text,
                    replyOwnerID = post.replyOwnerID, replyPostID = post.replyPostID, friendsOnly = post.friendsOnly,
                    comments = post.comments, copyright = post.copyright, likes = post.likes, reposts = post.reposts,
                    views = post.views, postType = post.postType, canPin = post.canPin, canDelete = post.canDelete,
                    canEdit = post.canEdit, isPinned = post.isPinned, markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite, donut = post.donut
                )
                return true
            }
        else {
            element
            }
        }
        return false
    }
}







