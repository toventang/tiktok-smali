package com.ss.android.ugc.aweme.ad.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.profile.model.User;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f66166a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(40676);
    }

    private static boolean b(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (splashInfo = awemeRawAd.getSplashInfo()) == null || splashInfo.getSplashFeedType() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean a(Aweme aweme) {
        AwemeSplashInfo splashInfo;
        if (!b(aweme) && aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (splashInfo = awemeRawAd.getSplashInfo()) != null && !splashInfo.hasUpdateLiving) {
                return true;
            }
            User author = aweme.getAuthor();
            if (author == null || !author.isLive()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
