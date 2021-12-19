package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements u {

    /* renamed from: a  reason: collision with root package name */
    private final PagingViewModel f9228a;

    static {
        Covode.recordClassIndex(4721);
    }

    f(PagingViewModel pagingViewModel) {
        this.f9228a = pagingViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f9228a.f9215f.setValue(obj);
    }
}
