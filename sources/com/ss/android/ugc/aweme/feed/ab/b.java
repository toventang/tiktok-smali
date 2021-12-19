package com.ss.android.ugc.aweme.feed.ab;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f91463a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(57551);
    }

    public static final int b() {
        BottomGradualOptimizeConfig a2 = a();
        if (a2 != null) {
            return a2.getGroupId();
        }
        return 0;
    }

    public static final BottomGradualOptimizeConfig a() {
        try {
            return (BottomGradualOptimizeConfig) com.bytedance.ies.abmock.b.a().a(true, "feed_bottom_gradual_optimize", BottomGradualOptimizeConfig.class);
        } catch (Exception unused) {
            return new BottomGradualOptimizeConfig(0, 0.18f);
        }
    }
}
