package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.w;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w.AnonymousClass2 f111836a;

    /* renamed from: b  reason: collision with root package name */
    private final Effect f111837b;

    /* renamed from: c  reason: collision with root package name */
    private final MusicModel f111838c;

    static {
        Covode.recordClassIndex(71890);
    }

    ac(w.AnonymousClass2 r1, Effect effect, MusicModel musicModel) {
        this.f111836a = r1;
        this.f111837b = effect;
        this.f111838c = musicModel;
    }

    public final void run() {
        w.AnonymousClass2 r0 = this.f111836a;
        w.this.f112069b.a(this.f111837b, this.f111838c);
    }
}
