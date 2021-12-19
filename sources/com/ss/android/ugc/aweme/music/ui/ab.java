package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.w;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ab implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w.AnonymousClass2 f111834a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicModel f111835b;

    static {
        Covode.recordClassIndex(71889);
    }

    ab(w.AnonymousClass2 r1, MusicModel musicModel) {
        this.f111834a = r1;
        this.f111835b = musicModel;
    }

    public final void run() {
        w.AnonymousClass2 r0 = this.f111834a;
        w.this.f112069b.a((Effect) null, this.f111835b);
    }
}
