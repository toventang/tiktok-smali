package com.ss.android.ugc.aweme.comment.page.tag.viewmodel;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<User> f72327a;

    /* renamed from: b  reason: collision with root package name */
    public final a<e> f72328b;

    static {
        Covode.recordClassIndex(44604);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f72327a, fVar.f72327a) && l.a(this.f72328b, fVar.f72328b);
    }

    public final int hashCode() {
        a<User> aVar = this.f72327a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a<e> aVar2 = this.f72328b;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TaggedState(taggedUsers=" + this.f72327a + ", event=" + this.f72328b + ")";
    }

    public /* synthetic */ f() {
        this(null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(a<? extends User> aVar, a<? extends e> aVar2) {
        this.f72327a = aVar;
        this.f72328b = aVar2;
    }
}
