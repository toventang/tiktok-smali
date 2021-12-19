package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import h.f.a.r;
import h.f.b.l;
import java.util.ArrayList;

public class InternalBeautyPanel implements au, f {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.beauty.b.c.a f139019a;

    /* renamed from: b  reason: collision with root package name */
    public c f139020b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.beauty.b.c.c f139021c;

    /* renamed from: d  reason: collision with root package name */
    public f f139022d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.beauty.b.c.f f139023e;

    /* renamed from: f  reason: collision with root package name */
    public e f139024f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.beauty.b.c.e f139025g;

    /* renamed from: h  reason: collision with root package name */
    public d f139026h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.beauty.b.c.d f139027i;

    /* renamed from: j  reason: collision with root package name */
    public b f139028j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.beauty.b.c.b f139029k;

    /* renamed from: l  reason: collision with root package name */
    public f.a f139030l;

    /* renamed from: m  reason: collision with root package name */
    public f.b f139031m;
    public a n;
    public final Context o;
    public final ViewGroup p;
    public final m q;
    public final com.ss.android.ugc.aweme.tools.beauty.b.a.e r;
    private ViewGroup s;
    private boolean t;
    private final g u;

    static {
        Covode.recordClassIndex(90933);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
    }

    public final com.ss.android.ugc.aweme.tools.beauty.b.c.c a() {
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar = this.f139021c;
        if (cVar == null) {
            l.a("beautyList");
        }
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f
    public final void b() {
        if (!this.t) {
            this.t = true;
            com.ss.android.ugc.aweme.dependence.beauty.a.c("InternalBeautyPanel show");
            com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar = this.f139021c;
            if (cVar == null) {
                l.a("beautyList");
            }
            cVar.g();
            com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar2 = this.f139021c;
            if (cVar2 == null) {
                l.a("beautyList");
            }
            cVar2.f();
            com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar = this.f139019a;
            if (aVar == null) {
                l.a("contentView");
            }
            aVar.a();
            f.a aVar2 = this.f139030l;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f
    public final void c() {
        if (this.t) {
            this.t = false;
            com.ss.android.ugc.aweme.dependence.beauty.a.c("InternalBeautyPanel hide");
            a aVar = this.n;
            aVar.a(aVar.f139044b);
            com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar2 = this.f139019a;
            if (aVar2 == null) {
                l.a("contentView");
            }
            aVar2.b();
            f.a aVar3 = this.f139030l;
            if (aVar3 != null) {
                aVar3.b();
            }
        }
    }

    static final class c<T> implements u<androidx.c.a<String, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InternalBeautyPanel f139040a;

        static {
            Covode.recordClassIndex(90936);
        }

        c(InternalBeautyPanel internalBeautyPanel) {
            this.f139040a = internalBeautyPanel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(androidx.c.a<String, Integer> aVar) {
            this.f139040a.a().a(aVar);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InternalBeautyPanel f139042a;

        static {
            Covode.recordClassIndex(90938);
        }

        e(InternalBeautyPanel internalBeautyPanel) {
            this.f139042a = internalBeautyPanel;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139042a.c();
        }
    }

    static final class d<T> implements u<ComposerBeauty> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InternalBeautyPanel f139041a;

        static {
            Covode.recordClassIndex(90937);
        }

        d(InternalBeautyPanel internalBeautyPanel) {
            this.f139041a = internalBeautyPanel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            com.ss.android.ugc.aweme.tools.beauty.b.c.c a2 = this.f139041a.a();
            l.b(composerBeauty2, "");
            a2.c(composerBeauty2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f
    public void setContainer(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        this.s = viewGroup;
        com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar = this.f139019a;
        if (aVar == null) {
            l.a("contentView");
        }
        aVar.setContainer(this.s);
    }

    static final class b<T> implements u<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InternalBeautyPanel f139039a;

        static {
            Covode.recordClassIndex(90935);
        }

        b(InternalBeautyPanel internalBeautyPanel) {
            this.f139039a = internalBeautyPanel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Boolean bool) {
            ArrayList arrayList = new ArrayList();
            for (T t : this.f139039a.q.a()) {
                T t2 = t;
                if (l.a((Object) t2.getBeautyCategoryExtra().getParentId(), (Object) "") || l.a((Object) t2.getBeautyCategoryExtra().getParentId(), (Object) "null")) {
                    arrayList.add(t);
                }
            }
            this.f139039a.a().a(arrayList);
            com.ss.android.ugc.aweme.tools.beauty.b.c.f fVar = this.f139039a.f139023e;
            if (fVar == null) {
                l.a("beautyTabView");
            }
            fVar.a(arrayList);
            com.ss.android.ugc.aweme.tools.beauty.b.c.b bVar = this.f139039a.f139029k;
            if (bVar == null) {
                l.a("beautyEnableView");
            }
            bVar.a();
            com.ss.android.ugc.aweme.tools.beauty.b.c.e eVar = this.f139039a.f139025g;
            if (eVar == null) {
                l.a("beautySeekBar");
            }
            eVar.a();
            com.ss.android.ugc.aweme.tools.beauty.b.c.d dVar = this.f139039a.f139027i;
            if (dVar == null) {
                l.a("beautyResetView");
            }
            dVar.a();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public com.ss.android.ugc.aweme.tools.beauty.b.a.e f139032a = new com.ss.android.ugc.aweme.tools.beauty.b.a.e();

        /* renamed from: b  reason: collision with root package name */
        public f.a f139033b;

        /* renamed from: c  reason: collision with root package name */
        public f.b f139034c;

        /* renamed from: d  reason: collision with root package name */
        public com.ss.android.ugc.aweme.tools.beauty.service.b f139035d;

        /* renamed from: e  reason: collision with root package name */
        public final Context f139036e;

        /* renamed from: f  reason: collision with root package name */
        public final ViewGroup f139037f;

        /* renamed from: g  reason: collision with root package name */
        public final m f139038g;

        static {
            Covode.recordClassIndex(90934);
        }

        public a(Context context, ViewGroup viewGroup, m mVar) {
            l.d(context, "");
            l.d(viewGroup, "");
            l.d(mVar, "");
            this.f139036e = context;
            this.f139037f = viewGroup;
            this.f139038g = mVar;
        }
    }

    private InternalBeautyPanel(Context context, ViewGroup viewGroup, m mVar, com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar) {
        this.o = context;
        this.p = viewGroup;
        this.q = mVar;
        this.r = eVar;
        this.s = viewGroup;
        this.f139031m = eVar.n;
        this.n = new a();
        g gVar = new g();
        this.u = gVar;
        com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.a) eVar.f138858b.f138837b.invoke(context, viewGroup, eVar);
        aVar = aVar == null ? new h(context, viewGroup, eVar, (byte) 0) : aVar;
        this.f139019a = aVar;
        gVar.a(com.ss.android.ugc.aweme.tools.beauty.b.c.a.class, aVar);
        com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar2 = this.f139019a;
        if (aVar2 == null) {
            l.a("contentView");
        }
        aVar2.setDismissViewClickListener(new e(this));
        com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar3 = this.f139019a;
        if (aVar3 == null) {
            l.a("contentView");
        }
        aVar3.c();
        this.f139020b = new c(mVar, this.f139031m, this.f139030l, this.n, gVar);
        r<? super Context, ? super View, ? super com.ss.android.ugc.aweme.tools.beauty.b.a.e, ? super c, ? extends com.ss.android.ugc.aweme.tools.beauty.b.c.c> rVar = eVar.f138859c.s;
        com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar4 = this.f139019a;
        if (aVar4 == null) {
            l.a("contentView");
        }
        View root = aVar4.getRoot();
        c cVar = this.f139020b;
        if (cVar == null) {
            l.a("listBusiness");
        }
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar2 = (com.ss.android.ugc.aweme.tools.beauty.b.c.c) rVar.a(context, root, eVar, cVar);
        if (cVar2 == null) {
            com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar5 = this.f139019a;
            if (aVar5 == null) {
                l.a("contentView");
            }
            View root2 = aVar5.getRoot();
            c cVar3 = this.f139020b;
            if (cVar3 == null) {
                l.a("listBusiness");
            }
            l.d(context, "");
            l.d(root2, "");
            l.d(cVar3, "");
            l.d(eVar, "");
            cVar2 = new j(context, root2, eVar, cVar3);
        }
        this.f139021c = cVar2;
        gVar.a(com.ss.android.ugc.aweme.tools.beauty.b.c.c.class, cVar2);
        this.f139024f = new e(mVar, this.f139030l, this.f139031m, gVar);
        r<? super Context, ? super View, ? super com.ss.android.ugc.aweme.tools.beauty.b.a.e, ? super e, ? extends com.ss.android.ugc.aweme.tools.beauty.b.c.e> rVar2 = eVar.f138860d.f138879k;
        com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar6 = this.f139019a;
        if (aVar6 == null) {
            l.a("contentView");
        }
        View root3 = aVar6.getRoot();
        e eVar2 = this.f139024f;
        if (eVar2 == null) {
            l.a("seekBarBusiness");
        }
        com.ss.android.ugc.aweme.tools.beauty.b.c.e eVar3 = (com.ss.android.ugc.aweme.tools.beauty.b.c.e) rVar2.a(context, root3, eVar, eVar2);
        if (eVar3 == null) {
            com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar7 = this.f139019a;
            if (aVar7 == null) {
                l.a("contentView");
            }
            View root4 = aVar7.getRoot();
            e eVar4 = this.f139024f;
            if (eVar4 == null) {
                l.a("seekBarBusiness");
            }
            eVar3 = new l(context, root4, eVar, eVar4);
        }
        this.f139025g = eVar3;
        gVar.a(com.ss.android.ugc.aweme.tools.beauty.b.c.e.class, eVar3);
        f.a aVar8 = this.f139030l;
        f.b bVar = this.f139031m;
        a aVar9 = this.n;
        l.d(mVar, "");
        l.d(aVar9, "");
        l.d(gVar, "");
        l.d(eVar, "");
        this.f139026h = new d(mVar, aVar8, bVar, aVar9, gVar, eVar);
        r<? super Context, ? super View, ? super com.ss.android.ugc.aweme.tools.beauty.b.a.e, ? super d, ? extends com.ss.android.ugc.aweme.tools.beauty.b.c.d> rVar3 = eVar.f138862f.f138864a;
        com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar10 = this.f139019a;
        if (aVar10 == null) {
            l.a("contentView");
        }
        View root5 = aVar10.getRoot();
        d dVar = this.f139026h;
        if (dVar == null) {
            l.a("beautyResetBusiness");
        }
        com.ss.android.ugc.aweme.tools.beauty.b.c.d dVar2 = (com.ss.android.ugc.aweme.tools.beauty.b.c.d) rVar3.a(context, root5, eVar, dVar);
        if (dVar2 == null) {
            com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar11 = this.f139019a;
            if (aVar11 == null) {
                l.a("contentView");
            }
            View root6 = aVar11.getRoot();
            d dVar3 = this.f139026h;
            if (dVar3 == null) {
                l.a("beautyResetBusiness");
            }
            l.d(context, "");
            l.d(root6, "");
            l.d(dVar3, "");
            l.d(eVar, "");
            dVar2 = new k(context, root6, eVar, dVar3);
        }
        this.f139027i = dVar2;
        gVar.a(com.ss.android.ugc.aweme.tools.beauty.b.c.d.class, dVar2);
        a aVar12 = this.n;
        f.b bVar2 = this.f139031m;
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar4 = this.f139021c;
        if (cVar4 == null) {
            l.a("beautyList");
        }
        this.f139022d = new f(mVar, aVar12, bVar2, cVar4);
        r<? super Context, ? super View, ? super com.ss.android.ugc.aweme.tools.beauty.b.a.e, ? super f, ? extends com.ss.android.ugc.aweme.tools.beauty.b.c.f> rVar4 = eVar.f138861e.f138881a;
        com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar13 = this.f139019a;
        if (aVar13 == null) {
            l.a("contentView");
        }
        View root7 = aVar13.getRoot();
        f fVar = this.f139022d;
        if (fVar == null) {
            l.a("tabViewBusiness");
        }
        com.ss.android.ugc.aweme.tools.beauty.b.c.f fVar2 = (com.ss.android.ugc.aweme.tools.beauty.b.c.f) rVar4.a(context, root7, eVar, fVar);
        if (fVar2 == null) {
            com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar14 = this.f139019a;
            if (aVar14 == null) {
                l.a("contentView");
            }
            View root8 = aVar14.getRoot();
            f fVar3 = this.f139022d;
            if (fVar3 == null) {
                l.a("tabViewBusiness");
            }
            fVar2 = new m(context, root8, eVar, fVar3);
        }
        this.f139023e = fVar2;
        gVar.a(com.ss.android.ugc.aweme.tools.beauty.b.c.f.class, fVar2);
        f.a aVar15 = this.f139030l;
        a aVar16 = this.n;
        com.ss.android.ugc.aweme.tools.beauty.b.c.d dVar4 = this.f139027i;
        if (dVar4 == null) {
            l.a("beautyResetView");
        }
        com.ss.android.ugc.aweme.tools.beauty.b.c.f fVar4 = this.f139023e;
        if (fVar4 == null) {
            l.a("beautyTabView");
        }
        this.f139028j = new b(mVar, aVar15, aVar16, dVar4, fVar4);
        r<? super Context, ? super View, ? super com.ss.android.ugc.aweme.tools.beauty.b.a.e, ? super b, ? extends com.ss.android.ugc.aweme.tools.beauty.b.c.b> rVar5 = eVar.f138863g.f138841a;
        com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar17 = this.f139019a;
        if (aVar17 == null) {
            l.a("contentView");
        }
        View root9 = aVar17.getRoot();
        b bVar3 = this.f139028j;
        if (bVar3 == null) {
            l.a("enableViewBusiness");
        }
        com.ss.android.ugc.aweme.tools.beauty.b.c.b bVar4 = (com.ss.android.ugc.aweme.tools.beauty.b.c.b) rVar5.a(context, root9, eVar, bVar3);
        if (bVar4 == null) {
            com.ss.android.ugc.aweme.tools.beauty.b.c.a aVar18 = this.f139019a;
            if (aVar18 == null) {
                l.a("contentView");
            }
            View root10 = aVar18.getRoot();
            b bVar5 = this.f139028j;
            if (bVar5 == null) {
                l.a("enableViewBusiness");
            }
            bVar4 = new i(context, root10, eVar, bVar5);
        }
        this.f139029k = bVar4;
        gVar.a(com.ss.android.ugc.aweme.tools.beauty.b.c.b.class, bVar4);
        if (context instanceof androidx.appcompat.app.d) {
            ((androidx.core.app.d) context).getLifecycle().a(this);
            androidx.appcompat.app.d dVar5 = (androidx.appcompat.app.d) context;
            mVar.b().a(dVar5, new b(this));
            mVar.h().observe(dVar5, new c(this));
            mVar.f().a(dVar5, new d(this));
        }
    }

    public /* synthetic */ InternalBeautyPanel(Context context, ViewGroup viewGroup, m mVar, com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar, byte b2) {
        this(context, viewGroup, mVar, eVar);
    }
}
