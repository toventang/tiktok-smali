package com.ss.android.ugc.aweme.commercialize.e.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73805a = new a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e.a.a$a  reason: collision with other inner class name */
    public static final class C1655a extends com.google.gson.b.a<Boolean> {
        static {
            Covode.recordClassIndex(45449);
        }

        C1655a() {
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(45448);
    }

    public static final boolean b(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (b.aB(aweme) || b.ay(aweme) || (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getWebviewType() == 1)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (r7 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.e.a.a.a(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
