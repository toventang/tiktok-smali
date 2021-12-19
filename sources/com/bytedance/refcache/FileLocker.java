package com.bytedance.refcache;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class FileLocker {
    static native int getStatus(String str);

    static {
        Covode.recordClassIndex(25946);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a("flock-lib", false, (Context) null);
        m.a(uptimeMillis, "flock-lib");
    }

    public static boolean a(String str) {
        boolean z;
        MethodCollector.i(6282);
        if (getStatus(str) >= 0) {
            z = true;
        } else {
            z = false;
        }
        MethodCollector.o(6282);
        return z;
    }
}
