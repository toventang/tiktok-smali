package com.ss.android.ugc.aweme.music.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.Callable;

final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final MusicModel f111753a;

    static {
        Covode.recordClassIndex(71863);
    }

    f(MusicModel musicModel) {
        this.f111753a = musicModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return MusicApi.a(this.f111753a.getMusicId(), 0).music;
    }
}
