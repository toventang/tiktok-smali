package com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.a.c.k;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.f;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.util.g;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.h;
import java.util.List;

public final class ProductDescImageViewHolder extends AbsFullSpanVH<f> implements au {

    /* renamed from: f  reason: collision with root package name */
    public static final b f86755f = new b((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private final h f86756g;

    static {
        Covode.recordClassIndex(54341);
    }

    public final PdpViewModel n() {
        return (PdpViewModel) this.f86756g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(54343);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        View view = this.itemView;
        l.b(view, "");
        a.C2089a.a(view, false);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54342);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescImageViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_vh_desc_ProductDescImageViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class c implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.preloader.c f86757a;

        static {
            Covode.recordClassIndex(54344);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, o oVar) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, Throwable th) {
        }

        c(com.ss.android.ugc.aweme.ecommerce.preloader.c cVar) {
            this.f86757a = cVar;
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            this.f86757a.a(th);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, o oVar, Animatable animatable) {
            this.f86757a.a(oVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProductDescImageViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559010(0x7f0d0262, float:1.8743352E38)
            r0 = 0
            android.view.View r0 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescImageViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescImageViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = h.i.a(r0)
            r4.f86756g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescImageViewHolder.<init>(android.view.ViewGroup):void");
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductDescImageViewHolder f86758a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f86759b;

        static {
            Covode.recordClassIndex(54345);
        }

        d(ProductDescImageViewHolder productDescImageViewHolder, f fVar) {
            this.f86758a = productDescImageViewHolder;
            this.f86759b = fVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f86759b.f86459a.getUrls() != null) {
                View view2 = this.f86758a.itemView;
                String str = "";
                l.b(view2, str);
                Context context = view2.getContext();
                l.b(context, str);
                Object b2 = n.b((List) this.f86759b.f86459a.getUrls(), 0);
                if (b2 != 0) {
                    str = b2;
                }
                com.ss.android.ugc.aweme.ecommerce.gallery.a.a(context, 0, 1, n.a(str), null, null, null, null, null, null, 16368);
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86758a.n().s;
                if (kVar != null) {
                    kVar.b(this.f86759b.f86459a.getUri());
                }
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar2 = this.f86758a.n().s;
                if (kVar2 != null) {
                    kVar2.d(this.f86759b.f86459a.getUri());
                }
            }
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(Object obj) {
        int i2;
        f fVar = (f) obj;
        l.d(fVar, "");
        View view = this.itemView;
        l.b(view, "");
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.ab2);
        com.ss.android.ugc.aweme.ecommerce.preloader.c cVar = new com.ss.android.ugc.aweme.ecommerce.preloader.c();
        cVar.a("pdp_detail");
        cVar.a(getAdapterPosition());
        cVar.a(fVar.f86459a);
        v a2 = g.a((Object) fVar.f86459a);
        a2.v = w.CENTER_CROP;
        w wVar = w.CENTER;
        a2.f39916l = R.drawable.yy;
        a2.o = wVar;
        v a3 = a2.a("CommerceHeadVH");
        a3.E = smartImageView;
        a3.a(new c(cVar));
        Image image = fVar.f86459a;
        Integer width = image.getWidth();
        int i3 = 100;
        if ((width != null && width.intValue() == 0) || image.getWidth() == null) {
            i2 = 100;
        } else {
            i2 = image.getWidth().intValue();
        }
        Integer height = image.getHeight();
        if ((height == null || height.intValue() != 0) && image.getHeight() != null) {
            i3 = image.getHeight().intValue();
        }
        int i4 = (com.ss.android.ugc.aweme.ecommerce.util.h.f87567a * i3) / i2;
        l.b(smartImageView, "");
        if (smartImageView.getLayoutParams() == null) {
            new ViewGroup.LayoutParams(-1, i4);
        } else {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = i4;
            smartImageView.setLayoutParams(layoutParams);
        }
        this.itemView.setOnClickListener(new d(this, fVar));
    }
}
