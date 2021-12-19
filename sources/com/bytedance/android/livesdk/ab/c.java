package com.bytedance.android.livesdk.ab;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(7488);
    }

    public static final b a(b bVar, String str) {
        l.d(bVar, "");
        l.d(str, "");
        bVar.a("streaming_type", str);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r5 != null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.bytedance.android.livesdk.ab.b a(com.bytedance.android.livesdk.ab.b r4, com.bytedance.ies.sdk.datachannel.DataChannel r5) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r4, r0)
            if (r5 == 0) goto L_0x003a
            java.lang.Class<com.bytedance.android.livesdk.j.aq> r0 = com.bytedance.android.livesdk.j.aq.class
            java.lang.Object r0 = r5.b(r0)
            com.bytedance.android.livesdk.model.Hashtag r0 = (com.bytedance.android.livesdk.model.Hashtag) r0
            if (r0 == 0) goto L_0x003a
            java.lang.String r3 = r0.title
        L_0x0013:
            java.lang.Class<com.bytedance.android.livesdk.j.aq> r0 = com.bytedance.android.livesdk.j.aq.class
            java.lang.Object r0 = r5.b(r0)
            com.bytedance.android.livesdk.model.Hashtag r0 = (com.bytedance.android.livesdk.model.Hashtag) r0
            if (r0 == 0) goto L_0x003e
            java.lang.Long r0 = r0.id
            if (r0 == 0) goto L_0x003e
            long r1 = r0.longValue()
        L_0x0025:
            java.lang.String r0 = "choose_hashtag_id"
            r4.a(r0, r1)
            if (r3 == 0) goto L_0x0032
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r3 = "none"
        L_0x0034:
            java.lang.String r0 = "choose_hashtag_name"
            r4.a(r0, r3)
            return r4
        L_0x003a:
            r3 = 0
            if (r5 == 0) goto L_0x003e
            goto L_0x0013
        L_0x003e:
            r1 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.ab.c.a(com.bytedance.android.livesdk.ab.b, com.bytedance.ies.sdk.datachannel.DataChannel):com.bytedance.android.livesdk.ab.b");
    }
}
