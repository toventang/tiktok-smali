package com.bytedance.zoin.zstd.a;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f46316a;

    static {
        Covode.recordClassIndex(28284);
    }

    public static synchronized void a() {
        synchronized (a.class) {
            MethodCollector.i(647);
            if (f46316a) {
                MethodCollector.o(647);
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.a("zstd-jni-decompress", false, (Context) null);
            m.a(uptimeMillis, "zstd-jni-decompress");
            f46316a = true;
            MethodCollector.o(647);
        }
    }
}
