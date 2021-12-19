package com.ss.android.ugc.aweme.music.assem;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.assem.arch.extensions.a<Object> f111120a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.assem.arch.extensions.a<Object> f111121b;

    static {
        Covode.recordClassIndex(71311);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f111120a, aVar.f111120a) && l.a(this.f111121b, aVar.f111121b);
    }

    public final int hashCode() {
        com.bytedance.assem.arch.extensions.a<Object> aVar = this.f111120a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        com.bytedance.assem.arch.extensions.a<Object> aVar2 = this.f111121b;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "LegacyCommunicateState(lazyLoadEvent=" + this.f111120a + ", loadEmptyEvent=" + this.f111121b + ")";
    }

    public /* synthetic */ a() {
        this(null, null);
    }

    private a(com.bytedance.assem.arch.extensions.a<? extends Object> aVar, com.bytedance.assem.arch.extensions.a<? extends Object> aVar2) {
        this.f111120a = aVar;
        this.f111121b = aVar2;
    }

    public static /* synthetic */ a a(a aVar, com.bytedance.assem.arch.extensions.a aVar2, com.bytedance.assem.arch.extensions.a aVar3, int i2) {
        if ((i2 & 1) != 0) {
            aVar2 = aVar.f111120a;
        }
        if ((i2 & 2) != 0) {
            aVar3 = aVar.f111121b;
        }
        return new a(aVar2, aVar3);
    }
}
