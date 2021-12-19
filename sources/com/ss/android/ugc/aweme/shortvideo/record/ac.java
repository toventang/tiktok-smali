package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;

final /* synthetic */ class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VEListener.j f130033a;

    /* renamed from: b  reason: collision with root package name */
    private final int f130034b;

    static {
        Covode.recordClassIndex(85325);
    }

    ac(VEListener.j jVar, int i2) {
        this.f130033a = jVar;
        this.f130034b = i2;
    }

    public final void run() {
        this.f130033a.a(this.f130034b);
    }
}
