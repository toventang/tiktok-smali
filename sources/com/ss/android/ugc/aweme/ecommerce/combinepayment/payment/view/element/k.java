package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.ss.android.ugc.aweme.ecommerce.address.widget.b;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class k extends g {

    /* renamed from: b  reason: collision with root package name */
    private o f85639b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85640c;

    /* renamed from: d  reason: collision with root package name */
    private List<Region> f85641d;

    /* renamed from: e  reason: collision with root package name */
    private h.f.a.b<? super l, z> f85642e;

    /* renamed from: g  reason: collision with root package name */
    private h.f.a.b<? super List<m>, z> f85643g;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f85644h;

    static {
        Covode.recordClassIndex(53560);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g, com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final View a(int i2) {
        if (this.f85644h == null) {
            this.f85644h = new SparseArray();
        }
        View view = (View) this.f85644h.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85644h.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final int getContentViewLayoutId() {
        return R.layout.pa;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g
    public final InputWithIndicator getInputView() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e getElementDTO() {
        return this.f85640c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z>, h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z> */
    public final h.f.a.b<l, z> getOnRegionPanelStatus() {
        return this.f85642e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final h.f.a.b<List<m>, z> getOnValueChange() {
        return this.f85643g;
    }

    public final o getPaymentMethod() {
        return this.f85639b;
    }

    public final List<Region> getRegionList() {
        return this.f85641d;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f85647a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85648b;

        static {
            Covode.recordClassIndex(53562);
        }

        b(k kVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
            this.f85647a = kVar;
            this.f85648b = eVar;
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(53563);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f85647a.getOnRegionPanelStatus().invoke(l.Close);
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k$b$b  reason: collision with other inner class name */
        static final class C2049b extends h.f.b.m implements h.f.a.b<List<? extends Region>, z> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(53564);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2049b(b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends Region> list) {
                List<? extends Region> list2 = list;
                l.d(list2, "");
                this.this$0.f85647a.setRegionList(list2);
                this.this$0.f85647a.b();
                this.this$0.f85647a.a();
                this.this$0.f85647a.getOnErrorClear().invoke();
                this.this$0.f85647a.getOnValueChange().invoke(this.this$0.f85647a.getValue());
                this.this$0.f85647a.getOnRegionPanelStatus().invoke(l.Close);
                return z.f158842a;
            }
        }

        public final void onClick(View view) {
            int i2;
            ClickAgent.onClick(view);
            Context context = this.f85647a.getContext();
            if (!(context instanceof androidx.fragment.app.e)) {
                context = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
            if (eVar != null) {
                List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> list = this.f85648b.f85296i;
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = 0;
                }
                b.a.a(false, null, i2, eVar.getSupportFragmentManager(), null, new a(this), new C2049b(this), null, 147);
                this.f85647a.getOnRegionPanelStatus().invoke(l.Open);
            }
        }
    }

    public final void b() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ej6);
        l.b(tuxTextView, "");
        tuxTextView.setText(n.a(n.h((Iterable) this.f85641d), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, e.f85651a, 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> getValue() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.k.getValue():java.util.List");
    }

    public final void setElementDTO(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
        this.f85640c = eVar;
    }

    public final void setPaymentMethod(o oVar) {
        this.f85639b = oVar;
    }

    static final class c extends h.f.b.m implements h.f.a.b<l, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f85649a = new c();

        static {
            Covode.recordClassIndex(53565);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(l lVar) {
            l.d(lVar, "");
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<List<? extends m>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f85650a = new d();

        static {
            Covode.recordClassIndex(53566);
        }

        d() {
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

    public final void setOnRegionPanelStatus(h.f.a.b<? super l, z> bVar) {
        l.d(bVar, "");
        this.f85642e = bVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void setOnValueChange(h.f.a.b<? super List<m>, z> bVar) {
        l.d(bVar, "");
        this.f85643g = bVar;
    }

    public final void setRegionList(List<Region> list) {
        l.d(list, "");
        this.f85641d = list;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<Region, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f85651a = new e();

        static {
            Covode.recordClassIndex(53567);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(Region region) {
            Region region2 = region;
            l.d(region2, "");
            String str = region2.f84320a;
            if (str != null) {
                return str;
            }
            return "";
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f85645a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f85646b;

        static {
            Covode.recordClassIndex(53561);
        }

        a(String str, k kVar) {
            this.f85645a = str;
            this.f85646b = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f85646b.getContext(), this.f85645a).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private k(Context context) {
        super(context, null, 0);
        l.d(context, "");
        this.f85641d = h.a.z.INSTANCE;
        this.f85642e = c.f85649a;
        this.f85643g = d.f85650a;
    }

    public /* synthetic */ k(Context context, byte b2) {
        this(context);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, o oVar, List<m> list, Object obj) {
        Region region;
        String str;
        String str2;
        String str3;
        l.d(eVar, "");
        l.d(oVar, "");
        super.a(eVar, oVar, list, obj);
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        String str4 = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (T t : list) {
                if (l.a((Object) t.getElement(), (Object) "eg_ccdc_global_billing_address_country_regin")) {
                    String paramValue = t.getParamValue();
                    List c2 = paramValue != null ? p.c(paramValue, new String[]{","}) : null;
                    if (c2 != null) {
                        str = (String) n.b(c2, 1);
                        str2 = (String) n.b(c2, 2);
                        str3 = (String) n.b(c2, 0);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    region = new Region(str, str2, str3);
                } else {
                    region = new Region(t.getParamValue(), null, null, 6);
                }
                arrayList.add(region);
            }
            this.f85641d = arrayList;
        }
        b();
        String str5 = eVar.f85299l;
        if (hl.a(str5)) {
            str4 = str5;
        }
        if (str4 != null) {
            View a2 = a(R.id.ak3);
            l.b(a2, "");
            a2.setVisibility(0);
            TuxIconView tuxIconView = (TuxIconView) a(R.id.bi7);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) a(R.id.bi7)).setOnClickListener(new a(str4, this));
        } else {
            View a3 = a(R.id.ak3);
            l.b(a3, "");
            a3.setVisibility(8);
            TuxIconView tuxIconView2 = (TuxIconView) a(R.id.bi7);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ej6);
        l.b(tuxTextView, "");
        tuxTextView.setHint(eVar.f85295h);
        setOnClickListener(new b(this, eVar));
    }
}
