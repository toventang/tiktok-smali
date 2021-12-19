package com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f73812a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final a f73813b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45456);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("enable_shopify_anchor_pdp_half_screen", false);
        } catch (Throwable unused) {
            return f73812a;
        }
    }
}
