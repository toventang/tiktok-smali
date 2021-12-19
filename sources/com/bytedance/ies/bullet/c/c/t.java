package com.bytedance.ies.bullet.c.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class t implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends d<?, ?, ?, ?>>, i> f32065a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(18796);
    }

    @Override // com.bytedance.ies.bullet.c.e.a
    public final void a() {
        Map<Class<? extends d<?, ?, ?, ?>>, i> map = this.f32065a;
        for (Map.Entry<Class<? extends d<?, ?, ?, ?>>, i> entry : map.entrySet()) {
            entry.getValue().a((Throwable) null);
        }
        map.clear();
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final <T extends d<?, ?, ?, ?>> i a(Class<? extends T> cls) {
        l.c(cls, "");
        return this.f32065a.get(cls);
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final i a(String str) {
        l.c(str, "");
        for (Map.Entry<Class<? extends d<?, ?, ?, ?>>, i> entry : this.f32065a.entrySet()) {
            if (l.a((Object) entry.getValue().a().f32074a, (Object) str)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.c.c.n
    public final <T extends d<?, ?, ?, ?>> void a(Class<? extends T> cls, i iVar) {
        l.c(cls, "");
        l.c(iVar, "");
        this.f32065a.put(cls, iVar);
    }
}
