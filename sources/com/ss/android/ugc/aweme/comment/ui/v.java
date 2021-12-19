package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class v implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72820a;

    /* renamed from: b  reason: collision with root package name */
    private final long f72821b;

    static {
        Covode.recordClassIndex(44853);
    }

    v(k kVar, long j2) {
        this.f72820a = kVar;
        this.f72821b = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f72820a.d(this.f72821b);
    }
}
