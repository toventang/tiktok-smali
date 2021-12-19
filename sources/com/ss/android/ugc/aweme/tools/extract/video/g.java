package com.ss.android.ugc.aweme.tools.extract.video;

import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.extract.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f140135a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f140136b;

    /* renamed from: c  reason: collision with root package name */
    private final j f140137c;

    static {
        Covode.recordClassIndex(91567);
    }

    public g(a aVar, Object obj, j jVar) {
        this.f140135a = aVar;
        this.f140136b = obj;
        this.f140137c = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a aVar = this.f140135a;
        aVar.a(new h(this.f140136b, aVar, this.f140137c));
        return null;
    }
}
