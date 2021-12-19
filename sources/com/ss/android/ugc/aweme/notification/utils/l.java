package com.ss.android.ugc.aweme.notification.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.in;

public final class l {
    static {
        Covode.recordClassIndex(73237);
    }

    public static boolean a() {
        if (BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser() == null || !in.d()) {
            return false;
        }
        return true;
    }

    public static String a(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }
}
