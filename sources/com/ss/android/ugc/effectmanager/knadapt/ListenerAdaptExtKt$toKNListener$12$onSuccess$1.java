package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

final class ListenerAdaptExtKt$toKNListener$12$onSuccess$1 extends m implements b<CategoryPageModel, z> {
    final /* synthetic */ ListenerAdaptExtKt$toKNListener$12 this$0;

    static {
        Covode.recordClassIndex(95565);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListenerAdaptExtKt$toKNListener$12$onSuccess$1(ListenerAdaptExtKt$toKNListener$12 listenerAdaptExtKt$toKNListener$12) {
        super(1);
        this.this$0 = listenerAdaptExtKt$toKNListener$12;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* bridge */ /* synthetic */ z invoke(CategoryPageModel categoryPageModel) {
        invoke(categoryPageModel);
        return z.f158842a;
    }

    public final void invoke(CategoryPageModel categoryPageModel) {
        l.c(categoryPageModel, "");
        this.this$0.$oldListener.onSuccess(categoryPageModel);
    }
}
