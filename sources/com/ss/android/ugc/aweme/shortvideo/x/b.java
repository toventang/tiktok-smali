package com.ss.android.ugc.aweme.shortvideo.x;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.ss.android.ugc.aweme.shortvideo.x.a;
import com.ss.android.ugc.tools.c;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements h.f.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final a.C3440a f132981a;

    /* renamed from: b  reason: collision with root package name */
    private final j f132982b;

    static {
        Covode.recordClassIndex(86967);
    }

    b(a.C3440a aVar, j jVar) {
        this.f132981a = aVar;
        this.f132982b = jVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        a.C3440a aVar = this.f132981a;
        j jVar = this.f132982b;
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
        c.f149151f.d("CameraVideoRecorder executeAsync concatasync result " + recorderConcatResult.f62105a);
        new Handler(Looper.getMainLooper()).post(new f(aVar, jVar, recorderConcatResult));
        return z.f158842a;
    }
}
