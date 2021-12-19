package com.ss.android.ugc.aweme;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public final class az {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f67855a = {"files/offlineX", "app_assets", "cache/gift_assets", "cache/feedcache"};

    static {
        Covode.recordClassIndex(41761);
    }

    public static a a() {
        try {
            Context a2 = d.a();
            if (a2 == null) {
                return new a(Long.MAX_VALUE, Long.MAX_VALUE, 1.0d);
            }
            File a3 = a(a2);
            if (a3 == null || !a3.exists()) {
                return new a(Long.MAX_VALUE, Long.MAX_VALUE, 1.0d);
            }
            int i2 = Build.VERSION.SDK_INT;
            StatFs statFs = new StatFs(a3.getPath());
            long availableBytes = statFs.getAvailableBytes();
            long totalBytes = statFs.getTotalBytes();
            double d2 = (double) availableBytes;
            Double.isNaN(d2);
            double d3 = (double) totalBytes;
            Double.isNaN(d3);
            return new a(availableBytes, totalBytes, (d2 * 1.0d) / d3);
        } catch (Throwable unused) {
            return new a(Long.MAX_VALUE, Long.MAX_VALUE, 1.0d);
        }
    }

    public static boolean b() {
        File a2;
        Context a3 = d.a();
        if (a3 == null || (a2 = a(a3)) == null) {
            return false;
        }
        String parent = a2.getParent();
        if (TextUtils.isEmpty(parent)) {
            return false;
        }
        String str = parent + "/";
        String[] strArr = f67855a;
        int length = strArr.length;
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            File file = new File(str + strArr[i2]);
            if (file.exists()) {
                z |= a(file);
            }
        }
        return z;
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    private static boolean a(File file) {
        if (file.isFile()) {
            return b(file);
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        for (File file2 : listFiles) {
            a(file2);
        }
        return b(file);
    }

    private static boolean b(File file) {
        MethodCollector.i(6344);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(6344);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6344);
        return delete;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f67856a;

        /* renamed from: b  reason: collision with root package name */
        public final long f67857b;

        /* renamed from: c  reason: collision with root package name */
        public final double f67858c;

        static {
            Covode.recordClassIndex(41762);
        }

        public a(long j2, long j3, double d2) {
            this.f67856a = j2;
            this.f67857b = j3;
            this.f67858c = d2;
        }
    }
}
