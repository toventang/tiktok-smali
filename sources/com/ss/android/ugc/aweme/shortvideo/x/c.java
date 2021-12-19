package com.ss.android.ugc.aweme.shortvideo.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.ss.android.ugc.aweme.shortvideo.x.a;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a.C3440a f132983a;

    /* renamed from: b  reason: collision with root package name */
    private final j f132984b;

    static {
        Covode.recordClassIndex(86968);
    }

    c(a.C3440a aVar, j jVar) {
        this.f132983a = aVar;
        this.f132984b = jVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        a.C3440a aVar = this.f132983a;
        j jVar = this.f132984b;
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
        com.ss.android.ugc.tools.c.f149151f.d("CameraVideoRecorder concatWithReleaseGPUResource concatAsync result " + recorderConcatResult.f62105a);
        aVar.a(jVar, recorderConcatResult.f62106b, recorderConcatResult.f62107c, recorderConcatResult.f62105a);
        return z.f158842a;
    }
}
