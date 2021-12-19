package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.io.Serializable;

public final class UserWithAweme implements Serializable, Cloneable {
    @c(a = "aweme")
    private final Aweme aweme;
    @c(a = "user")
    private final User user;

    static {
        Covode.recordClassIndex(61624);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final User getUser() {
        return this.user;
    }

    @Override // java.lang.Object
    public final UserWithAweme clone() {
        try {
            Object clone = super.clone();
            if (clone != null) {
                return (UserWithAweme) clone;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.model.UserWithAweme");
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return new UserWithAweme(new User(), new Aweme());
        }
    }

    public UserWithAweme(User user2, Aweme aweme2) {
        l.d(user2, "");
        l.d(aweme2, "");
        this.user = user2;
        this.aweme = aweme2;
    }
}
