package com.ss.android.ugc.aweme.music.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.e;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

final /* synthetic */ class h implements e.c {

    /* renamed from: a  reason: collision with root package name */
    private final e f111760a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicModel f111761b;

    static {
        Covode.recordClassIndex(71865);
    }

    h(e eVar, MusicModel musicModel) {
        this.f111760a = eVar;
        this.f111761b = musicModel;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.e.c
    public final void a() {
        this.f111760a.f111734e.a(this.f111761b.getMusicId());
    }
}
