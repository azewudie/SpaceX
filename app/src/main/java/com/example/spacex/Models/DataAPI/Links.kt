package com.example.spacex.Models.DataAPI

data class Links(
    var article_link: String?, // https://www.space.com/2196-spacex-inaugural-falcon-1-rocket-lost-launch.html
    var flickr_images: List<String?>?,
    var mission_patch: String?, // https://images2.imgbox.com/40/e3/GypSkayF_o.png
    var mission_patch_small: String?, // https://images2.imgbox.com/3c/0e/T8iJcSN3_o.png
    var presskit: String?, // http://www.spacex.com/press/2012/12/19/spacexs-falcon-1-successfully-delivers-razaksat-satellite-orbit
    var reddit_campaign: String?, // https://www.reddit.com/r/spacex/comments/4gyh8z
    var reddit_launch: String?, // https://www.reddit.com/r/space/comments/19gm5f/live_coverage_spacex_crs2_launch_to_the_iss/c8nvah4
    var reddit_media: String?, // https://www.reddit.com/r/spacex/comments/2xmumx
    var reddit_recovery: String?, // https://www.reddit.com/r/spacex/comments/4ee2zy
    var video_link: String?, // https://www.youtube.com/watch?v=0a_00nJ_Y88
    var wikipedia: String?, // https://en.wikipedia.org/wiki/DemoSat
    var youtube_id: String? // 0a_00nJ_Y88
)