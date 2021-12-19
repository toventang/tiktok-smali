package com.ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f130934a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(85817);
    }

    public static final boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (!bp.k(videoPublishEditModel)) {
            return false;
        }
        if ((!videoPublishEditModel.hasOriginalAudio() || videoPublishEditModel.voiceVolume <= 0.0f) && !videoPublishEditModel.hasRecord()) {
            return false;
        }
        return true;
    }
}
