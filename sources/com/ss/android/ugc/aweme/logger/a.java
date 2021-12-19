package com.ss.android.ugc.aweme.logger;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Long> f109000a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Long> f109001b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f109002c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f109003d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f109004e;

    /* renamed from: f  reason: collision with root package name */
    public volatile int f109005f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f109006g;

    /* renamed from: h  reason: collision with root package name */
    public long f109007h;

    /* renamed from: i  reason: collision with root package name */
    public long f109008i;

    /* renamed from: j  reason: collision with root package name */
    public HashMap<String, Long> f109009j;

    /* renamed from: k  reason: collision with root package name */
    private Map<String, Long> f109010k;

    /* renamed from: com.ss.android.ugc.aweme.logger.a$a  reason: collision with other inner class name */
    public static class C2793a implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(69798);
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    static {
        Covode.recordClassIndex(69797);
    }

    public static a c() {
        return b.f109011a;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f109011a = new a((byte) 0);

        static {
            Covode.recordClassIndex(69799);
        }
    }

    public static boolean b() {
        return com.ss.android.ugc.aweme.co.b.b().a(d.a(), "log_release_build_version_v4").isEmpty();
    }

    private boolean d() {
        if (this.f109001b.isEmpty() || this.f109003d) {
            return e();
        }
        return false;
    }

    private static boolean f() {
        Context a2 = d.a();
        String c2 = d.c();
        String a3 = com.ss.android.ugc.aweme.co.b.b().a(a2, "log_release_build_version_v4");
        if (c2.isEmpty()) {
            c2 = "default_version";
        }
        if (a3.equals(c2)) {
            return false;
        }
        com.ss.android.ugc.aweme.co.b.b().a(a2, "log_release_build_version_v4", c2);
        return true;
    }

    private void g() {
        HashMap<String, Long> hashMap = this.f109009j;
        if (!(hashMap == null || hashMap.isEmpty())) {
            long j2 = 0;
            for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
                j2 += entry.getValue().longValue();
            }
            this.f109010k.put("load_sp_total", Long.valueOf(j2));
        }
    }

    private a() {
        this.f109000a = new ConcurrentHashMap();
        this.f109001b = new ConcurrentHashMap();
        this.f109010k = new ConcurrentHashMap();
        this.f109002c = true;
        this.f109003d = false;
        this.f109004e = false;
        this.f109005f = -1;
        this.f109006g = true;
        this.f109009j = new HashMap<>();
        if (Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT >= 21) {
            this.f109000a = Collections.synchronizedMap(this.f109000a);
            this.f109001b = Collections.synchronizedMap(this.f109001b);
            this.f109010k = Collections.synchronizedMap(this.f109010k);
        }
    }

    private boolean e() {
        Long l2 = this.f109010k.get("cold_boot_application_to_main");
        if (l2 != null && l2.longValue() > 1000) {
            return false;
        }
        Long l3 = this.f109010k.get("cold_boot_application_to_splash");
        if (l3 != null && l3.longValue() > 1000) {
            return false;
        }
        Long l4 = this.f109010k.get("cold_boot_splash_to_main");
        if (l4 != null && l4.longValue() > 1000) {
            return false;
        }
        Long l5 = this.f109010k.get("cold_boot_main_create_to_resume");
        if (l5 == null || l5.longValue() <= 1000) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (b()) {
            if (this.f109004e) {
                c("first_feed_show_time_new_user_v4");
            } else {
                c("first_feed_show_time_new_user");
            }
            f();
        } else if (!this.f109002c || !d() || f()) {
            return;
        } else {
            if (this.f109003d) {
                c("first_feed_show_time_v3_cache");
            } else {
                c("first_feed_show_time_v3");
            }
        }
        this.f109002c = false;
        this.f109006g = false;
        this.f109000a.clear();
        this.f109001b.clear();
        this.f109010k.clear();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final boolean a(String str) {
        if (this.f109000a.get(str) != null) {
            return true;
        }
        return false;
    }

    public final boolean b(String str) {
        if (this.f109010k.get(str) != null) {
            return true;
        }
        return false;
    }

    private void c(String str) {
        int i2;
        boolean b2 = b();
        g();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        int i3 = 1;
        try {
            jSONObject.put("app2main5s", 1);
            if (!str.equals("first_feed_show_time_new_user") || (this.f109006g && e())) {
                for (Map.Entry<String, Long> entry : this.f109010k.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            } else {
                jSONObject2.put("new_user_report_bad_case", 1);
            }
            if (this.f109003d) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            jSONObject2.put("cold_boot_use_cache", i2);
            if (str.equals("first_feed_show_time_new_user_v4")) {
                i3 = 3;
            } else if (!b2) {
                i3 = 2;
            }
            jSONObject2.put("is_new_user", i3);
            jSONObject2.put("convert_type", this.f109005f);
            jSONObject3.put("category", jSONObject);
            jSONObject3.put("metric", jSONObject2);
            jSONObject4.put("placeHolder", "1");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.bytedance.apm.b.a(str, jSONObject4, jSONObject3);
        if (!b2) {
            com.bytedance.apm.b.a("first_feed_show_time_v3_all", jSONObject4, jSONObject3);
        }
        i.b(new b(jSONObject2), i.f4824a);
    }

    public final void a(String str, boolean z) {
        a(str, SystemClock.uptimeMillis(), z);
    }

    public final void b(String str, boolean z) {
        b(str, SystemClock.uptimeMillis(), z);
    }

    public final void a(String str, long j2) {
        if (this.f109010k.get(str) == null) {
            this.f109010k.put(str, Long.valueOf(j2));
        }
    }

    public final void b(String str, long j2) {
        Long l2 = this.f109010k.get(str);
        if (l2 != null) {
            j2 += l2.longValue();
        }
        this.f109010k.put(str, Long.valueOf(j2));
    }

    public final void a(String str, long j2, boolean z) {
        if (this.f109000a.get(str) == null) {
            this.f109000a.put(str, Long.valueOf(j2));
            if (z) {
                this.f109001b.put(str, Long.valueOf(j2));
            }
        } else if (z) {
            this.f109002c = false;
        }
    }

    public final void b(String str, long j2, boolean z) {
        Long l2 = this.f109000a.get(str);
        if (l2 != null) {
            if (this.f109010k.get(str) == null) {
                this.f109010k.put(str, Long.valueOf(j2 - l2.longValue()));
                l2.longValue();
            }
            if (z) {
                this.f109001b.remove(str);
            }
        } else if (z) {
            this.f109002c = false;
        } else {
            this.f109010k.put(str, 0L);
        }
    }
}
