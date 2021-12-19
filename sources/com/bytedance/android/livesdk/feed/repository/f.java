package com.bytedance.android.livesdk.feed.repository;

import androidx.lifecycle.u;
import com.bytedance.android.live.core.e.b;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements u {

    /* renamed from: a  reason: collision with root package name */
    private final FeedRepository f17629a;

    static {
        Covode.recordClassIndex(9770);
    }

    f(FeedRepository feedRepository) {
        this.f17629a = feedRepository;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f17629a.a((b) obj);
    }
}
