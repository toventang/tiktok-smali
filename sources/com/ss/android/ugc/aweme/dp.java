package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.n.a;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dp implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final dn f83123a;

    /* renamed from: b  reason: collision with root package name */
    private final a f83124b;

    static {
        Covode.recordClassIndex(51829);
    }

    dp(dn dnVar, a aVar) {
        this.f83123a = dnVar;
        this.f83124b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return dn.b(this.f83124b);
    }
}
