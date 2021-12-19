package com.bytedance.android.livesdk.feed.viewmodel;

import androidx.lifecycle.u;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements u {

    /* renamed from: a  reason: collision with root package name */
    private final BaseFeedDataViewModel f17714a;

    static {
        Covode.recordClassIndex(9827);
    }

    c(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f17714a = baseFeedDataViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        BaseFeedDataViewModel baseFeedDataViewModel = this.f17714a;
        if (obj == BaseFeedRepository.a.SUCCESS) {
            Integer value = baseFeedDataViewModel.f17701l.getValue();
            if (value == null) {
                value = 0;
            }
            baseFeedDataViewModel.f17701l.setValue(Integer.valueOf(value.intValue() + 1));
        }
    }
}
