package com.ss.android.ugc.aweme.kids.a.h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.Callable;

final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final MusicModel f105377a;

    static {
        Covode.recordClassIndex(67537);
    }

    f(MusicModel musicModel) {
        this.f105377a = musicModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MusicModel musicModel = this.f105377a;
        if (TextUtils.isEmpty(musicModel.getMusicId())) {
            return musicModel;
        }
        musicModel.setMusic(ChooseMusicApi.a(musicModel.getMusicId()).f105322a);
        musicModel.setStrongBeatUrl(musicModel.getMusic().getStrongBeatUrl());
        return musicModel;
    }
}
