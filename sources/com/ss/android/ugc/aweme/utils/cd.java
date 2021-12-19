package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import h.f.b.l;
import java.util.ArrayList;

public final class cd {

    /* renamed from: a  reason: collision with root package name */
    public static final cd f142764a = new cd();

    private cd() {
    }

    static {
        Covode.recordClassIndex(93385);
    }

    public static final boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        ArrayList<TimeSpeedModelExtension> a2 = CameraComponentModel.a(videoPublishEditModel.mVideoSegmentsDesc);
        if (a2.isEmpty()) {
            return false;
        }
        l.b(a2, "");
        for (T t : a2) {
            l.b(t, "");
            if (t.isUploadTypeSticker()) {
                return true;
            }
        }
        return false;
    }
}
