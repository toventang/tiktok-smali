package com.bytedance.ies.xbridge.platform.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.l;
import java.util.Iterator;

public final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Iterator<String> f36398a;

    static {
        Covode.recordClassIndex(21804);
    }

    @Override // com.bytedance.ies.xbridge.l
    public final boolean a() {
        return this.f36398a.hasNext();
    }

    @Override // com.bytedance.ies.xbridge.l
    public final String b() {
        return this.f36398a.next();
    }

    public b(Iterator<String> it) {
        h.f.b.l.c(it, "");
        this.f36398a = it;
    }
}
