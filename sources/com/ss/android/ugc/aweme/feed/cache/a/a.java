package com.ss.android.ugc.aweme.feed.cache.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import h.f.b.l;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(58786);
    }

    public static final boolean a(Aweme aweme) {
        VideoUrlModel playAddr;
        List<String> urlList;
        l.d(aweme, "");
        Video video = aweme.getVideo();
        if (video == null || (playAddr = video.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null) {
            return true;
        }
        for (String str : urlList) {
            l.b(str, "");
            if (!a(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r12) {
        /*
            java.lang.String r11 = ""
            h.f.b.l.d(r12, r11)
            android.net.Uri r2 = android.net.Uri.parse(r12)
            java.lang.String r0 = "VExpiration"
            java.lang.String r1 = r2.getQueryParameter(r0)
            if (r1 != 0) goto L_0x0017
            java.lang.String r0 = "expire"
            java.lang.String r1 = r2.getQueryParameter(r0)
        L_0x0017:
            r9 = 1000(0x3e8, double:4.94E-321)
            r7 = -1
            if (r1 == 0) goto L_0x0023
            long r5 = java.lang.Long.parseLong(r1)     // Catch:{ all -> 0x0023 }
            long r5 = r5 * r9
            goto L_0x0025
        L_0x0023:
            r5 = -1
        L_0x0025:
            r4 = 0
            r3 = 1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x004b
            h.f.b.l.b(r2, r11)
            java.util.List r2 = r2.getPathSegments()
            int r0 = r2.size()
            if (r0 <= r3) goto L_0x003e
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r1 = (java.lang.String) r1
        L_0x003e:
            if (r1 == 0) goto L_0x004b
            r0 = 16
            int r0 = h.m.a.a(r0)     // Catch:{ all -> 0x004b }
            long r5 = java.lang.Long.parseLong(r1, r0)     // Catch:{ all -> 0x004b }
            long r5 = r5 * r9
        L_0x004b:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0057
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
        L_0x0057:
            return r3
        L_0x0058:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.cache.a.a.a(java.lang.String):boolean");
    }
}
