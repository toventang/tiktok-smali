package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;

public final class UserSelfResponse extends BaseResponse {
    @c(a = "user")
    private User user;

    static {
        Covode.recordClassIndex(65630);
    }

    public UserSelfResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ UserSelfResponse copy$default(UserSelfResponse userSelfResponse, User user2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user2 = userSelfResponse.user;
        }
        return userSelfResponse.copy(user2);
    }

    public final User component1() {
        return this.user;
    }

    public final UserSelfResponse copy(User user2) {
        return new UserSelfResponse(user2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UserSelfResponse) && l.a(this.user, ((UserSelfResponse) obj).user);
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

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UserSelfResponse(user=" + this.user + ")";
    }

    public final User getUser() {
        return this.user;
    }

    public final void setUser(User user2) {
        this.user = user2;
    }

    public UserSelfResponse(User user2) {
        this.user = user2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserSelfResponse(User user2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : user2);
    }
}
