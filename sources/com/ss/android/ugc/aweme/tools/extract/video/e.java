package com.ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f140129a;

    /* renamed from: b  reason: collision with root package name */
    private final CountDownLatch f140130b;

    /* renamed from: c  reason: collision with root package name */
    private final c f140131c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f140132d;

    static {
        Covode.recordClassIndex(91565);
    }

    public e(a aVar, CountDownLatch countDownLatch, c cVar, Object obj) {
        this.f140129a = aVar;
        this.f140130b = countDownLatch;
        this.f140131c = cVar;
        this.f140132d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.a(this.f140130b, this.f140131c, this.f140132d);
    }
}
