package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.util.e;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72495a;

    /* renamed from: b  reason: collision with root package name */
    private final long f72496b;

    static {
        Covode.recordClassIndex(44680);
    }

    aa(k kVar, long j2) {
        this.f72495a = kVar;
        this.f72496b = j2;
    }

    public final void run() {
        k kVar = this.f72495a;
        e.a(kVar.f72763b.getAid(), this.f72496b);
    }
}
