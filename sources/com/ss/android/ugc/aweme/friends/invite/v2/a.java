package com.ss.android.ugc.aweme.friends.invite.v2;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.utils.hl;
import h.f.b.l;

public final class a extends BaseResponse {
    @c(a = "invitation_code")

    /* renamed from: a  reason: collision with root package name */
    public final String f96977a = null;
    @c(a = "invitation_template")

    /* renamed from: b  reason: collision with root package name */
    public final String f96978b = null;
    @c(a = "invitation_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f96979c = null;

    static {
        Covode.recordClassIndex(61556);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f96977a, aVar.f96977a) && l.a(this.f96978b, aVar.f96978b) && l.a(this.f96979c, aVar.f96979c);
    }

    public final int hashCode() {
        String str = this.f96977a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f96978b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f96979c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InvitationConfig(code=" + this.f96977a + ", template=" + this.f96978b + ", invitationUrl=" + this.f96979c + ")";
    }

    private a() {
    }

    public final boolean a() {
        if (!hl.a(this.f96977a) || !hl.a(this.f96978b) || !hl.a(this.f96979c)) {
            return false;
        }
        return true;
    }
}
