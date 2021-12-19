package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;

public enum fp {
    FEED_REQ("feed_req"),
    VIDEO_REQ("video_req"),
    LOAD_MAIN("load_main"),
    FROM_SEND_TO_FIRST("from_send_to_first"),
    FEED_FIRST_VIDEO_PRELOAD("feed_first_video_preload"),
    FEED_FIRST_REQUEST_RESPONSE("feed_first_request_response"),
    FIRST_FRAME("first_frame"),
    FOCUS_TO_FEED_START("focus_to_feed_start"),
    FOCUS_TO_FEED_END("focus_to_feed_end"),
    FEED_TO_FIRST_FRAME_START("feed_to_first_frame_start"),
    FEED_TO_FIRST_FRAME_END("feed_to_first_frame_end"),
    FIRST_VIDEO_PLAY_START("first_video_play_start"),
    FIRST_VIDEO_PLAY_END("first_video_play_end"),
    PLAYER_FIRST_VIDEO_PREPARED("player_first_video_prepared"),
    TAKE_LIVE_BUBBLE("take_live_bubble"),
    FEED_CACHE_VIDEO("feed_cache_video"),
    ON_RENDER_READY("on_render_ready");
    
    private String name;

    public final String getName() {
        return this.name;
    }

    static {
        Covode.recordClassIndex(93533);
    }

    private fp(String str) {
        this.name = str;
    }
}
