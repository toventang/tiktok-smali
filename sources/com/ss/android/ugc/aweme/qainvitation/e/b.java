package com.ss.android.ugc.aweme.qainvitation.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class b extends BaseResponse {
    @c(a = "inviters")

    /* renamed from: a  reason: collision with root package name */
    public final List<User> f119142a;
    @c(a = "total_count")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f119143b;
    @c(a = "cursor")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f119144c;
    @c(a = "has_more")

    /* renamed from: d  reason: collision with root package name */
    public final Integer f119145d;

    static {
        Covode.recordClassIndex(77367);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f119142a, bVar.f119142a) && l.a(this.f119143b, bVar.f119143b) && l.a(this.f119144c, bVar.f119144c) && l.a(this.f119145d, bVar.f119145d);
    }

    public final int hashCode() {
        List<User> list = this.f119142a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.f119143b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f119144c;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f119145d;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return hashCode3 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InvitedYouUserListData(inviterList=" + this.f119142a + ", totalCount=" + this.f119143b + ", cursor=" + this.f119144c + ", hasMore=" + this.f119145d + ")";
    }

    private b() {
        this.f119142a = null;
        this.f119143b = null;
        this.f119144c = null;
        this.f119145d = null;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
