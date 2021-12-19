package com.bytedance.android.livesdk.rank.impl;

import com.bytedance.android.livesdk.rank.api.d;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.covode.number.Covode;
import h.f.a.b;

final /* synthetic */ class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final d.a f20667a;

    static {
        Covode.recordClassIndex(12218);
    }

    e(d.a aVar) {
        this.f20667a = aVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        return d.lambda$getRankRoomIds$0$RankService(this.f20667a, (RankPage) obj);
    }
}
