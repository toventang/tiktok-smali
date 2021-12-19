package com.ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import com.ss.texturerender.VideoSurface;

/* access modifiers changed from: package-private */
public final /* synthetic */ class an implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final aj f152257a;

    static {
        Covode.recordClassIndex(101486);
    }

    an(aj ajVar) {
        this.f152257a = ajVar;
    }

    public final void run() {
        aj ajVar = this.f152257a;
        VideoSurface e2 = ajVar.e(true);
        if (e2 != null) {
            e2.release();
        }
        ajVar.bx = false;
    }
}
