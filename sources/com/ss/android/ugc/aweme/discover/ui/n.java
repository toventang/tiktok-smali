package com.ss.android.ugc.aweme.discover.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class n extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f82624a = new n();

    static {
        Covode.recordClassIndex(51455);
    }

    n() {
        super(TrendsTabState.class, "canScrollVertically", "getCanScrollVertically()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((TrendsTabState) obj).getCanScrollVertically());
    }
}
