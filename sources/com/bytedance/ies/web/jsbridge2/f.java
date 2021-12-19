package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;

public abstract class f<P, R> extends c<P, R> {
    static {
        Covode.recordClassIndex(21291);
    }

    public abstract R invoke(P p, g gVar);

    protected static void terminate() {
        throw new z(0);
    }

    @Override // com.bytedance.ies.web.jsbridge2.c
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    protected static void terminate(String str) {
        throw new z(0, str);
    }
}
