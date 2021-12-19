package com.ss.android.ugc.aweme.im;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;

public class c {
    static {
        Covode.recordClassIndex(63780);
    }

    public static IMUser a(User user) {
        if (user == null) {
            return null;
        }
        return IMUser.fromUser(user);
    }
}
