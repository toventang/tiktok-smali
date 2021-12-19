package com.ss.android.ugc.aweme.feed.t;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f93930a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedItemList f93931b;

    /* renamed from: c  reason: collision with root package name */
    private final int f93932c;

    static {
        Covode.recordClassIndex(59748);
    }

    g(e eVar, FeedItemList feedItemList, int i2) {
        this.f93930a = eVar;
        this.f93931b = feedItemList;
        this.f93932c = i2;
    }

    public final void run() {
        e.a(this.f93931b, this.f93932c);
    }
}
