package com.ss.android.vesdk.runtime;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.ss.android.ttve.log.a;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.android.vesdk.aa;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f151455a = new ArrayList();

    static {
        Covode.recordClassIndex(99582);
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
        MethodCollector.i(1882);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1882);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1882);
        return delete;
    }

    public static synchronized boolean a(String str, Context context) {
        synchronized (g.class) {
            MethodCollector.i(1878);
            if (f151455a.contains(str)) {
                MethodCollector.o(1878);
                return true;
            }
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.a(str);
                m.a(uptimeMillis, str);
                f151455a.add(str);
            } catch (UnsatisfiedLinkError e2) {
                StringBuilder append = new StringBuilder("loadLibrary ").append(str).append(" error.");
                StringWriter stringWriter = new StringWriter();
                e2.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                a.a(4, append.append(stringWriter.getBuffer().toString()).toString());
                String mapLibraryName = System.mapLibraryName(str);
                if (context == null || a(context) == null) {
                    MethodCollector.o(1878);
                    return false;
                }
                File file = new File(a(context), "libso");
                if (!file.exists()) {
                    aa.c(file.getAbsolutePath());
                }
                File file2 = new File(file, mapLibraryName);
                if (file2.exists()) {
                    a(file2);
                }
                String a2 = a(context, str, file2);
                if (a2 != null) {
                    e2.getMessage();
                    a.a(4, e2.getMessage() + "[" + a2 + "]");
                    MethodCollector.o(1878);
                    return false;
                }
                String absolutePath = file2.getAbsolutePath();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                System.load(absolutePath);
                m.a(uptimeMillis2, absolutePath);
                f151455a.add(str);
            } catch (Throwable unused) {
                MethodCollector.o(1878);
                return false;
            }
            MethodCollector.o(1878);
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.runtime.g.a(android.content.Context, java.lang.String, java.io.File):java.lang.String");
    }
}
