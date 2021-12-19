package com.ss.android.ugc.aweme.discover.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f81628a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(50721);
    }

    public static boolean a(User user) {
        if (user == null || !user.isEnableDirectMessage()) {
            return true;
        }
        return false;
    }
}
