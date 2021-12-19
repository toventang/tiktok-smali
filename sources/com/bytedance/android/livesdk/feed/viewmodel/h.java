package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final BaseFeedDataViewModel f17719a;

    static {
        Covode.recordClassIndex(9832);
    }

    h(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f17719a = baseFeedDataViewModel;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f17719a.n.setValue(obj);
    }
}
