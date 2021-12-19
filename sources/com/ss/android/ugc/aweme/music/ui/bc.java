package com.ss.android.ugc.aweme.music.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bc implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final MusicModel f111920a;

    static {
        Covode.recordClassIndex(71938);
    }

    bc(MusicModel musicModel) {
        this.f111920a = musicModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MusicModel musicModel = this.f111920a;
        if (TextUtils.isEmpty(musicModel.getMusicId())) {
            return musicModel;
        }
        musicModel.setMusic(MusicApi.a(musicModel.getMusicId(), 0).music);
        musicModel.setStrongBeatUrl(musicModel.getMusic().getStrongBeatUrl());
        return musicModel;
    }
}
