package com.ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.h.a.n;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import f.a.ab;
import f.a.d.g;
import h.a.z;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class InfoStickerListRecommendViewModel extends HumbleViewModel implements com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryResponse, Effect>, com.ss.android.ugc.tools.infosticker.view.internal.e<Effect>, com.ss.android.ugc.tools.infosticker.view.internal.e {

    /* renamed from: a  reason: collision with root package name */
    public final t<List<Effect>> f149625a;

    /* renamed from: b  reason: collision with root package name */
    public final t<List<p<EffectCategoryResponse, List<Effect>>>> f149626b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<com.ss.android.ugc.tools.view.widget.b.a> f149627c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<com.ss.android.ugc.tools.view.widget.b.a> f149628d;

    /* renamed from: e  reason: collision with root package name */
    public t<ab<List<Effect>>> f149629e;

    /* renamed from: f  reason: collision with root package name */
    final m f149630f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.tools.infosticker.a.a.f f149631g;

    /* renamed from: h  reason: collision with root package name */
    public final h.f.a.b<Effect, Boolean> f149632h;

    /* renamed from: i  reason: collision with root package name */
    public final h.f.a.b<EffectCategoryResponse, Boolean> f149633i;

    /* renamed from: j  reason: collision with root package name */
    private f.a.b.a f149634j;

    /* renamed from: k  reason: collision with root package name */
    private n f149635k;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.tools.infosticker.a.a.d f149636l;

    static {
        Covode.recordClassIndex(98532);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<Object> e() {
        return null;
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.a
    public final LiveData<List<p<EffectCategoryResponse, List<Effect>>>> a() {
        return this.f149626b;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<List<Effect>> b() {
        return this.f149625a;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<com.ss.android.ugc.tools.view.widget.b.a> c() {
        return this.f149627c;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<com.ss.android.ugc.tools.view.widget.b.a> d() {
        return this.f149628d;
    }

    public final f.a.b.a h() {
        f.a.b.a aVar = this.f149634j;
        if (aVar != null) {
            return aVar;
        }
        f.a.b.a aVar2 = new f.a.b.a();
        this.f149634j = aVar2;
        return aVar2;
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        f.a.b.a aVar = this.f149634j;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f149634j = null;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void g() {
        if (!isDestroyed()) {
            com.ss.android.ugc.tools.view.widget.b.a value = this.f149627c.getValue();
            if (value == null || value == com.ss.android.ugc.tools.view.widget.b.a.NONE) {
                List<Effect> value2 = this.f149625a.getValue();
                if (value2 == null || !value2.isEmpty()) {
                    com.ss.android.ugc.tools.view.widget.b.a value3 = this.f149628d.getValue();
                    if (value3 == null || !(value3 == com.ss.android.ugc.tools.view.widget.b.a.EMPTY || value3 == com.ss.android.ugc.tools.view.widget.b.a.LOADING)) {
                        this.f149628d.setValue(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
                        throw new NoSuchMethodException("Category sticker list does not support load more action.");
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void f() {
        if (!isDestroyed()) {
            com.ss.android.ugc.tools.view.widget.b.a value = this.f149627c.getValue();
            if (value == null || !(value == com.ss.android.ugc.tools.view.widget.b.a.EMPTY || value == com.ss.android.ugc.tools.view.widget.b.a.LOADING)) {
                List<Effect> value2 = this.f149625a.getValue();
                if (value2 != null) {
                    l.b(value2, "");
                    if (true ^ value2.isEmpty()) {
                        return;
                    }
                }
                this.f149627c.setValue(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
                com.ss.android.ugc.tools.infosticker.a.a.d dVar = this.f149636l;
                n nVar = this.f149635k;
                if (nVar != null) {
                    ab b2 = dVar.a(nVar).b((f.a.d.f) new c(this)).d(new d(this)).b();
                    l.b(b2, "");
                    h().a(b2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.b.a.a()).a(new a(this), new b(this)));
                    return;
                }
                throw new IllegalArgumentException("ListMeta not fetched yet".toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListRecommendViewModel f149638a;

        static {
            Covode.recordClassIndex(98534);
        }

        b(InfoStickerListRecommendViewModel infoStickerListRecommendViewModel) {
            this.f149638a = infoStickerListRecommendViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f149638a.f149627c.setValue(com.ss.android.ugc.tools.view.widget.b.a.ERROR);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f.a.d.f<List<? extends Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListRecommendViewModel f149637a;

        static {
            Covode.recordClassIndex(98533);
        }

        a(InfoStickerListRecommendViewModel infoStickerListRecommendViewModel) {
            this.f149637a = infoStickerListRecommendViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            InfoStickerListRecommendViewModel infoStickerListRecommendViewModel = this.f149637a;
            l.b(list2, "");
            infoStickerListRecommendViewModel.f149629e.observe(infoStickerListRecommendViewModel.f149630f, new f(infoStickerListRecommendViewModel, list2));
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void a(com.ss.android.ugc.tools.h.a.m mVar) {
        l.d(mVar, "");
        if (mVar instanceof n) {
            this.f149635k = (n) mVar;
            f();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T, R> implements g<com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect>, List<? extends Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListRecommendViewModel f149640a;

        static {
            Covode.recordClassIndex(98536);
        }

        d(InfoStickerListRecommendViewModel infoStickerListRecommendViewModel) {
            this.f149640a = infoStickerListRecommendViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ List<? extends Effect> apply(com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect> aVar) {
            com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect> aVar2 = aVar;
            l.d(aVar2, "");
            List<V> list = aVar2.f149201a;
            if (this.f149640a.f149632h == e.f149686a) {
                return list;
            }
            h.f.a.b<Effect, Boolean> bVar = this.f149640a.f149632h;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    public static final class e<T, R> implements g<p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>, List<? extends Effect>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f149641a = new e();

        static {
            Covode.recordClassIndex(98537);
        }

        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ List<? extends Effect> apply(p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
            p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar2 = pVar;
            l.d(pVar2, "");
            List<T> list = (List) pVar2.component1();
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
            for (T t : list) {
                arrayList.add(new Effect(t.getLoki_effect()));
            }
            return arrayList;
        }
    }

    static final class f<T> implements u<ab<List<? extends Effect>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListRecommendViewModel f149642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f149643b;

        static {
            Covode.recordClassIndex(98538);
        }

        f(InfoStickerListRecommendViewModel infoStickerListRecommendViewModel, List list) {
            this.f149642a = infoStickerListRecommendViewModel;
            this.f149643b = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(ab<List<? extends Effect>> abVar) {
            ab<List<? extends Effect>> abVar2 = abVar;
            if (abVar2 == null) {
                this.f149642a.a(this.f149643b);
                return;
            }
            ab<List<? extends Effect>> a2 = abVar2.a(f.a.a.b.a.a());
            if (a2 != null) {
                this.f149642a.h().a(a2.a(new f.a.d.f<List<? extends Effect>>(this) {
                    /* class com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f149644a;

                    static {
                        Covode.recordClassIndex(98539);
                    }

                    {
                        this.f149644a = r1;
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(List<? extends Effect> list) {
                        List<? extends Effect> list2 = list;
                        if (list2 == null || list2.isEmpty()) {
                            this.f149644a.f149642a.a(this.f149644a.f149643b);
                            return;
                        }
                        InfoStickerListRecommendViewModel infoStickerListRecommendViewModel = this.f149644a.f149642a;
                        List list3 = this.f149644a.f149643b;
                        List<p<EffectCategoryResponse, List<Effect>>> value = infoStickerListRecommendViewModel.f149626b.getValue();
                        if (value != null && !value.isEmpty()) {
                            List g2 = h.a.n.g((Collection) list2);
                            g2.addAll(h.a.n.c((Iterable) list3, value.get(0).getSecond().size()));
                            infoStickerListRecommendViewModel.a(h.a.n.k(g2));
                            List g3 = h.a.n.g((Collection) value);
                            g3.set(0, new p(((p) g3.get(0)).getFirst(), list2));
                            infoStickerListRecommendViewModel.f149626b.postValue(h.a.n.k(g3));
                        }
                    }
                }, new f.a.d.f<Throwable>(this) {
                    /* class com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel.f.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f149645a;

                    static {
                        Covode.recordClassIndex(98540);
                    }

                    {
                        this.f149645a = r1;
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Throwable th) {
                        this.f149645a.f149642a.a(this.f149645a.f149643b);
                    }
                }));
            }
        }
    }

    public final void a(List<? extends Effect> list) {
        com.ss.android.ugc.tools.view.widget.b.a aVar;
        l.d(list, "");
        this.f149625a.setValue(list);
        t<com.ss.android.ugc.tools.view.widget.b.a> tVar = this.f149627c;
        if (list.isEmpty()) {
            aVar = com.ss.android.ugc.tools.view.widget.b.a.EMPTY;
        } else {
            aVar = com.ss.android.ugc.tools.view.widget.b.a.NONE;
        }
        tVar.setValue(aVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f<com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListRecommendViewModel f149639a;

        static {
            Covode.recordClassIndex(98535);
        }

        c(InfoStickerListRecommendViewModel infoStickerListRecommendViewModel) {
            this.f149639a = infoStickerListRecommendViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: h.f.a.b<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect> aVar) {
            List<p<K, List<V>>> list = aVar.f149202b;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (((Boolean) this.f149639a.f149633i.invoke(t.getFirst())).booleanValue()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
            for (T t2 : arrayList2) {
                Object component1 = t2.component1();
                List list2 = (List) t2.component2();
                if (this.f149639a.f149632h != e.f149686a) {
                    h.f.a.b<Effect, Boolean> bVar = this.f149639a.f149632h;
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
            this.f149639a.f149626b.postValue(arrayList3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoStickerListRecommendViewModel(m mVar, com.ss.android.ugc.tools.infosticker.a.a.d dVar, com.ss.android.ugc.tools.infosticker.a.a.f fVar, h.f.a.b<? super Effect, Boolean> bVar, h.f.a.b<? super EffectCategoryResponse, Boolean> bVar2) {
        super(mVar);
        l.d(mVar, "");
        l.d(dVar, "");
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f149630f = mVar;
        this.f149636l = dVar;
        this.f149631g = fVar;
        this.f149632h = bVar;
        this.f149633i = bVar2;
        t<List<Effect>> tVar = new t<>();
        this.f149625a = tVar;
        t<com.ss.android.ugc.tools.view.widget.b.a> tVar2 = new t<>();
        this.f149628d = tVar2;
        this.f149629e = new t<>();
        tVar.setValue(z.INSTANCE);
        tVar2.setValue(com.ss.android.ugc.tools.view.widget.b.a.NONE);
    }
}
