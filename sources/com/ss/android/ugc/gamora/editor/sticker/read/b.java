package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.b.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final e f146854c;

    static {
        Covode.recordClassIndex(96726);
    }

    public final boolean c() {
        if (this.f146854c.f146910f == 1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f88093b.getEffectId().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return l.a((Object) ((a) obj).f88093b.getEffectId(), (Object) this.f88093b.getEffectId());
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Effect effect, e eVar) {
        super(effect);
        l.d(effect, "");
        l.d(eVar, "");
        this.f146854c = eVar;
    }
}
