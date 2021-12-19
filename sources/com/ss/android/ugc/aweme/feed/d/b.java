package com.ss.android.ugc.aweme.feed.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.aweme.video.preload.s;

public final class b {
    static {
        Covode.recordClassIndex(58920);
    }

    public static void a(Aweme aweme) {
        s.b().d();
        ac.a(aweme, 0);
        if (aweme != null && aweme.getVideo() != null) {
            aweme.getVideo().setSourceId(aweme.getAid());
            VideoUrlModel properPlayAddr = aweme.getVideo().getProperPlayAddr();
            if (properPlayAddr != null) {
                properPlayAddr.setSourceId(aweme.getAid());
            }
        }
    }
}
