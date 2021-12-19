package com.google.android.play.core.e;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.android.play.core.b.b f53264a = new com.google.android.play.core.b.b("SplitInstallHelper");

    static {
        Covode.recordClassIndex(32917);
    }

    public static void a(Context context, String str) {
        MethodCollector.i(10166);
        synchronized (ag.class) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.a(str, false, (Context) null);
                m.a(uptimeMillis, str);
            } catch (UnsatisfiedLinkError e2) {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                String mapLibraryName = System.mapLibraryName(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(mapLibraryName).length());
                sb.append(str2);
                sb.append("/");
                sb.append(mapLibraryName);
                String sb2 = sb.toString();
                if (new File(sb2).exists()) {
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    System.load(sb2);
                    m.a(uptimeMillis2, sb2);
                } else {
                    MethodCollector.o(10166);
                    throw e2;
                }
            } catch (Throwable th) {
                MethodCollector.o(10166);
                throw th;
            }
        }
        MethodCollector.o(10166);
    }
}
