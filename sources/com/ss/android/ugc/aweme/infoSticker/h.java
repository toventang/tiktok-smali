package com.ss.android.ugc.aweme.infoSticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class h {
    static {
        Covode.recordClassIndex(67083);
    }

    public static boolean a(Effect effect) {
        return effect.getTags().contains("pollsticker");
    }

    public static boolean b(Effect effect) {
        return effect.getTags().contains("qa");
    }

    public static boolean c(Effect effect) {
        return effect.getTags().contains("commentPanel");
    }

    public static boolean d(Effect effect) {
        return effect.getTags().contains("mention");
    }

    public static boolean e(Effect effect) {
        return effect.getTags().contains("hashtag");
    }

    public static boolean f(Effect effect) {
        return effect.getTags().contains("donation");
    }

    public static boolean g(Effect effect) {
        return effect.getTags().contains("UploadImageSticker");
    }

    public static boolean h(Effect effect) {
        return effect.getTags().contains("CountdownSticker");
    }

    public static boolean i(Effect effect) {
        return effect.getTags().contains("duet");
    }
}
