package com.ss.android.ugc.aweme.sticker.repository.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.shortvideo.ui.h;
import com.ss.android.ugc.aweme.sticker.p.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.b.a.d;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(88505);
    }

    private static String a(Effect effect) {
        List<String> music;
        String str;
        if (effect == null || (music = effect.getMusic()) == null || (str = (String) n.h((List) music)) == null) {
            return null;
        }
        return e.a(str);
    }

    public static final boolean a(d dVar, Effect effect) {
        l.d(dVar, "");
        if (effect == null) {
            return false;
        }
        if (effect.getEffectType() != 0 || dVar.c(effect)) {
            return true;
        }
        return false;
    }

    public static final boolean b(d dVar, Effect effect) {
        l.d(dVar, "");
        if (!a(dVar, effect)) {
            return false;
        }
        if (!c.a(effect) || h.d(effect.getEffectId()) || a(effect) != null) {
            return true;
        }
        return false;
    }
}
