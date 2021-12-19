package com.ss.android.ugc.aweme.detail.ui;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final l f79975a;

    /* renamed from: b  reason: collision with root package name */
    private final String f79976b;

    static {
        Covode.recordClassIndex(49764);
    }

    p(l lVar, String str) {
        this.f79975a = lVar;
        this.f79976b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f79975a.c(this.f79976b);
    }
}
