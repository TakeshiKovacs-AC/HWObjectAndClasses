import attachments.*
import postMembers.*

fun main() {

    val wallService = WallService()
    val post1 = Post(
        (1..1000).random(), 956, 299, 1648037000, "This is the 2nd post here",
        376, 744, true, Comments(7, true, true, false, false),
        Copyright(334, "www.svideteli_iegovy.ru", "Official web site of Svideteli", "web site"),
        Likes(79, false, true, true), Reposts(8, true), 98, PostType.REPLY,
        PostSource(PostSource.Type.WIDGET, PostSource.Platform.IPHONE, PostSource.Data.COMMENTS, "www.www.ru"),
        Geo("Тип места", "48 градусов западной долготы", "Деревня"), 45,
        AudioAttachment(Audio(), 567, 789, 756, 63),
        false, true, true, true, true, true
    )

    val post2 = Post(
        (1..1000).random(), 456, 893, 1647974707, "This is the 1st post here",
        903, 209, true, Comments(4, true, false, true, false),
        Copyright(678, "www.leningrad-spb.ru", "Official web-site of Leningrad", "web site"),
        Likes(89, true, true, false), Reposts(4, false), 107,
        PostType.POST, PostSource(PostSource.Type.API, PostSource.Platform.IPHONE, PostSource.Data.PROFILE_ACTIVITY, "yht"),
        Geo("yth", "re34", "5tyu"), 29, VideoAttachment(Video(), 67, 90, 37, 64),
        false, false, true, false, false, false
    )

    val post3 = Post(
        234, 487, 309, 1648092229, "This is the 3rd post here",
        200, 222, false, Comments(9, false, true, false, true),
        Copyright(207, "www.dom2.dom", "Official web site of Dom2", "page"),
        Likes(40, true, true, false), Reposts(0, false), 43, PostType.COPY,
        PostSource(PostSource.Type.SMS, PostSource.Platform.WPHONE, PostSource.Data.POLL, "ymmm"),
        Geo("typ0", "f4582", "gft6"), 11, NoteAttachment(Note(), 76, 98, 46, 80),
        false, true,false, true, false, true
    )

    val post4 = Post(
        234, 333, 999, System.currentTimeMillis() / 1000, "This is the 4th post here", 500,
        567, true, Comments(19, true, true, true, false),
        Copyright(202, "www.github.com", "VCS", "web site"), Likes(150, true, true, true),
        Reposts(30, true), 298, PostType.POST, PostSource(PostSource.Type.WIDGET, PostSource.Platform.IPHONE, PostSource.Data.POLL, "ytu"),
        Geo("op[[", "dfg5", "yt690"), 988, DocAttachment(Doc(), 78, 93, 36, 90),
        false, false, true, true, true, true
    )

    wallService.add(post1)
    wallService.add(post2)
    wallService.add(post3)
    wallService.update(post4)

    for(post in wallService.posts)
        println(post)
        println()
}