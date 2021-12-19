package com.ss.android.ugc.aweme.qainvitation.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class a extends BaseResponse {
    @c(a = "invite_id")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f119141a;

    static {
        Covode.recordClassIndex(77366);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f119141a, ((a) obj).f119141a);
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f119141a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InviteUsersData(uid=" + this.f119141a + ")";
    }

    private a() {
        this.f119141a = null;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
