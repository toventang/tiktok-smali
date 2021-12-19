package com.airbnb.epoxy.a;

import com.airbnb.epoxy.a.d;
import com.bytedance.covode.number.Covode;
import h.a.af;
import h.a.n;
import h.f.a.a;
import h.f.b.l;
import h.j.g;
import h.j.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public final class e<P extends d> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<P> f4980a;

    static {
        Covode.recordClassIndex(2090);
    }

    public e(int i2, a<? extends P> aVar) {
        l.c(aVar, "");
        g a2 = h.a(0, i2);
        ArrayList arrayList = new ArrayList(n.a(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            ((af) it).a();
            arrayList.add(aVar.invoke());
        }
        this.f4980a = new ArrayDeque<>(arrayList);
    }
}
