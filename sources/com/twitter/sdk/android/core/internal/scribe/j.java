package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f156086a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f156087b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f156088c = false;

    static {
        Covode.recordClassIndex(103685);
    }

    j(i iVar, Object obj) {
        this.f156086a = iVar;
        this.f156087b = obj;
    }

    public final void run() {
        this.f156086a.a(this.f156087b, this.f156088c);
    }
}
