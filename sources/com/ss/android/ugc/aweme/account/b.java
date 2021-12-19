package com.ss.android.ugc.aweme.account;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IAgeGateService;
import com.ss.android.ugc.aweme.bj;
import com.ss.android.ugc.aweme.bk;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.br;
import com.ss.android.ugc.aweme.bs;
import com.ss.android.ugc.aweme.bv;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile IAccountService f62864a;

    static {
        Covode.recordClassIndex(38725);
    }

    public static void a() {
        if (f62864a == null) {
            f62864a = AccountService.a();
        }
    }

    public static bo b() {
        a();
        return f62864a.g();
    }

    public static bk c() {
        a();
        return f62864a.d();
    }

    public static IAgeGateService d() {
        a();
        return f62864a.c();
    }

    public static bj e() {
        a();
        return f62864a.h();
    }

    public static br f() {
        a();
        return f62864a.i();
    }

    public static IAccountUserService g() {
        a();
        return f62864a.e();
    }

    public static bv h() {
        a();
        return f62864a.f();
    }

    public static bs i() {
        a();
        return f62864a.j();
    }
}
