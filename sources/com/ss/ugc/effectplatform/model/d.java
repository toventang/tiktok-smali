package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(102481);
    }

    public static final String a(Effect effect) {
        l.c(effect, "");
        if (l.a((Object) effect.getFile_url().getUri(), (Object) "")) {
            return null;
        }
        return effect.getFile_url().getUri();
    }
}
