package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.task.al;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$13 implements e<PanelInfoModel> {
    final /* synthetic */ IFetchPanelInfoListener $oldListener;
    final /* synthetic */ al $taskManager;

    static {
        Covode.recordClassIndex(95566);
    }

    public final void onSuccess(PanelInfoModel panelInfoModel) {
        l.c(panelInfoModel, "");
        if (DataPreProcess.enable) {
            ListenerAdaptExtKt.preProcess(panelInfoModel, this.$taskManager, new ListenerAdaptExtKt$toKNListener$13$onSuccess$1(this));
        } else {
            this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel(panelInfoModel));
        }
    }

    ListenerAdaptExtKt$toKNListener$13(al alVar, IFetchPanelInfoListener iFetchPanelInfoListener) {
        this.$taskManager = alVar;
        this.$oldListener = iFetchPanelInfoListener;
    }

    public final void onFail(PanelInfoModel panelInfoModel, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
