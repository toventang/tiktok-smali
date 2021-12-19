package com.bytedance.android.live.effect.c;

import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements f.a.d.k {

    /* renamed from: a  reason: collision with root package name */
    static final f.a.d.k f9741a = new k();

    static {
        Covode.recordClassIndex(4960);
    }

    private k() {
    }

    @Override // f.a.d.k
    public final boolean a(Object obj) {
        return ((FilterModel) obj).getEffect().getTags().contains("new");
    }
}
