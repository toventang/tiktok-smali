package com.bytedance.ies.ugc.aweme.commercialize.splash.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34763a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(20855);
    }

    public static final void a(boolean z, Aweme aweme, String str) {
        String str2;
        if (aweme != null && aweme.isAd()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("failCode", str);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str2 = awemeRawAd.getCreativeIdStr();
            } else {
                str2 = null;
            }
            jSONObject.put("creativeId", str2);
            jSONObject.put("groupId", aweme.getAid());
            IMonitorDepend iMonitorDepend = com.bytedance.ies.android.base.runtime.a.f31873b;
            if (iMonitorDepend != null) {
                iMonitorDepend.monitorStatusRate("aweme_ad_awesome_splash_show", !z ? 1 : 0, jSONObject);
            }
        }
    }

    public static final void a(boolean z, Long l2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("failReason", str2);
        jSONObject.put("creativeId", l2);
        jSONObject.put("logExtra", str);
        IMonitorDepend iMonitorDepend = com.bytedance.ies.android.base.runtime.a.f31873b;
        if (iMonitorDepend != null) {
            iMonitorDepend.monitorStatusRate("aweme_ad_normal_splash_download", !z ? 1 : 0, jSONObject);
        }
    }

    public static final void b(boolean z, Long l2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("failReason", str2);
        jSONObject.put("creativeId", l2);
        jSONObject.put("logExtra", str);
        IMonitorDepend iMonitorDepend = com.bytedance.ies.android.base.runtime.a.f31873b;
        if (iMonitorDepend != null) {
            iMonitorDepend.monitorStatusRate("aweme_ad_normal_splash_download_new", !z ? 1 : 0, jSONObject);
        }
    }

    public static final void a(boolean z, Aweme aweme, String str, Integer num, String str2) {
        String str3;
        if (aweme != null && aweme.isAd()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", str);
            jSONObject.put("errorCode", num);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str3 = awemeRawAd.getCreativeIdStr();
            } else {
                str3 = null;
            }
            jSONObject.put("creativeId", str3);
            jSONObject.put("groupId", aweme.getAid());
            jSONObject.put("url", str2);
            IMonitorDepend iMonitorDepend = com.bytedance.ies.android.base.runtime.a.f31873b;
            if (iMonitorDepend != null) {
                iMonitorDepend.monitorStatusRate("aweme_ad_awesome_splash_download", !z ? 1 : 0, jSONObject);
            }
        }
    }
}
