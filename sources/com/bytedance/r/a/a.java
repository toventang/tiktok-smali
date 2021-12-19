package com.bytedance.r.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.r.a.a.b;
import com.bytedance.r.a.c;
import com.google.android.play.core.e.c;
import com.google.android.play.core.e.d;
import com.google.android.play.core.e.g;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public c f42389a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<c> f42390b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    public final Handler f42391c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public boolean f42392d;

    /* renamed from: e  reason: collision with root package name */
    public SharedPreferences f42393e;

    /* renamed from: f  reason: collision with root package name */
    private g f42394f;

    static {
        Covode.recordClassIndex(25909);
    }

    public final void b() {
        this.f42391c.post(new Runnable() {
            /* class com.bytedance.r.a.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(25915);
            }

            public final void run() {
                a.this.f42392d = false;
                a.this.c();
            }
        });
    }

    a() {
    }

    public final void a() {
        g gVar;
        c cVar = this.f42389a;
        if (cVar != null && (gVar = this.f42394f) != null) {
            cVar.b(gVar);
            this.f42394f = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = r6.f42390b.poll();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.r.a.a.c():void");
    }

    public static void a(b bVar) {
        if (bVar != null) {
            bVar.a();
        }
    }

    public static void b(b bVar) {
        if (bVar != null) {
            bVar.b();
        }
    }

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    static String a(c cVar) {
        return TextUtils.join(",", cVar.f42410a);
    }

    private static long b(c cVar) {
        if (cVar.f42413d <= 0) {
            return 60000;
        }
        if (cVar.f42413d >= 960000) {
            return 960000;
        }
        return cVar.f42413d * 2;
    }

    public final Set<String> b(Context context) {
        if (this.f42389a == null) {
            this.f42389a = d.a(a(context));
        }
        return this.f42389a.b();
    }

    static JSONObject a(c cVar, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str);
            jSONObject.put("plugin_names", a(cVar));
            if (cVar.f42414e) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            jSONObject.put("is_retry", str2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void a(final c cVar, boolean z) {
        if (z) {
            final long b2 = b(cVar);
            this.f42391c.postDelayed(new Runnable() {
                /* class com.bytedance.r.a.a.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(25916);
                }

                public final void run() {
                    c.a aVar = new c.a(cVar.f42410a);
                    aVar.f42415a = null;
                    aVar.f42416b = cVar.f42412c;
                    c a2 = aVar.a();
                    a2.f42413d = b2;
                    a2.f42414e = true;
                    a.this.f42390b.add(a2);
                    a.this.c();
                }
            }, b2);
            return;
        }
        cVar.f42413d = 0;
        cVar.f42414e = false;
        this.f42390b.add(cVar);
        c();
    }

    public static void a(c cVar, long j2, int i2, String str) {
        com.bytedance.r.a.a.a aVar = cVar.f42412c;
        if (aVar != null) {
            JSONObject a2 = a(cVar, "plugin_install_failed");
            try {
                a2.put("duration", j2);
                a2.put("error_code", i2);
                a2.put("error_msg", str);
            } catch (JSONException unused) {
            }
            aVar.a(a2);
        }
    }
}
