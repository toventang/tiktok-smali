package com.ss.android.ugc.aweme.im.sdk.common.controller.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.websocket.a.c.b;
import com.ss.android.websocket.internal.a;

public final class d implements b {
    static {
        Covode.recordClassIndex(65492);
    }

    private static c b(a aVar) {
        try {
            c cVar = new c();
            cVar.f102344c = aVar.getMethod();
            cVar.f102348g = aVar.getPayload();
            cVar.f102346e = aVar.getPayloadEncoding();
            cVar.f102347f = aVar.getPayloadType();
            return cVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 != 5) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r1 == 1015) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 == 1) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return b(r4);
     */
    @Override // com.ss.android.websocket.a.c.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.ss.android.websocket.internal.a r4) {
        /*
            r3 = this;
            int r2 = r4.getMethod()
            int r1 = r4.getService()
            r0 = 1
            if (r2 != r0) goto L_0x0017
            r0 = 5
            if (r1 == r0) goto L_0x0012
        L_0x000e:
            r0 = 1015(0x3f7, float:1.422E-42)
            if (r1 != r0) goto L_0x001a
        L_0x0012:
            com.ss.android.ugc.aweme.im.sdk.common.controller.k.c r0 = b(r4)
        L_0x0016:
            return r0
        L_0x0017:
            if (r2 != r0) goto L_0x001a
            goto L_0x000e
        L_0x001a:
            r0 = 0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.k.d.a(com.ss.android.websocket.internal.a):java.lang.Object");
    }
}
