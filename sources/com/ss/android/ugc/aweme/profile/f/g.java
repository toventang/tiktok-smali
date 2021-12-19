package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final int f116415a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f116416b;

    /* renamed from: c  reason: collision with root package name */
    private final Exception f116417c;

    static {
        Covode.recordClassIndex(75156);
    }

    g(int i2, boolean z, Exception exc) {
        this.f116415a = i2;
        this.f116416b = z;
        this.f116417c = exc;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return e.b(this.f116415a, this.f116416b, this.f116417c);
    }
}
