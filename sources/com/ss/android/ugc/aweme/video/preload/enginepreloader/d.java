package com.ss.android.ugc.aweme.video.preload.enginepreloader;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.aweme.video.preload.f;
import com.ss.ttvideoengine.d;
import java.lang.ref.WeakReference;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final EnginePreloader.AnonymousClass5 f143695a;

    /* renamed from: b  reason: collision with root package name */
    private final d.f f143696b;

    /* renamed from: c  reason: collision with root package name */
    private final long f143697c;

    /* renamed from: d  reason: collision with root package name */
    private final long f143698d;

    static {
        Covode.recordClassIndex(94016);
    }

    d(EnginePreloader.AnonymousClass5 r1, d.f fVar, long j2, long j3) {
        this.f143695a = r1;
        this.f143696b = fVar;
        this.f143697c = j2;
        this.f143698d = j3;
    }

    public final void run() {
        EnginePreloader.AnonymousClass5 r0 = this.f143695a;
        d.f fVar = this.f143696b;
        long j2 = this.f143697c;
        long j3 = this.f143698d;
        for (WeakReference<f> weakReference : EnginePreloader.this.f143649a) {
            f fVar2 = weakReference.get();
            if (fVar2 != null) {
                fVar2.a(fVar.f152451a, j2, j3);
            }
        }
    }
}
