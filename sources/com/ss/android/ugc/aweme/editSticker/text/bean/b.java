package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.aweme.editSticker.h;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(55645);
    }

    static final h a(Effect effect) {
        try {
            i iVar = (i) d.b().a(effect.getExtra(), i.class);
            String str = effect.getUnzipPath() + File.separator + iVar.f88427a;
            l.d(str, "");
            iVar.f88428b = str;
            l.b(iVar, "");
            return new h(effect, iVar);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final List<a> a(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : effectChannelResponse.getAllCategoryEffects()) {
            if (t != null) {
                try {
                    g gVar = (g) d.b().a(t.getExtra(), g.class);
                    if (gVar == null) {
                        gVar = new g();
                    }
                    arrayList.add(new a(t, gVar));
                } catch (Exception e2) {
                    h d2 = d.d();
                    if (d2 != null) {
                        d2.a(e2);
                    }
                }
            }
        }
        return arrayList;
    }
}
