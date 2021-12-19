package com.ss.android.ugc.aweme.feed.interest;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f93511a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(59243);
    }

    public static String a() {
        IAccountUserService e2 = AccountService.a().e();
        if (e2 != null) {
            return e2.getCurUserId();
        }
        return null;
    }
}
