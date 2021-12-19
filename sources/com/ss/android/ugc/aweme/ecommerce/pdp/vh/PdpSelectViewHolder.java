package com.ss.android.ugc.aweme.ecommerce.pdp.vh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.h;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.j;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ShopPolicy;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.PdpSelectItemView;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.c.b.a.k;
import h.f.b.l;
import h.m.p;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.internal.o;

public final class PdpSelectViewHolder extends AbsFullSpanVH<h> implements au {

    /* renamed from: f  reason: collision with root package name */
    public final Fragment f86723f;

    /* renamed from: g  reason: collision with root package name */
    private final PdpSelectItemView f86724g = ((PdpSelectItemView) this.itemView.findViewById(R.id.dxg));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f86725j;

    static {
        Covode.recordClassIndex(54322);
    }

    public final PdpViewModel n() {
        return (PdpViewModel) this.f86725j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        View view = this.itemView;
        l.b(view, "");
        a.C2089a.a(view, false);
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
            Covode.recordClassIndex(54323);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_vh_PdpSelectViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
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
        final /* synthetic */ long f86726a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpSelectViewHolder f86727b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f86728c;

        static {
            Covode.recordClassIndex(54324);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
            int label;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(54325);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h.c.d dVar, b bVar) {
                super(2, dVar);
                this.this$0 = bVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new a(dVar, this.this$0);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    r.a(obj);
                    PdpViewModel n = this.this$0.f86727b.n();
                    AnonymousClass1 r1 = new h.f.a.b<h.c.d<? super z>, Object>(this, null) {
                        /* class com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder.b.a.AnonymousClass1 */
                        int label;
                        final /* synthetic */ a this$0;

                        static {
                            Covode.recordClassIndex(54326);
                        }

                        {
                            this.this$0 = r2;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.d<z> create(h.c.d<?> dVar) {
                            l.d(dVar, "");
                            return 

                            @Override // com.ss.android.ugc.aweme.utils.bp
                            public final void a(View view) {
                                if (view != null) {
                                    bz unused = kotlinx.coroutines.i.a(bs.f159054a, o.f159148a, null, new a(null, this), 2);
                                    com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86727b.n().s;
                                    if (kVar != null) {
                                        kVar.a(this.f86728c.a(), (h) null);
                                    }
                                }
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public b(PdpSelectViewHolder pdpSelectViewHolder, h hVar) {
                                super(700);
                                this.f86727b = pdpSelectViewHolder;
                                this.f86728c = hVar;
                            }
                        }

                        public static final class c extends bp {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ long f86729a = 700;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ PdpSelectViewHolder f86730b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ h f86731c;

                            static {
                                Covode.recordClassIndex(54327);
                            }

                            /* access modifiers changed from: package-private */
                            public static final class a extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                                int label;
                                final /* synthetic */ c this$0;

                                static {
                                    Covode.recordClassIndex(54328);
                                }

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                a(h.c.d dVar, c cVar) {
                                    super(2, dVar);
                                    this.this$0 = cVar;
                                }

                                @Override // h.c.b.a.a
                                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                    l.d(dVar, "");
                                    return new a(dVar, this.this$0);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // h.f.a.m
                                public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                    return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
                                }

                                @Override // h.c.b.a.a
                                public final Object invokeSuspend(Object obj) {
                                    h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        r.a(obj);
                                        PdpViewModel n = this.this$0.f86730b.n();
                                        AnonymousClass1 r1 = new h.f.a.b<h.c.d<? super z>, Object>(this, null) {
                                            /* class com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder.c.a.AnonymousClass1 */
                                            int label;
                                            final /* synthetic */ a this$0;

                                            static {
                                                Covode.recordClassIndex(54329);
                                            }

                                            {
                                                this.this$0 = r2;
                                            }

                                            @Override // h.c.b.a.a
                                            public final h.c.d<z> create(h.c.d<?> dVar) {
                                                l.d(dVar, "");
                                                return 

                                                @Override // com.ss.android.ugc.aweme.utils.bp
                                                public final void a(View view) {
                                                    if (view != null) {
                                                        bz unused = kotlinx.coroutines.i.a(bs.f159054a, o.f159148a, null, new a(null, this), 2);
                                                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86730b.n().s;
                                                        if (kVar != null) {
                                                            kVar.a(this.f86731c.a(), (h) null);
                                                        }
                                                    }
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public c(PdpSelectViewHolder pdpSelectViewHolder, h hVar) {
                                                    super(700);
                                                    this.f86730b = pdpSelectViewHolder;
                                                    this.f86731c = hVar;
                                                }
                                            }

                                            public static final class e extends bp {

                                                /* renamed from: a  reason: collision with root package name */
                                                final /* synthetic */ long f86735a = 700;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ PdpSelectViewHolder f86736b;

                                                /* renamed from: c  reason: collision with root package name */
                                                final /* synthetic */ h f86737c;

                                                static {
                                                    Covode.recordClassIndex(54331);
                                                }

                                                @Override // com.ss.android.ugc.aweme.utils.bp
                                                public final void a(View view) {
                                                    View view2;
                                                    if (view != null) {
                                                        PdpViewModel n = this.f86736b.n();
                                                        Fragment fragment = this.f86736b.f86723f;
                                                        if (fragment != null) {
                                                            view2 = fragment.getView();
                                                        } else {
                                                            view2 = null;
                                                        }
                                                        n.a(view2, 0);
                                                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86736b.n().s;
                                                        if (kVar != null) {
                                                            kVar.a(this.f86737c.a(), (h) null);
                                                        }
                                                    }
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public e(PdpSelectViewHolder pdpSelectViewHolder, h hVar) {
                                                    super(700);
                                                    this.f86736b = pdpSelectViewHolder;
                                                    this.f86737c = hVar;
                                                }
                                            }

                                            public static final class d extends bp {

                                                /* renamed from: a  reason: collision with root package name */
                                                final /* synthetic */ long f86732a = 700;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ PdpSelectViewHolder f86733b;

                                                /* renamed from: c  reason: collision with root package name */
                                                final /* synthetic */ h f86734c;

                                                static {
                                                    Covode.recordClassIndex(54330);
                                                }

                                                @Override // com.ss.android.ugc.aweme.utils.bp
                                                public final void a(View view) {
                                                    Context context;
                                                    if (view != null) {
                                                        PdpViewModel n = this.f86733b.n();
                                                        Fragment fragment = this.f86733b.f86723f;
                                                        if (fragment == null || (context = fragment.getContext()) == null) {
                                                            com.bytedance.services.apm.api.a.a("Open shipping failed. Context is NULL");
                                                        } else {
                                                            n.n = kotlinx.coroutines.i.a(bs.f159054a, o.f159148a, null, new PdpViewModel.n(n, context, null), 2);
                                                        }
                                                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86733b.n().s;
                                                        if (kVar != null) {
                                                            kVar.a(this.f86734c.a(), this.f86734c);
                                                        }
                                                    }
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public d(PdpSelectViewHolder pdpSelectViewHolder, h hVar) {
                                                    super(700);
                                                    this.f86733b = pdpSelectViewHolder;
                                                    this.f86734c = hVar;
                                                }
                                            }

                                            @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
                                            public final /* synthetic */ void a(Object obj) {
                                                String str;
                                                Context context;
                                                String str2;
                                                String str3;
                                                String priceStr;
                                                h hVar = (h) obj;
                                                l.d(hVar, "");
                                                String str4 = null;
                                                this.f86724g.setDesc(null);
                                                this.f86724g.setSubDesc(null);
                                                this.f86724g.setSecondLineDescL2(null);
                                                this.f86724g.setSecondLineDescL1(null);
                                                this.f86724g.setSecondLineDescExtra(null);
                                                PdpSelectItemView pdpSelectItemView = this.f86724g;
                                                l.b(pdpSelectItemView, "");
                                                Context context2 = pdpSelectItemView.getContext();
                                                l.b(context2, "");
                                                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.fj);
                                                this.f86724g.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                                                this.f86724g.setBackIconVisibility(true);
                                                if (hVar instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.i) {
                                                    this.f86724g.setTitle(R.string.bgh);
                                                    PdpSelectItemView pdpSelectItemView2 = this.f86724g;
                                                    l.b(pdpSelectItemView2, "");
                                                    pdpSelectItemView2.setOnClickListener(new b(this, hVar));
                                                    PdpSelectItemView pdpSelectItemView3 = this.f86724g;
                                                    List<ShopPolicy> list = ((com.ss.android.ugc.aweme.ecommerce.pdp.d.i) hVar).f86473a;
                                                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                                                    Iterator<T> it = list.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(it.next().f86664a);
                                                    }
                                                    pdpSelectItemView3.setSecondLineDescL1(n.a(arrayList, " · ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
                                                    this.f86724g.setPadding(dimensionPixelSize, com.ss.android.ugc.aweme.base.utils.n.a(24.0d), dimensionPixelSize, dimensionPixelSize);
                                                } else if (hVar instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.l) {
                                                    this.f86724g.setTitle(R.string.bgn);
                                                    PdpSelectItemView pdpSelectItemView4 = this.f86724g;
                                                    l.b(pdpSelectItemView4, "");
                                                    pdpSelectItemView4.setOnClickListener(new c(this, hVar));
                                                } else if (hVar instanceof j) {
                                                    com.ss.android.ugc.aweme.ecommerce.pdp.d.d dVar = ((j) hVar).f86474a;
                                                    if (dVar == null) {
                                                        PdpSelectItemView pdpSelectItemView5 = this.f86724g;
                                                        View view = this.itemView;
                                                        l.b(view, "");
                                                        pdpSelectItemView5.setDesc(view.getContext().getString(R.string.bg8));
                                                    } else {
                                                        Price price = dVar.f86449a;
                                                        if ((price == null || (priceStr = price.getPriceStr()) == null || priceStr.length() == 0) && ((str2 = dVar.f86450b) == null || str2.length() == 0)) {
                                                            String str5 = dVar.f86453e;
                                                            if (str5 == null || str5.length() == 0) {
                                                                View view2 = this.itemView;
                                                                l.b(view2, "");
                                                                str3 = view2.getContext().getString(R.string.bg8);
                                                            } else {
                                                                str3 = dVar.f86453e;
                                                            }
                                                            l.b(str3, "");
                                                            this.f86724g.setDesc(str3);
                                                            this.f86724g.setSubDesc(null);
                                                            this.f86724g.setDescLineThru(false);
                                                            this.f86724g.setSecondLineDescL2(null);
                                                        } else {
                                                            this.f86724g.setDesc(dVar.f86450b);
                                                            PdpSelectItemView pdpSelectItemView6 = this.f86724g;
                                                            Price price2 = dVar.f86449a;
                                                            if (price2 != null) {
                                                                str4 = price2.getPriceStr();
                                                            }
                                                            pdpSelectItemView6.setSubDesc(str4);
                                                            this.f86724g.setDescLineThru(true);
                                                            this.f86724g.setSecondLineDescL2(dVar.f86454f);
                                                            if (dVar.f86458j) {
                                                                PdpSelectItemView pdpSelectItemView7 = this.f86724g;
                                                                View view3 = this.itemView;
                                                                l.b(view3, "");
                                                                pdpSelectItemView7.setSubDescColor(androidx.core.content.b.c(view3.getContext(), R.color.bh));
                                                            } else {
                                                                PdpSelectItemView pdpSelectItemView8 = this.f86724g;
                                                                View view4 = this.itemView;
                                                                l.b(view4, "");
                                                                pdpSelectItemView8.setSubDescColor(androidx.core.content.b.c(view4.getContext(), R.color.bx));
                                                            }
                                                            String str6 = dVar.f86456h;
                                                            if (!(str6 == null || str6.length() == 0)) {
                                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                                Fragment fragment = this.f86723f;
                                                                if (!(fragment == null || (context = fragment.getContext()) == null)) {
                                                                    l.b(context, "");
                                                                    com.bytedance.tux.c.b bVar = new com.bytedance.tux.c.b(context, R.raw.icon_truck_moving_ltr);
                                                                    SpannableString spannableString = new SpannableString(" ");
                                                                    bVar.setBounds(0, 0, com.ss.android.ugc.aweme.base.utils.n.a(14.0d), com.ss.android.ugc.aweme.base.utils.n.a(11.0d));
                                                                    bVar.c(androidx.core.content.b.c(context, R.color.bh));
                                                                    spannableString.setSpan(new com.bytedance.tux.f.a.c(bVar), 0, spannableString.length(), 33);
                                                                    spannableStringBuilder.append((CharSequence) spannableString);
                                                                    int c2 = androidx.core.content.b.c(context, R.color.bh);
                                                                    SpannableString spannableString2 = new SpannableString(" " + context.getString(R.string.bg5) + " ");
                                                                    spannableString2.setSpan(new ForegroundColorSpan(c2), 0, spannableString2.length(), 33);
                                                                    spannableString2.setSpan(new com.bytedance.tux.f.a.b(62, true), 0, spannableString2.length(), 33);
                                                                    spannableStringBuilder.append((CharSequence) spannableString2);
                                                                }
                                                                spannableStringBuilder.append((CharSequence) dVar.f86456h);
                                                                this.f86724g.setSecondLineDescExtra(spannableStringBuilder);
                                                            }
                                                        }
                                                        this.f86724g.setSecondLineDescL1(dVar.f86455g);
                                                    }
                                                    this.f86724g.setTitle(R.string.bfz);
                                                    PdpSelectItemView pdpSelectItemView9 = this.f86724g;
                                                    l.b(pdpSelectItemView9, "");
                                                    pdpSelectItemView9.setOnClickListener(new d(this, hVar));
                                                    this.f86724g.setPadding(dimensionPixelSize, com.ss.android.ugc.aweme.base.utils.n.a(24.0d), dimensionPixelSize, dimensionPixelSize);
                                                } else if (hVar instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.k) {
                                                    this.f86724g.setTitle(R.string.bgt);
                                                    if (!n().f86305f || p.a((CharSequence) ((com.ss.android.ugc.aweme.ecommerce.pdp.d.k) hVar).f86475a)) {
                                                        PdpSelectItemView pdpSelectItemView10 = this.f86724g;
                                                        l.b(pdpSelectItemView10, "");
                                                        pdpSelectItemView10.setOnClickListener(new e(this, hVar));
                                                    } else {
                                                        this.f86724g.setBackIconVisibility(false);
                                                    }
                                                    com.ss.android.ugc.aweme.ecommerce.pdp.d.k kVar = (com.ss.android.ugc.aweme.ecommerce.pdp.d.k) hVar;
                                                    if (p.a((CharSequence) kVar.f86475a)) {
                                                        PdpSelectItemView pdpSelectItemView11 = this.f86724g;
                                                        l.b(pdpSelectItemView11, "");
                                                        str = pdpSelectItemView11.getContext().getString(R.string.bg8);
                                                    } else {
                                                        str = kVar.f86475a;
                                                    }
                                                    l.b(str, "");
                                                    this.f86724g.setDescLineThru(false);
                                                    this.f86724g.setDesc(str);
                                                }
                                            }

                                            /* JADX WARNING: Illegal instructions before constructor call */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public PdpSelectViewHolder(android.view.ViewGroup r5, androidx.fragment.app.Fragment r6) {
                                                /*
                                                    r4 = this;
                                                    java.lang.String r3 = ""
                                                    h.f.b.l.d(r5, r3)
                                                    android.content.Context r2 = r5.getContext()
                                                    r1 = 2131559024(0x7f0d0270, float:1.874338E38)
                                                    r0 = 0
                                                    android.view.View r0 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(r2, r1, r5, r0)
                                                    h.f.b.l.b(r0, r3)
                                                    r4.<init>(r0)
                                                    r4.f86723f = r6
                                                    android.view.View r1 = r4.itemView
                                                    r0 = 2131368168(0x7f0a18e8, float:1.8356278E38)
                                                    android.view.View r0 = r1.findViewById(r0)
                                                    com.ss.android.ugc.aweme.ecommerce.pdp.view.PdpSelectItemView r0 = (com.ss.android.ugc.aweme.ecommerce.pdp.view.PdpSelectItemView) r0
                                                    r4.f86724g = r0
                                                    java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
                                                    h.k.c r1 = h.f.b.ab.a(r0)
                                                    com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder$a
                                                    r0.<init>(r4, r1, r1)
                                                    h.h r0 = h.i.a(r0)
                                                    r4.f86725j = r0
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder.<init>(android.view.ViewGroup, androidx.fragment.app.Fragment):void");
                                            }
                                        }
