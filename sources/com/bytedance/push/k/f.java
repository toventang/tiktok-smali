package com.bytedance.push.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private Object f42239a;

    static {
        Covode.recordClassIndex(25805);
    }

    f() {
    }

    private Object a() {
        MethodCollector.i(6256);
        if (this.f42239a == null) {
            synchronized (d.class) {
                try {
                    if (this.f42239a == null) {
                        try {
                            this.f42239a = Class.forName("android.os.SystemProperties").newInstance();
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6256);
                    throw th;
                }
            }
        }
        Object obj = this.f42239a;
        MethodCollector.o(6256);
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r6 = a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return (java.lang.String) r6.getClass().getMethod("get", java.lang.String.class).invoke(r6, r8);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = android.os.SystemProperties.get(r8)     // Catch:{ all -> 0x0005 }
            return r0
        L_0x0005:
            java.lang.Object r6 = r7.a()     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.Class r5 = r6.getClass()     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.String r4 = "get"
            r3 = 1
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2 = 0
            r1[r2] = r0     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.reflect.Method r1 = r5.getMethod(r4, r1)     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            r0[r2] = r8     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            java.lang.String r0 = ""
        L_0x0028:
            return r0
        L_0x0029:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.k.f.a(java.lang.String):java.lang.String");
    }
}
