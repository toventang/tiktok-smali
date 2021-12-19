package com.ss.android.ugc.aweme.music.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.a.b;

final /* synthetic */ class w implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Music f111631a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicModel f111632b;

    static {
        Covode.recordClassIndex(71727);
    }

    w(Music music, MusicModel musicModel) {
        this.f111631a = music;
        this.f111632b = musicModel;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        Music music = this.f111631a;
        MusicModel musicModel = this.f111632b;
        music.getExtraParamFromPretreatment().put("rank", obj);
        musicModel.getExtraParamFromPretreatment().put("rank", obj);
        return 1;
    }
}
