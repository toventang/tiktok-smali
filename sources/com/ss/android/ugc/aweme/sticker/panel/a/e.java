package com.ss.android.ugc.aweme.sticker.panel.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final int f135019a;

    /* renamed from: b  reason: collision with root package name */
    private final Effect f135020b;

    static {
        Covode.recordClassIndex(88285);
    }

    public e(int i2, Effect effect) {
        l.d(effect, "");
        this.f135019a = i2;
        this.f135020b = effect;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.a.a
    public final boolean a(Effect effect, int i2, int i3) {
        l.d(effect, "");
        if (i2 != this.f135019a) {
            return false;
        }
        if (l.a((Object) effect.getEffectId(), (Object) this.f135020b.getParentId())) {
            return true;
        }
        if (!g.a(effect) || !l.a((Object) effect.getEffectId(), (Object) this.f135020b.getEffectId())) {
            return false;
        }
        return true;
    }
}
