package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final b f116556a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f116557b;

    /* renamed from: c  reason: collision with root package name */
    private final String f116558c;

    /* renamed from: d  reason: collision with root package name */
    private final int f116559d;

    /* renamed from: e  reason: collision with root package name */
    private final long f116560e;

    /* renamed from: f  reason: collision with root package name */
    private final int f116561f;

    /* renamed from: g  reason: collision with root package name */
    private final String f116562g;

    /* renamed from: h  reason: collision with root package name */
    private final int f116563h;

    /* renamed from: i  reason: collision with root package name */
    private final int f116564i;

    static {
        Covode.recordClassIndex(75311);
    }

    c(b bVar, boolean z, String str, int i2, long j2, int i3, String str2, int i4, int i5) {
        this.f116556a = bVar;
        this.f116557b = z;
        this.f116558c = str;
        this.f116559d = i2;
        this.f116560e = j2;
        this.f116561f = i3;
        this.f116562g = str2;
        this.f116563h = i4;
        this.f116564i = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f116556a.a(this.f116557b, this.f116558c, this.f116559d, this.f116560e, this.f116561f, this.f116562g, this.f116563h, this.f116564i);
    }
}
