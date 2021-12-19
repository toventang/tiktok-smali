package com.ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.d;
import java.util.HashMap;
import java.util.Map;

public class TEMonitorInvoker {
    public static native Map<String, String> nativeGetMap();

    public static native Map<String, String> nativeGetMapByType(int i2);

    public static native void nativeInit();

    public static native void nativeMonitorPerf(int i2);

    public static native void nativeMonitorPerfWithType(int i2);

    public static native void nativePerfDouble(int i2, String str, double d2);

    public static native void nativePerfDouble(String str, double d2);

    public static native void nativePerfLong(int i2, String str, long j2);

    public static native void nativePerfLong(String str, long j2);

    public static native void nativePerfRational(String str, float f2, float f3);

    public static native void nativePerfString(int i2, String str, String str2);

    public static native void nativePerfString(String str, String str2);

    public static native void nativeReset();

    public static native void nativeReset(int i2);

    static {
        Covode.recordClassIndex(37674);
        d.b();
    }

    public static void onNativeCallback_onMonitorLogFloat(String str, String str2, float f2) {
        h.a(str, str2, f2);
    }

    public static void onNativeCallback_onMonitorLogInt(String str, String str2, long j2) {
        h.a(str, str2, j2);
    }

    public static void onNativeCallback_onMonitorLogMap(String str, String str2, HashMap hashMap) {
        h.a(str, str2, hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void onNativeCallback_onMonitorLogJson(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0013 }
            r1.<init>(r5)     // Catch:{ JSONException -> 0x0013 }
            boolean r0 = com.ss.android.ttve.monitor.h.f61221d     // Catch:{ JSONException -> 0x0010 }
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "service"
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x0010 }
            goto L_0x0018
        L_0x0010:
            r0 = move-exception
            r2 = r1
            goto L_0x0014
        L_0x0013:
            r0 = move-exception
        L_0x0014:
            r0.printStackTrace()
            r1 = r2
        L_0x0018:
            boolean r0 = com.ss.android.ttve.monitor.h.f61221d
            if (r0 == 0) goto L_0x0022
            java.lang.ref.WeakReference<com.ss.android.ttve.monitor.IMonitor> r0 = com.ss.android.ttve.monitor.h.f61220c
            com.ss.android.ttve.monitor.h.b(r0, r3, r1)
            return
        L_0x0022:
            java.lang.ref.WeakReference<com.ss.android.ttve.monitor.IMonitor> r0 = com.ss.android.ttve.monitor.h.f61220c
            com.ss.android.ttve.monitor.h.a(r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.monitor.TEMonitorInvoker.onNativeCallback_onMonitorLogJson(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
