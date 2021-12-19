package com.ss.android.ugc.aweme.sticker.repository.d.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public abstract class a {
    static {
        Covode.recordClassIndex(88547);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(String str, Effect effect);

    public final boolean b(String str, Effect effect) {
        l.d(str, "");
        if (effect == null) {
            return true;
        }
        return a(str, effect);
    }
}
