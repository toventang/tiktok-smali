package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.profile.model.User;

public final class im {
    static {
        Covode.recordClassIndex(93674);
    }

    public static UrlModel a(User user) {
        UrlModel avatarVideoUri;
        if (user != null && (avatarVideoUri = user.getAvatarVideoUri()) != null && d.b(avatarVideoUri.getUrlList()) && !TextUtils.isEmpty(avatarVideoUri.getUrlList().get(0))) {
            return avatarVideoUri;
        }
        return null;
    }
}
