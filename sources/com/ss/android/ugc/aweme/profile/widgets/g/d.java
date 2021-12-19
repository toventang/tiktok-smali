package com.ss.android.ugc.aweme.profile.widgets.g;

import com.bytedance.assem.arch.service.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.assem.arch.extensions.a<p<Exception, Integer>> f117874a;

    static {
        Covode.recordClassIndex(76384);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f117874a, ((d) obj).f117874a);
        }
        return true;
    }

    public final int hashCode() {
        com.bytedance.assem.arch.extensions.a<p<Exception, Integer>> aVar = this.f117874a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MineProfileEditData(onUserUpdateFailed=" + this.f117874a + ")";
    }

    public /* synthetic */ d() {
        this(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends h.p<? extends java.lang.Exception, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(com.bytedance.assem.arch.extensions.a<? extends p<? extends Exception, Integer>> aVar) {
        this.f117874a = aVar;
    }
}
