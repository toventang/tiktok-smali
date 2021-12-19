package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final q f112748a;

    /* renamed from: b  reason: collision with root package name */
    private final String f112749b;

    static {
        Covode.recordClassIndex(72466);
    }

    r(q qVar, String str) {
        this.f112748a = qVar;
        this.f112749b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        q.a(this.f112748a, this.f112749b);
        return null;
    }
}
