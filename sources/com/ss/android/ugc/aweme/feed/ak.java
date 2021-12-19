package com.ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static long f91904a;

    /* renamed from: b  reason: collision with root package name */
    public static final ak f91905b = new ak();

    private ak() {
    }

    static {
        Covode.recordClassIndex(57849);
    }

    public static final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        d dVar = new d();
        dVar.a("action_type", str);
        if (TextUtils.equals(str, "show")) {
            f91904a = System.currentTimeMillis();
            dVar.a("duration", 0);
        } else {
            dVar.a("duration", System.currentTimeMillis() - f91904a);
        }
        if (TextUtils.equals(str, "exit")) {
            dVar.a("exit_method", str2);
        }
        r.a("story_cold_start_notification", dVar.f66730a);
    }
}
