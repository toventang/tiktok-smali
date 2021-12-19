package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.j.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f75773a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(46736);
    }

    private static int a(Aweme aweme) {
        if (!b.d(aweme)) {
            return -1;
        }
        CardStruct e2 = b.e(aweme);
        l.b(e2, "");
        return e2.getCardType();
    }

    private static long b(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Long creativeId;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
            return 0;
        }
        return creativeId.longValue();
    }

    private static String c(Aweme aweme) {
        CardStruct e2;
        if (aweme == null || !aweme.isAd() || (e2 = b.e(aweme)) == null) {
            return null;
        }
        return e2.getCardUrl();
    }

    public static final void a(String str) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                List<JSONObject> list = a.f74484c;
                if (list.size() > 0) {
                    jSONObject.put("url", str);
                    jSONObject.put("error_details", list);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (jSONObject.length() > 0) {
                com.bytedance.apm.b.a("aweme_ad_card_load_details", 0, jSONObject);
            }
        }
    }

    public static final void a(Aweme aweme, Boolean bool) {
        if (aweme != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("card_type", a(aweme));
                jSONObject.put("url", c(aweme));
                if (l.a((Object) bool, (Object) true)) {
                    jSONObject.put("card_opt_version", "1");
                }
                if (aweme.isAd()) {
                    jSONObject.put("creative_id", b(aweme));
                }
                if (aweme.isLive()) {
                    jSONObject.put("sub_type", "feed_live");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            com.bytedance.apm.b.a("aweme_ad_card_show_error_rate", 0, jSONObject);
            com.bytedance.apm.b.a("aweme_ad_card_show_error_rate_v2", 0, jSONObject);
        }
    }

    public static final void b(Aweme aweme, String str, Boolean bool) {
        l.d(str, "");
        if (aweme != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("card_type", a(aweme));
                jSONObject.put("url", c(aweme));
                jSONObject.put("error_msg", str);
                if (l.a((Object) bool, (Object) true)) {
                    jSONObject.put("card_opt_version", "1");
                }
                if (aweme.isAd()) {
                    jSONObject.put("creative_id", b(aweme));
                }
                if (aweme.isLive()) {
                    jSONObject.put("sub_type", "feed_live");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            com.bytedance.apm.b.a("aweme_ad_card_show_error_rate_v2", 2, jSONObject);
            com.bytedance.apm.b.a("aweme_ad_card_show_error", 2, jSONObject);
        }
    }

    public static final void a(Aweme aweme, String str, Boolean bool) {
        l.d(str, "");
        if (aweme != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("card_type", a(aweme));
                jSONObject.put("url", c(aweme));
                jSONObject.put("error_msg", str);
                if (l.a((Object) bool, (Object) true)) {
                    jSONObject.put("card_opt_version", "1");
                }
                if (aweme.isAd()) {
                    jSONObject.put("creative_id", b(aweme));
                }
                if (aweme.isLive()) {
                    jSONObject.put("sub_type", "feed_live");
                }
                jSONObject.put("error_details", a.f74484c);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            com.bytedance.apm.b.a("aweme_ad_card_show_error_rate", 1, jSONObject);
            com.bytedance.apm.b.a("aweme_ad_card_show_error_rate_v2", 1, jSONObject);
            com.bytedance.apm.b.a("aweme_ad_card_show_error", 1, jSONObject);
        }
    }
}
