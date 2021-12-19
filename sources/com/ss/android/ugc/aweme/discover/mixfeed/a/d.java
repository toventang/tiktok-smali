package com.ss.android.ugc.aweme.discover.mixfeed.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f81635a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(50729);
    }

    public static final String a(Aweme aweme) {
        VideoTag videoTag;
        String englishTitle;
        if (aweme != null) {
            if (aweme.getNewLabel() == 1) {
                return "New";
            }
            Video video = aweme.getVideo();
            if (video == null || (videoTag = video.getVideoTag()) == null || (englishTitle = videoTag.getEnglishTitle()) == null) {
                return "";
            }
            return englishTitle;
        }
        return "";
    }
}
