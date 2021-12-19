package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f73865a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final a f73866b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45500);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("enable_wishlist_product_tab", false);
        } catch (Throwable unused) {
            return f73865a;
        }
    }
}
