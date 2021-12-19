package com.ss.android.ugc.aweme.shortvideo.WorkSpace;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f124791a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(81997);
    }

    public static Workspace a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.isFastImport) {
            return c.a(null, null, videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
        }
        if (com.ss.android.ugc.aweme.shortvideo.edit.model.b.c(videoPublishEditModel)) {
            return c.a(null, null, videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
        }
        return c.a(videoPublishEditModel.getContactVideoPathAsKey(), videoPublishEditModel.getContactAudioPathAsKey(), videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
    }
}
