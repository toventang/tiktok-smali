package com.ss.android.ugc.aweme.discover.l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f81406a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f81407b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(50595);
    }

    public static final boolean a() {
        if (b.a().a(true, "discover_speed_detail", 0) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        if (!a() || f81406a) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(com.ss.android.ugc.aweme.common.e.a<com.ss.android.ugc.aweme.feed.model.Aweme, ?> r3, java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r4) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r4, r0)
            boolean r0 = a()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            java.util.Iterator r2 = r4.iterator()
        L_0x0010:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            if (r1 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getAuthor()
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r1.getStatistics()
            if (r0 != 0) goto L_0x0010
        L_0x002a:
            return
        L_0x002b:
            com.ss.android.ugc.aweme.music.service.d.a(r3, r4)
            com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService r0 = com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl.b()
            r0.a(r3, r4)
            if (r3 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.profile.IProfileService r0 = com.ss.android.ugc.aweme.profile.ProfileServiceImpl.g()
            r0.mobRefreshInProfileAweme(r3, r4)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.l.a.a(com.ss.android.ugc.aweme.common.e.a, java.util.List):void");
    }
}
