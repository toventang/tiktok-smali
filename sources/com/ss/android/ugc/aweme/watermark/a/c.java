package com.ss.android.ugc.aweme.watermark.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final b f144740a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f144741b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f144742c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f144743d;

    static {
        Covode.recordClassIndex(94674);
    }

    c(b bVar, boolean z, boolean z2, boolean z3) {
        this.f144740a = bVar;
        this.f144741b = z;
        this.f144742c = z2;
        this.f144743d = z3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f144740a.a(this.f144741b, this.f144742c, this.f144743d);
    }
}
