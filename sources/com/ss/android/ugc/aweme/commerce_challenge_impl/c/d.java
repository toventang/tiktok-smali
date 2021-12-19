package com.ss.android.ugc.aweme.commerce_challenge_impl.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f73548a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final d f73549b = new d();

    private d() {
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("post_global_layout", true);
        } catch (Throwable unused) {
            return f73548a;
        }
    }

    static {
        Covode.recordClassIndex(45266);
    }
}
