package com.ss.android.ugc.aweme.ftc;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ui.task.a;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;

final /* synthetic */ class i implements a {

    /* renamed from: a  reason: collision with root package name */
    private final FTCVideoRecordNewActivity f98600a;

    /* renamed from: b  reason: collision with root package name */
    private final j f98601b;

    static {
        Covode.recordClassIndex(62693);
    }

    i(FTCVideoRecordNewActivity fTCVideoRecordNewActivity, j jVar) {
        this.f98600a = fTCVideoRecordNewActivity;
        this.f98601b = jVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f98600a;
        j jVar = this.f98601b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jVar.m();
            return;
        }
        SafeHandler safeHandler = fTCVideoRecordNewActivity.f97382h;
        jVar.getClass();
        safeHandler.post(new q(jVar));
    }
}
