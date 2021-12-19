package com.ss.android.deviceregister.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.a;
import com.ss.android.deviceregister.b.c;
import com.ss.android.ugc.aweme.lancet.c.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static String f59405a;

    /* renamed from: b  reason: collision with root package name */
    public static a f59406b;

    /* renamed from: c  reason: collision with root package name */
    public static String f59407c;

    /* renamed from: d  reason: collision with root package name */
    public static String f59408d;

    /* renamed from: e  reason: collision with root package name */
    public static int f59409e;

    /* renamed from: f  reason: collision with root package name */
    public static String f59410f;

    /* renamed from: g  reason: collision with root package name */
    public static String f59411g = "2.5.5.6";

    /* renamed from: h  reason: collision with root package name */
    public static volatile JSONObject f59412h;

    /* renamed from: i  reason: collision with root package name */
    public static String f59413i;

    /* renamed from: j  reason: collision with root package name */
    public static final Object f59414j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static c f59415k;

    /* renamed from: l  reason: collision with root package name */
    public static c f59416l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f59417m = false;
    public static String n;
    public static String o;
    private static int p;
    private static ConcurrentHashMap<String, Object> q = new ConcurrentHashMap<>();
    private static boolean r = false;
    private static String s;
    private static String t;
    private static String u;
    private static volatile boolean v;
    private static ConcurrentHashMap<String, Object> w;

    static {
        Covode.recordClassIndex(36689);
    }

    public static int a() {
        a aVar;
        if (p <= 0 && (aVar = f59406b) != null) {
            p = aVar.i();
        }
        return p;
    }

    public static String b(Context context) {
        if (m.a(f59413i)) {
            f59413i = a.a(context).getString("user_agent", null);
        }
        return f59413i;
    }

    public static String c(Context context) {
        if (!TextUtils.isEmpty(f59405a)) {
            return f59405a;
        }
        a aVar = f59406b;
        if (aVar != null) {
            return aVar.a();
        }
        try {
            if (a(context.getPackageManager(), context.getPackageName()).metaData != null) {
                f59405a = null;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String a(Context context) {
        if (m.a(s) && context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                    return s;
                }
                Signature signature = packageInfo.signatures[0];
                if (signature == null) {
                    return s;
                }
                s = com.bytedance.common.utility.d.b(signature.toByteArray());
            } catch (Exception unused) {
            }
        }
        return s;
    }

    private static void a(Throwable th) {
        a aVar = f59406b;
        if (aVar != null) {
            c cVar = f59416l;
            aVar.c();
            if (cVar != null) {
                String stackTraceString = Log.getStackTraceString(th);
                if (!m.a(stackTraceString)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("stack", stackTraceString);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    cVar.a("device_register", jSONObject);
                }
            }
        }
    }

    private static ApplicationInfo a(PackageManager packageManager, String str) {
        if (!TextUtils.equals(str, com.bytedance.ies.ugc.appcontext.d.a().getPackageName())) {
            return packageManager.getApplicationInfo(str, 128);
        }
        if (b.f107191a == null) {
            b.f107191a = packageManager.getApplicationInfo(str, 128);
        }
        return b.f107191a;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2911);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(2911);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r2 = new org.json.JSONObject();
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = r12.getPackageName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r7 = a(r12.getPackageManager(), r4).metaData;
        r0 = com.ss.android.deviceregister.a.d.f59405a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r0 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r0.length() <= 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        r8.put("channel", com.ss.android.deviceregister.a.d.f59405a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r7 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        if (android.text.TextUtils.isEmpty("") != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        r8.put("appkey", r7.getString(""));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r7 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (android.text.TextUtils.isEmpty("") != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        r8.put("channel", null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        a(r0);
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0721, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0722, code lost:
        a(r0);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2908);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0728, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0220 A[Catch:{ Exception -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x023b A[Catch:{ Exception -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x023e A[Catch:{ Exception -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026e A[Catch:{ Exception -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0283 A[Catch:{ Exception -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02af A[Catch:{ Exception -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02b1 A[Catch:{ Exception -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02d3 A[Catch:{ Exception -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02de A[Catch:{ Exception -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02f6 A[Catch:{ all -> 0x0360 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0306 A[Catch:{ all -> 0x0360 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0312 A[Catch:{ all -> 0x0360 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x034d A[Catch:{ all -> 0x0360 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x036a A[Catch:{ all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x039b A[Catch:{ all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03a5 A[Catch:{ all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x053f A[Catch:{ all -> 0x0545 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x056b A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x059f A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x05af A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05c8 A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x05d3 A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x05da A[Catch:{ all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05fb A[Catch:{ all -> 0x0608 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0610 A[SYNTHETIC, Splitter:B:304:0x0610] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x06a9 A[Catch:{ all -> 0x06f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x06c0 A[Catch:{ all -> 0x06f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x06ee A[Catch:{ all -> 0x06f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x070f A[SYNTHETIC, Splitter:B:360:0x070f] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01cb A[Catch:{ Exception -> 0x0204 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d9 A[Catch:{ Exception -> 0x0204 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r12, org.json.JSONObject r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 1839
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.deviceregister.a.d.a(android.content.Context, org.json.JSONObject, boolean):boolean");
    }
}
