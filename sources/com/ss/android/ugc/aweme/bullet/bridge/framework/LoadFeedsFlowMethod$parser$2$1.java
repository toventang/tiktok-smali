package com.ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.covode.number.Covode;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import java.lang.reflect.Type;

public final class LoadFeedsFlowMethod$parser$2$1 implements k<Boolean> {
    static {
        Covode.recordClassIndex(42607);
    }

    LoadFeedsFlowMethod$parser$2$1() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        if (r3.h() == true) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean a(com.google.gson.l r3) {
        /*
            r2 = 0
            r1 = 1
            if (r3 == 0) goto L_0x000c
            int r0 = r3.g()     // Catch:{ Exception -> 0x0012 }
            if (r0 != r1) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0012 }
            return r0
        L_0x0012:
            r0 = move-exception
            r0.printStackTrace()
            if (r3 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1 = 0
            goto L_0x0021
        L_0x001b:
            boolean r0 = r3.h()     // Catch:{ Exception -> 0x0026 }
            if (r0 != r1) goto L_0x0019
        L_0x0021:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0026 }
            return r0
        L_0x0026:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod$parser$2$1.a(com.google.gson.l):java.lang.Boolean");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ Boolean a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}
