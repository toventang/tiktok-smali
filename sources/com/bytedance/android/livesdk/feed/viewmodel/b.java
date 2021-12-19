package com.bytedance.android.livesdk.feed.viewmodel;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final BaseFeedDataViewModel f17713a;

    static {
        Covode.recordClassIndex(9826);
    }

    b(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f17713a = baseFeedDataViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f17713a.f17699j.setValue(obj);
    }
}
