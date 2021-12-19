package com.ss.android.deviceregister.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.deviceregister.a.b;
import com.ss.android.deviceregister.a.c;
import com.ss.android.deviceregister.d.a;
import com.ss.android.deviceregister.f;
import com.ss.android.deviceregister.g;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public abstract class d {
    public static boolean A = false;

    /* renamed from: a  reason: collision with root package name */
    public static b f59435a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f59436b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static c f59437c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile g f59438d;

    /* renamed from: f  reason: collision with root package name */
    public static final Bundle f59439f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    public static volatile boolean f59440g = false;

    /* renamed from: h  reason: collision with root package name */
    public static volatile boolean f59441h = false;

    /* renamed from: i  reason: collision with root package name */
    public static volatile boolean f59442i = false;
    public static long p = 0;
    public static volatile boolean u = false;
    public static List<WeakReference<DeviceRegisterManager.a>> y = Collections.synchronizedList(new ArrayList());
    public static final ThreadLocal<Boolean> z = new ThreadLocal<>();

    /* renamed from: e  reason: collision with root package name */
    public final Object f59443e = new Object();

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f59444j;

    /* renamed from: k  reason: collision with root package name */
    public int f59445k;

    /* renamed from: l  reason: collision with root package name */
    protected final com.ss.android.deviceregister.b.a.a f59446l;

    /* renamed from: m  reason: collision with root package name */
    public final Context f59447m;
    public final SharedPreferences n;
    public JSONObject o;
    public long q = 0;
    public long r = 0;
    public long s = 0;
    public String t;
    public String v;
    public a w;
    public volatile f x;

    /* access modifiers changed from: protected */
    public abstract void a(String str, String str2);

    public final String c() {
        return this.f59446l.b();
    }

    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        int f59449a;

        static {
            Covode.recordClassIndex(36707);
        }

        private static boolean b() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        private static boolean c() {
            if (j.f107226e && j.b() && !j.c()) {
                return j.f107226e;
            }
            boolean b2 = b();
            j.f107226e = b2;
            return b2;
        }

        public final void a() {
            Pair<String, Boolean> a2;
            boolean z;
            int i2;
            MethodCollector.i(3030);
            if (d.f59441h) {
                MethodCollector.o(3030);
                return;
            }
            try {
                d.this.r = System.currentTimeMillis();
                if (!c()) {
                    MethodCollector.o(3030);
                    return;
                }
                String b2 = com.ss.android.deviceregister.a.d.b(d.this.f59447m);
                if (!m.a(b2)) {
                    d.this.o.put("user_agent", b2);
                }
                if (!m.a(d.this.v)) {
                    d.this.o.put("app_track", d.this.v);
                }
                JSONObject jSONObject = new JSONObject(new JSONTokener(d.this.o.toString()));
                jSONObject.put("req_id", DeviceRegisterManager.getRequestId());
                if (d.this.f59444j) {
                    jSONObject.put("scene", 2);
                }
                try {
                    Bundle bundle = new Bundle();
                    synchronized (d.f59439f) {
                        try {
                            bundle.putAll(d.f59439f);
                        } catch (Throwable th) {
                            MethodCollector.o(3030);
                            throw th;
                        }
                    }
                    if (bundle.size() > 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (String str : bundle.keySet()) {
                            jSONObject2.put(str, a(bundle, str));
                        }
                        jSONObject.put("custom", jSONObject2);
                    }
                    String str2 = com.ss.android.b.f59122b;
                    String str3 = com.ss.android.b.f59123c;
                    if (!d.this.f59444j && !DeviceRegisterManager.isNewUserMode(d.this.f59447m) && (a2 = com.ss.android.deviceregister.d.a(d.this.f59447m)) != null) {
                        if (a2.second == null || !((Boolean) a2.second).booleanValue()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        jSONObject.put("gaid_limited", i2);
                        jSONObject.put("google_aid", a2.first);
                    }
                    if (!m.a(str2)) {
                        jSONObject.put("app_language", str2);
                    }
                    if (!m.a(str3)) {
                        jSONObject.put("app_region", str3);
                    }
                } catch (Throwable unused) {
                }
                d.this.a(jSONObject);
                jSONObject.put("sdk_version", "2.12.1-rc.30-delay");
                jSONObject.put("sdk_flavor", "global");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("magic_tag", "ss_app_log");
                jSONObject3.put("header", jSONObject);
                jSONObject3.put("_gen_time", System.currentTimeMillis());
                d.f59441h = true;
                d.z.set(Boolean.TRUE);
                boolean a3 = a(this, jSONObject3.toString());
                synchronized (d.f59436b) {
                    try {
                        d.f59441h = false;
                        try {
                            d.f59436b.notifyAll();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    } finally {
                        MethodCollector.o(3030);
                    }
                }
                d.f59440g = true;
                d.z.remove();
                if (!a3) {
                    d.a(false, m.a(d.this.f59446l.c()));
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                MethodCollector.o(3030);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f3, code lost:
            if (r1 != false) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0110, code lost:
            monitor-enter(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0114, code lost:
            monitor-exit(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x011f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0121, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(3021);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0124, code lost:
            throw r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00ec  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 306
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.deviceregister.b.d.a.run():void");
        }

        public a() {
            super("DeviceRegisterThread");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0160, code lost:
            if (r0 == false) goto L_0x0174;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ae, code lost:
            if (r11 != false) goto L_0x01b0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x00f5, code lost:
            continue;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x00f5, code lost:
            continue;
         */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x01a1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a(java.lang.String r16) {
            /*
            // Method dump skipped, instructions count: 515
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.deviceregister.b.d.a.a(java.lang.String):boolean");
        }

        private static Object a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }

        private static boolean a(a aVar, String str) {
            Boolean bool = true;
            if (bool.booleanValue()) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject optJSONObject = jSONObject.optJSONObject("header");
                    if (optJSONObject != null) {
                        optJSONObject.put("version_code", com.ss.android.ugc.aweme.app.c.a.f66678b);
                        jSONObject.put("header", optJSONObject);
                    }
                    str = jSONObject.toString();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            return aVar.a(str);
        }
    }

    public final String b() {
        if (this.f59444j) {
            return "";
        }
        return this.f59446l.a();
    }

    public final void d() {
        synchronized (this.f59443e) {
            this.f59443e.notifyAll();
        }
    }

    public final String a() {
        return this.f59446l.c();
    }

    static {
        Covode.recordClassIndex(36705);
    }

    public final void e() {
        DeviceRegisterManager.a aVar;
        String c2 = this.f59446l.c();
        String str = this.t;
        synchronized (com.ss.android.deviceregister.a.d.f59414j) {
            if (com.ss.android.deviceregister.a.d.f59412h != null) {
                try {
                    com.ss.android.deviceregister.a.d.f59412h.put("device_id", c2);
                    com.ss.android.deviceregister.a.d.f59412h.put("install_id", str);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        int size = y.size();
        for (int i2 = 0; i2 < size; i2++) {
            WeakReference<DeviceRegisterManager.a> weakReference = y.get(i2);
            if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                try {
                    aVar.a(this.f59446l.c(), this.t);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public static String a(Context context) {
        try {
            return com.ss.android.deviceregister.c.a(context).c();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(JSONObject jSONObject) {
        boolean z2;
        if (f59438d != null) {
            jSONObject.put("pre_installed_channel", f59438d.a());
        }
        try {
            int i2 = 0;
            PackageInfo packageInfo = this.f59447m.getPackageManager().getPackageInfo(this.f59447m.getPackageName(), 0);
            if (packageInfo != null) {
                jSONObject.put("apk_first_install_time", packageInfo.firstInstallTime);
                if ((packageInfo.applicationInfo.flags & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i2 = 1;
                }
                jSONObject.put("is_system_app", i2);
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(boolean z2) {
        this.t = null;
        this.f59444j = z2;
        this.f59446l.b("device_id");
        this.f59446l.b("install_id");
        this.f59446l.b("clientudid");
        com.ss.android.deviceregister.a.a.a(this.f59447m).edit().remove("install_id").apply();
        com.ss.android.ugc.aweme.bf.d.a(this.f59447m, "com.ss.android.deviceregister.utils.Cdid", 0).edit().putString("cdid", null).apply();
        com.ss.android.deviceregister.d.a.f59465a = new a.C1295a((byte) 0);
        JSONObject jSONObject = new JSONObject();
        com.ss.android.deviceregister.a.d.f59412h = null;
        com.ss.android.deviceregister.a.d.a(this.f59447m, jSONObject, z2);
        this.o = jSONObject;
    }

    protected static void a(String str, JSONObject jSONObject) {
        c cVar = f59437c;
        if (cVar != null) {
            cVar.a(str, jSONObject);
        }
    }

    public d(Context context, boolean z2) {
        this.f59447m = context;
        this.f59446l = com.ss.android.deviceregister.c.a(context);
        this.n = com.ss.android.deviceregister.a.a.a(context);
        this.f59444j = z2;
    }

    public static void a(boolean z2, boolean z3) {
        DeviceRegisterManager.a aVar;
        int size = y.size();
        for (int i2 = 0; i2 < size; i2++) {
            WeakReference<DeviceRegisterManager.a> weakReference = y.get(i2);
            if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                try {
                    aVar.a(z2, z3);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
