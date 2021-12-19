package com.ss.android.ugc.tools.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import h.f.b.l;
import h.m.p;

public final class a {
    static {
        Covode.recordClassIndex(98728);
    }

    public static final String a(AudioRecorderParam audioRecorderParam) {
        l.d(audioRecorderParam, "");
        if (p.c(audioRecorderParam.getAudioUrl(), "df", false)) {
            return audioRecorderParam.getAudioUrl();
        }
        return audioRecorderParam.getAudioUrl() + "df";
    }
}
