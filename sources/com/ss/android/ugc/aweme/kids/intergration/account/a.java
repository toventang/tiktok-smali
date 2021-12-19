package com.ss.android.ugc.aweme.kids.intergration.account;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static volatile IAccountService f106698a;

    static {
        Covode.recordClassIndex(68193);
    }

    static void a() {
        if (f106698a == null) {
            f106698a = AccountService.a();
        }
    }

    public static IAccountUserService b() {
        a();
        return f106698a.e();
    }
}
