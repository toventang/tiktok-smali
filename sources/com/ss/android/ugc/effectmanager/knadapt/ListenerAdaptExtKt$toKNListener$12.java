package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.task.al;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$12 implements e<CategoryPageModel> {
    final /* synthetic */ IFetchCategoryEffectListener $oldListener;
    final /* synthetic */ al $taskManager;

    static {
        Covode.recordClassIndex(95564);
    }

    public final void onSuccess(CategoryPageModel categoryPageModel) {
        l.c(categoryPageModel, "");
        if (DataPreProcess.enable) {
            ListenerAdaptExtKt.preProcess(categoryPageModel, this.$taskManager, new ListenerAdaptExtKt$toKNListener$12$onSuccess$1(this));
        } else {
            this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel(categoryPageModel));
        }
    }

    ListenerAdaptExtKt$toKNListener$12(al alVar, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        this.$taskManager = alVar;
        this.$oldListener = iFetchCategoryEffectListener;
    }

    public final void onFail(CategoryPageModel categoryPageModel, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
