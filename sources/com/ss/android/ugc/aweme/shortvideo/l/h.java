package com.ss.android.ugc.aweme.shortvideo.l;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f128683a;

    static {
        Covode.recordClassIndex(84352);
    }

    h(b bVar) {
        this.f128683a = bVar;
    }

    public final void run() {
        b bVar = this.f128683a;
        if (bVar.q == 0) {
            bVar.b();
        }
    }
}
