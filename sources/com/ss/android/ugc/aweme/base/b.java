package com.ss.android.ugc.aweme.base;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f67991a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(41878);
    }

    public static Integer a(Aweme aweme) {
        String str;
        int i2;
        User author;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        l.b(createIUserServicebyMonsterPlugin, "");
        if (l.a((Object) str, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
            return null;
        }
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            i2 = -1;
        } else {
            i2 = author.getFollowStatus();
        }
        return Integer.valueOf(i2);
    }
}
