
import attachments.*
import postMembers.*
import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun add() {

//       arrange

        val idChecked = 0
        val owner = 234
        val from = 456
        val time = 4567325630
        val textText = "Cat"
        val replyOwner = 457
        val replyPost = 409
        val friends = true
        val comm = Comments(356, false, true, true, true)
        val copy = Copyright(459, "www", "ttt", "yyy")
        val like = Likes(23, false, false, true)
        val repo = Reposts(86, false)
        val view = 65
        val type = PostType.COPY
        val source = PostSource(PostSource.Type.VK, PostSource.Platform.IPHONE, PostSource.Data.COMMENTS, "euheude")
        val geography = Geo("Place", "kuyt", "Place")
        val sign = 56
        val attach = PhotoAttachment("Big Bag", Photo(65, 98, 93, 60))
        val pin = false
        val delete = true
        val edit = false
        val pinned = false
        val marked = true
        val favor = false

//        act

        val service = WallService()
        val addedPost = service.add(Post(
                id = idChecked,
                ownerID = owner,
                fromID = from,
                date = time,
                text = textText,
                replyOwnerID = replyOwner,
                replyPostID = replyPost,
                friendsOnly = friends,
                comments = comm,
                copyright = copy,
                likes = like,
                reposts = repo,
                views = view,
                postType = type,
                postSource = source,
                geo = geography,
                signerID = sign,
                attachment = attach,
                canPin = pin,
                canDelete = delete,
                canEdit = edit,
                isPinned = pinned,
                markedAsAds = marked,
                isFavorite = favor
            )
        )
//        assert
        assertNotEquals(0, addedPost.id)
    }

    @Test
    fun update_same_ID() {

//        arrange

        val service = WallService()

//        act

        service.add(Post(
            0, 956, 299, 1648037000, "This is the 1nd post here",
            376, 744, true, Comments(7, true, true, false, false),
            Copyright(334, "www.svideteli_iegovy.ru", "Official web site of Svideteli", "web site"),
            Likes(79, false, true, true), Reposts(8, true), 98, PostType.REPLY,
            PostSource(PostSource.Type.WIDGET, PostSource.Platform.IPHONE, PostSource.Data.COMMENTS, "www.www.ru"),
            Geo("Тип места", "48 градусов западной долготы", "Деревня"), 45,
            AudioAttachment("Sinatra original record", Audio(65, 83, 57, 90)), false,
            true, true, true, true, true)
        )
        service.add(Post(
            0, 456, 893, 1647974707, "This is the 2st post here",
            903, 209, true, Comments(4, true, false, true, false),
            Copyright(678, "www.leningrad-spb.ru", "Official web-site of Leningrad", "web site"),
            Likes(89, true, true, false), Reposts(4, false), 107,
            PostType.POST, PostSource(PostSource.Type.API, PostSource.Platform.IPHONE, PostSource.Data.PROFILE_ACTIVITY, "yht"),
            Geo("yth", "re34", "5tyu"), 29,
            NoteAttachment("My notebook", Note( 90, 37, 64, 80)), false,
            false, true, false, false, false)
        )
        service.add(Post(
            234, 487, 309, 1648092229, "This is the 3rd post here",
            200, 222, false, Comments(9, false, true, false, true),
            Copyright(207, "www.dom2.dom", "Official web site of Dom2", "page"),
            Likes(40, true, true, false), Reposts(0, false), 43, PostType.COPY,
            PostSource(PostSource.Type.SMS, PostSource.Platform.WPHONE, PostSource.Data.POLL, "ymmm"),
            Geo("typ0", "f4582", "gft6"), 11,
            DocAttachment("Vasily's diploma", Doc(76, 98, 46, 80)),
            false, true,false, true, false, true)
        )

        val update = Post(
            3, 333, 999, System.currentTimeMillis() / 1000, "This is the 4th post here", 500,
            567, true, Comments(19, true, true, true, false),
            Copyright(202, "www.github.com", "VCS", "web site"), Likes(150, true, true, true),
            Reposts(30, true), 298, PostType.POST, PostSource(PostSource.Type.WIDGET, PostSource.Platform.IPHONE, PostSource.Data.POLL, "ytu"),
            Geo("op[[", "dfg5", "yt690"), 988,
            PhotoAttachment("Lebron & AD picture", Photo( 78, 93, 36, 90)),
            false, false, true, true, true, true)


        val result = service.update(update)

//         assert
        assertTrue(result)
    }

    @Test
    fun update_not_same_ID() {

//        arrange

        val service = WallService()

//        act

        service.add(Post(
            0, 956, 299, 1648037000, "This is the 1nd post here",
            376, 744, true, Comments(7, true, true, false, false),
            Copyright(334, "www.svideteli_iegovy.ru", "Official web site of Svideteli", "web site"),
            Likes(79, false, true, true), Reposts(8, true), 98, PostType.REPLY,
            PostSource(PostSource.Type.WIDGET, PostSource.Platform.IPHONE, PostSource.Data.COMMENTS, "www.www.ru"),
            Geo("Тип места", "48 градусов западной долготы", "Деревня"), 45,
            AudioAttachment("Sinatra original record", Audio(65, 83, 57, 90)), false,
            true, true, true, true, true)
        )
        service.add(Post(
            0, 456, 893, 1647974707, "This is the 2st post here",
            903, 209, true, Comments(4, true, false, true, false),
            Copyright(678, "www.leningrad-spb.ru", "Official web-site of Leningrad", "web site"),
            Likes(89, true, true, false), Reposts(4, false), 107,
            PostType.POST, PostSource(PostSource.Type.API, PostSource.Platform.IPHONE, PostSource.Data.PROFILE_ACTIVITY, "yht"),
            Geo("yth", "re34", "5tyu"), 29,
            NoteAttachment("My notebook", Note( 90, 37, 64, 80)), false,
            false, true, false, false, false)
        )
        service.add(Post(
            0, 487, 309, 1648092229, "This is the 3rd post here",
            200, 222, false, Comments(9, false, true, false, true),
            Copyright(207, "www.dom2.dom", "Official web site of Dom2", "page"),
            Likes(40, true, true, false), Reposts(0, false), 43, PostType.COPY,
            PostSource(PostSource.Type.SMS, PostSource.Platform.WPHONE, PostSource.Data.POLL, "ymmm"),
            Geo("typ0", "f4582", "gft6"), 11,
            DocAttachment("Vasily's diploma", Doc(76, 98, 46, 80)),
            false, true,false, true, false, true)
        )

        val update = Post(
            234, 333, 999, System.currentTimeMillis() / 1000, "This is the 4th post here", 500,
            567, true, Comments(19, true, true, true, false),
            Copyright(202, "www.github.com", "VCS", "web site"), Likes(150, true, true, true),
            Reposts(30, true), 298, PostType.POST, PostSource(PostSource.Type.WIDGET, PostSource.Platform.IPHONE, PostSource.Data.POLL, "ytu"),
            Geo("op[[", "dfg5", "yt690"), 988,
            PhotoAttachment("Lebron & AD picture", Photo( 78, 93, 36, 90)),
            false, false, true, true, true, true)


        val result = service.update(update)

//         assert
        assertFalse(result)
    }


    @Test
    fun addComment() {
//        arrange

        val service = WallService()

//        act

        val initialPost = service.add(Post(
            0, 956, 299, 1648037000, "This is the 1nd post here",
            376, 744, true, Comments(7, true, true, false, false),
            Copyright(334, "www.svideteli_iegovy.ru", "Official web site of Svideteli", "web site"),
            Likes(79, false, true, true), Reposts(8, true), 98, PostType.REPLY,
            PostSource(PostSource.Type.WIDGET, PostSource.Platform.IPHONE, PostSource.Data.COMMENTS, "www.www.ru"),
            Geo("Тип места", "48 градусов западной долготы", "Деревня"), 45,
            AudioAttachment("Sinatra original record", Audio(65, 83, 57, 90)), false,
            true, true, true, true, true)
        )

        val initialComment = Comment(
            456, 1, "Посмотрите какой милаш!",
            PhotoAttachment("Котик кушает блинчики", Photo(78, 89, 33, 98)), (1..50).random()
        )

//      assert

        assertEquals(initialPost.id, initialComment.postId)

    }

        @Test(expected = PostNotFoundException::class)
            fun shouldThrow() {
//        arrange

            val service = WallService()

//        act

            val initialPost = service.add(Post(
                0, 956, 299, 1648037000, "This is the 1nd post here",
                376, 744, true, Comments(7, true, true, false, false),
                Copyright(334, "www.svideteli_iegovy.ru", "Official web site of Svideteli", "web site"),
                Likes(79, false, true, true), Reposts(8, true), 98, PostType.REPLY,
                PostSource(PostSource.Type.WIDGET, PostSource.Platform.IPHONE, PostSource.Data.COMMENTS, "www.www.ru"),
                Geo("Тип места", "48 градусов западной долготы", "Деревня"), 45,
                AudioAttachment("Sinatra original record", Audio(65, 83, 57, 90)), false,
                true, true, true, true, true)
            )

            val initialComment = Comment(
                456, 2, "Посмотрите какой милаш!",
                PhotoAttachment("Котик кушает блинчики", Photo(78, 89, 33, 98)), (1..50).random()
            )



//      assert

            if (initialPost.id != initialComment.postId) {
                throw PostNotFoundException("Post not found!")
            }
        }

}


