package com.ss.android.ugc.aweme.sticker.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.sticker.repository.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134900a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(88188);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.d.a.a
    public final boolean a(String str, Effect effect) {
        l.d(str, "");
        l.d(effect, "");
        if (!c.b(effect)) {
            return false;
        }
        if (!g.a().A().b() || g.a().A().a()) {
            return true;
        }
        return false;
    }
}
