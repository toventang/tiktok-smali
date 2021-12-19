package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSubmitInfoView;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.SuperElement;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class PaymentInfoVH extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c> implements au {

    /* renamed from: g  reason: collision with root package name */
    public static final c f85095g = new c((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final View f85096f;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f85097j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f85098k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f85099l;

    /* renamed from: m  reason: collision with root package name */
    private final int f85100m;
    private final int n;
    private final int o;
    private final com.bytedance.lighten.a.e p;
    private final int q;
    private final int r;
    private KeyBoardVisibilityUtil s;

    static {
        Covode.recordClassIndex(53186);
    }

    public final OrderSubmitViewModel m() {
        return (OrderSubmitViewModel) this.f85097j.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(53189);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85101a = 700;

        static {
            Covode.recordClassIndex(53188);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
        }

        public b() {
            super(700);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void j() {
        super.j();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.s;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.a();
        }
        this.s = null;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<OrderSubmitViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_PaymentInfoVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        a.C2089a.a(this.f85096f, false);
        View view = this.f85096f;
        Context context = view.getContext();
        if (context != null && (context instanceof androidx.appcompat.app.d)) {
            this.s = new KeyBoardVisibilityUtil((androidx.core.app.d) context, 32, new f(view, this));
        }
        f.a.b.b unused = selectSubscribe(m(), e.f85159a, new ah(), new g(view, this));
        f.a.b.b unused2 = selectSubscribe(m(), f.f85160a, new ah(), new h(view, this));
    }

    public static final class d extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85102a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PaymentInfoVH f85103b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c f85104c;

        static {
            Covode.recordClassIndex(53190);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            String str2;
            String str3;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar;
            if (view != null) {
                OrderSubmitViewModel m2 = this.f85103b.m();
                Context context = this.f85103b.f85096f.getContext();
                l.b(context, "");
                m2.a(context, !this.f85104c.f84821e);
                HashMap<String, Object> j2 = this.f85103b.m().j();
                o oVar = this.f85104c.f84817a;
                String str4 = null;
                if (oVar != null) {
                    str = oVar.c();
                } else {
                    str = null;
                }
                o oVar2 = this.f85104c.f84817a;
                if (oVar2 != null) {
                    str2 = oVar2.f85345l;
                } else {
                    str2 = null;
                }
                Boolean valueOf = Boolean.valueOf(hl.a(str2));
                o oVar3 = this.f85104c.f84817a;
                if (oVar3 != null) {
                    str3 = oVar3.s;
                } else {
                    str3 = null;
                }
                Boolean valueOf2 = Boolean.valueOf(hl.a(str3));
                o oVar4 = this.f85104c.f84817a;
                if (!(oVar4 == null || (aVar = oVar4.t) == null)) {
                    str4 = aVar.f85273b;
                }
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("payment_method", j2, null, null, null, null, str, valueOf, valueOf2, str4, 60);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(PaymentInfoVH paymentInfoVH, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c cVar) {
            super(700);
            this.f85103b = paymentInfoVH;
            this.f85104c = cVar;
        }
    }

    public static final class e extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85105a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PaymentInfoVH f85106b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c f85107c;

        static {
            Covode.recordClassIndex(53191);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            if (view != null) {
                OrderSubmitViewModel m2 = this.f85106b.m();
                Context context = this.f85106b.f85096f.getContext();
                l.b(context, "");
                m2.a(context, false);
                HashMap<String, Object> j2 = this.f85106b.m().j();
                o oVar = this.f85107c.f84817a;
                String str2 = null;
                if (oVar != null) {
                    str = oVar.c();
                } else {
                    str = null;
                }
                o oVar2 = this.f85107c.f84817a;
                if (oVar2 != null) {
                    str2 = oVar2.f85345l;
                }
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("add_new_payment", j2, null, null, null, null, str, Boolean.valueOf(hl.a(str2)), null, null, 828);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(PaymentInfoVH paymentInfoVH, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c cVar) {
            super(700);
            this.f85106b = paymentInfoVH;
            this.f85107c = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentInfoVH(View view) {
        super(view);
        l.d(view, "");
        this.f85096f = view;
        h.k.c a2 = h.f.b.ab.a(OrderSubmitViewModel.class);
        this.f85097j = h.i.a((h.f.a.a) new a(this, a2, a2));
        this.f85100m = (int) n.b(view.getContext(), 25.6f);
        this.n = (int) n.b(view.getContext(), 16.0f);
        this.o = (int) n.b(view.getContext(), 4.0f);
        e.a aVar = new e.a();
        aVar.f39831e = n.b(view.getContext(), 2.0f);
        com.bytedance.lighten.a.e a3 = aVar.a();
        l.b(a3, "");
        this.p = a3;
        this.q = (int) n.b(view.getContext(), 26.0f);
        this.r = (int) n.b(view.getContext(), 14.0f);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c cVar) {
        boolean z;
        List<String> subList;
        boolean z2;
        String str;
        String string;
        String str2;
        String str3;
        String str4;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar2;
        MethodCollector.i(5899);
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c cVar2 = cVar;
        String str11 = "";
        l.d(cVar2, str11);
        int i2 = 8;
        if (!cVar2.f84822f) {
            this.f85096f.setVisibility(8);
            MethodCollector.o(5899);
            return;
        }
        this.f85096f.setVisibility(0);
        String str12 = null;
        if (!this.f85098k) {
            this.f85098k = true;
            HashMap<String, Object> j2 = m().j();
            o oVar = cVar2.f84817a;
            if (oVar != null) {
                str7 = oVar.c();
            } else {
                str7 = null;
            }
            o oVar2 = cVar2.f84817a;
            if (oVar2 != null) {
                str8 = oVar2.f85345l;
            } else {
                str8 = null;
            }
            Boolean valueOf = Boolean.valueOf(hl.a(str8));
            o oVar3 = cVar2.f84817a;
            if (oVar3 != null) {
                str9 = oVar3.s;
            } else {
                str9 = null;
            }
            Boolean valueOf2 = Boolean.valueOf(hl.a(str9));
            o oVar4 = cVar2.f84817a;
            if (oVar4 == null || (aVar2 = oVar4.t) == null) {
                str10 = null;
            } else {
                str10 = aVar2.f85273b;
            }
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("payment_method", j2, (String) null, (String) null, str7, valueOf, valueOf2, str10, 60);
        }
        View view = this.f85096f;
        String string2 = view.getContext().getString(R.string.bip);
        l.b(string2, str11);
        OrderSubmitInfoView orderSubmitInfoView = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
        if (orderSubmitInfoView != null) {
            String string3 = view.getContext().getString(R.string.bix);
            l.b(string3, str11);
            orderSubmitInfoView.setTitleText(string3);
        }
        OrderSubmitInfoView orderSubmitInfoView2 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
        if (orderSubmitInfoView2 != null) {
            orderSubmitInfoView2.setTitleFont(42);
        }
        OrderSubmitInfoView orderSubmitInfoView3 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
        if (orderSubmitInfoView3 != null) {
            orderSubmitInfoView3.setDescColor(androidx.core.content.b.c(view.getContext(), R.color.c5));
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.r7);
        l.b(linearLayout, str11);
        linearLayout.setVisibility(8);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.fbc);
        l.b(tuxIconView, str11);
        tuxIconView.setVisibility(8);
        if (cVar2.f84821e) {
            OrderSubmitInfoView orderSubmitInfoView4 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
            o oVar5 = cVar2.f84817a;
            if (!(oVar5 == null || (str6 = oVar5.f85335b) == null)) {
                string2 = str6;
            }
            orderSubmitInfoView4.setDescText(string2);
            OrderSubmitInfoView orderSubmitInfoView5 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
            if (orderSubmitInfoView5 != null) {
                o oVar6 = cVar2.f84817a;
                if (oVar6 != null) {
                    str5 = oVar6.f85338e;
                } else {
                    str5 = null;
                }
                orderSubmitInfoView5.setDescImage(str5);
            }
            OrderSubmitInfoView orderSubmitInfoView6 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
            if (orderSubmitInfoView6 != null) {
                orderSubmitInfoView6.setDescImageAlpha(1.0f);
            }
            OrderSubmitInfoView orderSubmitInfoView7 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
            if (orderSubmitInfoView7 != null) {
                orderSubmitInfoView7.a(true);
            }
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.hj);
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            o oVar7 = cVar2.f84817a;
            if (oVar7 != null) {
                str4 = oVar7.s;
            } else {
                str4 = null;
            }
            if (hl.a(str4)) {
                str12 = str4;
            }
            if (str12 != null) {
                LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.r7);
                l.b(linearLayout3, str11);
                linearLayout3.setVisibility(0);
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.r8);
                l.b(tuxTextView, str11);
                tuxTextView.setText(str12);
                ((TuxTextView) view.findViewById(R.id.r8)).setTextColor(androidx.core.content.b.c(view.getContext(), R.color.c4));
            }
            o oVar8 = cVar2.f84817a;
            if (!(oVar8 == null || (aVar = oVar8.t) == null || !l.a((Object) false, (Object) aVar.f85272a))) {
                LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.r7);
                l.b(linearLayout4, str11);
                linearLayout4.setVisibility(0);
                TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.fbc);
                l.b(tuxIconView2, str11);
                tuxIconView2.setVisibility(0);
                ((TuxTextView) view.findViewById(R.id.r8)).setTextColor(androidx.core.content.b.c(view.getContext(), R.color.bd));
                OrderSubmitInfoView orderSubmitInfoView8 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
                if (orderSubmitInfoView8 != null) {
                    orderSubmitInfoView8.setDescColor(androidx.core.content.b.c(view.getContext(), R.color.bz));
                }
                OrderSubmitInfoView orderSubmitInfoView9 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
                if (orderSubmitInfoView9 != null) {
                    orderSubmitInfoView9.setDescImageAlpha(0.3f);
                }
            }
        } else {
            if (!this.f85099l) {
                this.f85099l = true;
                HashMap<String, Object> j3 = m().j();
                o oVar9 = cVar2.f84817a;
                if (oVar9 != null) {
                    str2 = oVar9.c();
                } else {
                    str2 = null;
                }
                o oVar10 = cVar2.f84817a;
                if (oVar10 != null) {
                    str3 = oVar10.f85345l;
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("add_new_payment", j3, (String) null, (String) null, str2, Boolean.valueOf(hl.a(str3)), (Boolean) null, (String) null, 828);
            }
            LinearLayout linearLayout5 = (LinearLayout) view.findViewById(R.id.hj);
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(0);
            }
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.ajm);
            if (tuxTextView2 != null) {
                o oVar11 = cVar2.f84817a;
                if (oVar11 == null || (string = oVar11.f85335b) == null) {
                    string = view.getContext().getString(R.string.bix);
                }
                tuxTextView2.setText(string);
            }
            o oVar12 = cVar2.f84817a;
            if (oVar12 == null || (str = oVar12.f85345l) == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.ajm);
                l.b(tuxTextView3, str11);
                ViewGroup.LayoutParams layoutParams = tuxTextView3.getLayoutParams();
                if (layoutParams != null) {
                    ((ConstraintLayout.a) layoutParams).topMargin = this.q;
                    TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.d2j);
                    l.b(tuxTextView4, str11);
                    tuxTextView4.setVisibility(8);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    MethodCollector.o(5899);
                    throw nullPointerException;
                }
            } else {
                TuxTextView tuxTextView5 = (TuxTextView) view.findViewById(R.id.ajm);
                l.b(tuxTextView5, str11);
                ViewGroup.LayoutParams layoutParams2 = tuxTextView5.getLayoutParams();
                if (layoutParams2 != null) {
                    ((ConstraintLayout.a) layoutParams2).topMargin = this.r;
                    TuxTextView tuxTextView6 = (TuxTextView) view.findViewById(R.id.d2j);
                    l.b(tuxTextView6, str11);
                    tuxTextView6.setVisibility(0);
                    TuxTextView tuxTextView7 = (TuxTextView) view.findViewById(R.id.d2j);
                    l.b(tuxTextView7, str11);
                    o oVar13 = cVar2.f84817a;
                    if (oVar13 != null) {
                        str12 = oVar13.f85345l;
                    }
                    tuxTextView7.setText(str12);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    MethodCollector.o(5899);
                    throw nullPointerException2;
                }
            }
            List<o> list = cVar2.f84818b;
            OrderSubmitInfoView orderSubmitInfoView10 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
            if (orderSubmitInfoView10 != null) {
                if (list != null && list.size() > 1) {
                    str11 = string2;
                }
                orderSubmitInfoView10.setDescText(str11);
            }
            OrderSubmitInfoView orderSubmitInfoView11 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
            if (orderSubmitInfoView11 != null) {
                if (list == null || list.size() <= 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                orderSubmitInfoView11.a(z2);
            }
            LinearLayout linearLayout6 = (LinearLayout) view.findViewById(R.id.d2n);
            if (linearLayout6 != null) {
                linearLayout6.removeAllViews();
            }
            if (list == null || list.size() == 1) {
                TuxTextView tuxTextView8 = (TuxTextView) view.findViewById(R.id.d2m);
                if (tuxTextView8 != null) {
                    tuxTextView8.setVisibility(8);
                }
                LinearLayout linearLayout7 = (LinearLayout) view.findViewById(R.id.d2n);
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(8);
                }
            } else {
                TuxTextView tuxTextView9 = (TuxTextView) view.findViewById(R.id.d2m);
                if (tuxTextView9 != null) {
                    if (cVar2.f84820d != null) {
                        i2 = 0;
                    }
                    tuxTextView9.setVisibility(i2);
                }
                TuxTextView tuxTextView10 = (TuxTextView) view.findViewById(R.id.d2m);
                if (tuxTextView10 != null) {
                    tuxTextView10.setText(cVar2.f84820d);
                }
                LinearLayout linearLayout8 = (LinearLayout) view.findViewById(R.id.d2n);
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
                List<String> list2 = cVar2.f84819c;
                if (!(list2 == null || (subList = list2.subList(0, h.j.h.c(6, cVar2.f84819c.size()))) == null)) {
                    Iterator<T> it = subList.iterator();
                    while (it.hasNext()) {
                        SmartImageView smartImageView = new SmartImageView(view.getContext());
                        smartImageView.setLayoutParams(new LinearLayout.LayoutParams(this.f85100m, this.n));
                        com.bytedance.tux.h.i.b(smartImageView, null, null, Integer.valueOf(this.o), null, false, 27);
                        v a2 = r.a((String) it.next());
                        a2.f39916l = R.drawable.a5x;
                        a2.E = smartImageView;
                        a2.c();
                        smartImageView.setCircleOptions(this.p);
                        LinearLayout linearLayout9 = (LinearLayout) view.findViewById(R.id.d2n);
                        if (linearLayout9 != null) {
                            linearLayout9.addView(smartImageView);
                        }
                    }
                }
            }
        }
        if (cVar2.f84818b != null) {
            if (cVar2.f84818b.size() != 1 || cVar2.f84821e) {
                OrderSubmitInfoView orderSubmitInfoView12 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
                if (orderSubmitInfoView12 != null) {
                    orderSubmitInfoView12.setOnClickListener(new d(this, cVar2));
                }
            } else {
                OrderSubmitInfoView orderSubmitInfoView13 = (OrderSubmitInfoView) view.findViewById(R.id.d2i);
                if (orderSubmitInfoView13 != null) {
                    orderSubmitInfoView13.setOnClickListener(new b());
                }
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.hi);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new e(this, cVar2));
            MethodCollector.o(5899);
            return;
        }
        MethodCollector.o(5899);
    }

    static final class f extends h.f.b.m implements h.f.a.m<Boolean, Integer, z> {
        final /* synthetic */ View $this_apply$inlined;
        final /* synthetic */ PaymentInfoVH this$0;

        static {
            Covode.recordClassIndex(53192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view, PaymentInfoVH paymentInfoVH) {
            super(2);
            this.$this_apply$inlined = view;
            this.this$0 = paymentInfoVH;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, Integer num) {
            SuperElement superElement;
            SuperElement superElement2;
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            if (!booleanValue && (superElement = (SuperElement) this.$this_apply$inlined.findViewById(R.id.eev)) != null && superElement.hasFocus() && (superElement2 = (SuperElement) this.$this_apply$inlined.findViewById(R.id.eev)) != null) {
                superElement2.clearFocus();
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c>, Boolean, z> {
        final /* synthetic */ View $this_apply;
        final /* synthetic */ PaymentInfoVH this$0;

        static {
            Covode.recordClassIndex(53194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(View view, PaymentInfoVH paymentInfoVH) {
            super(2);
            this.$this_apply = view;
            this.this$0 = paymentInfoVH;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c> jediSimpleViewHolder, Boolean bool) {
            o oVar;
            boolean z;
            boolean booleanValue = bool.booleanValue();
            l.d(jediSimpleViewHolder, "");
            if (booleanValue) {
                SuperElement superElement = (SuperElement) this.$this_apply.findViewById(R.id.eev);
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e eVar = superElement.f85492c;
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar2 = superElement.f85490a;
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar = superElement.f85491b;
                if (nVar != null) {
                    oVar = nVar.f85329b;
                } else {
                    oVar = null;
                }
                if (!(eVar == null || eVar2 == null || oVar == null)) {
                    String a2 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.c.a(eVar2, oVar, eVar.getValue());
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar2 = superElement.f85491b;
                    if (nVar2 != null) {
                        if (a2 == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        nVar2.f85331d = Boolean.valueOf(z);
                    }
                    eVar.a(eVar2, oVar, eVar.getValue(), a2);
                }
                this.this$0.m().b(false);
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c>, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, z> {
        final /* synthetic */ View $this_apply;
        final /* synthetic */ PaymentInfoVH this$0;

        static {
            Covode.recordClassIndex(53193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(View view, PaymentInfoVH paymentInfoVH) {
            super(2);
            this.$this_apply = view;
            this.this$0 = paymentInfoVH;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c> jediSimpleViewHolder, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar) {
            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> paymentElements;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO2;
            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> list;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar2 = nVar;
            l.d(jediSimpleViewHolder, "");
            if (nVar2 != null) {
                o oVar = nVar2.f85329b;
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar = (oVar == null || (list = oVar.r) == null) ? null : (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e) h.a.n.h((List) list);
                if (eVar != null) {
                    SuperElement superElement = (SuperElement) this.$this_apply.findViewById(R.id.eev);
                    l.b(superElement, "");
                    superElement.setVisibility(0);
                    SuperElement superElement2 = (SuperElement) this.$this_apply.findViewById(R.id.eev);
                    l.d(eVar, "");
                    l.d(nVar2, "");
                    superElement2.f85490a = eVar;
                    superElement2.f85491b = nVar2;
                    o oVar2 = nVar2.f85329b;
                    if (oVar2 != null) {
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e eVar2 = superElement2.f85492c;
                        if (!l.a((Object) ((eVar2 == null || (elementDTO2 = eVar2.getElementDTO()) == null) ? null : elementDTO2.f85288a), (Object) eVar.f85288a)) {
                            o oVar3 = nVar2.f85329b;
                            Context context = superElement2.getContext();
                            l.b(context, "");
                            superElement2.f85492c = e.a.a(eVar, oVar3, context);
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e eVar3 = superElement2.f85492c;
                            String str = (eVar3 == null || (elementDTO = eVar3.getElementDTO()) == null) ? null : elementDTO.f85288a;
                            if (!l.a((Object) str, (Object) eVar.f85288a)) {
                                superElement2.removeAllViews();
                            }
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e eVar4 = superElement2.f85492c;
                            Objects.requireNonNull(eVar4, "null cannot be cast to non-null type android.view.View");
                            superElement2.addView((View) eVar4);
                        }
                        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> a2 = eVar.a();
                        ArrayList arrayList = new ArrayList();
                        for (T t : a2) {
                            p pVar = nVar2.f85328a;
                            if (pVar != null && (paymentElements = pVar.getPaymentElements()) != null) {
                                Iterator<T> it = paymentElements.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    if (l.a((Object) next.getElement(), (Object) t.f85288a)) {
                                        if (next != null) {
                                            arrayList.add(next);
                                        }
                                    }
                                }
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e eVar5 = superElement2.f85492c;
                        if (eVar5 != null) {
                            eVar5.a(eVar, oVar2, arrayList2, null);
                            if (eVar5 instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g) {
                                ((com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g) eVar5).setOnVerify(new SuperElement.a(superElement2, eVar, oVar2, arrayList2));
                            }
                        }
                    }
                    this.this$0.m().c(false);
                } else {
                    SuperElement superElement3 = (SuperElement) this.$this_apply.findViewById(R.id.eev);
                    l.b(superElement3, "");
                    superElement3.setVisibility(8);
                    this.this$0.m().c(true);
                }
            }
            return z.f158842a;
        }
    }
}
