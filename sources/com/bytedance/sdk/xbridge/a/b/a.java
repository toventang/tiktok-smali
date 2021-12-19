package com.bytedance.sdk.xbridge.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f43913a;

    static {
        Covode.recordClassIndex(26831);
    }

    public a() {
        ArrayList arrayList = new ArrayList();
        this.f43913a = arrayList;
        arrayList.add(new b());
        arrayList.add(new d());
        arrayList.add(new e());
    }

    @Override // com.bytedance.sdk.xbridge.a.b.c
    public final Boolean a(com.bytedance.sdk.xbridge.protocol.a.a aVar) {
        l.c(aVar, "");
        boolean z = false;
        Iterator<T> it = this.f43913a.iterator();
        while (it.hasNext()) {
            Boolean a2 = it.next().a(aVar);
            if (l.a((Object) a2, (Object) true)) {
                return true;
            }
            if (a2 == null) {
                z = null;
            }
        }
        return z;
    }
}
