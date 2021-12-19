package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import h.f.b.l;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class fz {

    /* renamed from: a  reason: collision with root package name */
    static String f142961a = "undefined";

    /* renamed from: b  reason: collision with root package name */
    static String f142962b = "undefined";

    /* renamed from: c  reason: collision with root package name */
    public static final fz f142963c = new fz();

    private fz() {
    }

    static {
        Covode.recordClassIndex(93557);
    }

    public static String a() {
        String c2 = c();
        if (TextUtils.isEmpty(c2)) {
            return "";
        }
        String d2 = d(c2);
        if (TextUtils.isEmpty(d2)) {
            return "";
        }
        try {
            String string = new JSONObject(d2).getString("pid");
            l.b(string, "");
            return string;
        } catch (JSONException unused) {
            return d2;
        }
    }

    private static String c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object invoke = cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.appsflyer.preinstall.path");
            if (invoke != null) {
                return (String) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b() {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "ro.channelId." + d.a().getPackageName(), "");
            if (invoke == null) {
                invoke = "";
            }
            return (String) invoke;
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f142964a;

        static {
            Covode.recordClassIndex(93558);
        }

        a(String str) {
            this.f142964a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            if (r5 != null) goto L_0x004e;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 250
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.fz.a.call():java.lang.Object");
        }
    }

    public static final void a(String str) {
        i.b(new a(str), i.f4824a);
    }

    public static boolean b(String str) {
        try {
            Method method = Class.forName("miui.os.MiuiInit").getMethod("isPreinstalledPackage", String.class);
            l.b(method, "");
            Object invoke = method.invoke(null, str);
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(String str) {
        try {
            Method method = Class.forName("miui.os.MiuiInit").getMethod("isPreinstalledPAIPackage", String.class);
            l.b(method, "");
            Object invoke = method.invoke(null, str);
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String d(java.lang.String r7) {
        /*
            r6 = 7334(0x1ca6, float:1.0277E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            java.lang.String r5 = ""
            if (r7 != 0) goto L_0x000d
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r5
        L_0x000d:
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r7)
            r4.load(r3)     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.d.a()     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.d.a()     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            r0 = 0
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r1, r0)     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            h.f.b.l.b(r0, r5)     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            java.lang.String r0 = r0.packageName     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            java.lang.String r0 = r4.getProperty(r0)     // Catch:{ FileNotFoundException | IOException -> 0x003c, all -> 0x0043 }
            if (r0 != 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r5 = r0
        L_0x003c:
            r3.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r5
        L_0x0043:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.fz.d(java.lang.String):java.lang.String");
    }
}
