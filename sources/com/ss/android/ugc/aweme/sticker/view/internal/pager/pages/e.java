package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.original.OriginalStickerViewModel;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.a.n;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.List;
import java.util.Map;

public class e extends g {
    public static final a p = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    public int f136445l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.panel.c.e f136446m;
    public Effect n;
    public OriginalStickerViewModel o;
    private final h w = i.a((h.f.a.a) new d(this));
    private final h x = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(89106);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89107);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<LiveData<n>> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(89110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveData<n> invoke() {
            return this.this$0.g().f136202e;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public final void k() {
        p().a("mCategoryKey");
    }

    static final class b extends m implements h.f.a.a<EffectCategoryModel> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(89108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EffectCategoryModel invoke() {
            return h.a.n.b((List) com.ss.android.ugc.aweme.sticker.repository.b.a(this.this$0.d().c().j()), this.this$0.f136430e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g
    public final com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> n() {
        o d2 = d();
        com.ss.android.ugc.aweme.sticker.d.d e2 = e();
        g f2 = f();
        com.ss.android.ugc.aweme.sticker.panel.c.e eVar = this.f136446m;
        if (eVar == null) {
            l.a("requestDesignerEffect");
        }
        Effect effect = this.n;
        if (effect == null) {
            l.a("currentEffect");
        }
        OriginalStickerViewModel originalStickerViewModel = new OriginalStickerViewModel(this, d2, e2, f2, eVar, effect);
        this.o = originalStickerViewModel;
        return originalStickerViewModel;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g
    public final com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b o() {
        return new com.ss.android.ugc.aweme.sticker.view.internal.pager.a.d(d(), f(), p(), i().f136210f, g().f136201d, g().f136199b);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public final com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b(View view) {
        l.d(view, "");
        return super.b(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g
    public final void a(int i2) {
        if (i2 != this.f136445l) {
            this.f136445l = i2;
            com.ss.android.ugc.aweme.sticker.panel.c.e eVar = this.f136446m;
            if (eVar == null) {
                l.a("requestDesignerEffect");
            }
            eVar.a(com.ss.android.ugc.aweme.sticker.panel.c.b.P, com.ss.android.ugc.aweme.sticker.panel.c.b.O, new c(this));
        }
    }

    static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.panel.c.d, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(89109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.sticker.panel.c.d dVar) {
            com.ss.android.ugc.aweme.sticker.panel.c.d dVar2 = dVar;
            l.d(dVar2, "");
            com.ss.android.ugc.aweme.sticker.panel.c.b.O = dVar2.b();
            List<String> a2 = dVar2.a();
            if (dVar2.a().size() > 10) {
                a2 = a2.subList(0, 10);
            }
            this.this$0.f136436k += a2.size();
            OriginalStickerViewModel originalStickerViewModel = this.this$0.o;
            if (originalStickerViewModel != null) {
                List<String> a3 = dVar2.a();
                l.d(a3, "");
                originalStickerViewModel.o.a(a3, (Map<String, String>) null, new OriginalStickerViewModel.b(originalStickerViewModel));
            }
            return z.f158842a;
        }
    }

    public final void a(l.b bVar, l.a aVar, RecyclerView.RecycledViewPool recycledViewPool, com.ss.android.ugc.aweme.sticker.panel.c.e eVar, Effect effect) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(effect, "");
        super.a(0, bVar, aVar, recycledViewPool);
        this.f136446m = eVar;
        this.n = effect;
        this.t = true;
    }
}
