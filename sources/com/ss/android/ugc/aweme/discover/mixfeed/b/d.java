package com.ss.android.ugc.aweme.discover.mixfeed.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.discover.m.f;
import com.ss.android.ugc.aweme.profile.model.User;

public final class d {
    static {
        Covode.recordClassIndex(50737);
    }

    public static final int a(User user) {
        if (user == null || !b.g().isLogin()) {
            return -1;
        }
        int followStatus = user.getFollowStatus();
        if (followStatus != 0) {
            if (followStatus == 1) {
                return 1;
            }
            if (followStatus != 2) {
                if (followStatus != 4) {
                    return 0;
                }
                return 4;
            } else if (f.a(user)) {
                return 2;
            } else {
                return 3;
            }
        } else if (user.getFollowerStatus() == 1) {
            return 5;
        }
        return 0;
    }
}
