package com.ss.android.ugc.aweme.mix.editname;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mix.api.response.b;
import h.f.b.l;

public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f<com.ss.android.ugc.aweme.mix.api.response.a> f109931a;

    /* renamed from: b  reason: collision with root package name */
    public final f<b> f109932b;

    static {
        Covode.recordClassIndex(70444);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f109931a, aVar.f109931a) && l.a(this.f109932b, aVar.f109932b);
    }

    public final int hashCode() {
        f<com.ss.android.ugc.aweme.mix.api.response.a> fVar = this.f109931a;
        int i2 = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        f<b> fVar2 = this.f109932b;
        if (fVar2 != null) {
            i2 = fVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EditNameState(checkNameRequest=" + this.f109931a + ", changeNameRequest=" + this.f109932b + ")";
    }

    public /* synthetic */ a() {
        this(t.f25669a, t.f25669a);
    }

    private a(f<com.ss.android.ugc.aweme.mix.api.response.a> fVar, f<b> fVar2) {
        l.d(fVar, "");
        l.d(fVar2, "");
        this.f109931a = fVar;
        this.f109932b = fVar2;
    }

    public static /* synthetic */ a a(a aVar, f fVar, f fVar2, int i2) {
        if ((i2 & 1) != 0) {
            fVar = aVar.f109931a;
        }
        if ((i2 & 2) != 0) {
            fVar2 = aVar.f109932b;
        }
        l.d(fVar, "");
        l.d(fVar2, "");
        return new a(fVar, fVar2);
    }
}
