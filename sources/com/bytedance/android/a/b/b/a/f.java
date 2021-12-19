package com.bytedance.android.a.b.b.a;

import com.bytedance.android.a.b.b.a.a;
import com.bytedance.android.a.b.b.a.e;
import com.bytedance.android.a.b.b.b;
import com.bytedance.android.a.b.b.c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f implements e.a {

    /* renamed from: a  reason: collision with root package name */
    private List<e> f6694a;

    static {
        Covode.recordClassIndex(3227);
    }

    @Override // com.bytedance.android.a.b.b.a.e.a
    public final b a() {
        throw new UnsupportedOperationException("do not call");
    }

    @Override // com.bytedance.android.a.b.b.a.e.a
    public final c a(b bVar) {
        return new a.C0090a(this.f6694a).a(bVar);
    }

    public final void a(List<e> list) {
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                it.remove();
            }
        }
        if (!list.isEmpty()) {
            List<e> list2 = this.f6694a;
            list2.addAll(list2.size() - 1, list);
        }
    }

    public f(com.bytedance.android.a.b.a aVar, a aVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g(aVar));
        arrayList.add(new d(aVar));
        this.f6694a = arrayList;
        arrayList.add(aVar2);
    }
}
