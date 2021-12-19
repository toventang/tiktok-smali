package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.model.Effect;
import h.a.i;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f153948a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(102663);
    }

    public static final boolean a(Effect effect) {
        int i2;
        l.c(effect, "");
        List<String> requirements_sec = effect.getRequirements_sec();
        if (requirements_sec == null || requirements_sec.isEmpty()) {
            return false;
        }
        List<String> requirements = effect.getRequirements();
        if (!(requirements instanceof Collection) || !requirements.isEmpty()) {
            Iterator<T> it = requirements.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if ((!p.a((CharSequence) it.next())) && (i2 = i2 + 1) < 0) {
                    n.b();
                }
            }
        } else {
            i2 = 0;
        }
        List<String> requirements_sec2 = effect.getRequirements_sec();
        if (requirements_sec2 != null && (!(requirements_sec2 instanceof Collection) || !requirements_sec2.isEmpty())) {
            Iterator<T> it2 = requirements_sec2.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                if ((!p.a((CharSequence) it2.next())) && (i3 = i3 + 1) < 0) {
                    n.b();
                }
            }
            if (i3 == 0 || i3 == i2) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static Map<String, List<String>> b(Effect effect, b bVar) {
        l.c(effect, "");
        String model_names = effect.getModel_names();
        d.a.e.b.a("effect_platform", "EffectUtils#getModelNamesOfEffect->effectId = " + effect.getEffect_id() + ", modelNames = " + model_names);
        if (u.a(model_names) || bVar == null) {
            return null;
        }
        if (model_names == null) {
            try {
                l.a();
            } catch (Exception e2) {
                d.a.e.b.a("effect_platform", "EffectUtils#getModelNamesOfEffect", e2);
                return null;
            }
        }
        return (Map) bVar.f153430a.convertJsonToObj(model_names, Map.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String[] a(com.ss.ugc.effectplatform.model.Effect r11, com.ss.ugc.effectplatform.a.b.b r12) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.a.a(com.ss.ugc.effectplatform.model.Effect, com.ss.ugc.effectplatform.a.b.b):java.lang.String[]");
    }

    private static String[] a(String[] strArr, Map<String, ? extends List<String>> map) {
        if (d.a.g.a.a(map)) {
            return strArr;
        }
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            arrayList.addAll((List) entry.getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        if (strArr != null) {
            arrayList2.addAll(i.j(strArr));
        }
        arrayList2.addAll(arrayList);
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
