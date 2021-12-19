package com.ss.android.ugc.aweme.tools.extract.b;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.d;
import com.bytedance.crash.j.i;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f140044a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(91517);
    }

    public static final void a(a aVar, String str, String str2, String str3) {
        String str4;
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        aVar.f140029b.f140041a = str2;
        StackTraceElement stackTraceElement = new StackTraceElement(f140044a.getClass().getName(), "", "", 0);
        if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
            str4 = "MainThread";
        } else {
            str4 = "SubThread";
        }
        d a2 = d.a(stackTraceElement, str, str2, str4, true, "EnsureNotReachHere", str3);
        l.b(a2, "");
        for (T t : aVar.f140028a) {
            String str5 = t.f140041a;
            if (str5 != null) {
                a2.c(t.f140042b, str5);
                if (t.f140043c) {
                    a2.a(t.f140042b, str5);
                }
            }
        }
        i.a(a2);
    }
}
