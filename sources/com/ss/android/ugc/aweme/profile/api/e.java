package com.ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static e f116012a;

    static {
        Covode.recordClassIndex(74811);
    }

    public static e a() {
        if (f116012a == null) {
            f116012a = new e();
        }
        return f116012a;
    }

    public static void a(Handler handler, String str) {
        c(handler, c.a(null, str, null, 0, true));
    }

    public static void b(Handler handler, String str) {
        h.a(str);
        n.a().a(handler, new g(str), 0);
    }

    private static void c(Handler handler, String str) {
        h.a(str);
        n.a().a(handler, new f(str), 0);
    }

    public static void a(Handler handler, String str, String str2, String str3, int i2, Boolean bool) {
        b(handler, c.a(str2, str, str3, i2, bool));
    }
}
