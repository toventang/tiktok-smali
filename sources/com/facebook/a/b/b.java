package com.facebook.a.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.m;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final f f46638a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static SensorManager f46639b;

    /* renamed from: c  reason: collision with root package name */
    public static e f46640c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f46641d = new AtomicBoolean(true);

    /* renamed from: e  reason: collision with root package name */
    static final AtomicBoolean f46642e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    static volatile Boolean f46643f = false;

    /* renamed from: g  reason: collision with root package name */
    private static String f46644g;

    /* renamed from: h  reason: collision with root package name */
    private static a f46645h = new a() {
        /* class com.facebook.a.b.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(28431);
        }

        @Override // com.facebook.a.b.b.a
        public final void a(String str) {
            if (!com.facebook.internal.a.b.a.a(b.class)) {
                try {
                    if (!b.f46643f.booleanValue()) {
                        b.f46643f = true;
                        m.c().execute(new Runnable(str) {
                            /* class com.facebook.a.b.b.AnonymousClass3 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ String f46648a;

                            static {
                                Covode.recordClassIndex(28433);
                            }

                            public final void run() {
                                String str;
                                String str2 = "0";
                                if (!com.facebook.internal.a.b.a.a(this)) {
                                    try {
                                        boolean z = true;
                                        GraphRequest a2 = GraphRequest.a((AccessToken) null, com.a.a(Locale.US, "%s/app_indexing_session", new Object[]{this.f46648a}), (JSONObject) null, (GraphRequest.b) null);
                                        Bundle bundle = a2.f46548j;
                                        if (bundle == null) {
                                            bundle = new Bundle();
                                        }
                                        ae.a();
                                        com.facebook.internal.b a3 = com.facebook.internal.b.a(m.f48921g);
                                        JSONArray jSONArray = new JSONArray();
                                        if (Build.MODEL != null) {
                                            str = Build.MODEL;
                                        } else {
                                            str = "";
                                        }
                                        jSONArray.put(str);
                                        if (a3 == null || a3.a() == null) {
                                            jSONArray.put("");
                                        } else {
                                            jSONArray.put(a3.a());
                                        }
                                        jSONArray.put(str2);
                                        if (Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || ((Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT))) {
                                            str2 = "1";
                                        }
                                        jSONArray.put(str2);
                                        Locale d2 = ad.d();
                                        jSONArray.put(d2.getLanguage() + "_" + d2.getCountry());
                                        String jSONArray2 = jSONArray.toString();
                                        bundle.putString("device_session_id", b.b());
                                        bundle.putString("extinfo", jSONArray2);
                                        a2.f46548j = bundle;
                                        JSONObject jSONObject = GraphRequest.a(a2).f49017b;
                                        AtomicBoolean e2 = b.e();
                                        if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                                            z = false;
                                        }
                                        e2.set(z);
                                        if (!b.e().get()) {
                                            b.f();
                                        } else if (b.g() != null) {
                                            b.g().a();
                                        }
                                        b.a(false);
                                    } catch (Throwable th) {
                                        com.facebook.internal.a.b.a.a(th, this);
                                    }
                                }
                            }

                            {
                                this.f46648a = r1;
                            }
                        });
                    }
                } catch (Throwable th) {
                    com.facebook.internal.a.b.a.a(th, b.class);
                }
            }
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(28434);
        }

        void a(String str);
    }

    public static boolean a() {
        com.facebook.internal.a.b.a.a(b.class);
        return false;
    }

    static String b() {
        if (com.facebook.internal.a.b.a.a(b.class)) {
            return null;
        }
        try {
            if (f46644g == null) {
                f46644g = UUID.randomUUID().toString();
            }
            return f46644g;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, b.class);
            return null;
        }
    }

    static boolean c() {
        if (com.facebook.internal.a.b.a.a(b.class)) {
            return false;
        }
        try {
            return f46642e.get();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, b.class);
            return false;
        }
    }

    static /* synthetic */ a d() {
        if (com.facebook.internal.a.b.a.a(b.class)) {
            return null;
        }
        try {
            return f46645h;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, b.class);
            return null;
        }
    }

    static /* synthetic */ AtomicBoolean e() {
        if (com.facebook.internal.a.b.a.a(b.class)) {
            return null;
        }
        try {
            return f46642e;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, b.class);
            return null;
        }
    }

    static /* synthetic */ String f() {
        if (com.facebook.internal.a.b.a.a(b.class)) {
            return null;
        }
        try {
            f46644g = null;
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, b.class);
            return null;
        }
    }

    static /* synthetic */ e g() {
        if (com.facebook.internal.a.b.a.a(b.class)) {
            return null;
        }
        try {
            return f46640c;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, b.class);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(28430);
    }

    static /* synthetic */ Boolean a(Boolean bool) {
        if (com.facebook.internal.a.b.a.a(b.class)) {
            return null;
        }
        try {
            f46643f = bool;
            return bool;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, b.class);
            return null;
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1162);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(1162);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
