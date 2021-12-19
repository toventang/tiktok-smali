package com.ss.android.ugc.aweme.shortvideo.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.ss.android.ugc.aweme.shortvideo.x.a;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a.C3440a f132995a;

    /* renamed from: b  reason: collision with root package name */
    private final j f132996b;

    /* renamed from: c  reason: collision with root package name */
    private final RecorderConcatResult f132997c;

    static {
        Covode.recordClassIndex(86971);
    }

    f(a.C3440a aVar, j jVar, RecorderConcatResult recorderConcatResult) {
        this.f132995a = aVar;
        this.f132996b = jVar;
        this.f132997c = recorderConcatResult;
    }

    public final void run() {
        a.C3440a aVar = this.f132995a;
        j jVar = this.f132996b;
        RecorderConcatResult recorderConcatResult = this.f132997c;
        jVar.a(recorderConcatResult.f62106b, recorderConcatResult.f62107c, aVar.f132974c, recorderConcatResult.f62105a);
    }
}
