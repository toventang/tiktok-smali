package com.ss.android.ugc.a.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.a.a.b.a;

public final class a<P extends com.ss.android.ugc.a.a.b.a> implements c<P> {

    /* renamed from: a  reason: collision with root package name */
    private Class<P> f61885a;

    static {
        Covode.recordClassIndex(38055);
    }

    @Override // com.ss.android.ugc.a.a.a.c
    public final P a() {
        try {
            return this.f61885a.newInstance();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public a(Class<P> cls) {
        this.f61885a = cls;
    }
}
