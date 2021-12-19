package com.benchmark.bytemonitor;

import android.content.Context;
import com.benchmark.bytemonitor.nativePort.ByteMonitorPort;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static BatteryMonitor f6090a;

    static {
        Covode.recordClassIndex(2955);
    }

    public static void a() {
        MethodCollector.i(11609);
        BatteryMonitor batteryMonitor = f6090a;
        if (batteryMonitor == null) {
            MethodCollector.o(11609);
            return;
        }
        ByteMonitorPort.nativeInit(batteryMonitor);
        ByteMonitorPort.f6091a = true;
        MethodCollector.o(11609);
    }

    public static void a(Context context) {
        MethodCollector.i(11431);
        if (f6090a == null) {
            synchronized (a.class) {
                try {
                    if (f6090a == null) {
                        f6090a = new BatteryMonitor(context);
                    }
                } finally {
                    MethodCollector.o(11431);
                }
            }
            return;
        }
        MethodCollector.o(11431);
    }
}
