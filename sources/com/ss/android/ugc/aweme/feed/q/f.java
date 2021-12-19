package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f93785a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a.d.f f93786b;

    static {
        Covode.recordClassIndex(59672);
    }

    f(a aVar, f.a.d.f fVar) {
        this.f93785a = aVar;
        this.f93786b = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f93785a.a(this.f93786b);
    }
}
