import attachments.*
import postMembers.*

fun main() {

    val wallService = WallService()

    val post0 = Post(
        0, 95, 29, 1648037700, "This is ZERO post here",
        37, 74, true, Comments(9, true, true, false, false),
        Copyright(34, "rrrr", "bbbb", "web site"),
        Likes(9, false, true, true), Reposts(9, true), 978, PostType.REPLY,
        PostSource(PostSource.Type.WIDGET, PostSource.Platform.IPHONE, PostSource.Data.COMMENTS, "www.www.ru"),
        Geo("Тип места", "48 градусов западной долготы", "Деревня"), 85,
        VideoAttachment("Kitty eating pancakes", Video(35, 97, 65, 24)),
        true, true, false,false, true, true
    )
    val post1 = Post(
        0, 956, 299, 1648037000, "This is the 1nd post here",
        376, 744, true, Comments(7, true, true, false, false),
        Copyright(334, "www.svideteli_iegovy.ru", "Official web site of Svideteli", "web site"),
        Likes(79, false, true, true), Reposts(8, true), 98, PostType.REPLY,
        PostSource(PostSource.Type.WIDGET, PostSource.Platform.IPHONE, PostSource.Data.COMMENTS, "www.www.ru"),
        Geo("Тип места", "48 градусов западной долготы", "Деревня"), 45,
        AudioAttachment("Sinatra original record", Audio(65, 83, 57, 90)), false,
        true, true, true, true, true
    )

    val post2 = Post(
        0, 456, 893, 1647974707, "This is the 2st post here",
        903, 209, true, Comments(4, true, false, true, false),
        Copyright(678, "www.leningrad-spb.ru", "Official web-site of Leningrad", "web site"),
        Likes(89, true, true, false), Reposts(4, false), 107,
        PostType.POST, PostSource(PostSource.Type.API, PostSource.Platform.IPHONE, PostSource.Data.PROFILE_ACTIVITY, "yht"),
        Geo("yth", "re34", "5tyu"), 29,
        NoteAttachment("My notebook", Note( 90, 37, 64, 80)), false,
        false, true, false, false, false
    )

    val post3 = Post(
        0, 487, 309, 1648092229, "This is the 3rd post here",
        200, 222, false, Comments(9, false, true, false, true),
        Copyright(207, "www.dom2.dom", "Official web site of Dom2", "page"),
        Likes(40, true, true, false), Reposts(0, false), 43, PostType.COPY,
        PostSource(PostSource.Type.SMS, PostSource.Platform.WPHONE, PostSource.Data.POLL, "ymmm"),
        Geo("typ0", "f4582", "gft6"), 11,
        DocAttachment("Vasily's diploma", Doc(76, 98, 46, 80)),
        false, true,false, true, false, true
    )

    val post4 = Post(
        4, 333, 999, System.currentTimeMillis() / 1000, "This is the 4th post here", 500,
        567, true, Comments(19, true, true, true, false),
        Copyright(202, "www.github.com", "VCS", "web site"), Likes(150, true, true, true),
        Reposts(30, true), 298, PostType.POST, PostSource(PostSource.Type.WIDGET, PostSource.Platform.IPHONE, PostSource.Data.POLL, "ytu"),
        Geo("op[[", "dfg5", "yt690"), 988,
        PhotoAttachment("Lebron & AD picture", Photo( 78, 93, 36, 90)),
        false, false, true, true, true, true
    )

    wallService.add(post0)
    wallService.add(post1)
    wallService.add(post2)
    wallService.add(post3)
    wallService.update(post4)

//    for(post in wallService.posts)
//        println(post)
//        println()
}