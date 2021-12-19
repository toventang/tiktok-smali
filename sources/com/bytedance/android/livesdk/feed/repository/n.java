package com.bytedance.android.livesdk.feed.repository;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final FeedRepository.a f17638a;

    static {
        Covode.recordClassIndex(9778);
    }

    n(FeedRepository.a aVar) {
        this.f17638a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        new Handler(Looper.getMainLooper()).post(new j(this.f17638a));
    }
}
