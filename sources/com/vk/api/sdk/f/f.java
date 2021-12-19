package com.vk.api.sdk.f;

import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f156326a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(103818);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r3) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.c(r3, r0)
            r2 = 0
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            r0.<init>()     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            okhttp3.Request$Builder r0 = r0.url(r3)     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            okhttp3.Request r1 = r0.build()     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            com.vk.api.sdk.j$b r0 = new com.vk.api.sdk.j$b     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            r0.<init>()     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            okhttp3.OkHttpClient r0 = r0.a()     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            okhttp3.Call r0 = r0.newCall(r1)     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            okhttp3.Response r0 = r0.execute()     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            if (r0 != 0) goto L_0x0027
            return r2
        L_0x0027:
            okhttp3.ResponseBody r1 = r0.body()     // Catch:{ Exception -> 0x003f, all -> 0x0037 }
            if (r1 == 0) goto L_0x0034
            byte[] r2 = r1.bytes()     // Catch:{ Exception -> 0x0040, all -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r0 = move-exception
            goto L_0x0039
        L_0x0034:
            if (r1 == 0) goto L_0x0045
            goto L_0x0042
        L_0x0037:
            r0 = move-exception
            r1 = r2
        L_0x0039:
            if (r1 == 0) goto L_0x003e
            r1.close()
        L_0x003e:
            throw r0
        L_0x003f:
            r1 = r2
        L_0x0040:
            if (r1 == 0) goto L_0x0045
        L_0x0042:
            r1.close()
        L_0x0045:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.sdk.f.f.a(java.lang.String):byte[]");
    }
}
