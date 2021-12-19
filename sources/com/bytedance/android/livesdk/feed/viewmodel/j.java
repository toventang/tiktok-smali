package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final BaseFeedDataViewModel f17721a;

    static {
        Covode.recordClassIndex(9834);
    }

    j(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f17721a = baseFeedDataViewModel;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f17721a.o.setValue(obj);
    }
}
