package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.r;
import com.google.gson.s;
import java.lang.reflect.Type;

public final class IntegerDefaultZeroAdater implements k<Integer>, s<Integer> {
    static {
        Covode.recordClassIndex(65563);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.gson.s
    public final /* synthetic */ l a(Integer num) {
        return new r((Number) num);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Integer a(com.google.gson.l r2) {
        /*
            java.lang.String r1 = ""
            h.f.b.l.d(r2, r1)
            java.lang.String r0 = r2.c()     // Catch:{ Exception -> 0x0021 }
            boolean r0 = h.f.b.l.a(r0, r1)     // Catch:{ Exception -> 0x0021 }
            if (r0 != 0) goto L_0x001b
            java.lang.String r1 = r2.c()     // Catch:{ Exception -> 0x0021 }
            java.lang.String r0 = "null"
            boolean r0 = h.f.b.l.a(r1, r0)     // Catch:{ Exception -> 0x0021 }
            if (r0 == 0) goto L_0x0021
        L_0x001b:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0021 }
            return r0
        L_0x0021:
            int r0 = r2.g()     // Catch:{ NumberFormatException -> 0x002a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x002a:
            r1 = move-exception
            com.google.gson.t r0 = new com.google.gson.t
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.gson.IntegerDefaultZeroAdater.a(com.google.gson.l):java.lang.Integer");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ Integer a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}
