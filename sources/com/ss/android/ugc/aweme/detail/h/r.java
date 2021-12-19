package com.ss.android.ugc.aweme.detail.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f79749a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f79750b;

    /* renamed from: c  reason: collision with root package name */
    private final int f79751c;

    static {
        Covode.recordClassIndex(49559);
    }

    r(b bVar, Aweme aweme, int i2) {
        this.f79749a = bVar;
        this.f79750b = aweme;
        this.f79751c = i2;
    }

    public final void run() {
        this.f79749a.a(this.f79750b, this.f79751c + 1);
    }
}
