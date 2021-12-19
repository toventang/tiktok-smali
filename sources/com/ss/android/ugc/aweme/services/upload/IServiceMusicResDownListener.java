package com.ss.android.ugc.aweme.services.upload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public interface IServiceMusicResDownListener {
    static {
        Covode.recordClassIndex(79842);
    }

    void onFailed();

    void onSuccess(MusicModel musicModel, String str);
}
