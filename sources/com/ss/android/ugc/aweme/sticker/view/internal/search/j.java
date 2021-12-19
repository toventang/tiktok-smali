package com.ss.android.ugc.aweme.sticker.view.internal.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.d;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class j implements com.ss.android.ugc.aweme.sticker.view.a.a<com.ss.android.ugc.tools.view.style.j, Fragment> {

    /* renamed from: a  reason: collision with root package name */
    final h f136574a;

    /* renamed from: b  reason: collision with root package name */
    public final t<z> f136575b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final a f136576c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.a<z> f136577d;

    /* renamed from: e  reason: collision with root package name */
    private final h f136578e;

    static {
        Covode.recordClassIndex(89200);
    }

    public final SearchStickerViewContainer a() {
        return (SearchStickerViewContainer) this.f136578e.getValue();
    }

    static final class a extends m implements h.f.a.a<SearchStickerViewContainer> {
        final /* synthetic */ e $activity;
        final /* synthetic */ l.b $requiredDependency;
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.panel.j $stickerViewConfigure;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(89201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, e eVar, l.b bVar, com.ss.android.ugc.aweme.sticker.panel.j jVar2) {
            super(0);
            this.this$0 = jVar;
            this.$activity = eVar;
            this.$requiredDependency = bVar;
            this.$stickerViewConfigure = jVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchStickerViewContainer invoke() {
            return new SearchStickerViewContainer(this.$activity, (View) this.this$0.f136574a.getValue(), this.$requiredDependency, this.this$0.f136576c, 1, 1, this.$stickerViewConfigure, this.this$0.f136577d);
        }
    }

    static final class b extends m implements h.f.a.a<View> {
        final /* synthetic */ e $activity;

        static {
            Covode.recordClassIndex(89202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            MethodCollector.i(11224);
            View inflate = LayoutInflater.from(this.$activity).inflate(R.layout.ahe, (ViewGroup) null);
            MethodCollector.o(11224);
            return inflate;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f136579a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f136580b;

        static {
            Covode.recordClassIndex(89203);
        }

        c(j jVar, h.f.a.a aVar) {
            this.f136579a = jVar;
            this.f136580b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f136579a.f136575b.setValue(z.f158842a);
            this.f136580b.invoke();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.sticker.view.a.a
    public final /* synthetic */ com.ss.android.ugc.tools.view.style.j a(e eVar, EffectCategoryModel effectCategoryModel, TabLayout tabLayout, h.f.a.a aVar) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(effectCategoryModel, "");
        h.f.b.l.d(tabLayout, "");
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.tools.view.style.j a2 = com.ss.android.ugc.tools.b.a(eVar);
        a2.setTextVisibility(false);
        a2.setImage(2131232686);
        a2.setOnClickListener(new c(this, aVar));
        h.f.b.l.d(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.a
    public final d<Fragment> a(int i2, l.b bVar, l.a aVar, RecyclerView.RecycledViewPool recycledViewPool) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(recycledViewPool, "");
        a aVar2 = this.f136576c;
        h.f.a.a<z> aVar3 = this.f136577d;
        SearchStickerViewContainer a2 = a();
        t<z> tVar = this.f136575b;
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(aVar3, "");
        h.f.b.l.d(a2, "");
        h.f.b.l.d(tVar, "");
        l lVar = new l();
        lVar.a(i2, bVar, aVar, recycledViewPool);
        h.f.b.l.d(aVar3, "");
        lVar.o = aVar3;
        h.f.b.l.d(aVar2, "");
        lVar.f136585m = aVar2;
        h.f.b.l.d(a2, "");
        lVar.f136584l = a2;
        h.f.b.l.d(tVar, "");
        lVar.n = tVar;
        return lVar;
    }

    public j(e eVar, a aVar, l.b bVar, com.ss.android.ugc.aweme.sticker.panel.j jVar, h.f.a.a<z> aVar2) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(aVar2, "");
        this.f136576c = aVar;
        this.f136577d = aVar2;
        this.f136574a = i.a(h.m.NONE, new b(eVar));
        this.f136578e = i.a(h.m.NONE, new a(this, eVar, bVar, jVar));
    }
}
