package com.ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f65507a = new t();

    private t() {
    }

    static {
        Covode.recordClassIndex(40284);
    }

    public static s a() {
        try {
            s sVar = (s) SettingsManager.a().a("user_login_window", s.class);
            if (sVar == null) {
                return new s();
            }
            return sVar;
        } catch (Throwable unused) {
            return new s();
        }
    }
}
