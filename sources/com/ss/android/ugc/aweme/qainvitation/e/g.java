package com.ss.android.ugc.aweme.qainvitation.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class g extends BaseResponse {
    @c(a = "user_list")

    /* renamed from: a  reason: collision with root package name */
    public final List<User> f119150a;
    @c(a = "block_results")

    /* renamed from: b  reason: collision with root package name */
    public final List<h> f119151b;

    static {
        Covode.recordClassIndex(77372);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f119150a, gVar.f119150a) && l.a(this.f119151b, gVar.f119151b);
    }

    public final int hashCode() {
        List<User> list = this.f119150a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<h> list2 = this.f119151b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "RecentContactsData(recentContacts=" + this.f119150a + ", recentContactsBlockedList=" + this.f119151b + ")";
    }

    private g() {
        this.f119150a = null;
        this.f119151b = null;
    }

    public /* synthetic */ g(byte b2) {
        this();
    }
}
