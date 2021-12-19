package com.bytedance.crash.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.runtime.b;
import com.bytedance.crash.runtime.e;
import com.bytedance.crash.runtime.n;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import java.io.File;
import java.util.Map;
import org.json.JSONArray;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    static boolean f27710a;

    /* renamed from: b  reason: collision with root package name */
    public static Map<String, String> f27711b;

    /* renamed from: c  reason: collision with root package name */
    private static File f27712c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f27713d;

    /* renamed from: e  reason: collision with root package name */
    private static final Runnable f27714e = new Runnable() {
        /* class com.bytedance.crash.j.m.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16247);
        }

        public final void run() {
            n.b().f27964d.removeCallbacks(this);
            if (m.a((String) null)) {
                a.a();
            }
        }
    };

    static {
        Covode.recordClassIndex(16246);
    }

    public static File b() {
        if (f27712c == null) {
            f27712c = new File(r.j(com.bytedance.crash.m.f27724a), "npth/configCrash/configInvalid");
        }
        return f27712c;
    }

    public static void a() {
        if (!f27710a) {
            f27713d = true;
            File file = new File(r.j(com.bytedance.crash.m.f27724a), "npth/configCrash/configFile");
            if (file.exists()) {
                try {
                    b.a(new JSONArray(j.a(file, "\n")), false);
                    f27710a = true;
                } catch (Throwable unused) {
                    b.a((JSONArray) null, false);
                }
            }
        }
    }

    public static void a(long j2) {
        n.b().a(f27714e, j2);
    }

    public static boolean a(String str) {
        File b2 = b();
        try {
            Map<String, String> map = f27711b;
            if (map == null) {
                map = j.c(b2);
            }
            f27711b = map;
            return e.a(map, str);
        } catch (Throwable unused) {
            com.bytedance.crash.m.f27730g.isDebugMode();
            return true;
        }
    }
}
