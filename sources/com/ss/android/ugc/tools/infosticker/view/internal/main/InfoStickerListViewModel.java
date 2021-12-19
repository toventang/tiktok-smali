package com.ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.h.a.n;
import com.ss.android.ugc.tools.infosticker.a.a.d;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import f.a.ab;
import f.a.d.f;
import f.a.d.g;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.List;

public final class InfoStickerListViewModel extends BaseInfoStickerListViewModel<Effect> implements com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryResponse, Effect>, com.ss.android.ugc.tools.infosticker.view.internal.a {

    /* renamed from: d  reason: collision with root package name */
    public final t<List<p<EffectCategoryResponse, List<Effect>>>> f149646d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.b<Effect, Boolean> f149647e;

    /* renamed from: f  reason: collision with root package name */
    public final h.f.a.b<EffectCategoryResponse, Boolean> f149648f;

    /* renamed from: g  reason: collision with root package name */
    private n f149649g;

    /* renamed from: h  reason: collision with root package name */
    private final d f149650h;

    static {
        Covode.recordClassIndex(98541);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.a
    public final LiveData<List<p<EffectCategoryResponse, List<Effect>>>> a() {
        return this.f149646d;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<Effect>> i() {
        throw new NoSuchMethodException("Category sticker list does not support load more action.");
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<Effect>> h() {
        d dVar = this.f149650h;
        n nVar = this.f149649g;
        if (nVar != null) {
            ab<List<Effect>> b2 = dVar.a(nVar).b((f) new a(this)).d(new b(this)).b();
            l.b(b2, "");
            return b2;
        }
        throw new IllegalArgumentException("ListMeta not fetched yet".toString());
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void a(com.ss.android.ugc.tools.h.a.m mVar) {
        l.d(mVar, "");
        if (mVar instanceof n) {
            this.f149649g = (n) mVar;
            f();
        }
    }

    static final class b<T, R> implements g<com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect>, List<? extends Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListViewModel f149652a;

        static {
            Covode.recordClassIndex(98543);
        }

        b(InfoStickerListViewModel infoStickerListViewModel) {
            this.f149652a = infoStickerListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ List<? extends Effect> apply(com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect> aVar) {
            com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect> aVar2 = aVar;
            l.d(aVar2, "");
            List<V> list = aVar2.f149201a;
            if (this.f149652a.f149647e == e.f149686a) {
                return list;
            }
            h.f.a.b<Effect, Boolean> bVar = this.f149652a.f149647e;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    static final class a<T> implements f<com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListViewModel f149651a;

        static {
            Covode.recordClassIndex(98542);
        }

        a(InfoStickerListViewModel infoStickerListViewModel) {
            this.f149651a = infoStickerListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: h.f.a.b<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect> aVar) {
            t<List<p<EffectCategoryResponse, List<Effect>>>> tVar = this.f149651a.f149646d;
            List<p<K, List<V>>> list = aVar.f149202b;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (((Boolean) this.f149651a.f149648f.invoke(t.getFirst())).booleanValue()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
            for (T t2 : arrayList2) {
                Object component1 = t2.component1();
                List list2 = (List) t2.component2();
                if (this.f149651a.f149647e != e.f149686a) {
                    h.f.a.b<Effect, Boolean> bVar = this.f149651a.f149647e;
                    ArrayList arrayList4 = new ArrayList();
                    for (T t3 : list2) {
                        if (bVar.invoke(t3).booleanValue()) {
                            arrayList4.add(t3);
                        }
                    }
                    list2 = arrayList4;
                }
                arrayList3.add(v.a(component1, list2));
            }
            tVar.postValue(arrayList3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoStickerListViewModel(m mVar, d dVar, h.f.a.b<? super Effect, Boolean> bVar, h.f.a.b<? super EffectCategoryResponse, Boolean> bVar2) {
        super(mVar);
        l.d(mVar, "");
        l.d(dVar, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f149650h = dVar;
        this.f149647e = bVar;
        this.f149648f = bVar2;
    }
}
