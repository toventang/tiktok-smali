package com.ss.android.ugc.aweme.commercialize.utils.b.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f75654a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(46656);
    }

    public static final boolean a(Context context, String str, Aweme aweme, int i2) {
        AwemeRawAd awemeRawAd;
        if (context == null || aweme == null || !aweme.isAd() || TextUtils.isEmpty(str) || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        l.b(awemeRawAd, "");
        SmartRoute withParam = SmartRouter.buildRoute(context, "//main/commercialize/bottom_from").withParam("url", str);
        Long creativeId = awemeRawAd.getCreativeId();
        l.b(creativeId, "");
        SmartRoute withParam2 = withParam.withParam("ad_id", creativeId.longValue()).withParam("ad_type", awemeRawAd.getType()).withParam("ad_system_origin", awemeRawAd.getSystemOrigin());
        Long creativeId2 = awemeRawAd.getCreativeId();
        l.b(creativeId2, "");
        withParam2.withParam("ad_id", creativeId2.longValue()).withParam("bundle_download_app_log_extra", awemeRawAd.getLogExtra()).withParam("aweme_id", aweme.getAid()).withParam("click_from", i2).open();
        return true;
    }
}
