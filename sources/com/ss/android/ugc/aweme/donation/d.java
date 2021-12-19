package com.ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f82965a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(51729);
    }

    public static c a() {
        try {
            c cVar = (c) SettingsManager.a().a("donation_urls", c.class);
            if (cVar == null) {
                return new c();
            }
            return cVar;
        } catch (Throwable unused) {
            return new c();
        }
    }
}
