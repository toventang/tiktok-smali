package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.ugc.effectplatform.h.e;
import h.f.b.l;
import java.util.List;

public final class ListenerAdaptExtKt$toKNListener$14 implements e<List<? extends String>> {
    final /* synthetic */ IModFavoriteList $oldListener;

    static {
        Covode.recordClassIndex(95568);
    }

    ListenerAdaptExtKt$toKNListener$14(IModFavoriteList iModFavoriteList) {
        this.$oldListener = iModFavoriteList;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.ugc.effectplatform.h.e
    public final /* bridge */ /* synthetic */ void onSuccess(List<? extends String> list) {
        onSuccess((List<String>) list);
    }

    public final void onSuccess(List<String> list) {
        l.c(list, "");
        this.$oldListener.onSuccess(list);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
    @Override // com.ss.ugc.effectplatform.h.e
    public final /* bridge */ /* synthetic */ void onFail(List<? extends String> list, com.ss.ugc.effectplatform.model.e eVar) {
        onFail((List<String>) list, eVar);
    }

    public final void onFail(List<String> list, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
