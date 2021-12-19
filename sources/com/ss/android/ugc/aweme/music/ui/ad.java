package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.w;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w.AnonymousClass3 f111839a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicModel f111840b;

    static {
        Covode.recordClassIndex(71891);
    }

    ad(w.AnonymousClass3 r1, MusicModel musicModel) {
        this.f111839a = r1;
        this.f111840b = musicModel;
    }

    public final void run() {
        w.AnonymousClass3 r0 = this.f111839a;
        w.this.f112069b.a(this.f111840b, false);
    }
}
