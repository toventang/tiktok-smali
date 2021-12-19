package com.ss.android.ugc.aweme.shortvideo.sticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.c;

public final class b {
    static {
        Covode.recordClassIndex(85423);
    }

    public static final boolean a(String str) {
        a aVar;
        String b2 = c.b(str, "audio_graph");
        if (b2 == null || (aVar = (a) c.f149148c.a(b2, a.class)) == null || !aVar.enableMusic()) {
            return false;
        }
        return true;
    }

    public static final boolean a(Effect effect) {
        String str;
        a aVar;
        if (effect != null) {
            str = effect.getSdkExtra();
        } else {
            str = null;
        }
        String b2 = c.b(str, "audio_graph");
        if (b2 == null || (aVar = (a) c.f149148c.a(b2, a.class)) == null || !aVar.enableMic()) {
            return false;
        }
        return true;
    }
}
