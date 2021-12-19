package com.ss.android.ugc.aweme.account.agegate.model;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final b f62782a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62783b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f62784c;

    static {
        Covode.recordClassIndex(38685);
    }

    c(b bVar, String str, boolean z) {
        this.f62782a = bVar;
        this.f62783b = str;
        this.f62784c = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return b.a(this.f62783b, false, this.f62784c);
    }
}
