package com.ss.android.ugc.aweme.sticker.repository.d.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class k extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final k f135500a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(88558);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.repository.d.a.a
    public final boolean a(String str, Effect effect) {
        l.d(str, "");
        l.d(effect, "");
        if (g.i(effect) || c.f(effect)) {
            return true;
        }
        return false;
    }
}
