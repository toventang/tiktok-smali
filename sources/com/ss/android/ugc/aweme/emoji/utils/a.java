package com.ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;

public final class a {
    static {
        Covode.recordClassIndex(56209);
    }

    public static boolean a() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || !createIUserServicebyMonsterPlugin.isLogin()) {
            return false;
        }
        return true;
    }

    public static long c() {
        return Long.parseLong(b().toString());
    }

    public static CharSequence b() {
        IAccountUserService e2 = AccountService.a().e();
        if (e2 == null) {
            return "-1";
        }
        return e2.getCurUserId();
    }
}
