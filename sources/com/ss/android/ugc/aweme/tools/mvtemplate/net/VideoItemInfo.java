package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class VideoItemInfo extends DataBaseResponse {
    @c(a = "video")
    private VideoItem videoItem;

    static {
        Covode.recordClassIndex(91988);
    }

    public final VideoItem getVideoItem() {
        return this.videoItem;
    }

    public final void setVideoItem(VideoItem videoItem2) {
        this.videoItem = videoItem2;
    }
}
