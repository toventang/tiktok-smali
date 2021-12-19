package com.ss.android.ugc.aweme.commercialize.live.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f74555a = "https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-report?hide_nav_bar=1&use_bdx=1&trans_status_bar=1";

    /* renamed from: b  reason: collision with root package name */
    public static final b f74556b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(45973);
    }

    public static final String a() {
        String a2 = SettingsManager.a().a("live_links_report_schema", "https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-report?hide_nav_bar=1&use_bdx=1&trans_status_bar=1");
        l.b(a2, "");
        if (TextUtils.isEmpty(a2)) {
            return f74555a;
        }
        return a2;
    }
}
