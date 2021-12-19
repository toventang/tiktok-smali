package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements u {

    /* renamed from: a  reason: collision with root package name */
    private final PagingViewModel f9225a;

    static {
        Covode.recordClassIndex(4718);
    }

    c(PagingViewModel pagingViewModel) {
        this.f9225a = pagingViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f9225a.f9216g.postValue(obj);
    }
}
