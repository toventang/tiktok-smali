package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f76051a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final ad f76052b = new ad();

    private ad() {
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_ad_half_web_page_log", true);
        } catch (Throwable unused) {
            return f76051a;
        }
    }

    static {
        Covode.recordClassIndex(46912);
    }
}
