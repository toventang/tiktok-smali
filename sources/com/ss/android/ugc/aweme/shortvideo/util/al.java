package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import h.f.b.l;

public final class al {
    static {
        Covode.recordClassIndex(86586);
    }

    public static final boolean a(VideoSegment videoSegment) {
        l.d(videoSegment, "");
        try {
            if (ak.a(Math.min(videoSegment.f125482f, videoSegment.f125483g), Math.max(videoSegment.f125482f, videoSegment.f125483g), videoSegment.a()).getFirst().intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            bj.b(e2.getMessage());
            return false;
        }
    }
}
