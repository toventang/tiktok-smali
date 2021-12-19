package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements u {

    /* renamed from: a  reason: collision with root package name */
    private final PagingViewModel f9223a;

    static {
        Covode.recordClassIndex(4716);
    }

    a(PagingViewModel pagingViewModel) {
        this.f9223a = pagingViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f9223a.f9211b.postValue(obj);
    }
}
