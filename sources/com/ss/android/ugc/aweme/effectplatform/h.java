package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;

public final class h implements IJsonConverter {

    /* renamed from: a  reason: collision with root package name */
    private f f89048a;

    static {
        Covode.recordClassIndex(56002);
    }

    public static h a() {
        return new h(g.a().G());
    }

    private h(f fVar) {
        this.f89048a = fVar;
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> String convertObjToJson(T t) {
        if (t == null) {
            return null;
        }
        return this.f89048a.b(t);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[SYNTHETIC, Splitter:B:20:0x003b] */
    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T convertJsonToObj(java.io.InputStream r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            r4 = 0
            com.google.gson.c.a r3 = new com.google.gson.c.a     // Catch:{ t -> 0x0020 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ t -> 0x0020 }
            r0.<init>(r6)     // Catch:{ t -> 0x0020 }
            r3.<init>(r0)     // Catch:{ t -> 0x0020 }
            com.google.gson.f r0 = r5.f89048a     // Catch:{ t -> 0x001d, all -> 0x001a }
            java.lang.Object r1 = r0.a(r3, r7)     // Catch:{ t -> 0x001d, all -> 0x001a }
            r3.close()     // Catch:{ IOException -> 0x0015 }
            goto L_0x0019
        L_0x0015:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0019:
            return r1
        L_0x001a:
            r1 = move-exception
            r4 = r3
            goto L_0x0039
        L_0x001d:
            r2 = move-exception
            r4 = r3
            goto L_0x0021
        L_0x0020:
            r2 = move-exception
        L_0x0021:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "JsonConvertImpl convert fail : "
            r1.<init>(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0038 }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0038 }
            com.ss.android.ugc.tools.utils.q.b(r0)     // Catch:{ all -> 0x0038 }
            throw r2     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
        L_0x0039:
            if (r4 == 0) goto L_0x0043
            r4.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0043:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectplatform.h.convertJsonToObj(java.io.InputStream, java.lang.Class):java.lang.Object");
    }
}
