package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.experiment.ad;
import com.ss.android.ugc.aweme.framework.a.a;
import h.f.b.l;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static final aa f95294a = new aa();

    private aa() {
    }

    static {
        Covode.recordClassIndex(60360);
    }

    public static final void b(String str) {
        c("stop in ".concat(String.valueOf(str)));
    }

    public static void c(String str) {
        if (ad.b()) {
            a.a(3, "FeedPlayerLogger", str);
        }
    }

    public static final void a(String str) {
        l.d(str, "");
        c("pause, source ".concat(String.valueOf(str)));
    }

    public static final void a(String str, String str2) {
        l.d(str2, "");
        c("play " + str + " source " + str2);
    }

    public static final void b(String str, String str2) {
        l.d(str, "");
        c("PlayerController." + str + " result is " + str2);
    }

    public static final void c(String str, String str2) {
        l.d(str, "");
        c("PlayerManager." + str + " result is " + str2);
    }
}
