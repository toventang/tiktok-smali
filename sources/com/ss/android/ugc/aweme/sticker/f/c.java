package com.ss.android.ugc.aweme.sticker.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.a.f;
import com.ss.android.ugc.aweme.sticker.repository.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c {
    static {
        Covode.recordClassIndex(88148);
    }

    public static final int a(o oVar) {
        l.d(oVar, "");
        return b(oVar);
    }

    public static final int b(o oVar) {
        l.d(oVar, "");
        Map<String, f> a2 = oVar.c().i().a();
        ArrayList arrayList = new ArrayList(a2.size());
        for (Map.Entry<String, f> entry : a2.entrySet()) {
            arrayList.add(entry.getKey());
        }
        ArrayList arrayList2 = arrayList;
        int i2 = 0;
        for (T t : b.a(oVar.c().j())) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            if (!arrayList2.contains(t.getKey())) {
                return i2;
            }
            i2 = i3;
        }
        return 0;
    }

    public static final boolean a(o oVar, Effect effect) {
        l.d(oVar, "");
        return oVar.n().c(effect);
    }

    public static final boolean d(o oVar, Effect effect) {
        l.d(oVar, "");
        l.d(effect, "");
        if (!g.e(effect) || oVar.c().c().a(effect)) {
            return false;
        }
        return true;
    }

    public static final boolean c(o oVar, Effect effect) {
        String str;
        l.d(oVar, "");
        if (effect == null) {
            return false;
        }
        String effectId = effect.getEffectId();
        Effect g2 = oVar.g();
        String str2 = null;
        if (g2 != null) {
            str = g2.getEffectId();
        } else {
            str = null;
        }
        if (l.a((Object) effectId, (Object) str)) {
            return true;
        }
        if (l.a((Object) oVar.p().f135424a, (Object) "livestreaming")) {
            String resourceId = effect.getResourceId();
            Effect g3 = oVar.g();
            if (g3 != null) {
                str2 = g3.getResourceId();
            }
            if (l.a((Object) resourceId, (Object) str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(o oVar, Effect effect) {
        String str;
        l.d(oVar, "");
        if (effect == null) {
            return false;
        }
        String effectId = effect.getEffectId();
        Effect f2 = oVar.f();
        String str2 = null;
        if (f2 != null) {
            str = f2.getEffectId();
        } else {
            str = null;
        }
        if (l.a((Object) effectId, (Object) str)) {
            return true;
        }
        if (l.a((Object) oVar.p().f135424a, (Object) "livestreaming")) {
            String resourceId = effect.getResourceId();
            Effect f3 = oVar.f();
            if (f3 != null) {
                str2 = f3.getResourceId();
            }
            if (l.a((Object) resourceId, (Object) str2)) {
                return true;
            }
        }
        return false;
    }

    public static final Effect a(o oVar, List<? extends Effect> list, int i2) {
        l.d(oVar, "");
        l.d(list, "");
        if (list.size() - 2 < i2) {
            return null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int size = list.size();
        while (i2 < size) {
            if (d(oVar, (Effect) list.get(i2))) {
                return (Effect) list.get(i2);
            }
            i2++;
        }
        return null;
    }
}
