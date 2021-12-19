package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.profile.model.User;

public final class af {
    static {
        Covode.recordClassIndex(75304);
    }

    public static void a() {
        User curUser = b.g().getCurUser();
        b.a();
        b.f62864a.k().updateMethodInfo("update_name", curUser.getUniqueId());
        curUser.setNicknameUpdateReminder(false);
    }
}
