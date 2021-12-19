package com.ss.android.ugc.aweme.profile.widgets.navbar.a;

import com.bytedance.assem.arch.core.a;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.k.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d<AREA> {

    /* renamed from: a  reason: collision with root package name */
    public final List<b<AREA>> f117966a = new ArrayList();

    static {
        Covode.recordClassIndex(76465);
    }

    public final void a(AREA area, c<? extends a> cVar) {
        l.d(area, "");
        l.d(cVar, "");
        b<AREA> bVar = new b<>(area, cVar);
        List<b<AREA>> list = this.f117966a;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f117960a);
        }
        if (!arrayList.contains(bVar.f117960a)) {
            this.f117966a.add(bVar);
        }
    }
}
