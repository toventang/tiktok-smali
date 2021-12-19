package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.s;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.ab;
import h.m.p;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public final class OrderSubmitBottomWidget extends JediBaseWidget implements au {

    /* renamed from: j  reason: collision with root package name */
    public static final b f85163j = new b((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public boolean f85164h;

    /* renamed from: i  reason: collision with root package name */
    public String f85165i;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f85166k;

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final k f85172a = new k();

        static {
            Covode.recordClassIndex(53240);
        }

        k() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(53226);
    }

    @Override // com.bytedance.widget.Widget
    public final int b() {
        return R.layout.re;
    }

    public final OrderSubmitViewModel l() {
        return (OrderSubmitViewModel) this.f85166k.getValue();
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(53228);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public OrderSubmitBottomWidget() {
        h.k.c a2 = ab.a(OrderSubmitViewModel.class);
        this.f85166k = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    public static final class a extends h.f.b.m implements h.f.a.a<OrderSubmitViewModel> {
        final /* synthetic */ Widget $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = widget;
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_widget_OrderSubmitBottomWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void c() {
        super.c();
        View view = this.f46127e;
        if (view != null) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.eps);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setText(view.getContext().getString(R.string.fxu));
            f.a.b.b unused = selectSubscribe(l(), a.f85173a, new ah(), new c(view, this));
            f.a.b.b unused2 = selectSubscribe(l(), e.f85177a, new ah(), new d(view, this));
            f.a.b.b unused3 = selectSubscribe(l(), f.f85178a, g.f85179a, new ah(), new e(view, this));
            f.a.b.b unused4 = selectSubscribe(l(), h.f85180a, new ah(), new f(view, this));
            f.a.b.b unused5 = selectSubscribe(l(), b.f85174a, new ah(), new i(view));
            f.a.b.b unused6 = selectSubscribe(l(), c.f85175a, d.f85176a, new ah(), new j(view));
            TuxButton tuxButton = (TuxButton) view.findViewById(R.id.d5a);
            h.f.b.l.b(tuxButton, "");
            tuxButton.setOnClickListener(new g(view, this));
            View findViewById = view.findViewById(R.id.eeu);
            h.f.b.l.b(findViewById, "");
            findViewById.setOnClickListener(new h(this));
            view.setOnClickListener(k.f85172a);
        }
    }

    public static final class h extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85170a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OrderSubmitBottomWidget f85171b;

        static {
            Covode.recordClassIndex(53236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(700);
            this.f85171b = orderSubmitBottomWidget;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                OrderSubmitBottomWidget orderSubmitBottomWidget = this.f85171b;
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("total", orderSubmitBottomWidget.l().j(), null, null, null, null, null, null, null, null, 1020);
                orderSubmitBottomWidget.withState(orderSubmitBottomWidget.l(), new l(orderSubmitBottomWidget));
            }
        }
    }

    public static final class g extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85167a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f85168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ OrderSubmitBottomWidget f85169c;

        static {
            Covode.recordClassIndex(53234);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                OrderSubmitBottomWidget orderSubmitBottomWidget = this.f85169c;
                orderSubmitBottomWidget.withState(orderSubmitBottomWidget.l(), new h.f.a.b<OrderSubmitState, z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget.g.AnonymousClass1 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(53235);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(OrderSubmitState orderSubmitState) {
                        Boolean bool;
                        s placeOrderButtonText;
                        n userPaymentInfo;
                        o oVar;
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar;
                        String str;
                        String str2;
                        o oVar2;
                        o oVar3;
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar2;
                        OrderSubmitState orderSubmitState2 = orderSubmitState;
                        h.f.b.l.d(orderSubmitState2, "");
                        if (orderSubmitState2.getReachableAny()) {
                            n userPaymentInfo2 = orderSubmitState2.getUserPaymentInfo();
                            String str3 = null;
                            if (userPaymentInfo2 == null || (oVar3 = userPaymentInfo2.f85329b) == null || (aVar2 = oVar3.t) == null) {
                                bool = null;
                            } else {
                                bool = aVar2.f85272a;
                            }
                            if (h.f.b.l.a((Object) bool, (Object) false) && (userPaymentInfo = orderSubmitState2.getUserPaymentInfo()) != null && (oVar = userPaymentInfo.f85329b) != null && (aVar = oVar.t) != null && (str = aVar.f85274c) != null && hl.a(str)) {
                                OrderSubmitViewModel l2 = this.this$0.f85169c.l();
                                Context context = this.this$0.f85168b.getContext();
                                h.f.b.l.b(context, "");
                                n userPaymentInfo3 = orderSubmitState2.getUserPaymentInfo();
                                if (userPaymentInfo3 == null || (oVar2 = userPaymentInfo3.f85329b) == null) {
                                    str2 = null;
                                } else {
                                    str2 = oVar2.c();
                                }
                                h.f.b.l.d(context, "");
                                h.f.b.l.d(str, "");
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("balance_insufficient", (String) null, str2);
                                ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(a.C1094a.a(context).d(str), new OrderSubmitViewModel.ai(l2, context, str2)).a(false)).a().b().show();
                            } else if (!orderSubmitState2.getHasAddress()) {
                                this.this$0.f85169c.l().a(this.this$0.f85168b.getContext());
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("add_shipping_address", "next", this.this$0.f85169c.l().j(), (String) null, (String) null, (Boolean) null, (String) null, (Boolean) null, 240);
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("bottom");
                            } else if (orderSubmitState2.getUserPaymentInfo() == null) {
                                OrderSubmitViewModel l3 = this.this$0.f85169c.l();
                                Context context2 = this.this$0.f85168b.getContext();
                                h.f.b.l.b(context2, "");
                                l3.a(context2, false);
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("add_payment_method", "confirm", this.this$0.f85169c.l().j(), (String) null, (String) null, (Boolean) null, (String) null, (Boolean) null, 240);
                            } else {
                                if (orderSubmitState2.getOrderSummaryPanelOpened()) {
                                    this.this$0.f85169c.l().a(false);
                                }
                                HashMap<String, Object> j2 = this.this$0.f85169c.l().j();
                                h.f.b.l.d(j2, "");
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.putAll(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84785a);
                                linkedHashMap.putAll(j2);
                                com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_submit_order", linkedHashMap);
                                BillInfoData billInfoData = this.this$0.f85169c.l().f84735k;
                                if (!(billInfoData == null || (placeOrderButtonText = billInfoData.getPlaceOrderButtonText()) == null)) {
                                    str3 = placeOrderButtonText.f85003a;
                                }
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(com.ss.android.ugc.aweme.ecommerce.track.b.a(str3), "place_order", this.this$0.f85169c.l().j(), (String) null, (String) null, (Boolean) null, (String) null, (Boolean) null, 240);
                                this.this$0.f85169c.l().b(this.this$0.f85168b.getContext());
                            }
                        }
                        return z.f158842a;
                    }
                });
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(700);
            this.f85168b = view;
            this.f85169c = orderSubmitBottomWidget;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<OrderSubmitState, z> {
        final /* synthetic */ OrderSubmitBottomWidget this$0;

        static {
            Covode.recordClassIndex(53241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(1);
            this.this$0 = orderSubmitBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            if (orderSubmitState2.getOrderSummaryPanelOpened()) {
                this.this$0.l().a(false);
            } else {
                this.this$0.l().a(true);
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ View $this_apply;
        final /* synthetic */ OrderSubmitBottomWidget this$0;

        static {
            Covode.recordClassIndex(53232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(2);
            this.$this_apply = view;
            this.this$0 = orderSubmitBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            final boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar2, "");
            iVar2.withState(this.this$0.l(), new h.f.a.b<OrderSubmitState, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(53233);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(OrderSubmitState orderSubmitState) {
                    String string;
                    s placeOrderButtonText;
                    OrderSubmitState orderSubmitState2 = orderSubmitState;
                    h.f.b.l.d(orderSubmitState2, "");
                    int i2 = 0;
                    if (booleanValue) {
                        TuxIconView tuxIconView = (TuxIconView) this.this$0.$this_apply.findViewById(R.id.emv);
                        h.f.b.l.b(tuxIconView, "");
                        tuxIconView.setVisibility(0);
                        TuxTextView tuxTextView = (TuxTextView) this.this$0.$this_apply.findViewById(R.id.eps);
                        h.f.b.l.b(tuxTextView, "");
                        tuxTextView.setVisibility(0);
                        TuxTextView tuxTextView2 = (TuxTextView) this.this$0.$this_apply.findViewById(R.id.epr);
                        h.f.b.l.b(tuxTextView2, "");
                        tuxTextView2.setVisibility(0);
                        ((TuxButton) this.this$0.$this_apply.findViewById(R.id.d5a)).setButtonVariant(0);
                    } else {
                        TuxIconView tuxIconView2 = (TuxIconView) this.this$0.$this_apply.findViewById(R.id.emv);
                        h.f.b.l.b(tuxIconView2, "");
                        tuxIconView2.setVisibility(8);
                        TuxTextView tuxTextView3 = (TuxTextView) this.this$0.$this_apply.findViewById(R.id.eps);
                        h.f.b.l.b(tuxTextView3, "");
                        tuxTextView3.setVisibility(8);
                        TuxTextView tuxTextView4 = (TuxTextView) this.this$0.$this_apply.findViewById(R.id.epr);
                        h.f.b.l.b(tuxTextView4, "");
                        tuxTextView4.setVisibility(8);
                        TuxTextView tuxTextView5 = (TuxTextView) this.this$0.$this_apply.findViewById(R.id.ayj);
                        h.f.b.l.b(tuxTextView5, "");
                        if (orderSubmitState2.getHasAddress()) {
                            i2 = 8;
                        }
                        tuxTextView5.setVisibility(i2);
                        TuxButton tuxButton = (TuxButton) this.this$0.$this_apply.findViewById(R.id.d5a);
                        h.f.b.l.b(tuxButton, "");
                        if (orderSubmitState2.getHasAddress()) {
                            BillInfoData billInfoData = this.this$0.this$0.l().f84735k;
                            if (billInfoData == null || (placeOrderButtonText = billInfoData.getPlaceOrderButtonText()) == null) {
                                string = null;
                            } else {
                                string = placeOrderButtonText.f85004b;
                            }
                        } else {
                            string = this.this$0.$this_apply.getContext().getString(R.string.fx5);
                        }
                        tuxButton.setText(string);
                        TuxButton tuxButton2 = (TuxButton) this.this$0.$this_apply.findViewById(R.id.d5a);
                        h.f.b.l.b(tuxButton2, "");
                        tuxButton2.setBackground(androidx.core.content.b.a(this.this$0.$this_apply.getContext(), (int) R.drawable.xv));
                        ((TuxButton) this.this$0.$this_apply.findViewById(R.id.d5a)).setTextColor(androidx.core.content.b.c(this.this$0.$this_apply.getContext(), R.color.bz));
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, String, z> {
        final /* synthetic */ View $this_apply;
        final /* synthetic */ OrderSubmitBottomWidget this$0;

        static {
            Covode.recordClassIndex(53229);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(2);
            this.$this_apply = view;
            this.this$0 = orderSubmitBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            String str2 = str;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(str2, "");
            TuxTextView tuxTextView = (TuxTextView) this.$this_apply.findViewById(R.id.epr);
            if (tuxTextView != null) {
                tuxTextView.setText(str2);
            }
            if (!this.this$0.f85164h) {
                this.this$0.f85164h = true;
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("total", this.this$0.l().j(), (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, 1020);
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ View $this_apply;

        static {
            Covode.recordClassIndex(53237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(View view) {
            super(2);
            this.$this_apply = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                TuxIconView tuxIconView = (TuxIconView) this.$this_apply.findViewById(R.id.emv);
                h.f.b.l.b(tuxIconView, "");
                tuxIconView.setRotation(180.0f);
            } else {
                TuxIconView tuxIconView2 = (TuxIconView) this.$this_apply.findViewById(R.id.emv);
                h.f.b.l.b(tuxIconView2, "");
                tuxIconView2.setRotation(0.0f);
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ View $this_apply;
        final /* synthetic */ OrderSubmitBottomWidget this$0;

        static {
            Covode.recordClassIndex(53230);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(2);
            this.$this_apply = view;
            this.this$0 = orderSubmitBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(iVar, "");
            if (intValue > 0 && this.this$0.l().f84728a != 0) {
                Context context = this.$this_apply.getContext();
                h.f.b.l.b(context, "");
                SpannableString spannableString = new SpannableString(context.getResources().getQuantityString(R.plurals.c0, intValue, Integer.valueOf(intValue)));
                int a2 = p.a((CharSequence) spannableString, "(", 0, false, 6);
                int a3 = p.a((CharSequence) spannableString, ")", 0, false, 6) + 1;
                if (!(a2 == -1 || a3 == -1 || a2 >= a3)) {
                    spannableString.setSpan(new com.bytedance.tux.f.a.b(31, true), a2, a3, 33);
                }
                TuxTextView tuxTextView = (TuxTextView) this.$this_apply.findViewById(R.id.eps);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setText(spannableString);
            }
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements q<com.bytedance.jedi.arch.i, Boolean, n, z> {
        final /* synthetic */ View $this_apply;
        final /* synthetic */ OrderSubmitBottomWidget this$0;

        static {
            Covode.recordClassIndex(53231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
            super(3);
            this.$this_apply = view;
            this.this$0 = orderSubmitBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool, n nVar) {
            String str;
            String a2;
            s placeOrderButtonText;
            TuxButton tuxButton;
            s placeOrderButtonText2;
            String str2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            String str3 = null;
            if (!booleanValue) {
                a2 = "add_shipping_address";
            } else if (nVar == null) {
                a2 = "add_payment_method";
            } else {
                BillInfoData billInfoData = this.this$0.l().f84735k;
                if (billInfoData == null || (placeOrderButtonText = billInfoData.getPlaceOrderButtonText()) == null) {
                    str = null;
                } else {
                    str = placeOrderButtonText.f85003a;
                }
                a2 = com.ss.android.ugc.aweme.ecommerce.track.b.a(str);
            }
            if (!h.f.b.l.a((Object) a2, (Object) this.this$0.f85165i)) {
                if (h.f.b.l.a((Object) a2, (Object) "add_shipping_address") || h.f.b.l.a((Object) a2, (Object) "add_payment_method")) {
                    str2 = "next";
                } else {
                    str2 = "place_order";
                }
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(a2, str2, this.this$0.l().j(), (String) null, (String) null, (Boolean) null, 112);
                this.this$0.f85165i = a2;
            }
            if (!booleanValue) {
                TuxButton tuxButton2 = (TuxButton) this.$this_apply.findViewById(R.id.d5a);
                h.f.b.l.b(tuxButton2, "");
                tuxButton2.setText(this.$this_apply.getContext().getString(R.string.fx5));
                TuxTextView tuxTextView = (TuxTextView) this.$this_apply.findViewById(R.id.ayj);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setVisibility(0);
            } else {
                if (nVar == null) {
                    tuxButton = (TuxButton) this.$this_apply.findViewById(R.id.d5a);
                    h.f.b.l.b(tuxButton, "");
                    str3 = this.$this_apply.getContext().getString(R.string.bio);
                } else {
                    tuxButton = (TuxButton) this.$this_apply.findViewById(R.id.d5a);
                    h.f.b.l.b(tuxButton, "");
                    BillInfoData billInfoData2 = this.this$0.l().f84735k;
                    if (!(billInfoData2 == null || (placeOrderButtonText2 = billInfoData2.getPlaceOrderButtonText()) == null)) {
                        str3 = placeOrderButtonText2.f85004b;
                    }
                }
                tuxButton.setText(str3);
                TuxTextView tuxTextView2 = (TuxTextView) this.$this_apply.findViewById(R.id.ayj);
                h.f.b.l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
            }
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements q<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.j, Boolean, z> {
        final /* synthetic */ View $this_apply;

        static {
            Covode.recordClassIndex(53238);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(View view) {
            super(3);
            this.$this_apply = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.j jVar, Boolean bool) {
            Set<String> keySet;
            String str;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.j jVar2 = jVar;
            final boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            AnonymousClass1 r0 = new h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.j, Boolean>() {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget.j.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(53239);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.j jVar) {
                    return Boolean.valueOf(a(jVar));
                }

                public final boolean a(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.j jVar) {
                    HashMap<String, String> hashMap;
                    Set<String> keySet;
                    h.f.b.l.d(jVar, "");
                    String str = jVar.f84969a;
                    if (str == null || str.length() == 0 || (hashMap = jVar.f84970b) == null || hashMap.isEmpty() || (keySet = jVar.f84970b.keySet()) == null || keySet.isEmpty() || booleanValue) {
                        return true;
                    }
                    return false;
                }
            };
            if (jVar2 == null || r0.a(jVar2)) {
                TuxTextView tuxTextView = (TuxTextView) this.$this_apply.findViewById(R.id.vv);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setVisibility(8);
            } else {
                String str2 = jVar2.f84969a;
                HashMap<String, String> hashMap = jVar2.f84970b;
                if (!(hashMap == null || (keySet = hashMap.keySet()) == null || (str = (String) h.a.n.c((Iterable) keySet)) == null)) {
                    h.f.b.l.b(str, "");
                    String str3 = jVar2.f84970b.get(str);
                    if (str3 != null) {
                        h.f.b.l.b(str3, "");
                        if (str2 != null) {
                            int a2 = p.a((CharSequence) str2, str, 0, false, 6);
                            int length = str.length() + a2;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            String substring = str2.substring(0, a2);
                            h.f.b.l.b(substring, "");
                            spannableStringBuilder.append((CharSequence) substring);
                            SpannableString spannableString = new SpannableString(str3);
                            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(this.$this_apply.getContext(), R.color.bh)), 0, str3.length(), 33);
                            spannableStringBuilder.append((CharSequence) spannableString);
                            String substring2 = str2.substring(length);
                            h.f.b.l.b(substring2, "");
                            spannableStringBuilder.append((CharSequence) substring2);
                            TuxTextView tuxTextView2 = (TuxTextView) this.$this_apply.findViewById(R.id.vv);
                            h.f.b.l.b(tuxTextView2, "");
                            tuxTextView2.setText(spannableStringBuilder);
                            TuxTextView tuxTextView3 = (TuxTextView) this.$this_apply.findViewById(R.id.vv);
                            h.f.b.l.b(tuxTextView3, "");
                            tuxTextView3.setVisibility(0);
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }
}
