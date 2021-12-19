package com.ss.android.ugc.aweme.common.widget;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.experiment.ad;
import com.ss.android.ugc.aweme.framework.a.a;

public final class d {
    static {
        Covode.recordClassIndex(47270);
    }

    public static void a(String str) {
        if (ad.b()) {
            a.a(3, "FeedNotOnRenderFirstFrameLog", str);
        }
    }
}
