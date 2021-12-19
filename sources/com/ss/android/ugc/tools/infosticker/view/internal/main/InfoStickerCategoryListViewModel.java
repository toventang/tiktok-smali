package com.ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.infosticker.a.a.d;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import f.a.ab;
import f.a.d.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class InfoStickerCategoryListViewModel extends BaseInfoStickerListViewModel<Effect> implements au {

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.b<Effect, Boolean> f149608d;

    /* renamed from: e  reason: collision with root package name */
    private j<Effect, CategoryEffectModel> f149609e;

    /* renamed from: f  reason: collision with root package name */
    private final d f149610f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.tools.h.a.b f149611g;

    static {
        Covode.recordClassIndex(98525);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<Effect>> h() {
        j<Effect, CategoryEffectModel> a2 = this.f149610f.a(this.f149611g);
        this.f149609e = a2;
        ab<List<Effect>> b2 = a2.b();
        if (this.f149608d == e.f149686a) {
            return b2;
        }
        ab<R> c2 = b2.c(new a(this));
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<Effect>> i() {
        ab<List<Effect>> b2;
        j<Effect, CategoryEffectModel> jVar = this.f149609e;
        if (!(jVar == null || (b2 = jVar.b()) == null)) {
            if (this.f149608d == e.f149686a) {
                return b2;
            }
            ab<R> c2 = b2.c(new b(this));
            if (c2 != null) {
                return c2;
            }
        }
        ab<List<Effect>> a2 = ab.a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
        l.b(a2, "");
        return a2;
    }

    static final class a<T, R> implements g<List<? extends Effect>, List<? extends Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerCategoryListViewModel f149612a;

        static {
            Covode.recordClassIndex(98526);
        }

        a(InfoStickerCategoryListViewModel infoStickerCategoryListViewModel) {
            this.f149612a = infoStickerCategoryListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ List<? extends Effect> apply(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            l.d(list2, "");
            h.f.a.b<Effect, Boolean> bVar = this.f149612a.f149608d;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    static final class b<T, R> implements g<List<? extends Effect>, List<? extends Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerCategoryListViewModel f149613a;

        static {
            Covode.recordClassIndex(98527);
        }

        b(InfoStickerCategoryListViewModel infoStickerCategoryListViewModel) {
            this.f149613a = infoStickerCategoryListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ List<? extends Effect> apply(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            l.d(list2, "");
            h.f.a.b<Effect, Boolean> bVar = this.f149613a.f149608d;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    public /* synthetic */ InfoStickerCategoryListViewModel(m mVar, d dVar, com.ss.android.ugc.tools.h.a.b bVar) {
        this(mVar, dVar, bVar, e.f149686a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InfoStickerCategoryListViewModel(m mVar, d dVar, com.ss.android.ugc.tools.h.a.b bVar, h.f.a.b<? super Effect, Boolean> bVar2) {
        super(mVar);
        l.d(mVar, "");
        l.d(dVar, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f149610f = dVar;
        this.f149611g = bVar;
        this.f149608d = bVar2;
    }
}
