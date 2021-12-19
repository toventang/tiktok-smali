package com.tencent.wcdb.database;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public final class SQLiteGlobal {

    /* renamed from: a  reason: collision with root package name */
    public static final int f154597a;

    public static void loadLib() {
    }

    private static native int nativeReleaseMemory();

    private static native void nativeSetDefaultPageSize(int i2);

    private SQLiteGlobal() {
    }

    static {
        int i2;
        MethodCollector.i(3281);
        Covode.recordClassIndex(103042);
        if (!WCDBInitializationProbe.libLoaded) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.a("wcdb", false, (Context) null);
            m.a(uptimeMillis, "wcdb");
        }
        try {
            i2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
        } catch (RuntimeException unused) {
            i2 = 4096;
        }
        f154597a = i2;
        nativeSetDefaultPageSize(i2);
        MethodCollector.o(3281);
    }
}
