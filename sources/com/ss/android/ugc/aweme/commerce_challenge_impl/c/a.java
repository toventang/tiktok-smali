package com.ss.android.ugc.aweme.commerce_challenge_impl.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f73540a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final a f73541b = new a();

    private a() {
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_edit_hashtag_with_emoji", true);
        } catch (Throwable unused) {
            return f73540a;
        }
    }

    static {
        Covode.recordClassIndex(45262);
    }
}
