package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.profile.model.User;

public final class hr {
    static {
        Covode.recordClassIndex(93641);
    }

    public static Boolean a() {
        User curUser = b.g().getCurUser();
        if (curUser == null || curUser.getCommerceUserInfo() == null) {
            return false;
        }
        return Boolean.valueOf(curUser.getCommerceUserInfo().isHasTcmEntry());
    }
}
