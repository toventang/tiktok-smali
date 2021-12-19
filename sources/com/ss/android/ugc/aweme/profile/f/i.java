package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final int f116421a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116422b;

    /* renamed from: c  reason: collision with root package name */
    private final FeedItemList f116423c;

    static {
        Covode.recordClassIndex(75158);
    }

    i(int i2, String str, FeedItemList feedItemList) {
        this.f116421a = i2;
        this.f116422b = str;
        this.f116423c = feedItemList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return e.b(this.f116421a, this.f116422b, this.f116423c);
    }
}
