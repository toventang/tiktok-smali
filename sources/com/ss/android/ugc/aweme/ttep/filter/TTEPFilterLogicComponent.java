package com.ss.android.ugc.aweme.ttep.filter;

import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.a;
import com.bytedance.creativex.recorder.filter.b.c;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.filter.FilterBean;
import h.f.a.b;
import h.f.b.g;
import h.f.b.l;
import h.z;

public final class TTEPFilterLogicComponent extends c<a> implements a {
    static {
        Covode.recordClassIndex(92306);
    }

    @Override // com.bytedance.creativex.recorder.filter.b.c, com.bytedance.creativex.recorder.filter.a.a
    public final void setFilterChosen(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3) {
        l.d(filterBean, "");
    }

    @Override // com.bytedance.creativex.recorder.filter.b.c, com.bytedance.creativex.recorder.filter.a.a
    public final void setFilterScroll(FilterBean filterBean, FilterBean filterBean2, float f2) {
        l.d(filterBean, "");
        l.d(filterBean2, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTEPFilterLogicComponent(f fVar, d dVar, c.a aVar, b<? super com.bytedance.creativex.recorder.filter.a.b, com.bytedance.creativex.recorder.filter.a.b> bVar, h.f.a.a<Boolean> aVar2, b<? super com.bytedance.creativex.recorder.filter.b.a, z> bVar2) {
        super(fVar, dVar, aVar, bVar, aVar2, bVar2);
        l.d(fVar, "");
        l.d(dVar, "");
        l.d(aVar, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TTEPFilterLogicComponent(f fVar, d dVar, c.a aVar, b bVar, h.f.a.a aVar2, b bVar2, int i2, g gVar) {
        this(fVar, dVar, aVar, (i2 & 8) != 0 ? null : bVar, (i2 & 16) != 0 ? null : aVar2, (i2 & 32) == 0 ? bVar2 : null);
    }
}
