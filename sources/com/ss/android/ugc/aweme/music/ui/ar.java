package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.e;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

final /* synthetic */ class ar implements e.c {

    /* renamed from: a  reason: collision with root package name */
    private final ah f111897a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicModel f111898b;

    static {
        Covode.recordClassIndex(71921);
    }

    ar(ah ahVar, MusicModel musicModel) {
        this.f111897a = ahVar;
        this.f111898b = musicModel;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.e.c
    public final void a() {
        this.f111897a.am.a(this.f111898b.getMusicId());
    }
}
