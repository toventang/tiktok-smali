package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class b extends BaseResponse {
    @c(a = "invite_id")

    /* renamed from: a  reason: collision with root package name */
    public String f102663a = null;
    @c(a = "invite_url")

    /* renamed from: b  reason: collision with root package name */
    public String f102664b = null;
    @c(a = "expired_at")

    /* renamed from: c  reason: collision with root package name */
    public Long f102665c = null;
    @c(a = "group")

    /* renamed from: d  reason: collision with root package name */
    public a f102666d = null;
    @c(a = "error")

    /* renamed from: e  reason: collision with root package name */
    public c f102667e = null;

    static {
        Covode.recordClassIndex(65739);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f102663a, bVar.f102663a) && l.a(this.f102664b, bVar.f102664b) && l.a(this.f102665c, bVar.f102665c) && l.a(this.f102666d, bVar.f102666d) && l.a(this.f102667e, bVar.f102667e);
    }

    public final int hashCode() {
        String str = this.f102663a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102664b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l2 = this.f102665c;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        a aVar = this.f102666d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        c cVar = this.f102667e;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode4 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "GroupInviteInfoModel(inviteId=" + this.f102663a + ", inviteUrl=" + this.f102664b + ", expiredAt=" + this.f102665c + ", groupInfo=" + this.f102666d + ", inviteError=" + this.f102667e + ")";
    }

    private b() {
    }
}
