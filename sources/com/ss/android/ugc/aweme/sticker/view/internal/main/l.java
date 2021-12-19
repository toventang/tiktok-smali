package com.ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.sticker.view.a.d;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.view.style.j;
import h.f.b.m;
import h.z;

public final class l extends a<j> {
    static {
        Covode.recordClassIndex(89029);
    }

    public static final class b implements IIsTagNeedUpdatedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f136314a;

        static {
            Covode.recordClassIndex(89031);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedNotUpdate() {
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedUpdate() {
            this.f136314a.a(true);
        }

        b(j jVar) {
            this.f136314a = jVar;
        }
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ EffectCategoryModel $category;
        final /* synthetic */ h.f.a.m $clickTab;
        final /* synthetic */ int $index;

        static {
            Covode.recordClassIndex(89030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h.f.a.m mVar, EffectCategoryModel effectCategoryModel, int i2) {
            super(0);
            this.$clickTab = mVar;
            this.$category = effectCategoryModel;
            this.$index = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$clickTab.invoke(this.$category, Integer.valueOf(this.$index));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.main.a
    public final View a(e eVar, EffectCategoryModel effectCategoryModel, int i2, h.f.a.m<? super EffectCategoryModel, ? super Integer, z> mVar) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(effectCategoryModel, "");
        h.f.b.l.d(mVar, "");
        TabView a2 = this.f136279k.a(effectCategoryModel.getKey()).a(eVar, effectCategoryModel, this.f136272d, new a(mVar, effectCategoryModel, i2));
        this.f136277i.f136209e.a(effectCategoryModel, new b(a2));
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(TabLayout tabLayout, e eVar, androidx.lifecycle.m mVar, com.ss.android.ugc.aweme.sticker.panel.j jVar, d dVar, l.b bVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a aVar, com.ss.android.ugc.aweme.sticker.view.a.b<j, ?> bVar2) {
        super(tabLayout, eVar, mVar, jVar, dVar, bVar, aVar, bVar2);
        h.f.b.l.d(tabLayout, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(bVar2, "");
    }
}
