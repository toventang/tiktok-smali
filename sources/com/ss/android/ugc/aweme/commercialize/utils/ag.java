package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commercialize.j.b;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;

public final class ag {
    static {
        Covode.recordClassIndex(46614);
    }

    public static void a(Context context, Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            String openUrl = aweme.getAwemeRawAd().getOpenUrl();
            String type = awemeRawAd.getType();
            if (!TextUtils.isEmpty(type)) {
                type.hashCode();
                char c2 = 65535;
                switch (type.hashCode()) {
                    case -1354573786:
                        if (type.equals("coupon")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 117588:
                        if (type.equals("web")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3083120:
                        if (type.equals("dial")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3148996:
                        if (type.equals("form")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 957829685:
                        if (type.equals("counsel")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1893962841:
                        if (type.equals("redpacket")) {
                            c2 = 5;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        j.d(context, aweme, "button");
                        j.d(context, "click_coupon", aweme, j.a(context, aweme, false, (Map<String, String>) null));
                        a.a("homepage_ad", "click_coupon", awemeRawAd).c();
                        break;
                    case 1:
                    case 4:
                        if (!com.ss.android.ugc.aweme.commercialize.im.a.a(openUrl)) {
                            j.d(context, aweme, "button");
                            j.r(context, aweme);
                            a.a("homepage_ad", "click_button", awemeRawAd).c();
                            break;
                        } else {
                            j.a(context, "homepage_ad", "click_message", aweme, j.a(context, aweme, false, (Map<String, String>) null));
                            a.a("homepage_ad", "click_message", awemeRawAd).c();
                            break;
                        }
                    case 2:
                        j.s(context, aweme);
                        a.a("homepage_ad", "click_call", aweme.getAwemeRawAd()).c();
                        j.d(context, aweme, "button");
                        break;
                    case 3:
                        j.t(context, aweme);
                        a.a("homepage_ad", "click_form", aweme.getAwemeRawAd()).c();
                        j.d(context, aweme, "button");
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        j.d(context, aweme, "button");
                        j.v(context, aweme);
                        a.a("homepage_ad", "click_redpacket", awemeRawAd).c();
                        break;
                }
                w.a(context, aweme, 8, (b) null);
            }
        }
    }
}
