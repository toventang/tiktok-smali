package com.ss.android.ugc.aweme.music.service;

import android.app.Activity;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public interface IMusicRecordService {

    public interface a {
        static {
            Covode.recordClassIndex(71848);
        }
    }

    static {
        Covode.recordClassIndex(71847);
    }

    void startRecord(m mVar, Activity activity, MusicModel musicModel, String str, String str2, a aVar, int i2, boolean z);
}
