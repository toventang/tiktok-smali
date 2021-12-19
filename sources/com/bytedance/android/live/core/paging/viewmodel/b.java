package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final PagingViewModel f9224a;

    static {
        Covode.recordClassIndex(4717);
    }

    b(PagingViewModel pagingViewModel) {
        this.f9224a = pagingViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f9224a.f9212c.postValue(obj);
    }
}
