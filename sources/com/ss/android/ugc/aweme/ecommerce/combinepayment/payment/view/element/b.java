package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class b extends LinearLayout implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f85525a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private h.f.a.b<? super List<m>, z> f85526b;

    /* renamed from: c  reason: collision with root package name */
    private o f85527c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85528d;

    /* renamed from: e  reason: collision with root package name */
    private h.f.a.b<? super String, String> f85529e;

    /* renamed from: g  reason: collision with root package name */
    private final h f85530g;

    static final class c extends h.f.b.m implements h.f.a.b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f85531a = new c();

        static {
            Covode.recordClassIndex(53506);
        }

        c() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(53503);
    }

    private final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.a getBalanceView() {
        return (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.a) this.f85530g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53504);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e getElementDTO() {
        return this.f85528d;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.String, java.lang.String>, h.f.a.b<java.lang.String, java.lang.String> */
    public final h.f.a.b<String, String> getGetBindUrl() {
        return this.f85529e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final h.f.a.b<List<m>, z> getOnValueChange() {
        return this.f85526b;
    }

    public final o getPaymentMethod() {
        return this.f85527c;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.b$b  reason: collision with other inner class name */
    static final class C2046b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.a> {
        final /* synthetic */ Context $context;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2046b(b bVar, Context context) {
            super(0);
            this.this$0 = bVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.a invoke() {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.a aVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.a(this.$context, (byte) 0);
            aVar.getBalanceTextValue();
            this.this$0.addView(aVar);
            return aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final List<m> getValue() {
        return n.a(new m("balance", null, null, null, null, 24, null));
    }

    public final void setElementDTO(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
        this.f85528d = eVar;
    }

    public final void setPaymentMethod(o oVar) {
        this.f85527c = oVar;
    }

    static final class e extends h.f.b.m implements h.f.a.b<List<? extends m>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f85535a = new e();

        static {
            Covode.recordClassIndex(53508);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends m> list) {
            l.d(list, "");
            return z.f158842a;
        }
    }

    public final void setGetBindUrl(h.f.a.b<? super String, String> bVar) {
        l.d(bVar, "");
        this.f85529e = bVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void setOnValueChange(h.f.a.b<? super List<m>, z> bVar) {
        l.d(bVar, "");
        this.f85526b = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(5829);
        this.f85526b = e.f85535a;
        this.f85529e = c.f85531a;
        this.f85530g = i.a((h.f.a.a) new C2046b(this, context));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        MethodCollector.o(5829);
    }

    public static final class d extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85532a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f85533b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f85534c;

        static {
            Covode.recordClassIndex(53507);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String invoke;
            if (view != null && (invoke = this.f85533b.getGetBindUrl().invoke(this.f85534c.f85334a)) != null && hl.a(invoke)) {
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("active_now", "confirm", (HashMap) null, "payment_method", (String) null, (Boolean) null, this.f85534c.f85335b, Boolean.valueOf(hl.a(this.f85534c.f85345l)), 52);
                EventCenter.a().a("ec_payment_method_activate_clicked", "{}");
                SmartRouter.buildRoute(this.f85533b.getContext(), invoke).open();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(b bVar, o oVar) {
            super(700);
            this.f85533b = bVar;
            this.f85534c = oVar;
        }
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, o oVar, List<m> list, Object obj) {
        String str;
        String str2;
        l.d(eVar, "");
        l.d(oVar, "");
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        getBalanceView().setBalanceTextColor(androidx.core.content.b.c(getContext(), R.color.c5));
        getBalanceView().setButtonTextValue("");
        getBalanceView().setNoteTextVisibility(false);
        getBalanceView().setNoteTextValue("");
        getBalanceView().setBalanceTextValue("");
        getBalanceView().a(false);
        String str3 = oVar.s;
        String str4 = null;
        if (str3 != null && hl.a(str3)) {
            getBalanceView().setBalanceTextValue(str3);
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar = oVar.t;
        if (aVar != null && l.a((Object) aVar.f85272a, (Object) false)) {
            getBalanceView().setBalanceTextColor(androidx.core.content.b.c(getContext(), R.color.bz));
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.c cVar = oVar.u;
        if (!(cVar == null || (str2 = cVar.f85283c) == null || !hl.a(str2))) {
            getBalanceView().setBalanceTextValue(str2);
            getBalanceView().setBalanceTextColor(androidx.core.content.b.c(getContext(), R.color.bz));
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.c cVar2 = oVar.u;
        if (!(cVar2 == null || (str = cVar2.f85282b) == null || !hl.a(str))) {
            getBalanceView().setNoteTextValue(str);
            getBalanceView().setNoteTextVisibility(true);
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.c cVar3 = oVar.u;
        if (cVar3 != null) {
            str4 = cVar3.f85281a;
        }
        if (hl.a(str4) && str4 != null) {
            getBalanceView().setButtonTextValue(str4);
            getBalanceView().a(true);
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("active_now", "confirm", (HashMap) null, "payment_method", oVar.f85335b, Boolean.valueOf(hl.a(oVar.f85345l)), 20);
            ConstraintLayout constraintLayout = (ConstraintLayout) getBalanceView().a(R.id.r9);
            l.b(constraintLayout, "");
            constraintLayout.setOnClickListener(new d(this, oVar));
        }
    }
}
