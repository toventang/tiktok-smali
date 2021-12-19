package com.ss.android.ugc.tools.h.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.b;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.h.a.m;
import com.ss.android.ugc.tools.h.a.n;
import f.a.t;
import h.f.b.l;
import java.util.List;

public interface d<CATEGORY, DOWNLOAD_EVENT> {
    static {
        Covode.recordClassIndex(98259);
    }

    j<Effect, CategoryEffectModel> a(b bVar);

    t<List<m>> a();

    t<DOWNLOAD_EVENT> a(Effect effect, boolean z);

    t<com.ss.android.ugc.tools.h.a.a<CATEGORY, Effect>> a(n nVar);

    CATEGORY a(Effect effect);

    CATEGORY a(String str);

    public static final class a {
        static {
            Covode.recordClassIndex(98260);
        }

        public static <CATEGORY, DOWNLOAD_EVENT> CATEGORY a(d<CATEGORY, DOWNLOAD_EVENT> dVar, Effect effect) {
            l.d(effect, "");
            return dVar.a(effect.getEffectId());
        }
    }
}
