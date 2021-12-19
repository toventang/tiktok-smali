package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final int f116408a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f116409b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f116410c;

    /* renamed from: d  reason: collision with root package name */
    private final int f116411d;

    /* renamed from: e  reason: collision with root package name */
    private final long f116412e;

    /* renamed from: f  reason: collision with root package name */
    private final long f116413f;

    /* renamed from: g  reason: collision with root package name */
    private final int f116414g;

    static {
        Covode.recordClassIndex(75155);
    }

    f(int i2, boolean z, int i3, long j2, long j3, int i4) {
        this.f116409b = i2;
        this.f116410c = z;
        this.f116411d = i3;
        this.f116412e = j2;
        this.f116413f = j3;
        this.f116414g = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return e.a(this.f116408a, this.f116409b, this.f116410c, this.f116411d, this.f116412e, this.f116413f, this.f116414g);
    }
}
