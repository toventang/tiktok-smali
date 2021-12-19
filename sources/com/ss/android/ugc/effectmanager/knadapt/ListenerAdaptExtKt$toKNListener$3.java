package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.Effect;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ListenerAdaptExtKt$toKNListener$3 implements e<List<? extends Effect>> {
    final /* synthetic */ IFetchEffectListListener $oldListener;

    static {
        Covode.recordClassIndex(95576);
    }

    ListenerAdaptExtKt$toKNListener$3(IFetchEffectListListener iFetchEffectListListener) {
        this.$oldListener = iFetchEffectListListener;
    }

    public final void onSuccess(List<? extends Effect> list) {
        l.c(list, "");
        IFetchEffectListListener iFetchEffectListListener = this.$oldListener;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.ss.android.ugc.effectmanager.effect.model.Effect(it.next()));
        }
        iFetchEffectListListener.onSuccess(arrayList);
    }

    public final void onFail(List<? extends Effect> list, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
