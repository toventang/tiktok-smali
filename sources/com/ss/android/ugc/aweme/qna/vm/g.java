package com.ss.android.ugc.aweme.qna.vm;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.question.model.a;
import h.f.b.l;

public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f<a> f119678a;

    /* renamed from: b  reason: collision with root package name */
    public final e f119679b;

    static {
        Covode.recordClassIndex(77741);
    }

    public static g a(f<a> fVar, e eVar) {
        l.d(fVar, "");
        l.d(eVar, "");
        return new g(fVar, eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f119678a, gVar.f119678a) && l.a(this.f119679b, gVar.f119679b);
    }

    public final int hashCode() {
        f<a> fVar = this.f119678a;
        int i2 = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        e eVar = this.f119679b;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "QnaCreationState(response=" + this.f119678a + ", event=" + this.f119679b + ")";
    }

    public /* synthetic */ g() {
        this(t.f25669a, e.PUBLISH_NONE);
    }

    private g(f<a> fVar, e eVar) {
        l.d(fVar, "");
        l.d(eVar, "");
        this.f119678a = fVar;
        this.f119679b = eVar;
    }
}
