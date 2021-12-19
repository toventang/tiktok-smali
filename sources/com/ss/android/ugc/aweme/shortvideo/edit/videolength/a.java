package com.ss.android.ugc.aweme.shortvideo.edit.videolength;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;

public final class a {
    static {
        Covode.recordClassIndex(83922);
    }

    public static final boolean a(c cVar) {
        if (cVar == null || cVar.isPgc()) {
            return false;
        }
        return true;
    }

    public static final boolean b(VideoPublishEditModel videoPublishEditModel) {
        if (!com.ss.android.ugc.aweme.shortvideo.edit.a.a() && a(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean a(VideoPublishEditModel videoPublishEditModel) {
        EditPreviewInfo editPreviewInfo;
        if (videoPublishEditModel != null) {
            editPreviewInfo = videoPublishEditModel.getPreviewInfo();
        } else {
            editPreviewInfo = null;
        }
        if (editPreviewInfo == null || editPreviewInfo.getPreviewVideoLength() == 0) {
            if (videoPublishEditModel == null || videoPublishEditModel.videoDurationFromVideoCutPage < 61000) {
                return false;
            }
            return true;
        } else if (editPreviewInfo.getPreviewVideoLength() >= 61000) {
            return true;
        } else {
            return false;
        }
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, String str) {
        if (videoPublishEditModel != null) {
            videoPublishEditModel.mMusicPath = null;
            videoPublishEditModel.musicId = str;
            videoPublishEditModel.mMusicStart = 0;
            videoPublishEditModel.isSoundLoop = false;
            videoPublishEditModel.musicVolume = 0.5f;
        }
    }
}
