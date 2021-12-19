package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public class BundleUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f155127a;

    public static boolean isBundle() {
        return f155127a;
    }

    static {
        boolean z;
        Covode.recordClassIndex(103249);
        try {
            Class.forName("org.chromium.base.BundleCanary");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f155127a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getNativeLibraryPath(java.lang.String r4) {
        /*
            com.ttnet.org.chromium.base.m r3 = com.ttnet.org.chromium.base.m.b()
            android.content.Context r0 = com.ttnet.org.chromium.base.c.f155223a     // Catch:{ all -> 0x0014 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ all -> 0x0014 }
            dalvik.system.BaseDexClassLoader r0 = (dalvik.system.BaseDexClassLoader) r0     // Catch:{ all -> 0x0014 }
            java.lang.String r0 = r0.findLibrary(r4)     // Catch:{ all -> 0x0014 }
            r3.close()
            return r0
        L_0x0014:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x001b }
            goto L_0x001f
        L_0x001b:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x001f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.BundleUtils.getNativeLibraryPath(java.lang.String):java.lang.String");
    }
}
