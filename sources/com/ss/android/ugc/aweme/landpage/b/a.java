package com.ss.android.ugc.aweme.landpage.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.landpage.b;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hh;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107275a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(68629);
    }

    public final boolean a(Aweme aweme) {
        if (aweme != null) {
            return a(aweme.getAwemeRawAd());
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.landpage.b
    public final boolean a(AwemeRawAd awemeRawAd) {
        ag nativeSiteConfig;
        if (awemeRawAd == null || (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) == null || !TextUtils.equals(nativeSiteConfig.getRenderType(), "lynx") || TextUtils.isEmpty(nativeSiteConfig.getLynxScheme())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.landpage.b
    public final String a(AwemeRawAd awemeRawAd, Context context) {
        String str;
        String str2;
        o oVar = new o();
        if (awemeRawAd != null) {
            com.ss.android.ugc.aweme.commercialize.feed.c.a preloadData = awemeRawAd.getPreloadData();
            String str3 = null;
            if (preloadData != null) {
                str = preloadData.getSiteId();
            } else {
                str = null;
            }
            oVar.a("siteId", str);
            Long adId = awemeRawAd.getAdId();
            if (adId != null) {
                str2 = String.valueOf(adId.longValue());
            } else {
                str2 = null;
            }
            oVar.a("adId", str2);
            oVar.a("creativeId", awemeRawAd.getCreativeIdStr());
            oVar.a("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                str3 = String.valueOf(groupId.longValue());
            }
            oVar.a("groupId", str3);
            oVar.a("webUrl", awemeRawAd.getWebUrl());
            oVar.a("pageData", awemeRawAd.getNativeSiteAdInfo());
            oVar.a("appData", awemeRawAd.getAppData());
            oVar.a("landPageShowType", Integer.valueOf(com.ss.android.ugc.aweme.ad.utils.a.a(awemeRawAd)));
            oVar.a("isRTL", Integer.valueOf(gb.a(context) ? 1 : 0));
            oVar.a("topSafeAreaHeight", Integer.valueOf(hh.b()));
        }
        String oVar2 = oVar.toString();
        l.b(oVar2, "");
        return oVar2;
    }
}
