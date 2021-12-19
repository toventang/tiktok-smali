package com.ss.android.ugc.aweme.ecommerce.semipdp.vh;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.semipdp.j;
import com.zhiliaoapp.musically.R;
import dmt.viewpager.DmtRtlViewPager;
import dmt.viewpager.DmtViewPager;
import h.f.b.l;
import h.h;
import h.z;
import java.util.LinkedHashMap;
import java.util.List;

public final class SemiPdpHeaderVH extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b> implements au {

    /* renamed from: f  reason: collision with root package name */
    public int f87334f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommerce.pdp.a.a f87335g;

    /* renamed from: j  reason: collision with root package name */
    public final View f87336j;

    /* renamed from: k  reason: collision with root package name */
    private final h f87337k;

    static {
        Covode.recordClassIndex(54816);
    }

    public final SemiPdpViewModel m() {
        return (SemiPdpViewModel) this.f87337k.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        a.C2089a.a(this.f87336j, false);
        f.a.b.b unused = selectSubscribe(m(), a.f87348a, new ah(), new e(this));
    }

    public static final class a extends h.f.b.m implements h.f.a.a<SemiPdpViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54817);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpHeaderVH.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_semipdp_vh_SemiPdpHeaderVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemiPdpHeaderVH(View view) {
        super(view);
        l.d(view, "");
        this.f87336j = view;
        h.k.c a2 = h.f.b.ab.a(SemiPdpViewModel.class);
        this.f87337k = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    static final class c extends h.f.b.m implements h.f.a.b<Image, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.d.b $item$inlined;
        final /* synthetic */ SemiPdpHeaderVH this$0;

        static {
            Covode.recordClassIndex(54819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SemiPdpHeaderVH semiPdpHeaderVH, com.ss.android.ugc.aweme.ecommerce.pdp.d.b bVar) {
            super(1);
            this.this$0 = semiPdpHeaderVH;
            this.$item$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Image image) {
            String str;
            Image image2 = image;
            l.d(image2, "");
            j a2 = this.this$0.m().a();
            if (a2 != null) {
                if (this.this$0.m().f87249d) {
                    str = "full_screen";
                } else {
                    str = "half_screen";
                }
                String uri = image2.getUri();
                if (uri == null) {
                    uri = "";
                }
                l.d(str, "");
                l.d(uri, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("photo_id", uri);
                linkedHashMap.put("page_show_type", str);
                a2.b("tiktokec_product_detail_page_photo_click", linkedHashMap);
            }
            this.this$0.m().f87253k = true;
            return z.f158842a;
        }
    }

    public static final class d implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f87338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SemiPdpHeaderVH f87339b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.d.b f87340c;

        static {
            Covode.recordClassIndex(54820);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            String str;
            String str2;
            this.f87339b.f87334f = i2;
            TuxTextView tuxTextView = (TuxTextView) this.f87338a.findViewById(R.id.bo4);
            l.b(tuxTextView, "");
            tuxTextView.setText(com.ss.android.ugc.aweme.ecommerce.util.h.a(String.valueOf(i2 + 1), String.valueOf(this.f87340c.f86448a.size())));
            Image image = this.f87340c.f86448a.get(i2);
            if (image != null) {
                this.f87339b.m().f87255m.add(image);
                j a2 = this.f87339b.m().a();
                if (a2 != null) {
                    if (this.f87339b.m().f87249d) {
                        str = "full_screen";
                    } else {
                        str = "half_screen";
                    }
                    String uri = image.getUri();
                    if (uri == null) {
                        uri = "";
                    }
                    if (this.f87339b.m().f87250e) {
                        str2 = "viewer";
                    } else {
                        str2 = "main";
                    }
                    l.d(str, "");
                    l.d(uri, "");
                    l.d(str2, "");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("photo_id", uri);
                    linkedHashMap.put("page_show_type", str);
                    linkedHashMap.put("photo_show_type", str2);
                    a2.b("tiktokec_product_detail_page_photo_glide", linkedHashMap);
                }
            }
        }

        d(View view, SemiPdpHeaderVH semiPdpHeaderVH, com.ss.android.ugc.aweme.ecommerce.pdp.d.b bVar) {
            this.f87338a = view;
            this.f87339b = semiPdpHeaderVH;
            this.f87340c = bVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.pdp.d.b bVar) {
        boolean z;
        com.ss.android.ugc.aweme.ecommerce.pdp.d.b bVar2 = bVar;
        l.d(bVar2, "");
        View view = this.f87336j;
        List<Image> list = bVar2.f86448a;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DmtRtlViewPager dmtRtlViewPager = (DmtRtlViewPager) view.findViewById(R.id.abc);
            l.b(dmtRtlViewPager, "");
            dmtRtlViewPager.setVisibility(8);
            View view2 = this.itemView;
            l.b(view2, "");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(R.id.abd);
            l.b(appCompatImageView, "");
            appCompatImageView.setVisibility(0);
            return;
        }
        DmtRtlViewPager dmtRtlViewPager2 = (DmtRtlViewPager) view.findViewById(R.id.abc);
        l.b(dmtRtlViewPager2, "");
        dmtRtlViewPager2.setVisibility(0);
        View view3 = this.itemView;
        l.b(view3, "");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view3.findViewById(R.id.abd);
        l.b(appCompatImageView2, "");
        appCompatImageView2.setVisibility(8);
        List<Image> list2 = bVar2.f86448a;
        DmtRtlViewPager dmtRtlViewPager3 = (DmtRtlViewPager) view.findViewById(R.id.abc);
        l.b(dmtRtlViewPager3, "");
        com.ss.android.ugc.aweme.ecommerce.pdp.a.a aVar = new com.ss.android.ugc.aweme.ecommerce.pdp.a.a(list2, dmtRtlViewPager3, "semi_pdp_head");
        this.f87335g = aVar;
        aVar.f86326a = m().f87249d;
        com.ss.android.ugc.aweme.ecommerce.pdp.a.a aVar2 = this.f87335g;
        if (aVar2 != null) {
            aVar2.f86329d = new b(this, bVar2);
        }
        com.ss.android.ugc.aweme.ecommerce.pdp.a.a aVar3 = this.f87335g;
        if (aVar3 != null) {
            aVar3.f86327b = new c(this, bVar2);
        }
        DmtViewPager dmtViewPager = (DmtViewPager) view.findViewById(R.id.abc);
        l.b(dmtViewPager, "");
        dmtViewPager.setAdapter(this.f87335g);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.bo4);
        l.b(tuxTextView, "");
        tuxTextView.setText(com.ss.android.ugc.aweme.ecommerce.util.h.a(String.valueOf(this.f87334f + 1), String.valueOf(bVar2.f86448a.size())));
        m().f87255m.add(bVar2.f86448a.get(0));
        DmtViewPager dmtViewPager2 = (DmtViewPager) view.findViewById(R.id.abc);
        l.b(dmtViewPager2, "");
        dmtViewPager2.setCurrentItem(this.f87334f);
        ((DmtViewPager) view.findViewById(R.id.abc)).setOnPageChangeListener(new d(view, this, bVar2));
    }

    static final class b extends h.f.b.m implements h.f.a.m<Boolean, Integer, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.d.b $item$inlined;
        final /* synthetic */ SemiPdpHeaderVH this$0;

        static {
            Covode.recordClassIndex(54818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SemiPdpHeaderVH semiPdpHeaderVH, com.ss.android.ugc.aweme.ecommerce.pdp.d.b bVar) {
            super(2);
            this.this$0 = semiPdpHeaderVH;
            this.$item$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            this.this$0.m().f87250e = booleanValue;
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b>, Boolean, z> {
        final /* synthetic */ SemiPdpHeaderVH this$0;

        static {
            Covode.recordClassIndex(54821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SemiPdpHeaderVH semiPdpHeaderVH) {
            super(2);
            this.this$0 = semiPdpHeaderVH;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.pdp.d.b> jediSimpleViewHolder, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(jediSimpleViewHolder, "");
            com.ss.android.ugc.aweme.ecommerce.pdp.a.a aVar = this.this$0.f87335g;
            if (aVar != null) {
                aVar.f86326a = booleanValue;
            }
            return z.f158842a;
        }
    }
}
