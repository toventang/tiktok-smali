package com.benchmark.tools;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.m;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f6382a = new ArrayList();

    static {
        Covode.recordClassIndex(3068);
    }

    private static File a(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private static boolean a(File file) {
        MethodCollector.i(1110);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1110);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1110);
        return delete;
    }

    public static synchronized boolean a(String str, Context context) {
        synchronized (h.class) {
            MethodCollector.i(1109);
            if (f6382a.contains(str)) {
                MethodCollector.o(1109);
                return true;
            }
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.b(str, false, null);
                m.a(uptimeMillis, str);
                f6382a.add(str);
            } catch (UnsatisfiedLinkError e2) {
                String mapLibraryName = System.mapLibraryName(str);
                if (context == null || a(context) == null) {
                    MethodCollector.o(1109);
                    return false;
                }
                File file = new File(a(context), "libso");
                if (!file.exists()) {
                    new File(file.getAbsolutePath()).mkdirs();
                }
                File file2 = new File(file, mapLibraryName);
                if (file2.exists()) {
                    a(file2);
                }
                if (a(context, str, file2) != null) {
                    e2.getMessage();
                    MethodCollector.o(1109);
                    return false;
                }
                String absolutePath = file2.getAbsolutePath();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                System.load(absolutePath);
                m.a(uptimeMillis2, absolutePath);
                f6382a.add(str);
            } catch (Throwable unused) {
                MethodCollector.o(1109);
                return false;
            }
            MethodCollector.o(1109);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.Closeable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r12, java.lang.String r13, java.io.File r14) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.tools.h.a(android.content.Context, java.lang.String, java.io.File):java.lang.String");
    }
}
