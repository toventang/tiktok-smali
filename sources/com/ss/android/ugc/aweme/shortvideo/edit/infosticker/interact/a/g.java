package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.z.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f127179a;

    /* renamed from: b  reason: collision with root package name */
    private final c f127180b;

    static {
        Covode.recordClassIndex(83422);
    }

    g(d dVar, c cVar) {
        this.f127179a = dVar;
        this.f127180b = cVar;
    }

    public final void run() {
        d dVar = this.f127179a;
        c cVar = this.f127180b;
        dVar.b();
        dVar.setVisibility(0);
        if (cVar != null) {
            cVar.a();
        }
    }
}
