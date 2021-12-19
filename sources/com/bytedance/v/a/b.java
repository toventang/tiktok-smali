package com.bytedance.v.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.v.a.c;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f45873a = new String(a.f45867a);

    /* renamed from: b  reason: collision with root package name */
    public static final String f45874b = new String(a.f45868b);

    /* renamed from: c  reason: collision with root package name */
    public static final String f45875c = new String(a.f45869c);

    /* renamed from: d  reason: collision with root package name */
    public static final String f45876d = new String(a.f45870d);

    /* renamed from: e  reason: collision with root package name */
    public static final String f45877e = new String(a.f45871e);

    /* renamed from: f  reason: collision with root package name */
    public static final String f45878f = new String(a.f45872f);

    /* renamed from: g  reason: collision with root package name */
    public static HashSet<String> f45879g = new HashSet<>();

    /* renamed from: h  reason: collision with root package name */
    public static HashSet<String> f45880h = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    private static HashSet<String> f45881i = new HashSet<>();

    /* renamed from: j  reason: collision with root package name */
    private static String f45882j = null;

    /* renamed from: k  reason: collision with root package name */
    private static int f45883k = 0;

    /* renamed from: l  reason: collision with root package name */
    private static String f45884l = null;

    /* renamed from: m  reason: collision with root package name */
    private static String f45885m = null;
    private static String n = null;
    private static boolean o = false;
    private static c.a<Integer> p = new c.a<>("android.os.UserHandle", "myUserId", new Class[0]);

    private static int d() {
        Integer a2;
        if (!o && f45883k == 0 && (a2 = p.a(new Object[0])) != null) {
            f45883k = a2.intValue();
        }
        return f45883k;
    }

    public static String a() {
        String str = f45884l;
        if (str != null) {
            return str;
        }
        String str2 = f45873a;
        if (f45880h.isEmpty() || f45880h.contains(str2)) {
            f45884l = str2;
            return str2;
        }
        String str3 = null;
        Iterator<String> it = f45880h.iterator();
        while (it.hasNext()) {
            str3 = it.next();
            if (str3.startsWith(str2)) {
                f45884l = str3;
                return str3;
            }
        }
        f45884l = str3;
        return str3;
    }

    public static String b() {
        String str = n;
        if (str != null) {
            return str;
        }
        if (!TextUtils.isEmpty(f45882j)) {
            n = a() + f45874b + "/" + f45882j;
        }
        return n;
    }

    static {
        Covode.recordClassIndex(27991);
    }

    public static String c() {
        String str = f45885m;
        if (str != null) {
            return str;
        }
        if (!f45879g.isEmpty()) {
            Iterator<String> it = f45879g.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("/data")) {
                    f45885m = next;
                    return next;
                }
            }
        } else if (!TextUtils.isEmpty(f45882j)) {
            String str2 = f45876d + "/" + f45882j;
            f45885m = str2;
            return str2;
        }
        return f45885m;
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new File(str).getCanonicalPath();
        } catch (IOException unused) {
            return str;
        }
    }

    private static File e(Context context) {
        if (d.f107193a != null && d.f107197e) {
            return d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    private static void f(Context context) {
        f45885m = context.getApplicationInfo().dataDir;
        try {
            File e2 = e(context);
            if (e2 != null) {
                String parent = e2.getParent();
                n = parent;
                if (parent != null) {
                    Iterator<String> it = c(context).iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (n.startsWith(next)) {
                            f45884l = next;
                            return;
                        }
                    }
                    n = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    private static List<String> g(Context context) {
        HashSet hashSet = new HashSet();
        int i2 = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = StorageManager.class.getDeclaredMethod(f45878f, new Class[0]);
            declaredMethod.setAccessible(true);
            String[] strArr = (String[]) declaredMethod.invoke((StorageManager) a(context, "storage"), new Object[0]);
            if (strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    hashSet.add(str);
                }
            }
        } catch (Exception unused) {
        }
        return new ArrayList(hashSet);
    }

    public static HashSet<String> d(Context context) {
        MethodCollector.i(4068);
        if (!o) {
            synchronized (f45881i) {
                try {
                    Iterator<String> it = f45880h.iterator();
                    while (it.hasNext()) {
                        f45881i.add(it.next() + f45874b + "/" + context.getPackageName());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4068);
                    throw th;
                }
            }
        }
        HashSet<String> hashSet = f45881i;
        MethodCollector.o(4068);
        return hashSet;
    }

    public static void a(Context context) {
        MethodCollector.i(3848);
        synchronized (b.class) {
            try {
                if (!o) {
                    d();
                    try {
                        e(context);
                    } catch (Exception unused) {
                    }
                    b(context);
                    c(context);
                    d(context);
                    f(context);
                    f45882j = context.getPackageName();
                    o = true;
                    MethodCollector.o(3848);
                }
            } finally {
                MethodCollector.o(3848);
            }
        }
    }

    public static HashSet<String> b(Context context) {
        MethodCollector.i(3849);
        if (!o) {
            synchronized (f45879g) {
                try {
                    if (f45879g.isEmpty() && context != null) {
                        String str = context.getApplicationInfo().dataDir;
                        String a2 = a(str);
                        f45879g.add(str);
                        f45879g.add(a2);
                        if (a2 != null) {
                            String str2 = f45876d;
                            if (!a2.startsWith(str2)) {
                                String str3 = str2 + "/" + context.getPackageName();
                                if (a2.startsWith(str2 + "/")) {
                                    a2 = f45877e + "/" + f45883k + a2.substring(str2.length());
                                }
                                f45879g.add(str3);
                                f45879g.add(a2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3849);
                    throw th;
                }
            }
        }
        HashSet<String> hashSet = f45879g;
        MethodCollector.o(3849);
        return hashSet;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:8|9|(1:11)|12|13|(1:15)|16|17|18|(1:21)|22|(4:25|(2:27|39)(1:38)|36|23)|37|28) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0053 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[Catch:{ Exception -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashSet<java.lang.String> c(android.content.Context r5) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.v.a.b.c(android.content.Context):java.util.HashSet");
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4083);
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
                    MethodCollector.o(4083);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
