package com.ss.android.ugc.aweme.tools.extract.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;
import h.p;
import h.v;

public final class f implements e {
    static {
        Covode.recordClassIndex(91493);
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a.e
    public final p<Integer, String> a(VideoPublishEditModel videoPublishEditModel, int i2) {
        l.d(videoPublishEditModel, "");
        int size = videoPublishEditModel.mvCreateVideoData.srcSelectMediaList.size();
        if (size == 0) {
            return v.a(12, "");
        }
        if (i2 == size) {
            return v.a(-1, "");
        }
        return v.a(12, "frame count:" + i2 + ", select size:" + size);
    }
}
