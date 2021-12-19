package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final o f92987a;

    /* renamed from: b  reason: collision with root package name */
    private final int f92988b;

    /* renamed from: c  reason: collision with root package name */
    private final long f92989c;

    /* renamed from: d  reason: collision with root package name */
    private final long f92990d;

    /* renamed from: e  reason: collision with root package name */
    private final Video f92991e;

    static {
        Covode.recordClassIndex(58988);
    }

    u(o oVar, int i2, long j2, long j3, Video video) {
        this.f92987a = oVar;
        this.f92988b = i2;
        this.f92989c = j2;
        this.f92990d = j3;
        this.f92991e = video;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f92987a.a(this.f92988b, this.f92989c, this.f92990d, this.f92991e);
    }
}
