package com.lynx.tasm.base;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxEnv;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LLog {

    /* renamed from: a  reason: collision with root package name */
    public static int f55752a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static ConcurrentHashMap<Integer, e> f55753b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static Integer f55754c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static int f55755d = 6;

    /* renamed from: e  reason: collision with root package name */
    private static int[] f55756e;

    /* renamed from: f  reason: collision with root package name */
    private static long f55757f = 0;

    private static native void nativeInitALogNative(long j2, boolean z);

    private static native void nativeSetHasLoggingDelegate(boolean z);

    private static native void nativeSetNativeMinLogLevel(int i2);

    private static long getALogPtr() {
        return f55757f;
    }

    private static boolean sdkAboveAndroidN() {
        if (Build.VERSION.SDK_INT > 24) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(34867);
    }

    private static boolean initALogLazy() {
        long a2 = a.a();
        if (a2 == 0) {
            return false;
        }
        a(a2);
        return true;
    }

    private static void a() {
        if (f55756e == null) {
            int[] iArr = new int[9];
            f55756e = iArr;
            iArr[2] = -1;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 1;
            iArr[6] = 2;
            iArr[7] = 3;
            iArr[8] = 5;
        }
    }

    public static void a(long j2) {
        boolean z;
        MethodCollector.i(12079);
        if (Build.VERSION.SDK_INT > 24) {
            z = true;
        } else {
            z = false;
        }
        f55757f = j2;
        nativeInitALogNative(j2, z);
        MethodCollector.o(12079);
    }

    public static void a(int i2) {
        MethodCollector.i(11932);
        if (LynxEnv.b().f()) {
            try {
                a();
                nativeSetNativeMinLogLevel(f55756e[i2]);
                if (f55755d != i2) {
                    f55755d = i2;
                }
                MethodCollector.o(11932);
                return;
            } catch (ArrayIndexOutOfBoundsException e2) {
                e2.getMessage();
                f55755d = 6;
                nativeSetNativeMinLogLevel(f55756e[6]);
            }
        }
        MethodCollector.o(11932);
    }

    public static synchronized int a(b bVar) {
        int intValue;
        synchronized (LLog.class) {
            MethodCollector.i(12077);
            Integer valueOf = Integer.valueOf(f55754c.intValue() + 1);
            f55754c = valueOf;
            if (bVar.a() == 1) {
                int i2 = f55752a;
                if (i2 != -1) {
                    f55753b.remove(Integer.valueOf(i2));
                }
                f55752a = valueOf.intValue();
                for (Map.Entry<Integer, e> entry : f55753b.entrySet()) {
                    e value = entry.getValue();
                    if (!(entry.getValue() instanceof d)) {
                        int i3 = f55755d;
                        if (i3 == 6) {
                            f55755d = value.b();
                        } else {
                            f55755d = Math.min(i3, value.b());
                        }
                    }
                }
                a(f55755d);
            } else if (!(bVar instanceof d)) {
                int i4 = f55755d;
                if (i4 == 6) {
                    f55755d = bVar.b();
                } else {
                    f55755d = Math.min(i4, bVar.b());
                }
                a(f55755d);
            }
            f55753b.put(valueOf, bVar);
            if (LynxEnv.b().f()) {
                nativeSetHasLoggingDelegate(true);
            }
            intValue = valueOf.intValue();
            MethodCollector.o(12077);
        }
        return intValue;
    }

    public static void b(String str, String str2) {
        a(4, str, str2);
    }

    public static void c(String str, String str2) {
        a(5, str, str2);
    }

    public static void d(String str, String str2) {
        a(6, str, str2);
    }

    public static void a(String str, String str2) {
        a(3, str, str2);
    }

    public static void a(int i2, String str, String str2) {
        a(i2, str, str2, g.JAVA, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(int r4, java.lang.String r5, java.lang.String r6, com.lynx.tasm.base.g r7, int r8) {
        /*
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.lynx.tasm.base.e> r0 = com.lynx.tasm.base.LLog.f55753b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x000a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r2 = r3.next()
            com.lynx.tasm.base.e r2 = (com.lynx.tasm.base.e) r2
            boolean r0 = r2 instanceof com.lynx.tasm.base.d
            if (r0 == 0) goto L_0x005b
            r1 = r2
            com.lynx.tasm.base.d r1 = (com.lynx.tasm.base.d) r1
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000a
            boolean r0 = r1.a()
            if (r0 == 0) goto L_0x0056
        L_0x0029:
            r1 = r6
        L_0x002a:
            r0 = 2
            if (r4 == r0) goto L_0x0052
            r0 = 3
            if (r4 == r0) goto L_0x004e
            r0 = 4
            if (r4 == r0) goto L_0x004a
            r0 = 5
            if (r4 == r0) goto L_0x0046
            r0 = 6
            if (r4 == r0) goto L_0x0042
            r0 = 8
            if (r4 == r0) goto L_0x003e
            goto L_0x000a
        L_0x003e:
            r2.a(r1)
            goto L_0x000a
        L_0x0042:
            r2.e(r5, r1)
            goto L_0x000a
        L_0x0046:
            r2.d(r5, r1)
            goto L_0x000a
        L_0x004a:
            r2.c(r5, r1)
            goto L_0x000a
        L_0x004e:
            r2.b(r5, r1)
            goto L_0x000a
        L_0x0052:
            r2.a(r5, r1)
            goto L_0x000a
        L_0x0056:
            java.lang.String r1 = r6.substring(r8)
            goto L_0x002a
        L_0x005b:
            boolean r0 = r2.a(r7, r4)
            if (r0 == 0) goto L_0x000a
            goto L_0x0029
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.base.LLog.a(int, java.lang.String, java.lang.String, com.lynx.tasm.base.g, int):void");
    }

    private static void log(int i2, String str, String str2, int i3, long j2, int i4) {
        g gVar;
        if (i3 == 1) {
            try {
                gVar = g.JS;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        } else {
            gVar = g.Native;
        }
        if (i2 != 7) {
            Long.valueOf(j2);
            a(i2, str, str2, gVar, i4);
        }
    }
}
