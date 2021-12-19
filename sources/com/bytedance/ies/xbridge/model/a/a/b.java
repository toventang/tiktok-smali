package com.bytedance.ies.xbridge.model.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.l;
import java.util.Iterator;

public final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Iterator<String> f36288a;

    static {
        Covode.recordClassIndex(21712);
    }

    @Override // com.bytedance.ies.xbridge.l
    public final boolean a() {
        return this.f36288a.hasNext();
    }

    @Override // com.bytedance.ies.xbridge.l
    public final String b() {
        return this.f36288a.next();
    }

    public b(Iterator<String> it) {
        h.f.b.l.c(it, "");
        this.f36288a = it;
    }
}
