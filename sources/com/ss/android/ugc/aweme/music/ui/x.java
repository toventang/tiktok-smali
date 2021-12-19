package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.w;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w.AnonymousClass2 f112107a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicModel f112108b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f112109c;

    static {
        Covode.recordClassIndex(72042);
    }

    x(w.AnonymousClass2 r1, MusicModel musicModel, boolean z) {
        this.f112107a = r1;
        this.f112108b = musicModel;
        this.f112109c = z;
    }

    public final void run() {
        w.AnonymousClass2 r0 = this.f112107a;
        w.this.f112069b.a(this.f112108b, this.f112109c);
    }
}
