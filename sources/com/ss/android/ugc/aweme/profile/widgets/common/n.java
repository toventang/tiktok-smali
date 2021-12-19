package com.ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class n implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f<User> f117713a;

    /* renamed from: b  reason: collision with root package name */
    public final g f117714b;

    static {
        Covode.recordClassIndex(76202);
    }

    public static n a(f<? extends User> fVar, g gVar) {
        l.d(fVar, "");
        l.d(gVar, "");
        return new n(fVar, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f117713a, nVar.f117713a) && l.a(this.f117714b, nVar.f117714b);
    }

    public final int hashCode() {
        f<User> fVar = this.f117713a;
        int i2 = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        g gVar = this.f117714b;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UserProfileInfoState(request=" + this.f117713a + ", action=" + this.f117714b + ")";
    }

    public /* synthetic */ n() {
        this(t.f25669a, g.NORMAL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    private n(f<? extends User> fVar, g gVar) {
        l.d(fVar, "");
        l.d(gVar, "");
        this.f117713a = fVar;
        this.f117714b = gVar;
    }
}
