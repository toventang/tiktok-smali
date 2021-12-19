package com.ss.android.ugc.aweme.tools.extract.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.extract.a.e;
import com.ss.android.ugc.aweme.tools.extract.ab;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import h.p;
import h.v;

public final class g implements e {
    static {
        Covode.recordClassIndex(91494);
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a.e
    public final p<Integer, String> a(VideoPublishEditModel videoPublishEditModel, int i2) {
        l.d(videoPublishEditModel, "");
        if (ab.f140003a == null) {
            return v.a(1, "");
        }
        j jVar = ab.f140003a;
        if (jVar != null && !jVar.getCheckAudioFrame()) {
            return v.a(2, "");
        }
        l.d(videoPublishEditModel, "");
        if (!e.a.a(videoPublishEditModel)) {
            return v.a(3, "output file:" + videoPublishEditModel.mOutputFile);
        }
        if (!i.a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            return v.a(4, "auido file:" + videoPublishEditModel.mEncodedAudioOutputFile);
        }
        return v.a(-2, "");
    }
}
