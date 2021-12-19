package com.ss.android.ugc.aweme.commerce.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commerce.a.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Aweme f73374a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f73375b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static long f73376c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f73377d;

    private a() {
    }

    static {
        Covode.recordClassIndex(45168);
    }

    private static boolean a(long j2) {
        double d2 = (double) (j2 - f73376c);
        Double.isNaN(d2);
        if (d2 / 1000.0d >= 2.0d) {
            return true;
        }
        return false;
    }

    private static void b(long j2) {
        AwemeRawAd awemeRawAd;
        if (!f73377d && a(j2)) {
            f73377d = true;
            Aweme aweme = f73374a;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                l.b(awemeRawAd, "");
                if (k.b(f73374a)) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "viewable_2s", awemeRawAd).a("is_piv", 0).b();
                }
            }
        }
    }

    public static final void a(String str) {
        Aweme aweme = f73374a;
        if (aweme != null && aweme.isAd()) {
            long currentTimeMillis = System.currentTimeMillis();
            switch (str.hashCode()) {
                case -1036064766:
                    if (!str.equals("bufferStart")) {
                        return;
                    }
                    b(currentTimeMillis);
                    f73376c = Long.MAX_VALUE;
                    return;
                case -934426579:
                    if (!str.equals("resume")) {
                        return;
                    }
                    f73376c = currentTimeMillis;
                    return;
                case -697335956:
                    if (!str.equals("sessionStart")) {
                        return;
                    }
                    f73376c = currentTimeMillis;
                    f73377d = false;
                    return;
                case -599445191:
                    if (!str.equals("complete")) {
                        return;
                    }
                    b(currentTimeMillis);
                    f73376c = Long.MAX_VALUE;
                    return;
                case -524537143:
                    if (!str.equals("sessionFinish")) {
                        return;
                    }
                    b(currentTimeMillis);
                    f73376c = Long.MAX_VALUE;
                    return;
                case 106440182:
                    if (!str.equals("pause")) {
                        return;
                    }
                    b(currentTimeMillis);
                    f73376c = Long.MAX_VALUE;
                    return;
                case 1859771635:
                    if (!str.equals("bufferFinish")) {
                        return;
                    }
                    f73376c = currentTimeMillis;
                    return;
                case 1928770270:
                    if (!str.equals("mediaStart")) {
                        return;
                    }
                    f73376c = currentTimeMillis;
                    f73377d = false;
                    return;
                case 2147444528:
                    if (!str.equals("skipped")) {
                        return;
                    }
                    b(currentTimeMillis);
                    f73376c = Long.MAX_VALUE;
                    return;
                default:
                    return;
            }
        }
    }
}
