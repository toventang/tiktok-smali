package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

final /* synthetic */ class ab implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final k f115949a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f115950b;

    static {
        Covode.recordClassIndex(74778);
    }

    ab(k kVar, Aweme aweme) {
        this.f115949a = kVar;
        this.f115950b = aweme;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f115949a.c(this.f115950b);
    }
}
