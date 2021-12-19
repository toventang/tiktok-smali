package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class VisionSearchStruct {
    @c(a = "privacy")
    private VisionSearchPrivacy privacy;

    static {
        Covode.recordClassIndex(63113);
    }

    public VisionSearchPrivacy getPrivacy() {
        VisionSearchPrivacy visionSearchPrivacy = this.privacy;
        if (visionSearchPrivacy != null) {
            return visionSearchPrivacy;
        }
        throw new a();
    }
}
