package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.f.a.a.a.a.c;

public final class j {
    static {
        Covode.recordClassIndex(60377);
    }

    public static int a(Aweme aweme) {
        if (aweme == null || aweme.getVideo() == null) {
            return 0;
        }
        try {
            int b2 = b(aweme.getVideo().getPlayAddr());
            if (b2 == -1) {
                return 0;
            }
            return b2;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int b(VideoUrlModel videoUrlModel) {
        Integer valueOf;
        if (videoUrlModel == null) {
            return -1;
        }
        c hitBitrate = videoUrlModel.getHitBitrate();
        if (hitBitrate == null || (valueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
            valueOf = -1;
        }
        return valueOf.intValue();
    }

    public static Integer a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return null;
        }
        if (videoUrlModel.getHitBitrate() != null) {
            return Integer.valueOf(videoUrlModel.getHitBitrate().getBitRate());
        }
        if (videoUrlModel.getBitRate() == null || videoUrlModel.getBitRate().size() <= 0) {
            return null;
        }
        return Integer.valueOf(videoUrlModel.getBitRate().get(0).getBitRate());
    }
}
