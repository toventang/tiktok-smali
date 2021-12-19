package com.bytedance.android.live.effect.c;

import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.t;

final /* synthetic */ class l implements g {

    /* renamed from: a  reason: collision with root package name */
    private final j f9742a;

    static {
        Covode.recordClassIndex(4961);
    }

    l(j jVar) {
        this.f9742a = jVar;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        return t.a(new n(this.f9742a, (FilterModel) obj));
    }
}
