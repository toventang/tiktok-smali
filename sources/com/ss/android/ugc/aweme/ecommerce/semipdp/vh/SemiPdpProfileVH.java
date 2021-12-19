package com.ss.android.ugc.aweme.ecommerce.semipdp.vh;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.o;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.semipdp.j;
import com.ss.android.ugc.aweme.ecommerce.util.g;
import com.ss.android.ugc.aweme.ecommerce.util.n;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.k.c;
import h.m.p;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class SemiPdpProfileVH extends JediSimpleViewHolder<o> implements au {

    /* renamed from: f  reason: collision with root package name */
    public final View f87342f;

    /* renamed from: g  reason: collision with root package name */
    private final h f87343g;

    static {
        Covode.recordClassIndex(54823);
    }

    public final SemiPdpViewModel m() {
        return (SemiPdpViewModel) this.f87343g.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        a.C2089a.a(this.f87342f, true);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<SemiPdpViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ c $viewModelClass;
        final /* synthetic */ c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, c cVar, c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpProfileVH.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_semipdp_vh_SemiPdpProfileVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemiPdpProfileVH(View view) {
        super(view);
        l.d(view, "");
        this.f87342f = view;
        c a2 = h.f.b.ab.a(SemiPdpViewModel.class);
        this.f87343g = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87344a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f87345b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SemiPdpProfileVH f87346c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o f87347d;

        static {
            Covode.recordClassIndex(54825);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            if (view != null) {
                j a2 = this.f87346c.m().a();
                if (a2 != null) {
                    if (this.f87346c.m().f87249d) {
                        str = "full_screen";
                    } else {
                        str = "half_screen";
                    }
                    HashMap<String, Object> h2 = this.f87346c.m().h();
                    l.d("showcase_detail", "");
                    l.d(str, "");
                    l.d(h2, "");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("module_name", "showcase_detail");
                    linkedHashMap.put("page_show_type", str);
                    linkedHashMap.putAll(h2);
                    a2.b("tiktokec_module_click", linkedHashMap);
                }
                SemiPdpViewModel m2 = this.f87346c.m();
                Context context = this.f87345b.getContext();
                l.b(context, "");
                m2.a(context, this.f87347d.f86484e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view, SemiPdpProfileVH semiPdpProfileVH, o oVar) {
            super(700);
            this.f87345b = view;
            this.f87346c = semiPdpProfileVH;
            this.f87347d = oVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(o oVar) {
        long j2;
        CharSequence string;
        o oVar2 = oVar;
        l.d(oVar2, "");
        View view = this.f87342f;
        v a2 = g.a((Object) oVar2.f86480a).a("ShopProfileVH");
        View view2 = this.itemView;
        l.b(view2, "");
        Context context = view2.getContext();
        l.b(context, "");
        a2.w = com.ss.android.ugc.aweme.ecommerce.pdp.vh.g.a(context);
        a2.E = (SmartImageView) view.findViewById(R.id.e33);
        a2.c();
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.e34);
        l.b(tuxTextView, "");
        tuxTextView.setText(oVar2.f86481b);
        Long l2 = oVar2.f86482c;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        int i2 = 0;
        if (j2 > 1) {
            View view3 = this.itemView;
            l.b(view3, "");
            Context context2 = view3.getContext();
            l.b(context2, "");
            string = context2.getResources().getString(R.string.bgj, Long.valueOf(j2));
        } else {
            View view4 = this.itemView;
            l.b(view4, "");
            Context context3 = view4.getContext();
            l.b(context3, "");
            string = context3.getResources().getString(R.string.bft, Long.valueOf(j2));
        }
        l.b(string, "");
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.d9y);
        l.b(tuxTextView2, "");
        if (p.a(string, String.valueOf(j2), 0, false, 6) != -1) {
            string = n.a(string, String.valueOf(j2));
        }
        tuxTextView2.setText(string);
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.d9y);
        l.b(tuxTextView3, "");
        if (j2 == 0) {
            i2 = 8;
        }
        tuxTextView3.setVisibility(i2);
        View findViewById = view.findViewById(R.id.e36);
        l.b(findViewById, "");
        findViewById.setOnClickListener(new b(view, this, oVar2));
    }
}
