package com.bytedance.android.livesdk.feed.drawerfeed;

import androidx.lifecycle.u;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class p implements u {

    /* renamed from: a  reason: collision with root package name */
    private final l f17416a;

    static {
        Covode.recordClassIndex(9654);
    }

    p(l lVar) {
        this.f17416a = lVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f17416a.a((BaseFeedRepository.a) obj);
    }
}
