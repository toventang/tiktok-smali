package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class DuetNotice {
    @c(a = "aweme")
    private final Aweme aweme;
    @c(a = "from_user_info")
    private final User fromUser;
    @c(a = "to_user_info")
    private final User toUser;

    static {
        Covode.recordClassIndex(72522);
    }

    public static /* synthetic */ DuetNotice copy$default(DuetNotice duetNotice, User user, User user2, Aweme aweme2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user = duetNotice.fromUser;
        }
        if ((i2 & 2) != 0) {
            user2 = duetNotice.toUser;
        }
        if ((i2 & 4) != 0) {
            aweme2 = duetNotice.aweme;
        }
        return duetNotice.copy(user, user2, aweme2);
    }

    public final User component1() {
        return this.fromUser;
    }

    public final User component2() {
        return this.toUser;
    }

    public final Aweme component3() {
        return this.aweme;
    }

    public final DuetNotice copy(User user, User user2, Aweme aweme2) {
        return new DuetNotice(user, user2, aweme2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetNotice)) {
            return false;
        }
        DuetNotice duetNotice = (DuetNotice) obj;
        return l.a(this.fromUser, duetNotice.fromUser) && l.a(this.toUser, duetNotice.toUser) && l.a(this.aweme, duetNotice.aweme);
    }

    public final int hashCode() {
        User user = this.fromUser;
        int i2 = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        User user2 = this.toUser;
        int hashCode2 = (hashCode + (user2 != null ? user2.hashCode() : 0)) * 31;
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            i2 = aweme2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "DuetNotice(fromUser=" + this.fromUser + ", toUser=" + this.toUser + ", aweme=" + this.aweme + ")";
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final User getFromUser() {
        return this.fromUser;
    }

    public final User getToUser() {
        return this.toUser;
    }

    public DuetNotice(User user, User user2, Aweme aweme2) {
        this.fromUser = user;
        this.toUser = user2;
        this.aweme = aweme2;
    }
}
