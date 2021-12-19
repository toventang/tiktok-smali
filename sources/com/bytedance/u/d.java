package com.bytedance.u;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile g<e> f45709a;

    /* renamed from: b  reason: collision with root package name */
    static List<a> f45710b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static c f45711c;

    /* renamed from: d  reason: collision with root package name */
    private static long f45712d = 1024;

    static {
        Covode.recordClassIndex(27815);
    }

    /* renamed from: com.bytedance.u.d$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f45713a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 27816(0x6ca8, float:3.8979E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.u.f[] r0 = com.bytedance.u.f.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.u.d.AnonymousClass1.f45713a = r2
                com.bytedance.u.f r0 = com.bytedance.u.f.PREFER_SD_CARD     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.u.d.AnonymousClass1.f45713a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.u.f r0 = com.bytedance.u.f.PREFER_EXTERNAL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.u.d.AnonymousClass1.f45713a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.u.f r0 = com.bytedance.u.f.PREFER_PRIVATE     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.u.d.AnonymousClass1.<clinit>():void");
        }
    }

    public static List<a> b() {
        MethodCollector.i(8079);
        if (f45711c == null) {
            List<a> list = f45710b;
            MethodCollector.o(8079);
            return list;
        }
        synchronized (f45710b) {
            try {
                if (!f45710b.containsAll(f45711c.a())) {
                    f45710b.addAll(f45711c.a());
                }
            } catch (Throwable th) {
                MethodCollector.o(8079);
                throw th;
            }
        }
        List<a> list2 = f45710b;
        MethodCollector.o(8079);
        return list2;
    }

    public static boolean a() {
        if (f45709a == null || f45709a.a() == null) {
            return false;
        }
        return true;
    }

    private static void a(File file) {
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
    }

    public static void a(a aVar) {
        MethodCollector.i(8070);
        synchronized (f45710b) {
            try {
                f45710b.add(aVar);
            } finally {
                MethodCollector.o(8070);
            }
        }
    }

    private static File c(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    private static File d(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    private static File e(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107193a != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    private static File f(Context context) {
        if (!TextUtils.isEmpty(null)) {
            return context.getExternalFilesDir(null);
        }
        if (com.ss.android.ugc.aweme.lancet.d.f107196d != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        com.ss.android.ugc.aweme.lancet.d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    private static File l(Context context) {
        try {
            File c2 = c(context);
            if (c2 == null || c2.getFreeSpace() < f45709a.a().f45714a) {
                return null;
            }
            return c2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static File a(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        parentFile.getFreeSpace();
        if (parentFile.getFreeSpace() < f45712d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return file;
    }

    private static File g(Context context) {
        File a2 = a(context);
        if (a2 == null || !a2.exists() || a2.getFreeSpace() < f45709a.a().f45716c) {
            return null;
        }
        return a2;
    }

    private static File h(Context context) {
        File f2;
        try {
            if (!"mounted".equals(Environment.getExternalStorageState()) || (f2 = f(context)) == null || !f2.exists() || f2.getFreeSpace() < f45709a.a().f45715b) {
                return null;
            }
            return f2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static File i(Context context) {
        try {
            File d2 = d(context);
            if (d2 == null || !d2.exists() || d2.getFreeSpace() < f45709a.a().f45714a) {
                return null;
            }
            return d2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static File j(Context context) {
        File b2 = b(context);
        if (b2 == null || !b2.exists() || b2.getFreeSpace() < f45709a.a().f45716c) {
            return null;
        }
        return b2;
    }

    private static File k(Context context) {
        File e2;
        try {
            if (!"mounted".equals(Environment.getExternalStorageState()) || (e2 = e(context)) == null || e2.getFreeSpace() < f45709a.a().f45715b) {
                return null;
            }
            return e2;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static File a(Context context) {
        File[] fileArr;
        b a2 = b.a(context);
        if (a2 != null && a2.a() && !TextUtils.isEmpty(a2.f45703c)) {
            int i2 = Build.VERSION.SDK_INT;
            try {
                fileArr = context.getExternalFilesDirs(null);
            } catch (Exception e2) {
                e2.printStackTrace();
                fileArr = null;
            }
            File a3 = a(fileArr, context);
            if (a3 != null) {
                return a3;
            }
            try {
                f(context);
                File file = new File(a2.f45703c + "/Android/data/" + context.getPackageName() + "/files");
                a(file);
                if (file.exists()) {
                    return file;
                }
                return null;
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }

    public static File b(Context context) {
        File[] fileArr;
        b a2 = b.a(context);
        if (a2 != null && a2.a()) {
            int i2 = Build.VERSION.SDK_INT;
            try {
                fileArr = context.getExternalCacheDirs();
            } catch (Exception e2) {
                e2.printStackTrace();
                fileArr = null;
            }
            File a3 = a(fileArr, context);
            if (a3 != null) {
                return a3;
            }
            try {
                e(context);
                File file = new File(a2.f45703c + "/Android/data/" + context.getPackageName() + "/cache");
                a(file);
                if (file.exists()) {
                    return file;
                }
                return null;
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }

    public static File a(Context context, f fVar) {
        File i2;
        if (!a()) {
            return null;
        }
        int i3 = AnonymousClass1.f45713a[fVar.ordinal()];
        if (i3 == 1) {
            File g2 = g(context);
            if (!(g2 == null && (g2 = h(context)) == null)) {
                return g2;
            }
        } else if (i3 == 2) {
            File h2 = h(context);
            if (!(h2 == null && (h2 = g(context)) == null)) {
                return h2;
            }
        } else if (i3 == 3 && !((i2 = i(context)) == null && (i2 = h(context)) == null)) {
            return i2;
        }
        return d(context);
    }

    public static File b(Context context, f fVar) {
        File l2;
        if (!a()) {
            return null;
        }
        int i2 = AnonymousClass1.f45713a[fVar.ordinal()];
        if (i2 == 1) {
            File j2 = j(context);
            if (!(j2 == null && (j2 = k(context)) == null)) {
                return j2;
            }
        } else if (i2 == 2) {
            File k2 = k(context);
            if (!(k2 == null && (k2 = j(context)) == null)) {
                return k2;
            }
        } else if (i2 == 3 && !((l2 = l(context)) == null && (l2 = k(context)) == null)) {
            return l2;
        }
        return c(context);
    }

    private static File a(File[] fileArr, Context context) {
        b a2;
        if (fileArr != null && (a2 = b.a(context)) != null && a2.a() && !TextUtils.isEmpty(a2.f45703c)) {
            for (File file : fileArr) {
                if (!(file == null || file.getPath() == null || !file.getPath().contains(a2.f45703c))) {
                    a(file);
                    if (file.exists()) {
                        return file;
                    }
                }
            }
        }
        return null;
    }
}
