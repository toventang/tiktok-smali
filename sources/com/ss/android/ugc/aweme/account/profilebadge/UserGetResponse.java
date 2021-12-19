package com.ss.android.ugc.aweme.account.profilebadge;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.io.Serializable;

public final class UserGetResponse implements Serializable {
    @c(a = "user")
    private final User user;

    static {
        Covode.recordClassIndex(40152);
    }

    public static /* synthetic */ UserGetResponse copy$default(UserGetResponse userGetResponse, User user2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user2 = userGetResponse.user;
        }
        return userGetResponse.copy(user2);
    }

    public final User component1() {
        return this.user;
    }

    public final UserGetResponse copy(User user2) {
        return new UserGetResponse(user2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UserGetResponse) && l.a(this.user, ((UserGetResponse) obj).user);
        }
        return true;
    }

    public final int hashCode() {
        User user2 = this.user;
        if (user2 != null) {
            return user2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UserGetResponse(user=" + this.user + ")";
    }

    public final User getUser() {
        return this.user;
    }

    public UserGetResponse(User user2) {
        this.user = user2;
    }
}
