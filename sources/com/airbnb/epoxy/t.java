package com.airbnb.epoxy;

import com.airbnb.epoxy.q;
import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class t<T extends q> extends s<T> {
    static {
        Covode.recordClassIndex(2166);
    }

    /* access modifiers changed from: protected */
    public abstract T h();

    public void a(T t) {
        super.a((Object) t);
    }

    public void b(T t) {
        super.b((Object) t);
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        return super.c(obj);
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ void a(Object obj, s sVar) {
        super.a(obj, sVar);
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ void a(Object obj, List list) {
        super.a(obj, list);
    }
}
