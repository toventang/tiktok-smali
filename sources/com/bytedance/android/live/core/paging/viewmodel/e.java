package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements u {

    /* renamed from: a  reason: collision with root package name */
    private final PagingViewModel f9227a;

    static {
        Covode.recordClassIndex(4720);
    }

    e(PagingViewModel pagingViewModel) {
        this.f9227a = pagingViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f9227a.f9214e.postValue(obj);
    }
}
