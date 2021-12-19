package com.ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c;
import com.ss.android.ugc.aweme.shortvideo.preview.a;
import dmt.av.video.b.j;
import h.f.b.l;

public final class h {
    static {
        Covode.recordClassIndex(83271);
    }

    public static final int a(a aVar, AudioRecorderParam audioRecorderParam) {
        l.d(aVar, "");
        l.d(audioRecorderParam, "");
        j d2 = aVar.d();
        c.a.a();
        return d2.a(audioRecorderParam, c.a.c());
    }
}
