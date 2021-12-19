package com.ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f63715a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(39288);
    }

    public static final boolean a() {
        try {
            if (b.a().a(true, "trusted_env_login_on_new_install", 0) != 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    public static final boolean b() {
        try {
            if (b.a().a(true, "trusted_env_login_on_new_install", 0) == 2) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }
}
