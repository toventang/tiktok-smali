package com.bytedance.android.livesdk.feed.viewmodel;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements u {

    /* renamed from: a  reason: collision with root package name */
    private final BaseFeedDataViewModel f17712a;

    static {
        Covode.recordClassIndex(9825);
    }

    a(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f17712a = baseFeedDataViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f17712a.f17698i.setValue(obj);
    }
}
