package com.ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class ac extends ad {

    /* renamed from: a  reason: collision with root package name */
    public final List<User> f104037a;

    /* renamed from: b  reason: collision with root package name */
    public final int f104038b;

    static {
        Covode.recordClassIndex(66627);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return l.a(this.f104037a, acVar.f104037a) && this.f104038b == acVar.f104038b;
    }

    public final int hashCode() {
        List<User> list = this.f104037a;
        return ((list != null ? list.hashCode() : 0) * 31) + this.f104038b;
    }

    public final String toString() {
        return "RecommendUserAggregationPod(userList=" + this.f104037a + ", totalCount=" + this.f104038b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ac(List<? extends User> list, int i2) {
        super(3);
        l.d(list, "");
        this.f104037a = list;
        this.f104038b = i2;
    }
}
