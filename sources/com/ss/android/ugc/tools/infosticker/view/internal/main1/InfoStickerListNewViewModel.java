package com.ss.android.ugc.tools.infosticker.view.internal.main1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.h.a.n;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import f.a.ab;
import f.a.d.f;
import f.a.d.g;
import h.f.b.l;
import h.f.b.z;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class InfoStickerListNewViewModel extends BaseInfoStickerListViewModel<InfoStickerEffect> implements com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryModel, InfoStickerEffect>, com.ss.android.ugc.tools.infosticker.view.internal.a {

    /* renamed from: d  reason: collision with root package name */
    public final t<List<p<EffectCategoryModel, List<InfoStickerEffect>>>> f149833d;

    /* renamed from: e  reason: collision with root package name */
    public final t<List<p<EffectCategoryModel, List<InfoStickerEffect>>>> f149834e;

    /* renamed from: f  reason: collision with root package name */
    public final t<List<InfoStickerEffect>> f149835f;

    /* renamed from: g  reason: collision with root package name */
    public final m f149836g;

    /* renamed from: h  reason: collision with root package name */
    public final h.f.a.b<InfoStickerEffect, Boolean> f149837h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f149838i;

    /* renamed from: j  reason: collision with root package name */
    private n f149839j;

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.android.ugc.tools.infosticker.a.a.a f149840k;

    static {
        Covode.recordClassIndex(98650);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.a
    public final LiveData<List<p<EffectCategoryModel, List<InfoStickerEffect>>>> a() {
        return this.f149833d;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<InfoStickerEffect>> i() {
        throw new NoSuchMethodException("Category sticker list does not support load more action.");
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<InfoStickerEffect>> h() {
        if (this.f149838i) {
            z.a aVar = new z.a();
            aVar.element = false;
            this.f149533a.observe(this.f149836g, new a(this, aVar));
        }
        com.ss.android.ugc.tools.infosticker.a.a.a aVar2 = this.f149840k;
        if (this.f149839j != null) {
            ab<R> b2 = aVar2.b().b(new b(this)).d(new c(this)).b();
            l.b(b2, "");
            return b2;
        }
        throw new IllegalArgumentException("ListMeta not fetched yet".toString());
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void a(com.ss.android.ugc.tools.h.a.m mVar) {
        l.d(mVar, "");
        if (mVar instanceof n) {
            this.f149839j = (n) mVar;
            f();
        }
    }

    static final class a<T> implements u<List<? extends InfoStickerEffect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListNewViewModel f149841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f149842b;

        static {
            Covode.recordClassIndex(98651);
        }

        a(InfoStickerListNewViewModel infoStickerListNewViewModel, z.a aVar) {
            this.f149841a = infoStickerListNewViewModel;
            this.f149842b = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(List<? extends InfoStickerEffect> list) {
            List<? extends InfoStickerEffect> list2 = list;
            if (!this.f149842b.element) {
                l.b(list2, "");
                if (!list2.isEmpty()) {
                    this.f149841a.f149835f.observe(this.f149841a.f149836g, new u<List<? extends InfoStickerEffect>>(this) {
                        /* class com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerListNewViewModel.a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f149843a;

                        static {
                            Covode.recordClassIndex(98652);
                        }

                        {
                            this.f149843a = r1;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // androidx.lifecycle.u
                        public final /* synthetic */ void onChanged(List<? extends InfoStickerEffect> list) {
                            final List<? extends InfoStickerEffect> list2 = list;
                            this.f149843a.f149841a.f149834e.observe(this.f149843a.f149841a.f149836g, new u<List<? extends p<? extends EffectCategoryModel, ? extends List<? extends InfoStickerEffect>>>>(this) {
                                /* class com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerListNewViewModel.a.AnonymousClass1.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ AnonymousClass1 f149844a;

                                static {
                                    Covode.recordClassIndex(98653);
                                }

                                {
                                    this.f149844a = r1;
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // androidx.lifecycle.u
                                public final /* synthetic */ void onChanged(List<? extends p<? extends EffectCategoryModel, ? extends List<? extends InfoStickerEffect>>> list) {
                                    Object obj;
                                    List<? extends p<? extends EffectCategoryModel, ? extends List<? extends InfoStickerEffect>>> list2 = list;
                                    InfoStickerListNewViewModel infoStickerListNewViewModel = this.f149844a.f149843a.f149841a;
                                    List list3 = list2;
                                    l.b(list3, "");
                                    int size = ((List) ((p) list2.get(0)).getSecond()).size();
                                    l.d(list3, "");
                                    List g2 = h.a.n.g((Collection) list3);
                                    List<DATA> value = infoStickerListNewViewModel.f149533a.getValue();
                                    if (value == null || (obj = h.a.n.c((Iterable) value, size)) == null) {
                                        obj = h.a.z.INSTANCE;
                                    }
                                    g2.addAll(obj);
                                    infoStickerListNewViewModel.f149533a.setValue(h.a.n.k(g2));
                                    l.b(list2, "");
                                    List g3 = h.a.n.g((Collection) list2);
                                    g3.set(0, new p(((p) g3.get(0)).getFirst(), list2));
                                    this.f149844a.f149843a.f149841a.f149833d.postValue(h.a.n.k(g3));
                                }
                            });
                        }
                    });
                    this.f149842b.element = true;
                }
            }
        }
    }

    static final class c<T, R> implements g<com.ss.android.ugc.tools.h.a.a<EffectCategoryModel, InfoStickerEffect>, List<? extends InfoStickerEffect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListNewViewModel f149847a;

        static {
            Covode.recordClassIndex(98655);
        }

        c(InfoStickerListNewViewModel infoStickerListNewViewModel) {
            this.f149847a = infoStickerListNewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ List<? extends InfoStickerEffect> apply(com.ss.android.ugc.tools.h.a.a<EffectCategoryModel, InfoStickerEffect> aVar) {
            com.ss.android.ugc.tools.h.a.a<EffectCategoryModel, InfoStickerEffect> aVar2 = aVar;
            l.d(aVar2, "");
            List<V> list = aVar2.f149201a;
            if (this.f149847a.f149837h == a.f149861a) {
                return list;
            }
            h.f.a.b<InfoStickerEffect, Boolean> bVar = this.f149847a.f149837h;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    static final class b<T> implements f<com.ss.android.ugc.tools.h.a.a<EffectCategoryModel, InfoStickerEffect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListNewViewModel f149846a;

        static {
            Covode.recordClassIndex(98654);
        }

        b(InfoStickerListNewViewModel infoStickerListNewViewModel) {
            this.f149846a = infoStickerListNewViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.tools.h.a.a<EffectCategoryModel, InfoStickerEffect> aVar) {
            List<p<K, List<V>>> list = aVar.f149202b;
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
            for (T t : list) {
                Object component1 = t.component1();
                List list2 = (List) t.component2();
                if (this.f149846a.f149837h != a.f149861a) {
                    h.f.a.b<InfoStickerEffect, Boolean> bVar = this.f149846a.f149837h;
                    ArrayList arrayList2 = new ArrayList();
                    for (T t2 : list2) {
                        if (bVar.invoke(t2).booleanValue()) {
                            arrayList2.add(t2);
                        }
                    }
                    list2 = arrayList2;
                }
                arrayList.add(v.a(component1, list2));
            }
            this.f149846a.f149833d.postValue(arrayList);
            if (this.f149846a.f149838i) {
                this.f149846a.f149834e.postValue(arrayList);
            }
        }
    }
}
