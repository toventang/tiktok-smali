package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final FeedRepository.a f17631a;

    static {
        Covode.recordClassIndex(9772);
    }

    h(FeedRepository.a aVar) {
        this.f17631a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        FeedRepository.a aVar = this.f17631a;
        Pair pair = (Pair) obj;
        if (pair.first != null) {
            aVar.f17613c = (String) pair.first;
        }
        if (pair.second != null) {
            aVar.f17614d = (String) pair.second;
        }
    }
}
