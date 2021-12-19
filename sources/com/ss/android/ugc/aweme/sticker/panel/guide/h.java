package com.ss.android.ugc.aweme.sticker.panel.guide;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface h {

    public enum a {
        GIF,
        LOTTIE;

        static {
            Covode.recordClassIndex(88358);
        }
    }

    static {
        Covode.recordClassIndex(88357);
    }

    void a(boolean z, Effect effect, a aVar);
}
