package com.ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.preload.api.e;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f143771a;

    static {
        Covode.recordClassIndex(94060);
    }

    r(e eVar) {
        this.f143771a = eVar;
    }

    public final void run() {
        try {
            this.f143771a.c();
        } catch (Exception unused) {
        }
    }
}
