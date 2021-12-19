package com.ss.android.ugc.aweme.main.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static f f109250a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f109251b = new e();

    private e() {
    }

    static {
        f fVar;
        Covode.recordClassIndex(69960);
        int a2 = b.a().a(true, "feed_swipe_left", 0);
        int a3 = b.a().a(true, "top_follow_notice_live_unread_style", 0);
        if (a2 == a.f109240a && a3 == c.f109244a) {
            fVar = new f(a.f109240a, c.f109244a);
        } else {
            fVar = new f(a2, a3);
        }
        f109250a = fVar;
    }
}
