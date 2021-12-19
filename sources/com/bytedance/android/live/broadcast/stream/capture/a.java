package com.bytedance.android.live.broadcast.stream.capture;

import com.bytedance.android.live.broadcast.stream.capture.c;
import com.bytedance.android.live.effect.api.a.f;
import com.bytedance.android.live.effect.api.c;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.effect.IVideoEffectProcessor;
import java.util.ArrayList;
import java.util.List;

public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    protected List<IVideoEffectProcessor.FaceDetectListener> f8534a;

    /* renamed from: b  reason: collision with root package name */
    public f f8535b;

    /* renamed from: c  reason: collision with root package name */
    protected f f8536c;

    static {
        Covode.recordClassIndex(4378);
    }

    public abstract void a();

    public abstract void a(c.a aVar);

    @Override // com.bytedance.android.live.effect.api.c
    public abstract void a(com.bytedance.android.live.effect.model.a aVar);

    public abstract void a(PrivacyCert privacyCert);

    public abstract void a(boolean z, PrivacyCert privacyCert);

    public abstract void b();

    public abstract void b(PrivacyCert privacyCert);

    public final synchronized void a(f fVar) {
        this.f8536c = fVar;
    }

    public final synchronized void b(IVideoEffectProcessor.FaceDetectListener faceDetectListener) {
        List<IVideoEffectProcessor.FaceDetectListener> list = this.f8534a;
        if (list != null) {
            for (int size = list.size() - 1; size > 0; size--) {
                if (this.f8534a.get(size) == faceDetectListener) {
                    this.f8534a.remove(size);
                }
            }
        }
    }

    public final synchronized void a(IVideoEffectProcessor.FaceDetectListener faceDetectListener) {
        if (this.f8534a == null) {
            this.f8534a = new ArrayList();
        }
        this.f8534a.add(faceDetectListener);
    }
}
