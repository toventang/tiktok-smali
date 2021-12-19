package com.ss.android.ugc.tools.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;
import h.p;

public final class m {
    static {
        Covode.recordClassIndex(98755);
    }

    public static final p<Integer, Integer> a(VideoPublishEditModel videoPublishEditModel) {
        int i2;
        l.d(videoPublishEditModel, "");
        int i3 = 0;
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            i3 = videoPublishEditModel.videoCount;
            i2 = videoPublishEditModel.photoCount;
        } else {
            if (videoPublishEditModel.extractFramesModel != null && videoPublishEditModel.extractFramesModel.getFrameSize() > 0) {
                i3 = videoPublishEditModel.extractFramesModel.getFrameSize();
            } else if (!(videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.selectMediaList == null)) {
                i2 = videoPublishEditModel.mvCreateVideoData.selectMediaList.size();
            }
            i2 = 0;
        }
        return new p<>(Integer.valueOf(i3), Integer.valueOf(i2));
    }
}
