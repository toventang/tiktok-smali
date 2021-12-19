package com.ss.android.ugc.aweme.ecommerce.pdp.vh;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.o;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.ecommerce.util.g;
import com.ss.android.ugc.aweme.ecommerce.util.n;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.h;
import h.p;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ShopProfileVH extends AbsFullSpanVH<o> implements au {

    /* renamed from: f  reason: collision with root package name */
    private final TuxTextView f86738f = ((TuxTextView) this.itemView.findViewById(R.id.e34));

    /* renamed from: g  reason: collision with root package name */
    private final TuxTextView f86739g = ((TuxTextView) this.itemView.findViewById(R.id.d9y));

    /* renamed from: j  reason: collision with root package name */
    private final SmartImageView f86740j = ((SmartImageView) this.itemView.findViewById(R.id.e33));

    /* renamed from: k  reason: collision with root package name */
    private final TuxButton f86741k = ((TuxButton) this.itemView.findViewById(R.id.fkg));

    /* renamed from: l  reason: collision with root package name */
    private final h f86742l;

    static {
        Covode.recordClassIndex(54332);
    }

    public final PdpViewModel n() {
        return (PdpViewModel) this.f86742l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void g() {
        a(new i(aI_(), (byte) 0));
        super.g();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54333);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.ShopProfileVH.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_vh_ShopProfileVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86743a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShopProfileVH f86744b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f86745c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f86746d;

        static {
            Covode.recordClassIndex(54334);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                String uri = j.a(this.f86745c.f86484e, ag.c(new p("enter_from", this.f86744b.n().m()), new p("trackParams", dg.a().b(this.f86746d)))).build().toString();
                l.b(uri, "");
                k kVar = this.f86744b.n().s;
                if (kVar != null) {
                    kVar.f86392k = true;
                }
                SmartRouter.buildRoute(view.getContext(), uri).open();
                k kVar2 = this.f86744b.n().s;
                if (kVar2 != null) {
                    kVar2.a("showcase_detail", (com.ss.android.ugc.aweme.ecommerce.pdp.d.h) null);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ShopProfileVH shopProfileVH, o oVar, Map map) {
            super(700);
            this.f86744b = shopProfileVH;
            this.f86745c = oVar;
            this.f86746d = map;
        }
    }

    public static final class c extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86747a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShopProfileVH f86748b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f86749c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f86750d;

        static {
            Covode.recordClassIndex(54335);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                String uri = j.a(this.f86749c.f86484e, ag.c(new p("enter_from", this.f86748b.n().m()), new p("trackParams", dg.a().b(this.f86750d)))).build().toString();
                l.b(uri, "");
                k kVar = this.f86748b.n().s;
                if (kVar != null) {
                    kVar.f86392k = true;
                }
                SmartRouter.buildRoute(view.getContext(), uri).open();
                k kVar2 = this.f86748b.n().s;
                if (kVar2 != null) {
                    kVar2.a("showcase_detail", (com.ss.android.ugc.aweme.ecommerce.pdp.d.h) null);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ShopProfileVH shopProfileVH, o oVar, Map map) {
            super(700);
            this.f86748b = shopProfileVH;
            this.f86749c = oVar;
            this.f86750d = map;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShopProfileVH(android.view.ViewGroup r5) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.ShopProfileVH.<init>(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(Object obj) {
        long j2;
        String string;
        Object obj2;
        HashMap<String, Object> trackParams;
        HashMap<String, Object> trackParams2;
        o oVar = (o) obj;
        l.d(oVar, "");
        v a2 = g.a((Object) oVar.f86480a).a("ShopProfileVH");
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        l.b(context, "");
        a2.w = g.a(context);
        a2.E = this.f86740j;
        a2.c();
        TuxTextView tuxTextView = this.f86738f;
        l.b(tuxTextView, "");
        tuxTextView.setText(oVar.f86481b);
        Long l2 = oVar.f86482c;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        int i2 = 0;
        if (j2 > 1) {
            View view2 = this.itemView;
            l.b(view2, "");
            Context context2 = view2.getContext();
            l.b(context2, "");
            string = context2.getResources().getString(R.string.bgj, Long.valueOf(j2));
        } else {
            View view3 = this.itemView;
            l.b(view3, "");
            Context context3 = view3.getContext();
            l.b(context3, "");
            string = context3.getResources().getString(R.string.bft, Long.valueOf(j2));
        }
        l.b(string, "");
        if (h.m.p.a((CharSequence) string, String.valueOf(j2), 0, false, 6) != -1) {
            TuxTextView tuxTextView2 = this.f86739g;
            l.b(tuxTextView2, "");
            tuxTextView2.setText(n.a(string, String.valueOf(j2)));
        } else {
            TuxTextView tuxTextView3 = this.f86739g;
            l.b(tuxTextView3, "");
            tuxTextView3.setText(string);
        }
        TuxTextView tuxTextView4 = this.f86739g;
        l.b(tuxTextView4, "");
        if (j2 == 0) {
            i2 = 8;
        }
        tuxTextView4.setVisibility(i2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam = n().f86300a;
        if (!(pdpEnterParam == null || (trackParams2 = pdpEnterParam.getTrackParams()) == null)) {
            linkedHashMap.putAll(trackParams2);
        }
        linkedHashMap.remove("page_name");
        linkedHashMap.put("previous_page", "product_detail");
        IPdpStarter.PdpEnterParam pdpEnterParam2 = n().f86300a;
        if (pdpEnterParam2 == null || (trackParams = pdpEnterParam2.getTrackParams()) == null || (obj2 = trackParams.get("source_page_type")) == null) {
            obj2 = "unknown";
        }
        l.b(obj2, "");
        linkedHashMap.put("show_window_source", obj2);
        TuxButton tuxButton = this.f86741k;
        l.b(tuxButton, "");
        tuxButton.setOnClickListener(new b(this, oVar, linkedHashMap));
        View view4 = this.itemView;
        l.b(view4, "");
        view4.setOnClickListener(new c(this, oVar, linkedHashMap));
    }
}
