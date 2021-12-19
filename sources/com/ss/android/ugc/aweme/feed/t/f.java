package com.ss.android.ugc.aweme.feed.t;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f93927a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedItemList f93928b;

    /* renamed from: c  reason: collision with root package name */
    private final int f93929c;

    static {
        Covode.recordClassIndex(59747);
    }

    f(e eVar, FeedItemList feedItemList, int i2) {
        this.f93927a = eVar;
        this.f93928b = feedItemList;
        this.f93929c = i2;
    }

    public final void run() {
        e.a(this.f93928b, this.f93929c);
    }
}
