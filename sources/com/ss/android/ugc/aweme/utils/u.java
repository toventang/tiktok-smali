package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

public final class u {
    static {
        Covode.recordClassIndex(93726);
    }

    public static UrlModel a(User user) {
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            return user.getAvatarMedium();
        }
        if (user.getAvatarThumb() != null) {
            return user.getAvatarThumb();
        }
        if (user.getAvatarLarger() != null) {
            return user.getAvatarLarger();
        }
        return null;
    }
}
