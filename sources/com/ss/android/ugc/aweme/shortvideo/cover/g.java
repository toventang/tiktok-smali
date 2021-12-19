package com.ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f125253a;

    /* renamed from: b  reason: collision with root package name */
    private final long f125254b;

    static {
        Covode.recordClassIndex(82251);
    }

    g(b bVar, long j2) {
        this.f125253a = bVar;
        this.f125254b = j2;
    }

    public final void run() {
        b bVar = this.f125253a;
        long j2 = this.f125254b;
        bVar.q = false;
        bVar.f125241l.b().setValue(t.b(j2));
        bVar.a(j2);
    }
}
