package com.ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f139432a;

    /* renamed from: b  reason: collision with root package name */
    private final int f139433b;

    static {
        Covode.recordClassIndex(91162);
    }

    b(a aVar, int i2) {
        this.f139432a = aVar;
        this.f139433b = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        aw.a(this.f139433b, this.f139432a.f150019f);
        return null;
    }
}
