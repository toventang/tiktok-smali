package com.ss.android.ugc.aweme.sticker.repository;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.aweme.sticker.repository.a.y;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.a.ag;
import h.a.z;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b {
    static {
        Covode.recordClassIndex(88540);
    }

    public static final List<EffectCategoryModel> a(y yVar) {
        l.d(yVar, "");
        List<EffectCategoryModel> value = yVar.e().getValue();
        if (value == null) {
            return z.INSTANCE;
        }
        return value;
    }

    public static final Map<String, CategoryEffectModel> b(y yVar) {
        M m2;
        l.d(yVar, "");
        Map<String, LiveData<a<CategoryEffectModel>>> c2 = yVar.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ag.a(c2.size()));
        for (T t : c2.entrySet()) {
            Object key = t.getKey();
            a aVar = (a) ((LiveData) t.getValue()).getValue();
            if (aVar != null) {
                m2 = aVar.f69568a;
            } else {
                m2 = null;
            }
            linkedHashMap.put(key, m2);
        }
        return linkedHashMap;
    }

    public static final CategoryEffectModel a(y yVar, String str) {
        a<CategoryEffectModel> value;
        l.d(yVar, "");
        if (str == null || (value = yVar.a(str, false).getValue()) == null) {
            return null;
        }
        return value.f69568a;
    }
}
