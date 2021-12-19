package com.bytedance.common.utility.d;

import android.content.Context;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.ugc.effectplatform.b.a.e;
import java.io.File;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f26931a = {71, 73, 70, 56, 55, 97};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f26932b = {71, 73, 70, 56, 57, 97};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f26933c = {-1, -40, -1};

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f26934d = {-119, 80, 78, 71, e.f153515b, 10, 26, 10};

    static {
        Covode.recordClassIndex(15897);
    }

    private static File b(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static void a(String str) {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (listFiles[i2].isDirectory()) {
                    b(listFiles[i2].getAbsolutePath());
                } else if (listFiles[i2].isFile()) {
                    a(listFiles[i2]);
                }
            }
        }
    }

    private static void b(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (listFiles[i2].isDirectory()) {
                    b(listFiles[i2].getAbsolutePath());
                } else {
                    a(listFiles[i2]);
                }
            }
            a(file);
        }
    }

    public static String a(Context context) {
        Objects.requireNonNull(context, "Context is NUll");
        String str = null;
        try {
            if (b(context) != null) {
                str = b(context).getPath();
            } else {
                File dir = context.getDir("/data/data/" + context.getPackageName() + "/files/", 0);
                if (dir != null) {
                    str = dir.getPath();
                }
            }
        } catch (Throwable unused) {
        }
        if (!m.a(str)) {
            return str;
        }
        throw new NullPointerException("Cannot Create Files Dir");
    }

    private static boolean a(File file) {
        MethodCollector.i(839);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(839);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(839);
        return delete;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:26|27|28|32|33|36|37) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:30|29|40|41|42|43|46|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0060, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        if (0 == 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0071, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x006c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.InputStream r7, java.lang.String r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.d.a.a(java.io.InputStream, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003e, code lost:
        if (r3 == null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004e A[SYNTHETIC, Splitter:B:35:0x004e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = 814(0x32e, float:1.14E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            boolean r0 = com.bytedance.common.utility.m.a(r5)
            r1 = 0
            if (r0 != 0) goto L_0x0018
            boolean r0 = com.bytedance.common.utility.m.a(r6)
            if (r0 != 0) goto L_0x0018
            boolean r0 = com.bytedance.common.utility.m.a(r7)
            if (r0 == 0) goto L_0x001c
        L_0x0018:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r1
        L_0x001c:
            r3 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0038 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0038 }
            boolean r1 = a(r2, r6, r7)     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            r2.close()     // Catch:{ Exception -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x002e:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r1
        L_0x0032:
            r1 = move-exception
            r3 = r2
            goto L_0x0040
        L_0x0035:
            r0 = move-exception
            r3 = r2
            goto L_0x0039
        L_0x0038:
            r0 = move-exception
        L_0x0039:
            r0.printStackTrace()     // Catch:{ all -> 0x003d }
            goto L_0x004c
        L_0x003d:
            r1 = move-exception
            if (r3 == 0) goto L_0x0048
        L_0x0040:
            r3.close()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0048:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r1
        L_0x004c:
            if (r3 == 0) goto L_0x0056
            r3.close()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0056:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.d.a.a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
