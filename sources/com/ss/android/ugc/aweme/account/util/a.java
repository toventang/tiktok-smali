package com.ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f65474a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final a f65475b = new a();

    private a() {
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("http_cookie_error", true);
        } catch (Exception unused) {
            return f65474a;
        }
    }

    static {
        Covode.recordClassIndex(40261);
    }
}
