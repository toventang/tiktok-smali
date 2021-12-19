package com.ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f126084a = new u();

    private u() {
    }

    static {
        Covode.recordClassIndex(82803);
    }

    public static final VEUtils.VEVideoFileInfo a(String str) {
        l.d(str, "");
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (!(videoFileInfo == null || videoFileInfo.rotation % LiveFeedRefreshTimeSetting.DEFAULT == 0)) {
            int i2 = videoFileInfo.height;
            videoFileInfo.height = videoFileInfo.width;
            videoFileInfo.width = i2;
        }
        return videoFileInfo;
    }
}
