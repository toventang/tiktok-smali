package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FeedRepository.a f17633a;

    static {
        Covode.recordClassIndex(9774);
    }

    j(FeedRepository.a aVar) {
        this.f17633a = aVar;
    }

    public final void run() {
        this.f17633a.f17615e.a();
    }
}
