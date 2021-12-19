package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements u {

    /* renamed from: a  reason: collision with root package name */
    private final PagingViewModel f9226a;

    static {
        Covode.recordClassIndex(4719);
    }

    d(PagingViewModel pagingViewModel) {
        this.f9226a = pagingViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f9226a.f9213d.postValue(obj);
    }
}
