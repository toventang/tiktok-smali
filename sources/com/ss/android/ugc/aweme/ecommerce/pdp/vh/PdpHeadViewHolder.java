package com.ss.android.ugc.aweme.ecommerce.pdp.vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.HalfWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.HalfWaistView;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import dmt.viewpager.DmtRtlViewPager;
import h.a.n;
import h.z;
import java.util.List;

public final class PdpHeadViewHolder extends AbsFullSpanVH<com.ss.android.ugc.aweme.ecommerce.pdp.d.b> implements au {

    /* renamed from: f  reason: collision with root package name */
    public final TextView f86687f = ((TextView) this.itemView.findViewById(R.id.bo4));

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f86688g = ((ViewGroup) this.itemView.findViewById(R.id.bf_));

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommerce.pdp.a.a f86689j;

    /* renamed from: k  reason: collision with root package name */
    public int f86690k;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f86691l;

    /* renamed from: m  reason: collision with root package name */
    public Integer f86692m;
    public final androidx.fragment.app.i n;
    private final DmtRtlViewPager o = ((DmtRtlViewPager) this.itemView.findViewById(R.id.abc));
    private final h.h p;
    private final HalfWaistView q;

    static {
        Covode.recordClassIndex(54289);
    }

    public final PdpViewModel n() {
        return (PdpViewModel) this.p.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54290);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_vh_PdpHeadViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        View view = this.itemView;
        h.f.b.l.b(view, "");
        a.C2089a.a(view, false);
        ViewGroup viewGroup = this.f86688g;
        h.f.b.l.b(viewGroup, "");
        ViewGroup viewGroup2 = this.f86688g;
        h.f.b.l.b(viewGroup2, "");
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin += n().b();
            marginLayoutParams = marginLayoutParams2;
        }
        viewGroup.setLayoutParams(marginLayoutParams);
        f.a.b.b unused = selectSubscribe(n(), b.f86752a, new ah(), new i(this));
        f.a.b.b unused2 = selectSubscribe(n(), c.f86753a, new ah(), new j(this));
        f.a.b.b unused3 = selectSubscribe(n(), d.f86754a, new ah(), new k(this));
        f.a.b.b unused4 = selectSubscribe(n(), e.f86781a, new ah(), new l(this));
        f.a.b.b unused5 = selectSubscribe(n(), a.f86751a, new ah(), new h(this));
    }

    public final void o() {
        if (!n().q) {
            View view = this.itemView;
            h.f.b.l.b(view, "");
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e3_);
            h.f.b.l.b(tuxIconView, "");
            if (tuxIconView.getVisibility() == 0) {
                ViewGroup viewGroup = this.f86688g;
                h.f.b.l.b(viewGroup, "");
                if (viewGroup.getAlpha() > 0.0f) {
                    n().q = true;
                    com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = n().s;
                    if (kVar != null) {
                        kVar.c();
                    }
                }
            }
        }
    }

    public static final class g implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PdpHeadViewHolder f86697a;

        static {
            Covode.recordClassIndex(54297);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(PdpHeadViewHolder pdpHeadViewHolder) {
            this.f86697a = pdpHeadViewHolder;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            String str;
            this.f86697a.f86690k = i2;
            TextView textView = this.f86697a.f86687f;
            h.f.b.l.b(textView, "");
            textView.setText(com.ss.android.ugc.aweme.ecommerce.util.h.a(String.valueOf(i2 + 1), String.valueOf(((com.ss.android.ugc.aweme.ecommerce.pdp.d.b) this.f86697a.aI_()).f86448a.size())));
            Image image = (Image) n.b((List) ((com.ss.android.ugc.aweme.ecommerce.pdp.d.b) this.f86697a.aI_()).f86448a, i2);
            if (image != null) {
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86697a.n().s;
                if (kVar != null) {
                    kVar.b(image.getUri());
                }
                if (this.f86697a.n().f86309m) {
                    str = "viewer";
                } else {
                    str = "main";
                }
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar2 = this.f86697a.n().s;
                if (kVar2 != null) {
                    boolean z = this.f86697a.n().f86301b;
                    String uri = image.getUri();
                    if (uri == null) {
                        uri = "";
                    }
                    h.f.b.l.d(str, "");
                    h.f.b.l.d(uri, "");
                    new com.ss.android.ugc.aweme.ecommerce.pdp.b.n(str, z, uri).c(kVar2.f86382a);
                }
            }
        }
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86693a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpHeadViewHolder f86694b;

        static {
            Covode.recordClassIndex(54291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(PdpHeadViewHolder pdpHeadViewHolder) {
            super(700);
            this.f86694b = pdpHeadViewHolder;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f86694b.n().i();
            }
        }
    }

    public static final class c extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86695a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpHeadViewHolder f86696b;

        static {
            Covode.recordClassIndex(54292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(PdpHeadViewHolder pdpHeadViewHolder) {
            super(700);
            this.f86696b = pdpHeadViewHolder;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            SellerInfo sellerInfo;
            if (view != null) {
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86696b.n().s;
                if (kVar != null) {
                    ProductPackStruct productPackStruct = this.f86696b.n().f86303d;
                    if (productPackStruct == null || (sellerInfo = productPackStruct.f86640d) == null || (str = sellerInfo.f86657a) == null) {
                        str = "";
                    }
                    kVar.e(str);
                }
                Context context = view.getContext();
                h.f.b.l.b(context, "");
                IPdpStarter.a.a(context, this.f86696b.n, this.f86696b.n().l(), new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder.c.AnonymousClass1 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(54293);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.this$0.f86696b.n().s;
                        if (kVar != null) {
                            kVar.b();
                        }
                        return z.f158842a;
                    }
                });
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar2 = this.f86696b.n().s;
                if (kVar2 != null) {
                    kVar2.a("more_function", (Boolean) null, (Boolean) null);
                }
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Image, z> {
        final /* synthetic */ PdpHeadViewHolder this$0;

        static {
            Covode.recordClassIndex(54294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PdpHeadViewHolder pdpHeadViewHolder) {
            super(1);
            this.this$0 = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Image image) {
            Image image2 = image;
            h.f.b.l.d(image2, "");
            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.this$0.n().s;
            if (kVar != null) {
                kVar.d(image2.getUri());
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ PdpHeadViewHolder this$0;

        static {
            Covode.recordClassIndex(54296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PdpHeadViewHolder pdpHeadViewHolder) {
            super(1);
            this.this$0 = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bool.booleanValue();
            this.this$0.n().c(PdpViewModel.s.f86321a);
            return z.f158842a;
        }
    }

    public static final class m extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86698a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpHeadViewHolder f86699b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CartEntry f86700c;

        static {
            Covode.recordClassIndex(54303);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86699b.n().s;
                if (kVar != null) {
                    kVar.d();
                }
                this.f86699b.n().a(view.getContext());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(PdpHeadViewHolder pdpHeadViewHolder, CartEntry cartEntry) {
            super(700);
            this.f86699b = pdpHeadViewHolder;
            this.f86700c = cartEntry;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(Object obj) {
        HalfWaistBanner halfWaistBanner;
        boolean z;
        h.f.b.l.d(obj, "");
        ProductPackStruct productPackStruct = n().f86303d;
        String str = null;
        if (productPackStruct != null) {
            halfWaistBanner = productPackStruct.x;
        } else {
            halfWaistBanner = null;
        }
        if (halfWaistBanner == null) {
            HalfWaistView halfWaistView = this.q;
            h.f.b.l.b(halfWaistView, "");
            halfWaistView.setVisibility(8);
        } else {
            this.q.setHalfWaistUi(halfWaistBanner);
            HalfWaistView halfWaistView2 = this.q;
            h.f.b.l.b(halfWaistView2, "");
            halfWaistView2.setVisibility(0);
        }
        List<Image> list = ((com.ss.android.ugc.aweme.ecommerce.pdp.d.b) aI_()).f86448a;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = this.f86687f;
            h.f.b.l.b(textView, "");
            textView.setVisibility(8);
            View view = this.itemView;
            h.f.b.l.b(view, "");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.abd);
            h.f.b.l.b(appCompatImageView, "");
            appCompatImageView.setVisibility(0);
        } else {
            TextView textView2 = this.f86687f;
            h.f.b.l.b(textView2, "");
            textView2.setVisibility(0);
            View view2 = this.itemView;
            h.f.b.l.b(view2, "");
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(R.id.abd);
            h.f.b.l.b(appCompatImageView2, "");
            appCompatImageView2.setVisibility(8);
            List<Image> list2 = ((com.ss.android.ugc.aweme.ecommerce.pdp.d.b) aI_()).f86448a;
            DmtRtlViewPager dmtRtlViewPager = this.o;
            h.f.b.l.b(dmtRtlViewPager, "");
            com.ss.android.ugc.aweme.ecommerce.pdp.a.a aVar = new com.ss.android.ugc.aweme.ecommerce.pdp.a.a(list2, dmtRtlViewPager, "pdp_head");
            this.f86689j = aVar;
            aVar.f86326a = n().f86301b;
            com.ss.android.ugc.aweme.ecommerce.pdp.a.a aVar2 = this.f86689j;
            if (aVar2 != null) {
                aVar2.f86327b = new d(this);
            }
            com.ss.android.ugc.aweme.ecommerce.pdp.a.a aVar3 = this.f86689j;
            if (aVar3 != null) {
                aVar3.f86329d = new e(this);
            }
            com.ss.android.ugc.aweme.ecommerce.pdp.a.a aVar4 = this.f86689j;
            if (aVar4 != null) {
                aVar4.f86328c = new f(this);
            }
            DmtRtlViewPager dmtRtlViewPager2 = this.o;
            h.f.b.l.b(dmtRtlViewPager2, "");
            dmtRtlViewPager2.setAdapter(this.f86689j);
            TextView textView3 = this.f86687f;
            h.f.b.l.b(textView3, "");
            textView3.setText(com.ss.android.ugc.aweme.ecommerce.util.h.a(String.valueOf(this.f86690k + 1), String.valueOf(((com.ss.android.ugc.aweme.ecommerce.pdp.d.b) aI_()).f86448a.size())));
            DmtRtlViewPager dmtRtlViewPager3 = this.o;
            h.f.b.l.b(dmtRtlViewPager3, "");
            dmtRtlViewPager3.setCurrentItem(this.f86690k);
            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = n().s;
            if (kVar != null) {
                Image image = (Image) n.b((List) ((com.ss.android.ugc.aweme.ecommerce.pdp.d.b) aI_()).f86448a, this.f86690k);
                if (image != null) {
                    str = image.getUri();
                }
                kVar.b(str);
            }
            this.o.setOnPageChangeListener(new g(this));
        }
        View view3 = this.itemView;
        if (n().p) {
            h.f.b.l.b(view3, "");
            TuxIconView tuxIconView = (TuxIconView) view3.findViewById(R.id.uf);
            h.f.b.l.b(tuxIconView, "");
            tuxIconView.setVisibility(8);
        }
        if (n().w) {
            h.f.b.l.b(view3, "");
            ((TuxIconView) view3.findViewById(R.id.a7u)).setIconRes(R.raw.icon_arrow_left_ltr);
        } else {
            h.f.b.l.b(view3, "");
            ((TuxIconView) view3.findViewById(R.id.a7u)).setIconRes(R.raw.icon_x_mark);
        }
        TuxIconView tuxIconView2 = (TuxIconView) view3.findViewById(R.id.a7u);
        h.f.b.l.b(tuxIconView2, "");
        tuxIconView2.setOnClickListener(new b(this));
        TuxIconView tuxIconView3 = (TuxIconView) view3.findViewById(R.id.co2);
        h.f.b.l.b(tuxIconView3, "");
        tuxIconView3.setOnClickListener(new c(this));
    }

    static final class e extends h.f.b.m implements h.f.a.m<Boolean, Integer, z> {
        final /* synthetic */ PdpHeadViewHolder this$0;

        static {
            Covode.recordClassIndex(54295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.this$0 = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            this.this$0.n().f86309m = booleanValue;
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b>, Boolean, z> {
        final /* synthetic */ PdpHeadViewHolder this$0;

        static {
            Covode.recordClassIndex(54300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.this$0 = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b> jediSimpleViewHolder, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(jediSimpleViewHolder, "");
            com.ss.android.ugc.aweme.ecommerce.pdp.a.a aVar = this.this$0.f86689j;
            if (aVar != null) {
                aVar.f86326a = booleanValue;
            }
            this.this$0.f86691l = Boolean.valueOf(booleanValue);
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b>, Integer, z> {
        final /* synthetic */ PdpHeadViewHolder this$0;

        static {
            Covode.recordClassIndex(54302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.this$0 = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b> jediSimpleViewHolder, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(jediSimpleViewHolder, "");
            this.this$0.f86692m = Integer.valueOf(intValue);
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b>, Float, z> {
        final /* synthetic */ PdpHeadViewHolder this$0;

        static {
            Covode.recordClassIndex(54299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.this$0 = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b> jediSimpleViewHolder, Float f2) {
            float floatValue = f2.floatValue();
            h.f.b.l.d(jediSimpleViewHolder, "");
            if (floatValue >= 0.0f) {
                ViewGroup viewGroup = this.this$0.f86688g;
                h.f.b.l.b(viewGroup, "");
                viewGroup.setAlpha(floatValue);
            }
            this.this$0.o();
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b>, com.ss.android.ugc.aweme.ecommerce.pdp.a, z> {
        final /* synthetic */ PdpHeadViewHolder this$0;

        static {
            Covode.recordClassIndex(54298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.this$0 = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b> jediSimpleViewHolder, com.ss.android.ugc.aweme.ecommerce.pdp.a aVar) {
            int i2;
            JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b> jediSimpleViewHolder2 = jediSimpleViewHolder;
            com.ss.android.ugc.aweme.ecommerce.pdp.a aVar2 = aVar;
            h.f.b.l.d(jediSimpleViewHolder2, "");
            float f2 = 1.0f / ((float) com.ss.android.ugc.aweme.ecommerce.util.h.f87567a);
            Integer num = this.this$0.f86692m;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            float f3 = f2 * ((float) i2);
            if (!(!h.f.b.l.a((Object) this.this$0.f86691l, (Object) true)) && f3 < 0.05f) {
                View view = jediSimpleViewHolder2.itemView;
                h.f.b.l.b(view, "");
                TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e3_);
                h.f.b.l.b(tuxIconView, "");
                if (tuxIconView.getVisibility() == 0) {
                    PdpViewModel n = this.this$0.n();
                    View view2 = jediSimpleViewHolder2.itemView;
                    h.f.b.l.b(view2, "");
                    Context context = view2.getContext();
                    View view3 = jediSimpleViewHolder2.itemView;
                    h.f.b.l.b(view3, "");
                    n.a(context, aVar2, view3.findViewById(R.id.e3_));
                }
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PdpHeadViewHolder(android.view.ViewGroup r5, androidx.fragment.app.i r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559013(0x7f0d0265, float:1.8743358E38)
            r0 = 0
            android.view.View r0 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            r4.n = r6
            android.view.View r1 = r4.itemView
            r0 = 2131363239(0x7f0a05a7, float:1.8346281E38)
            android.view.View r0 = r1.findViewById(r0)
            dmt.viewpager.DmtRtlViewPager r0 = (dmt.viewpager.DmtRtlViewPager) r0
            r4.o = r0
            android.view.View r1 = r4.itemView
            r0 = 2131365082(0x7f0a0cda, float:1.835002E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.f86687f = r0
            android.view.View r1 = r4.itemView
            r0 = 2131364752(0x7f0a0b90, float:1.834935E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.f86688g = r0
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = h.i.a(r0)
            r4.p = r0
            android.view.View r1 = r4.itemView
            r0 = 2131363238(0x7f0a05a6, float:1.834628E38)
            android.view.View r0 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.view.HalfWaistView r0 = (com.ss.android.ugc.aweme.ecommerce.pdp.view.HalfWaistView) r0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder.<init>(android.view.ViewGroup, androidx.fragment.app.i):void");
    }

    static final class k extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b>, CartEntry, z> {
        final /* synthetic */ PdpHeadViewHolder this$0;

        static {
            Covode.recordClassIndex(54301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(PdpHeadViewHolder pdpHeadViewHolder) {
            super(2);
            this.this$0 = pdpHeadViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b> jediSimpleViewHolder, CartEntry cartEntry) {
            Integer num;
            CartEntry cartEntry2 = cartEntry;
            h.f.b.l.d(jediSimpleViewHolder, "");
            PdpHeadViewHolder pdpHeadViewHolder = this.this$0;
            View view = pdpHeadViewHolder.itemView;
            pdpHeadViewHolder.n();
            if (PdpViewModel.a(cartEntry2)) {
                h.f.b.l.b(view, "");
                TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e3_);
                h.f.b.l.b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                if (!(cartEntry2 == null || (num = cartEntry2.f86600b) == null)) {
                    int intValue = num.intValue();
                    if (intValue > 0) {
                        TuxAlertBadge tuxAlertBadge = (TuxAlertBadge) view.findViewById(R.id.e3b);
                        h.f.b.l.b(tuxAlertBadge, "");
                        tuxAlertBadge.setVisibility(0);
                        ((TuxAlertBadge) view.findViewById(R.id.e3b)).setCount(intValue);
                    } else {
                        TuxAlertBadge tuxAlertBadge2 = (TuxAlertBadge) view.findViewById(R.id.e3b);
                        h.f.b.l.b(tuxAlertBadge2, "");
                        tuxAlertBadge2.setVisibility(8);
                    }
                }
                TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.e3_);
                h.f.b.l.b(tuxIconView2, "");
                tuxIconView2.setOnClickListener(new m(pdpHeadViewHolder, cartEntry2));
            } else {
                h.f.b.l.b(view, "");
                TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.e3_);
                h.f.b.l.b(tuxIconView3, "");
                tuxIconView3.setVisibility(8);
                TuxAlertBadge tuxAlertBadge3 = (TuxAlertBadge) view.findViewById(R.id.e3b);
                h.f.b.l.b(tuxAlertBadge3, "");
                tuxAlertBadge3.setVisibility(8);
            }
            pdpHeadViewHolder.o();
            return z.f158842a;
        }
    }
}
