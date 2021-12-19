package com.ss.android.ugc.aweme.commerce.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class k {
    static {
        Covode.recordClassIndex(45177);
    }

    public static boolean a(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        if (aweme.getAwemeRawAd().getPivOption() == 1 || aweme.getAwemeRawAd().getPivOption() == 2) {
            return true;
        }
        return false;
    }

    public static boolean b(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        if (aweme.getAwemeRawAd().getPivOption() == 0 || aweme.getAwemeRawAd().getPivOption() == 2) {
            return true;
        }
        return false;
    }
}
