package com.ss.android.ugc.aweme.ad.feed.h;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import java.util.Collection;

public final class a {
    static {
        Covode.recordClassIndex(40535);
    }

    public static boolean c(Aweme aweme) {
        SpecialSticker specialSticker;
        if (aweme == null || (specialSticker = aweme.getSpecialSticker()) == null || specialSticker.getStickerType() != 2) {
            return false;
        }
        return true;
    }

    public static boolean d(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getPlayFunModel() == null) {
            return false;
        }
        return true;
    }

    public static boolean a(Aweme aweme) {
        UrlModel redImageUrl;
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (TextUtils.equals(awemeRawAd.getType(), "redpacket") && (redImageUrl = awemeRawAd.getRedImageUrl()) != null && !b.a((Collection) redImageUrl.getUrlList())) {
            return true;
        }
        return false;
    }

    public static boolean b(Aweme aweme) {
        com.ss.android.ugc.aweme.commerce.model.b activityPendant;
        UrlModel image;
        if (!(aweme == null || aweme.getActivityPendant() == null || (image = (activityPendant = aweme.getActivityPendant()).getImage()) == null || b.a((Collection) image.getUrlList()))) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis < activityPendant.getStartTime() || currentTimeMillis > activityPendant.getEndTime()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
