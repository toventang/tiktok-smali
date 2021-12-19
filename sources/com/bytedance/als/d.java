package com.bytedance.als;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d<T> extends l<T> {
    static {
        Covode.recordClassIndex(3104);
    }

    public d(T t) {
        super(t);
    }

    @Override // com.bytedance.als.h, com.bytedance.als.l
    public final void a(T t) {
        if (!l.a((Object) a(), (Object) t)) {
            super.a((Object) t);
        }
    }

    @Override // com.bytedance.als.h, com.bytedance.als.l
    public final void b(T t) {
        if (!l.a((Object) a(), (Object) t)) {
            super.b(t);
        }
    }
}
