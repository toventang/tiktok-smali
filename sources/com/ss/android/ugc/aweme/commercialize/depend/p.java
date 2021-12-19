package com.ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.ad.feed.c;
import com.ss.android.ugc.aweme.bullet.a;
import com.ss.android.ugc.aweme.bullet.e;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.utils.ad;
import com.ss.android.ugc.aweme.commercialize.utils.d;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class p implements c {
    static {
        Covode.recordClassIndex(45430);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.c
    public final boolean b(Aweme aweme) {
        return b.aI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.c
    public final boolean c(Aweme aweme) {
        return b.C(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.c
    public final boolean d(Aweme aweme) {
        return b.al(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.c
    public final boolean e(Aweme aweme) {
        return b.am(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.c
    public final boolean a(Aweme aweme) {
        return b.aH(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.c
    public final boolean a(AwemeRawAd awemeRawAd) {
        return b.e(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.c
    public final String a(Context context, Aweme aweme) {
        return ad.a(context, aweme, false);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.c
    public final e a(BulletContainerView bulletContainerView, String str, a aVar) {
        l.d(bulletContainerView, "");
        return new com.ss.android.ugc.aweme.commercialize.feed.a(bulletContainerView, str, aVar);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.c
    public final void a(Bundle bundle, Aweme aweme, Context context) {
        String str = "";
        l.d(bundle, str);
        l.d(context, str);
        d.a(bundle, aweme, context);
        d.b(bundle, aweme, context);
        if (!(context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd.getNonNativeClick() == 0 && com.ss.android.ugc.aweme.profile.service.a.f116616a.getAdLynxLandPageUtil().a(awemeRawAd)) {
                bundle.putLong("bundle_real_ad_id", awemeRawAd.getAdId().longValue());
                bundle.putString("bundle_render_type", awemeRawAd.getNativeSiteConfig().getRenderType());
                bundle.putString("bundle_lynx_scheme", awemeRawAd.getNativeSiteConfig().getLynxScheme());
                bundle.putInt("bundle_lynx_landing_style", awemeRawAd.getNativeSiteConfig().getLynxLandingStyle());
                if (!(aweme.getVideo() == null || aweme.getVideo().getOriginCover() == null || com.bytedance.common.utility.collection.b.a((Collection) aweme.getVideo().getOriginCover().getUrlList()))) {
                    bundle.putString("bundle_full_screen_bg_image", aweme.getVideo().getOriginCover().getUrlList().get(0));
                }
                List<String> geckoChannel = awemeRawAd.getNativeSiteConfig().getGeckoChannel();
                if (!com.bytedance.common.utility.collection.b.a((Collection) geckoChannel)) {
                    str = geckoChannel.get(0);
                }
                bundle.putString("lynx_channel_name", str);
                bundle.putString("bundle_native_site_custom_data", awemeRawAd.getNativeSiteCustomData());
                if (awemeRawAd.getNativeSiteConfig().getSecondPageGeckoChannel() != null) {
                    bundle.putStringArrayList("bundle_second_page_gecko_channels", (ArrayList) awemeRawAd.getNativeSiteConfig().getSecondPageGeckoChannel());
                }
                bundle.putString("bundle_native_site_ad_info", awemeRawAd.getNativeSiteAdInfo());
                bundle.putString("bundle_native_site_app_data", awemeRawAd.getAppData());
            }
        }
        d.c(bundle, aweme, context);
        d.a(bundle, context);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.c
    public final boolean a(Context context, Aweme aweme, int i2, com.ss.android.ugc.aweme.commercialize.j.b bVar) {
        l.d(bVar, "");
        return w.a(context, aweme, i2, bVar);
    }
}
