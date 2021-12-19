package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEUtils;

public final class a {
    static {
        Covode.recordClassIndex(91887);
    }

    public static final boolean a(Effect effect) {
        if (!(effect == null || effect.getUnzipPath() == null)) {
            String unzipPath = effect.getUnzipPath();
            if (e.b(unzipPath) && VEUtils.checkMVResourceIntegrity(unzipPath) == 0) {
                return true;
            }
        }
        return false;
    }
}
