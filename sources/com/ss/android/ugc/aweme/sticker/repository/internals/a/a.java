package com.ss.android.ugc.aweme.sticker.repository.internals.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.f;
import com.ss.android.ugc.aweme.sticker.repository.a.j;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.tools.b.a.a.a;
import com.ss.android.ugc.tools.b.a.d;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.h;
import h.z;

public final class a extends com.bytedance.jedi.a.f.a<z, CategoryEffectModel, com.ss.android.ugc.aweme.sticker.repository.c.a, CategoryEffectModel> {

    /* renamed from: a  reason: collision with root package name */
    public final String f135501a;

    /* renamed from: b  reason: collision with root package name */
    public final d f135502b;

    /* renamed from: f  reason: collision with root package name */
    private final h<j> f135503f;

    static {
        Covode.recordClassIndex(88563);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return z.f158842a;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.a.a$a  reason: collision with other inner class name */
    static final class C3527a<T> implements w<CategoryEffectModel> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f135504a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.repository.c.a f135505b;

        static {
            Covode.recordClassIndex(88564);
        }

        C3527a(a aVar, com.ss.android.ugc.aweme.sticker.repository.c.a aVar2) {
            this.f135504a = aVar;
            this.f135505b = aVar2;
        }

        @Override // f.a.w
        public final void subscribe(final v<CategoryEffectModel> vVar) {
            l.d(vVar, "");
            d dVar = this.f135504a.f135502b;
            String str = this.f135504a.f135501a;
            String str2 = this.f135505b.f135475a;
            int i2 = this.f135505b.f135476b;
            int i3 = this.f135505b.f135477c;
            int i4 = this.f135505b.f135478d;
            String str3 = this.f135505b.f135479e;
            AnonymousClass1 r9 = new IFetchCategoryEffectListener() {
                /* class com.ss.android.ugc.aweme.sticker.repository.internals.a.a.C3527a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88565);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    l.d(exceptionResult, "");
                    if (!vVar.isDisposed()) {
                        vVar.a((Throwable) exceptionResult.getException());
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryEffectModel categoryEffects;
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    l.d(categoryPageModel2, "");
                    if (!vVar.isDisposed() && (categoryEffects = categoryPageModel2.getCategoryEffects()) != null) {
                        vVar.a(categoryEffects);
                        vVar.a();
                    }
                }
            };
            l.d(dVar, "");
            l.d(str, "");
            l.d(str2, "");
            l.d(r9, "");
            dVar.a(str, str2, d.a.f149143b, new a.c(dVar, str, str2, i2, i3, i4, str3, r9), null);
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<CategoryEffectModel> a(com.ss.android.ugc.aweme.sticker.repository.c.a aVar) {
        com.ss.android.ugc.aweme.sticker.repository.a.d d2;
        t<CategoryEffectModel> a2;
        com.ss.android.ugc.aweme.sticker.repository.c.a aVar2 = aVar;
        l.d(aVar2, "");
        f fVar = this.f135503f.getValue().a().get(aVar2.f135475a);
        if (fVar != null && (d2 = fVar.d()) != null && (a2 = d2.a(aVar2)) != null) {
            return a2;
        }
        t a3 = t.a(new C3527a(this, aVar2));
        l.b(a3, "");
        return a3;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, d dVar, h<? extends j> hVar) {
        l.d(str, "");
        l.d(dVar, "");
        l.d(hVar, "");
        this.f135501a = str;
        this.f135502b = dVar;
        this.f135503f = hVar;
    }
}
