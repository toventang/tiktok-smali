package com.ss.android.ugc.aweme.ecommerce.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final b f84224a = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final h f84225b = new h();

    private h() {
    }

    public static final String a() {
        String str = b().f84206a;
        if (str == null) {
            return "sslocal://webcast_lynxview?url=https%3A%2F%2Ftosv.byted.org%2Fobj%2Fgecko-internal-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_coupon_panel%2Fpages%2Fcoupon%2Ftemplate.js&gravity=bottom&type=popup&hide_nav_bar=1&hide_status_bar=1&web_bg_color=ffffff&show_dim=1&mask_alpha=0.5";
        }
        return str;
    }

    static {
        Covode.recordClassIndex(52524);
    }

    public static final b b() {
        SettingsManager a2 = SettingsManager.a();
        b bVar = f84224a;
        b bVar2 = (b) a2.a("ecom_settings_config", b.class, bVar);
        return bVar2 == null ? bVar : bVar2;
    }
}
