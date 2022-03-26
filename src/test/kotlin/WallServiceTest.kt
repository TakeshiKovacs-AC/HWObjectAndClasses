
import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun add() {

//       arrange

        val idChecked = (1..1000).random()
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
        val pin = false
        val delete = true
        val edit = false
        val pinned = false
        val marked = true
        val favor = false
        val don = Donut(false, Donut.payedDurationTypes.DAY, true, true, Donut.EditModeTypes.ALL)

//        act

        val service = WallService()
        service.add(Post(
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
                canPin = pin,
                canDelete = delete,
                canEdit = edit,
                isPinned = pinned,
                markedAsAds = marked,
                isFavorite = favor,
                donut = don
            )
        )
//        assert
        assertNotEquals(0, idChecked)
    }

    @Test
    fun update_same_ID() {

//        arrange

        val service = WallService()

//        act

        service.add(Post(
            (1..1000).random(), 956, 299, 1648037000, "This is the 2nd post here",
            376, 744, true, Comments(7, true, true, false, false),
            Copyright(334, "www.svideteli_iegovy.ru", "Official web site of Svideteli", "web site"),
            Likes(79, false, true, true), Reposts(8, true), 98, PostType.REPLY,
            true, false, false, true, true, false,
            Donut(false, Donut.payedDurationTypes.NONE, false, false, Donut.EditModeTypes.DURATION))
        )
        service.add(Post(
            (1..1000).random(), 456, 893, 1647974707, "This is the 1st post here",
            903, 209, true, Comments(4, true, false, true, false),
            Copyright(209, "www.leningrad-spb.ru", "Official web-site of Leningrad", "web site"),
            Likes(89, true, true, false), Reposts(4, false), 107,
            PostType.POST, true, true, true, true, false, false,
            Donut(true, Donut.payedDurationTypes.WEEK, true, true, Donut.EditModeTypes.DURATION))
        )
        service.add(Post(
            234, 487, 309, 1648092229, "This is the 3rd post here",
            200, 222, false, Comments(9, false, true, false, true),
            Copyright(101, "www.dom2.dom", "Official web site of Dom2", "page"),
            Likes(40, true, true, false), Reposts(0, false), 43, PostType.COPY,
            false, false, true, true, false, true,
            Donut(false, Donut.payedDurationTypes.NONE, false, false, Donut.EditModeTypes.DURATION))
        )

        val update = Post(
            234, 333, 999, System.currentTimeMillis() / 1000, "This is the 4th post here", 500,
            567, true, Comments(19, true, true, true, false),
            Copyright(202, "www.github.com", "VCS", "web site"), Likes(150, true, true, true),
            Reposts(30, true), 298, PostType.POST, true, true, true, false, false,
            false, Donut(true, Donut.payedDurationTypes.YEAR, true, true, Donut.EditModeTypes.ALL))


        val result = service.update(update)

//         assert
        assertFalse(result)
    }

    @Test
    fun update_not_same_ID() {

//        arrange

        val service = WallService()

//        act

        service.add(Post(
            (1..1000).random(), 956, 299, 1648037000, "This is the 2nd post here",
            376, 744, true, Comments(7, true, true, false, false),
            Copyright(334, "www.svideteli_iegovy.ru", "Official web site of Svideteli", "web site"),
            Likes(79, false, true, true), Reposts(8, true), 98, PostType.REPLY,
            true, false, false, true, true, false,
            Donut(false, Donut.payedDurationTypes.NONE, false, false, Donut.EditModeTypes.DURATION))
        )
        service.add(Post(
            (1..1000).random(), 456, 893, 1647974707, "This is the 1st post here",
            903, 209, true, Comments(4, true, false, true, false),
            Copyright(209, "www.leningrad-spb.ru", "Official web-site of Leningrad", "web site"),
            Likes(89, true, true, false), Reposts(4, false), 107,
            PostType.POST, true, true, true, true, false, false,
            Donut(true, Donut.payedDurationTypes.WEEK, true, true, Donut.EditModeTypes.DURATION))
        )
        service.add(Post(
            235, 487, 309, 1648092229, "This is the 3rd post here",
            200, 222, false, Comments(9, false, true, false, true),
            Copyright(101, "www.dom2.dom", "Official web site of Dom2", "page"),
            Likes(40, true, true, false), Reposts(0, false), 43, PostType.COPY,
            false, false, true, true, false, true,
            Donut(false, Donut.payedDurationTypes.NONE, false, false, Donut.EditModeTypes.DURATION))
        )

        val update = Post(
            234, 333, 999, System.currentTimeMillis() / 1000, "This is the 4th post here", 500,
            567, true, Comments(19, true, true, true, false),
            Copyright(202, "www.github.com", "VCS", "web site"), Likes(150, true, true, true),
            Reposts(30, true), 298, PostType.POST, true, true, true, false, false,
            false, Donut(true, Donut.payedDurationTypes.YEAR, true, true, Donut.EditModeTypes.ALL))


        val result = service.update(update)

//         assert
        assertFalse(result)
    }

}


