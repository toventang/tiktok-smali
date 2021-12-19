package com.ss.android.ugc.aweme.share.i;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f123573a;

    /* renamed from: b  reason: collision with root package name */
    private final String f123574b;

    /* renamed from: c  reason: collision with root package name */
    private final int f123575c;

    static {
        Covode.recordClassIndex(81120);
    }

    c(a aVar, String str, int i2) {
        this.f123573a = aVar;
        this.f123574b = str;
        this.f123575c = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f123573a.b(this.f123574b, this.f123575c);
    }
}
