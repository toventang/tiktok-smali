package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f93085a = new q();

    private q() {
    }

    static {
        Covode.recordClassIndex(59033);
    }

    public static final boolean b() {
        if (f() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean c() {
        if (f() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean d() {
        if (f() == 2) {
            return true;
        }
        return false;
    }

    private static int f() {
        FeedDescSeeMoreConfig e2 = e();
        if (e2 != null) {
            return e2.getGroupId();
        }
        return 0;
    }

    public static final float a() {
        FeedDescSeeMoreConfig e2 = e();
        if (e2 != null) {
            float opacity = e2.getOpacity();
            if (opacity >= 0.18f && opacity <= 0.7f) {
                return e2.getOpacity();
            }
        }
        return 0.18f;
    }

    private static final FeedDescSeeMoreConfig e() {
        try {
            return (FeedDescSeeMoreConfig) b.a().a(true, "feed_desc_see_more_optimize", FeedDescSeeMoreConfig.class);
        } catch (Exception unused) {
            return new FeedDescSeeMoreConfig(0, 0.18f);
        }
    }
}
