package com.ss.android.ugc.gamora.recorder.choosemusic.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f147505a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(97205);
    }

    public static boolean a(Effect effect) {
        l.d(effect, "");
        if (c.h(effect) || g.t(effect)) {
            return true;
        }
        return false;
    }

    public static boolean a(ShortVideoContext shortVideoContext, Effect effect) {
        l.d(shortVideoContext, "");
        if (e.b() && !shortVideoContext.f124757b.b() && !shortVideoContext.f124757b.c() && !shortVideoContext.c() && !shortVideoContext.f124757b.f124714i && !com.ss.android.ugc.aweme.port.in.g.a().A().a() && shortVideoContext.f124757b.h() <= 0 && !c.h(effect) && !g.t(effect)) {
            return true;
        }
        return false;
    }
}
