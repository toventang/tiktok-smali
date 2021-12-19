package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

/* access modifiers changed from: package-private */
public final class ListenerAdaptExtKt$preProcess$2 extends m implements b<CategoryPageModel, com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel> {
    public static final ListenerAdaptExtKt$preProcess$2 INSTANCE = new ListenerAdaptExtKt$preProcess$2();

    static {
        Covode.recordClassIndex(95559);
    }

    ListenerAdaptExtKt$preProcess$2() {
        super(1);
    }

    public final com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel invoke(CategoryPageModel categoryPageModel) {
        List<Effect> effects;
        List<Effect> collectEffects;
        List<Effect> bindEffects;
        l.c(categoryPageModel, "");
        com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel categoryPageModel2 = new com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel(categoryPageModel);
        CategoryEffectModel categoryEffects = categoryPageModel2.getCategoryEffects();
        if (!(categoryEffects == null || (bindEffects = categoryEffects.getBindEffects()) == null)) {
            ListenerAdaptExtKt.preProcess(bindEffects);
        }
        CategoryEffectModel categoryEffects2 = categoryPageModel2.getCategoryEffects();
        if (!(categoryEffects2 == null || (collectEffects = categoryEffects2.getCollectEffects()) == null)) {
            ListenerAdaptExtKt.preProcess(collectEffects);
        }
        CategoryEffectModel categoryEffects3 = categoryPageModel2.getCategoryEffects();
        if (!(categoryEffects3 == null || (effects = categoryEffects3.getEffects()) == null)) {
            ListenerAdaptExtKt.preProcess(effects);
        }
        return categoryPageModel2;
    }
}
