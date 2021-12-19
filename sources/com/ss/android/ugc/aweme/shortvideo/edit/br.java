package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class br {
    static {
        Covode.recordClassIndex(83324);
    }

    public static final bq a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.isFastImport) {
            return new q(videoPublishEditModel);
        }
        return new h(videoPublishEditModel);
    }
}
