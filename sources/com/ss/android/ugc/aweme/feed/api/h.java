package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static volatile IFeedModuleService f91945a;

    static {
        Covode.recordClassIndex(57897);
    }

    public static IFeedModuleService a() {
        if (f91945a == null) {
            f91945a = FeedModuleServiceImpl.a();
        }
        return f91945a;
    }

    public static boolean b() {
        return a().canResumePlay();
    }
}
