package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;

final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final FeedItemList f116574a;

    static {
        Covode.recordClassIndex(75313);
    }

    e(FeedItemList feedItemList) {
        this.f116574a = feedItemList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f116574a;
    }
}
