package com.ss.android.ugc.aweme.friends.invite.v2;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class b extends BaseResponse {
    @c(a = "inviter")

    /* renamed from: a  reason: collision with root package name */
    public final User f96980a = null;

    static {
        Covode.recordClassIndex(61557);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f96980a, ((b) obj).f96980a);
        }
        return true;
    }

    public final int hashCode() {
        User user = this.f96980a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InvitationInfo(inviter=" + this.f96980a + ")";
    }

    private b() {
    }
}
