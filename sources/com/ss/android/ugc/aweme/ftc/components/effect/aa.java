package com.ss.android.ugc.aweme.ftc.components.effect;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f97809a;

    /* renamed from: b  reason: collision with root package name */
    private final int f97810b;

    /* renamed from: c  reason: collision with root package name */
    private final int f97811c;

    static {
        Covode.recordClassIndex(62164);
    }

    aa(f fVar, int i2, int i3) {
        this.f97809a = fVar;
        this.f97810b = i2;
        this.f97811c = i3;
    }

    public final void run() {
        f fVar = this.f97809a;
        fVar.x.a(this.f97810b, this.f97811c, false);
    }
}
