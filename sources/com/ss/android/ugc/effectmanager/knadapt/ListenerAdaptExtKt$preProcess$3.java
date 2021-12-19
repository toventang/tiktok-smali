package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

/* access modifiers changed from: package-private */
public final class ListenerAdaptExtKt$preProcess$3 extends m implements b<PanelInfoModel, com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel> {
    public static final ListenerAdaptExtKt$preProcess$3 INSTANCE = new ListenerAdaptExtKt$preProcess$3();

    static {
        Covode.recordClassIndex(95560);
    }

    ListenerAdaptExtKt$preProcess$3() {
        super(1);
    }

    public final com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel invoke(PanelInfoModel panelInfoModel) {
        List<Effect> bindEffects;
        List<Effect> collectEffects;
        l.c(panelInfoModel, "");
        com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel panelInfoModel2 = new com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel(panelInfoModel);
        CategoryEffectModel categoryEffectModel = panelInfoModel2.getCategoryEffectModel();
        if (!(categoryEffectModel == null || (collectEffects = categoryEffectModel.getCollectEffects()) == null)) {
            ListenerAdaptExtKt.preProcess(collectEffects);
        }
        CategoryEffectModel categoryEffectModel2 = panelInfoModel2.getCategoryEffectModel();
        if (!(categoryEffectModel2 == null || (bindEffects = categoryEffectModel2.getBindEffects()) == null)) {
            ListenerAdaptExtKt.preProcess(bindEffects);
        }
        panelInfoModel2.getCategoryList();
        return panelInfoModel2;
    }
}
