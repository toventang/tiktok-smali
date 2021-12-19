package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f75801a;

    static {
        Covode.recordClassIndex(46748);
    }

    o(Aweme aweme) {
        this.f75801a = aweme;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return n.a(this.f75801a);
    }
}
