package com.ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f<User> f117700a;

    /* renamed from: b  reason: collision with root package name */
    public final g f117701b;

    static {
        Covode.recordClassIndex(76181);
    }

    public static e a(f<? extends User> fVar, g gVar) {
        l.d(fVar, "");
        l.d(gVar, "");
        return new e(fVar, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f117700a, eVar.f117700a) && l.a(this.f117701b, eVar.f117701b);
    }

    public final int hashCode() {
        f<User> fVar = this.f117700a;
        int i2 = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        g gVar = this.f117701b;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MineProfileInfoState(request=" + this.f117700a + ", action=" + this.f117701b + ")";
    }

    public /* synthetic */ e() {
        this(t.f25669a, g.NORMAL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    private e(f<? extends User> fVar, g gVar) {
        l.d(fVar, "");
        l.d(gVar, "");
        this.f117700a = fVar;
        this.f117701b = gVar;
    }
}
