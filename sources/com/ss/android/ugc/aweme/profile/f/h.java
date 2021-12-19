package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final int f116418a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f116419b;

    /* renamed from: c  reason: collision with root package name */
    private final int f116420c;

    static {
        Covode.recordClassIndex(75157);
    }

    h(int i2, boolean z, int i3) {
        this.f116418a = i2;
        this.f116419b = z;
        this.f116420c = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return e.b(this.f116418a, this.f116419b, this.f116420c);
    }
}
