package com.ss.android.ugc.aweme.qainvitation.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class c extends BaseResponse {
    @com.google.gson.a.c(a = "invitees")

    /* renamed from: a  reason: collision with root package name */
    public final List<User> f119146a;

    static {
        Covode.recordClassIndex(77368);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f119146a, ((c) obj).f119146a);
        }
        return true;
    }

    public final int hashCode() {
        List<User> list = this.f119146a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InviteeListData(inviteeList=" + this.f119146a + ")";
    }

    private c() {
        this.f119146a = null;
    }

    public /* synthetic */ c(byte b2) {
        this();
    }
}
