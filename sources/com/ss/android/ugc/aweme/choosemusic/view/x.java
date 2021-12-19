package com.ss.android.ugc.aweme.choosemusic.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final u f70876a;

    /* renamed from: b  reason: collision with root package name */
    private final int f70877b;

    /* renamed from: c  reason: collision with root package name */
    private final MusicModel f70878c;

    static {
        Covode.recordClassIndex(43663);
    }

    x(u uVar, int i2, MusicModel musicModel) {
        this.f70876a = uVar;
        this.f70877b = i2;
        this.f70878c = musicModel;
    }

    public final void run() {
        this.f70876a.b(this.f70877b, this.f70878c);
    }
}
