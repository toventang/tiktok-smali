package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f93787a;

    /* renamed from: b  reason: collision with root package name */
    private final ai f93788b;

    static {
        Covode.recordClassIndex(59673);
    }

    g(Aweme aweme, ai aiVar) {
        this.f93787a = aweme;
        this.f93788b = aiVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.a(this.f93787a, this.f93788b);
    }
}
