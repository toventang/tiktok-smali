package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ui.task.a;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;

final /* synthetic */ class fk implements a {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordNewActivity f131759a;

    /* renamed from: b  reason: collision with root package name */
    private final j f131760b;

    static {
        Covode.recordClassIndex(86300);
    }

    fk(VideoRecordNewActivity videoRecordNewActivity, j jVar) {
        this.f131759a = videoRecordNewActivity;
        this.f131760b = jVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        VideoRecordNewActivity videoRecordNewActivity = this.f131759a;
        j jVar = this.f131760b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jVar.m();
            return;
        }
        SafeHandler safeHandler = videoRecordNewActivity.f131229h;
        jVar.getClass();
        safeHandler.post(new fs(jVar));
    }
}
