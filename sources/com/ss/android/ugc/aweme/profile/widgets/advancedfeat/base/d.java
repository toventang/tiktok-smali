package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base;

import com.bytedance.assem.arch.d.a;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.k.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d<AREA> {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<AREA>> f117599a = new ArrayList();

    static {
        Covode.recordClassIndex(76030);
    }

    public final void a(AREA area, c<? extends a> cVar) {
        l.d(area, "");
        l.d(cVar, "");
        a<AREA> aVar = new a<>(area, cVar);
        List<a<AREA>> list = this.f117599a;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f117596a);
        }
        if (!arrayList.contains(aVar.f117596a)) {
            this.f117599a.add(aVar);
        }
    }
}
