package com.ss.android.ugc.aweme.shortvideo.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

public final class bn {
    static {
        Covode.recordClassIndex(86630);
    }

    public static final String a(User user) {
        String str;
        String str2;
        if (user == null) {
            return "";
        }
        String uniqueId = user.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            str = user.getShortId();
        } else {
            str = user.getUniqueId();
        }
        if (str != null && str.length() != 0) {
            return str;
        }
        if (TextUtils.isEmpty(user.getRemarkName())) {
            str2 = user.getNickname();
            if (str2 == null) {
                return "";
            }
        } else {
            str2 = user.getRemarkName();
            if (str2 == null) {
                return "";
            }
        }
        return str2;
    }
}
