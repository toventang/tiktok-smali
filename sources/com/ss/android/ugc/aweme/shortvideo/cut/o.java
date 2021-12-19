package com.ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f125514a = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(82368);
    }

    public static boolean a(VideoSegment videoSegment) {
        if (videoSegment == null) {
            return false;
        }
        int i2 = videoSegment.f125482f;
        int i3 = videoSegment.f125483g;
        if (i2 > i3) {
            i3 = i2;
            i2 = i3;
        }
        if (i2 < 1080 && i3 < 1920) {
            return true;
        }
        if (i2 > 1080 || i3 > 1920 || videoSegment.a() >= 35) {
            return false;
        }
        return true;
    }
}
