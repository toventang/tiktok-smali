package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class bm {
    static {
        Covode.recordClassIndex(83318);
    }

    public static final boolean b(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.mVideoCanvasWidth == videoPublishEditModel.mOutVideoWidth && videoPublishEditModel.mVideoCanvasHeight == videoPublishEditModel.mOutVideoHeight) {
            return false;
        }
        return true;
    }

    public static final boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.mVideoCanvasWidth <= 0 || videoPublishEditModel.mVideoCanvasHeight <= 0) {
            return false;
        }
        if (videoPublishEditModel.mVideoCanvasWidth >= videoPublishEditModel.videoWidth() || videoPublishEditModel.mVideoCanvasHeight >= videoPublishEditModel.videoHeight()) {
            return true;
        }
        return false;
    }

    public static final float[] a(float f2, float f3, int i2, int i3, int i4, int i5) {
        float f4 = (float) i4;
        float f5 = (float) i2;
        float f6 = (f4 * 1.0f) / f5;
        float f7 = (float) i5;
        float f8 = (float) i3;
        float f9 = (1.0f * f7) / f8;
        if (f6 == f9) {
            return new float[]{f2, f3};
        }
        float max = Math.max(f6, f9);
        if (max == f6) {
            f3 = (((f3 * f8) * max) - (((f8 * max) - f7) / 2.0f)) / f7;
        } else {
            f2 = (((f2 * f5) * max) - (((f5 * max) - f4) / 2.0f)) / f4;
        }
        return new float[]{f2, f3};
    }
}
