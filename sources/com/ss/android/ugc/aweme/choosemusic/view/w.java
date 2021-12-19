package com.ss.android.ugc.aweme.choosemusic.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final u f70873a;

    /* renamed from: b  reason: collision with root package name */
    private final int f70874b;

    /* renamed from: c  reason: collision with root package name */
    private final MusicModel f70875c;

    static {
        Covode.recordClassIndex(43662);
    }

    w(u uVar, int i2, MusicModel musicModel) {
        this.f70873a = uVar;
        this.f70874b = i2;
        this.f70875c = musicModel;
    }

    public final void run() {
        this.f70873a.a(this.f70874b, this.f70875c);
    }
}
