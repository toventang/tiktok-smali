package com.benchmark.bytemonitor.nativePort;

import android.content.Context;
import android.os.SystemClock;
import com.benchmark.bytemonitor.BatteryMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class ByteMonitorPort {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f6091a = false;

    public static native void nativeInit(BatteryMonitor batteryMonitor);

    static {
        Covode.recordClassIndex(2956);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a("bytemonitor", false, (Context) null);
        m.a(uptimeMillis, "bytemonitor");
    }
}
