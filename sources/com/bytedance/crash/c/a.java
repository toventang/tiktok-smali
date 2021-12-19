package com.bytedance.crash.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.b;
import com.bytedance.crash.h;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.a.e;
import com.bytedance.crash.runtime.j;
import com.bytedance.crash.runtime.n;
import java.util.Map;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(16166);
    }

    public static void a(final String str, final Map<? extends String, ? extends String> map, final Map<String, String> map2, final h hVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            n.b().a(new Runnable() {
                /* class com.bytedance.crash.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(16167);
                }

                public final void run() {
                    try {
                        Context context = m.f27724a;
                        long j2 = currentTimeMillis;
                        String str = str;
                        b bVar = new b();
                        bVar.a("is_dart", (Object) 1);
                        bVar.a("crash_time", Long.valueOf(j2));
                        bVar.a("process_name", (Object) com.bytedance.crash.util.b.c(context));
                        bVar.a("data", (Object) str);
                        com.bytedance.crash.util.b.a(context, bVar.f27557a);
                        b a2 = e.a().a(CrashType.DART, bVar);
                        if (map != null) {
                            JSONObject optJSONObject = a2.f27557a.optJSONObject("custom");
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            b.a(optJSONObject, map);
                            Map map = map2;
                            if (map != null) {
                                b.a(optJSONObject, map);
                            }
                            bVar.a("custom", optJSONObject);
                        }
                        a2.a("logcat", (Object) j.a(m.f()));
                        com.bytedance.crash.j.e.a().a(a2.f27557a);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
