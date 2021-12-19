package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.profile.model.User;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f143197a = new z();

    private z() {
    }

    static {
        Covode.recordClassIndex(93732);
    }

    public static boolean b(Aweme aweme) {
        AwemeStatus status;
        if (aweme == null || (status = aweme.getStatus()) == null || status.getPrivateStatus() != 0) {
            return false;
        }
        return true;
    }

    public static boolean c(Aweme aweme) {
        AwemeStatus status;
        if (aweme == null || (status = aweme.getStatus()) == null || status.getPrivateStatus() != 2) {
            return false;
        }
        return true;
    }

    public static boolean d(Aweme aweme) {
        AwemeStatus status;
        if (aweme == null || (status = aweme.getStatus()) == null || status.getPrivateStatus() != 1) {
            return false;
        }
        return true;
    }

    public static boolean e(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    public static boolean f(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 1) {
            return false;
        }
        return true;
    }

    public static boolean a(Aweme aweme) {
        AwemeStatus status;
        if (aweme == null || (status = aweme.getStatus()) == null || status.getPrivateStatus() != 2) {
            return false;
        }
        User author = aweme.getAuthor();
        if ((author == null || author.getFollowStatus() != 2) && !m.a(aweme)) {
            return true;
        }
        return false;
    }
}
