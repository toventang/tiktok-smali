package com.ss.android.ugc.aweme.commercialize.h.a;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f74445a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(45919);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r3 != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r4, com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, org.json.JSONObject r7) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
        L_0x0003:
            return
        L_0x0004:
            if (r5 == 0) goto L_0x0003
            boolean r0 = r5.isAd()
            if (r0 != 0) goto L_0x000d
            goto L_0x0003
        L_0x000d:
            if (r5 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r5.getAwemeRawAd()
            if (r2 == 0) goto L_0x0025
            java.lang.Long r0 = r2.getCreativeId()
            if (r0 == 0) goto L_0x0025
            long r0 = r0.longValue()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            if (r3 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r3 = "0"
        L_0x0027:
            if (r2 == 0) goto L_0x003b
            java.lang.Long r0 = r2.getGroupId()
            if (r0 == 0) goto L_0x003b
            long r4 = r0.longValue()
        L_0x0033:
            java.lang.String r0 = "draw_ad"
            r1 = r6
            r2 = r7
            com.ss.android.ugc.aweme.commercialize.log.i.a(r0, r1, r2, r3, r4)
            return
        L_0x003b:
            r4 = 0
            goto L_0x0033
        L_0x003e:
            r2 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.h.a.b.a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, org.json.JSONObject):void");
    }
}
