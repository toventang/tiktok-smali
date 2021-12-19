package com.ss.android.ugc.tools.infosticker.view.internal.main1;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import f.a.ab;
import f.a.d.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class InfoStickerCategoryListNewViewModel extends BaseInfoStickerListViewModel<InfoStickerEffect> implements au {

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.b<InfoStickerEffect, Boolean> f149817d;

    /* renamed from: e  reason: collision with root package name */
    private j<InfoStickerEffect, CategoryEffectModel> f149818e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.tools.infosticker.a.a.a f149819f;

    static {
        Covode.recordClassIndex(98643);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<InfoStickerEffect>> h() {
        j<InfoStickerEffect, CategoryEffectModel> c2 = this.f149819f.c();
        this.f149818e = c2;
        ab<List<InfoStickerEffect>> b2 = c2.b();
        if (this.f149817d != a.f149861a) {
            b2.c(new a(this));
        }
        return b2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<InfoStickerEffect>> i() {
        ab<List<InfoStickerEffect>> b2;
        j<InfoStickerEffect, CategoryEffectModel> jVar = this.f149818e;
        if (jVar == null || (b2 = jVar.b()) == null) {
            ab<List<InfoStickerEffect>> a2 = ab.a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
            l.b(a2, "");
            return a2;
        } else if (this.f149817d == a.f149861a) {
            return b2;
        } else {
            b2.c(new b(this));
            return b2;
        }
    }

    static final class a<T, R> implements g<List<? extends InfoStickerEffect>, List<? extends InfoStickerEffect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerCategoryListNewViewModel f149820a;

        static {
            Covode.recordClassIndex(98644);
        }

        a(InfoStickerCategoryListNewViewModel infoStickerCategoryListNewViewModel) {
            this.f149820a = infoStickerCategoryListNewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ List<? extends InfoStickerEffect> apply(List<? extends InfoStickerEffect> list) {
            List<? extends InfoStickerEffect> list2 = list;
            l.d(list2, "");
            h.f.a.b<InfoStickerEffect, Boolean> bVar = this.f149820a.f149817d;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    static final class b<T, R> implements g<List<? extends InfoStickerEffect>, List<? extends InfoStickerEffect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerCategoryListNewViewModel f149821a;

        static {
            Covode.recordClassIndex(98645);
        }

        b(InfoStickerCategoryListNewViewModel infoStickerCategoryListNewViewModel) {
            this.f149821a = infoStickerCategoryListNewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ List<? extends InfoStickerEffect> apply(List<? extends InfoStickerEffect> list) {
            List<? extends InfoStickerEffect> list2 = list;
            l.d(list2, "");
            h.f.a.b<InfoStickerEffect, Boolean> bVar = this.f149821a.f149817d;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }
}
