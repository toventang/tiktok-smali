package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final b f116565a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f116566b;

    /* renamed from: c  reason: collision with root package name */
    private final String f116567c;

    /* renamed from: d  reason: collision with root package name */
    private final int f116568d;

    /* renamed from: e  reason: collision with root package name */
    private final long f116569e;

    /* renamed from: f  reason: collision with root package name */
    private final int f116570f;

    /* renamed from: g  reason: collision with root package name */
    private final String f116571g;

    /* renamed from: h  reason: collision with root package name */
    private final int f116572h;

    /* renamed from: i  reason: collision with root package name */
    private final int f116573i;

    static {
        Covode.recordClassIndex(75312);
    }

    d(b bVar, boolean z, String str, int i2, long j2, int i3, String str2, int i4, int i5) {
        this.f116565a = bVar;
        this.f116566b = z;
        this.f116567c = str;
        this.f116568d = i2;
        this.f116569e = j2;
        this.f116570f = i3;
        this.f116571g = str2;
        this.f116572h = i4;
        this.f116573i = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f116565a.a(this.f116566b, this.f116567c, this.f116568d, this.f116569e, this.f116570f, this.f116571g, this.f116572h, this.f116573i);
    }
}
