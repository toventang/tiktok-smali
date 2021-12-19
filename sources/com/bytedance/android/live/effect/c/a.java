package com.bytedance.android.live.effect.c;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.effect.api.a.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.model.LocalFilterModel;
import com.bytedance.android.live.effect.model.e;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import h.a.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class a implements j.a<FilterModel> {
    static {
        Covode.recordClassIndex(4940);
    }

    private static FilterModel.a a(String str) {
        o oVar;
        int i2;
        int i3;
        int i4;
        l c2;
        l c3;
        l c4;
        try {
            l a2 = q.a(str);
            h.f.b.l.b(a2, "");
            l c5 = a2.j().c("filterconfig");
            if (c5 != null) {
                oVar = c5.j();
            } else {
                oVar = null;
            }
            FilterModel.a aVar = new FilterModel.a();
            if (oVar == null || (c4 = oVar.c("max")) == null) {
                i2 = 100;
            } else {
                i2 = c4.g();
            }
            aVar.f9871a = i2;
            if (oVar == null || (c3 = oVar.c("min")) == null) {
                i3 = 0;
            } else {
                i3 = c3.g();
            }
            aVar.f9872b = i3;
            if (oVar == null || (c2 = oVar.c("value")) == null) {
                i4 = 50;
            } else {
                i4 = c2.g();
            }
            aVar.f9873c = i4;
            return aVar;
        } catch (Throwable unused) {
            return new FilterModel.a();
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.j.a
    public final List<e<FilterModel>> a(EffectChannelResponse effectChannelResponse) {
        List list;
        List<Effect> allCategoryEffects;
        if (effectChannelResponse == null || (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) == null) {
            list = new ArrayList();
        } else {
            ArrayList arrayList = new ArrayList(n.a((Iterable) allCategoryEffects, 10));
            for (T t : allCategoryEffects) {
                FilterModel filterModel = new FilterModel();
                filterModel.setFilterType(2);
                filterModel.setEffect(t);
                h.f.b.l.b(t, "");
                filterModel.setTags(t.getTags());
                filterModel.filterConfig = a(t.getExtra());
                arrayList.add(filterModel);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                FilterModel filterModel2 = (FilterModel) obj;
                if (!LiveNewEffectPanelSetting.INSTANCE.useNewPanel() || filterModel2.filterConfig != null) {
                    arrayList2.add(obj);
                }
            }
            list = n.g((Collection) arrayList2);
        }
        FilterModel filterModel3 = new FilterModel();
        filterModel3.setFilterType(0);
        LocalFilterModel localFilterModel = new LocalFilterModel();
        localFilterModel.setId("0");
        localFilterModel.setName(y.a((int) R.string.e2u));
        localFilterModel.setCoverResId(2131234728);
        localFilterModel.setFilterFilePath("");
        filterModel3.filterConfig = new FilterModel.a();
        filterModel3.setLocalFilter(localFilterModel);
        list.add(0, filterModel3);
        String str = com.bytedance.android.live.effect.api.a.f9640e;
        h.f.b.l.b(str, "");
        return n.a(new e(str, list));
    }
}
