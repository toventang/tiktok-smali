package com.facebook.internal.a;

import com.bytedance.covode.number.Covode;
import com.facebook.ab;
import com.facebook.internal.ae;
import com.facebook.internal.o;
import com.facebook.m;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static boolean f48486a;

    static {
        Covode.recordClassIndex(29241);
    }

    public static void a(Throwable th) {
        if (f48486a) {
            HashSet hashSet = new HashSet();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                o.b a2 = o.a(stackTraceElement.getClassName());
                if (a2 != o.b.Unknown) {
                    ae.a();
                    d.a(m.f48921g, "com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(a2.a(), "9.0.0").apply();
                    hashSet.add(a2.toString());
                }
            }
            if (ab.b() && !hashSet.isEmpty()) {
                new b(new JSONArray((Collection) hashSet), (byte) 0).b();
            }
        }
    }
}
