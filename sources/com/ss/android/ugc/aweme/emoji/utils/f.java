package com.ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import h.f.b.l;
import java.io.File;
import java.io.Serializable;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f89455a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(56214);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055 A[SYNTHETIC, Splitter:B:29:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(java.io.File r6) {
        /*
            r5 = 2729(0xaa9, float:3.824E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            java.lang.String r4 = ""
            h.f.b.l.d(r6, r4)
            r3 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003f }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ Exception -> 0x003f }
            r0.<init>(r6)     // Catch:{ Exception -> 0x003f }
            r2.<init>(r0)     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r0.<init>()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
        L_0x001e:
            if (r1 == 0) goto L_0x0028
            r0.append(r1)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            goto L_0x001e
        L_0x0028:
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            h.f.b.l.b(r1, r4)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r2.close()     // Catch:{ Exception -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0037:
            r4 = r1
            goto L_0x005d
        L_0x0039:
            r1 = move-exception
            r3 = r2
            goto L_0x0045
        L_0x003c:
            r0 = move-exception
            r3 = r2
            goto L_0x0040
        L_0x003f:
            r0 = move-exception
        L_0x0040:
            r0.printStackTrace()     // Catch:{ all -> 0x0044 }
            goto L_0x0053
        L_0x0044:
            r1 = move-exception
        L_0x0045:
            if (r3 == 0) goto L_0x004f
            r3.close()     // Catch:{ Exception -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004f:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r1
        L_0x0053:
            if (r3 == 0) goto L_0x005d
            r3.close()     // Catch:{ Exception -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005d:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.utils.f.a(java.io.File):java.lang.String");
    }

    public static final synchronized <T extends Serializable> List<T> a(String str, Class<T> cls) {
        List<T> a2;
        synchronized (f.class) {
            MethodCollector.i(2386);
            l.d(str, "");
            l.d(cls, "");
            File fileStreamPath = d.a().getFileStreamPath(str);
            l.b(fileStreamPath, "");
            a2 = a(fileStreamPath, cls);
            MethodCollector.o(2386);
        }
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[SYNTHETIC, Splitter:B:21:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072 A[SYNTHETIC, Splitter:B:31:0x0072] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized <T extends java.io.Serializable> java.util.List<T> a(java.io.File r8, java.lang.Class<T> r9) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.utils.f.a(java.io.File, java.lang.Class):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e A[SYNTHETIC, Splitter:B:36:0x007e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized <T extends java.io.Serializable> boolean a(java.io.File r9, java.util.List<? extends T> r10) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.utils.f.a(java.io.File, java.util.List):boolean");
    }

    public static final synchronized <T extends Serializable> boolean a(String str, List<? extends T> list) {
        boolean a2;
        synchronized (f.class) {
            MethodCollector.i(2376);
            l.d(str, "");
            File fileStreamPath = d.a().getFileStreamPath(str);
            l.b(fileStreamPath, "");
            a2 = a(fileStreamPath, list);
            MethodCollector.o(2376);
        }
        return a2;
    }
}
