package com.ss.ttvideoengine;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.s.j;

/* access modifiers changed from: package-private */
public final /* synthetic */ class am implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final aj f152255a;

    /* renamed from: b  reason: collision with root package name */
    private final Looper f152256b;

    static {
        Covode.recordClassIndex(101485);
    }

    am(aj ajVar, Looper looper) {
        this.f152255a = ajVar;
        this.f152256b = looper;
    }

    public final void run() {
        aj ajVar = this.f152255a;
        Looper looper = this.f152256b;
        ajVar.c();
        if (ajVar.bn != null) {
            VideoSurface videoSurface = ajVar.bn;
            if (looper != null) {
                videoSurface.f151769c = new Handler(looper, videoSurface);
            }
        }
        j.b("TTVideoEngine", "[SRLog]setupTextureRender in child thread");
    }
}
