package com.ss.android.ugc.aweme.commercialize.link;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public final class c implements a {
    static {
        Covode.recordClassIndex(45950);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.link.a
    public final boolean a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String str = null;
        if (aweme != null) {
            if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getDefaultCardInfo() == null) {
                str = b.a(aweme, false);
            } else {
                str = "ad_card";
            }
        }
        return TextUtils.equals("shopping_cart", str);
    }
}
