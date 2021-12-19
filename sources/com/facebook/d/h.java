package com.facebook.d;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;

public final class h<T> extends a<T> {
    static {
        Covode.recordClassIndex(28718);
    }

    @Override // com.facebook.d.a
    public final boolean a(float f2) {
        return super.a(f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.facebook.d.h<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(T t) {
        return super.a(i.a(t), true);
    }

    @Override // com.facebook.d.a
    public final boolean a(Throwable th) {
        return super.a((Throwable) i.a(th));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.facebook.d.h<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.d.a
    public final boolean a(T t, boolean z) {
        return super.a(i.a(t), z);
    }
}
