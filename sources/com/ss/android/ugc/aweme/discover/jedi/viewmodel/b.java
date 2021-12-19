package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f81383a = new b();

    static {
        Covode.recordClassIndex(50582);
    }

    b() {
        super(SearchState.class, "listState", "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((SearchState) obj).getListState();
    }
}
