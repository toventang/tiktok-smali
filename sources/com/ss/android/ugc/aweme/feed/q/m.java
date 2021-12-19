package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.aj;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f93794a;

    /* renamed from: b  reason: collision with root package name */
    private final aj f93795b;

    /* renamed from: c  reason: collision with root package name */
    private final int f93796c;

    static {
        Covode.recordClassIndex(59679);
    }

    m(a aVar, aj ajVar, int i2) {
        this.f93794a = aVar;
        this.f93795b = ajVar;
        this.f93796c = i2;
    }

    public final void run() {
        this.f93794a.a(this.f93795b, this.f93796c);
    }
}
