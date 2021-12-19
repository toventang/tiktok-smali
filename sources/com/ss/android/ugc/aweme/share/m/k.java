package com.ss.android.ugc.aweme.share.m;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f124091a = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftcm%2Fad%2Ftcm_center%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dstar_fe_i18n_mobile_tcm_center%26bundle%3Dindex.js%26module_name%3Dpage_tcm_center%26hide_nav_bar%3D1";

    /* renamed from: b  reason: collision with root package name */
    public static final k f124092b = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(81497);
    }

    public static final String a() {
        try {
            String a2 = SettingsManager.a().a("tcm_campaign_detail_url", "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftcm%2Fad%2Ftcm_center%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dstar_fe_i18n_mobile_tcm_center%26bundle%3Dindex.js%26module_name%3Dpage_tcm_center%26hide_nav_bar%3D1");
            l.b(a2, "");
            return a2;
        } catch (Throwable unused) {
            return f124091a;
        }
    }
}
