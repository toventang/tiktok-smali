package com.bytedance.common.utility;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static j f26946a = new e();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f26947a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f26948b;

        static {
            Covode.recordClassIndex(15911);
        }
    }

    public abstract String a(String str, List<Pair<String, String>> list, Map<String, String> map);

    public abstract String a(String str, Map<String, String> map);

    public abstract String a(String str, byte[] bArr, Map<String, String> map);

    public byte[] b(String str, byte[] bArr, Map<String, String> map) {
        return null;
    }

    static {
        Covode.recordClassIndex(15910);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(byte[] r4) {
        /*
            r3 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x001b }
            r0 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r0)     // Catch:{ all -> 0x001b }
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x001b }
            r1.<init>(r2)     // Catch:{ all -> 0x001b }
            r1.write(r4)     // Catch:{ all -> 0x0018 }
            r1.close()     // Catch:{ all -> 0x0018 }
            byte[] r0 = r2.toByteArray()
            return r0
        L_0x0018:
            r0 = move-exception
            r3 = r1
            goto L_0x001c
        L_0x001b:
            r0 = move-exception
        L_0x001c:
            if (r3 == 0) goto L_0x0021
            r3.close()
        L_0x0021:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.j.a(byte[]):byte[]");
    }

    public final String a(String str, byte[] bArr, boolean z, String str2) {
        HashMap hashMap = new HashMap();
        if (z) {
            try {
                bArr = a(bArr);
                hashMap.put("Content-Encoding", "gzip");
            } catch (Exception e2) {
                throw new b(0, e2.getMessage());
            }
        }
        if (!m.a(str2)) {
            hashMap.put("Content-Type", str2);
        }
        return a(str, bArr, hashMap);
    }
}
