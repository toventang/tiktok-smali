package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import h.f.b.l;

public final class bo {
    static {
        Covode.recordClassIndex(83320);
    }

    public static final PublishOutput a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        return new PublishOutput(videoPublishEditModel.creationId, videoPublishEditModel.getContactVideoPathAsKey(), videoPublishEditModel.musicId, videoPublishEditModel.isCommercialMusic(), videoPublishEditModel.isOriginalSound());
    }

    public static final boolean a(BaseShortVideoContext baseShortVideoContext) {
        l.d(baseShortVideoContext, "");
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || ((long) baseShortVideoContext.getVideoLength()) <= 61000) {
            return false;
        }
        return true;
    }
}
