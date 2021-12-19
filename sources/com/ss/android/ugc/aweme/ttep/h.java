package com.ss.android.ugc.aweme.ttep;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ui.task.a;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;

final /* synthetic */ class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TTEPEffectPreviewActivity f141341a;

    /* renamed from: b  reason: collision with root package name */
    private final j f141342b;

    static {
        Covode.recordClassIndex(92308);
    }

    h(TTEPEffectPreviewActivity tTEPEffectPreviewActivity, j jVar) {
        this.f141341a = tTEPEffectPreviewActivity;
        this.f141342b = jVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f141341a;
        j jVar = this.f141342b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jVar.m();
            return;
        }
        SafeHandler safeHandler = tTEPEffectPreviewActivity.f141210h;
        jVar.getClass();
        safeHandler.post(new p(jVar));
    }
}
