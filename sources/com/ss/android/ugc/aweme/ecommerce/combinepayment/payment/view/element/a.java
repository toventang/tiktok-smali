package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.h.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends LinearLayout implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final C2045a f85493c = new C2045a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f85494a;

    /* renamed from: b  reason: collision with root package name */
    public final int f85495b;

    /* renamed from: d  reason: collision with root package name */
    private o f85496d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85497e;

    /* renamed from: g  reason: collision with root package name */
    private h.f.a.b<? super List<m>, z> f85498g;

    /* renamed from: h  reason: collision with root package name */
    private t f85499h;

    /* renamed from: i  reason: collision with root package name */
    private h.f.a.b<? super l, z> f85500i;

    /* renamed from: j  reason: collision with root package name */
    private h.f.a.b<? super Boolean, z> f85501j;

    /* renamed from: k  reason: collision with root package name */
    private Address f85502k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f85503l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f85504m;
    private SparseArray n;

    static {
        Covode.recordClassIndex(53487);
    }

    private View a() {
        if (this.n == null) {
            this.n = new SparseArray();
        }
        View view = (View) this.n.get(R.id.egk);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.egk);
        this.n.put(R.id.egk, findViewById);
        return findViewById;
    }

    public final TuxIconView getIconView() {
        return (TuxIconView) this.f85504m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a$a  reason: collision with other inner class name */
    public static final class C2045a {
        static {
            Covode.recordClassIndex(53488);
        }

        private C2045a() {
        }

        public /* synthetic */ C2045a(byte b2) {
            this();
        }

        public static boolean a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, Address address) {
            h.f.b.l.d(eVar, "");
            if (address == null) {
                return false;
            }
            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> list = eVar.f85296i;
            if (list != null) {
                for (T t : list) {
                    String str = t.f85288a;
                    if (str == null) {
                        return false;
                    }
                    int hashCode = str.hashCode();
                    if (hashCode != -304863367) {
                        if (hashCode != 1981981399) {
                            if (hashCode == 2002908406 && str.equals("eg_ccdc_global_billing_address_street_mobile")) {
                            }
                        } else if (str.equals("eg_ccdc_global_billing_address")) {
                        }
                    } else if (str.equals("eg_ccdc_global_billing_address_postal_code")) {
                    }
                    String a2 = address.a(t.f85288a);
                    if (a2 == null || a2.length() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e getElementDTO() {
        return this.f85497e;
    }

    public final t getLogger() {
        return this.f85499h;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z>, h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z> */
    public final h.f.a.b<l, z> getOnRegionPanelStatus() {
        return this.f85500i;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final h.f.a.b<Boolean, z> getOnUseShippingAddressChange() {
        return this.f85501j;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final h.f.a.b<List<m>, z> getOnValueChange() {
        return this.f85498g;
    }

    public final o getPaymentMethod() {
        return this.f85496d;
    }

    public final Address getShippingAddress() {
        return this.f85502k;
    }

    public final boolean getUseShippingAddress() {
        return this.f85503l;
    }

    public static final class b implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f85505a;

        static {
            Covode.recordClassIndex(53489);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f85506a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f85507b;

                static {
                    Covode.recordClassIndex(53490);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f85506a < this.f85507b.f85505a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f85507b.f85505a;
                    int i2 = this.f85506a;
                    this.f85506a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f85507b = r1;
                }
            };
        }

        public b(ViewGroup viewGroup) {
            this.f85505a = viewGroup;
        }
    }

    public static final class d implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f85508a;

        static {
            Covode.recordClassIndex(53492);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f85509a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d f85510b;

                static {
                    Covode.recordClassIndex(53493);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f85509a < this.f85510b.f85508a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f85510b.f85508a;
                    int i2 = this.f85509a;
                    this.f85509a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f85510b = r1;
                }
            };
        }

        public d(ViewGroup viewGroup) {
            this.f85508a = viewGroup;
        }
    }

    public static final class l implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f85522a;

        static {
            Covode.recordClassIndex(53501);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a.l.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f85523a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ l f85524b;

                static {
                    Covode.recordClassIndex(53502);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f85523a < this.f85524b.f85522a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f85524b.f85522a;
                    int i2 = this.f85523a;
                    this.f85523a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f85524b = r1;
                }
            };
        }

        public l(ViewGroup viewGroup) {
            this.f85522a = viewGroup;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final List<m> getValue() {
        List<m> value;
        b<View> bVar = new b(this);
        ArrayList arrayList = new ArrayList();
        for (View view : bVar) {
            if ((view instanceof e) && (value = ((e) view).getValue()) != null) {
                arrayList.add(value);
            }
        }
        return n.b((Iterable) arrayList);
    }

    static final class c extends h.f.b.m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ Context $context;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(53491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, Context context) {
            super(0);
            this.this$0 = aVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            MethodCollector.i(5685);
            TuxIconView tuxIconView = new TuxIconView(this.$context, null, 0, 6);
            tuxIconView.setIconRes(R.raw.icon_info_circle);
            tuxIconView.setTintColorRes(R.attr.bj);
            tuxIconView.setIconHeight(this.this$0.f85494a);
            tuxIconView.setIconWidth(this.this$0.f85494a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.this$0.f85494a, this.this$0.f85494a);
            layoutParams.gravity = 16;
            tuxIconView.setLayoutParams(layoutParams);
            com.bytedance.tux.h.i.b(tuxIconView, Integer.valueOf(this.this$0.f85495b), null, null, null, false, 30);
            ((ViewGroup) this.this$0.findViewById(R.id.ch9)).addView(tuxIconView);
            MethodCollector.o(5685);
            return tuxIconView;
        }
    }

    public final void setElementDTO(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
        this.f85497e = eVar;
    }

    public final void setLogger(t tVar) {
        this.f85499h = tVar;
    }

    public final void setPaymentMethod(o oVar) {
        this.f85496d = oVar;
    }

    public final void setShippingAddress(Address address) {
        this.f85502k = address;
    }

    public final void setUseShippingAddress(boolean z) {
        this.f85503l = z;
    }

    static final class i extends h.f.b.m implements h.f.a.b<l, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f85519a = new i();

        static {
            Covode.recordClassIndex(53498);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(l lVar) {
            h.f.b.l.d(lVar, "");
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f85520a = new j();

        static {
            Covode.recordClassIndex(53499);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bool.booleanValue();
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<List<? extends m>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f85521a = new k();

        static {
            Covode.recordClassIndex(53500);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends m> list) {
            h.f.b.l.d(list, "");
            return z.f158842a;
        }
    }

    public final void setOnRegionPanelStatus(h.f.a.b<? super l, z> bVar) {
        h.f.b.l.d(bVar, "");
        this.f85500i = bVar;
    }

    public final void setOnUseShippingAddressChange(h.f.a.b<? super Boolean, z> bVar) {
        h.f.b.l.d(bVar, "");
        this.f85501j = bVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void setOnValueChange(h.f.a.b<? super List<m>, z> bVar) {
        h.f.b.l.d(bVar, "");
        this.f85498g = bVar;
    }

    static final class f extends h.f.b.m implements h.f.a.b<List<? extends m>, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e $elementDTO$inlined;
        final /* synthetic */ o $paymentMethod$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e $targetElement$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(53495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, a aVar, o oVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar2) {
            super(1);
            this.$targetElement$inlined = eVar;
            this.this$0 = aVar;
            this.$paymentMethod$inlined = oVar;
            this.$elementDTO$inlined = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends m> list) {
            h.f.b.l.d(list, "");
            this.this$0.getOnValueChange().invoke(this.this$0.getValue());
            return z.f158842a;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f85515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommonItemView f85516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f85517c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85518d;

        static {
            Covode.recordClassIndex(53497);
        }

        h(String str, CommonItemView commonItemView, a aVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
            this.f85515a = str;
            this.f85516b = commonItemView;
            this.f85517c = aVar;
            this.f85518d = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f85516b.getContext(), this.f85515a).open();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<List<? extends m>, String> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e $elementDTO$inlined;
        final /* synthetic */ o $paymentMethod$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e $targetElement$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(53494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, a aVar, o oVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar2) {
            super(1);
            this.$targetElement$inlined = eVar;
            this.this$0 = aVar;
            this.$paymentMethod$inlined = oVar;
            this.$elementDTO$inlined = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(List<? extends m> list) {
            boolean z;
            List<? extends m> list2 = list;
            h.f.b.l.d(list2, "");
            String a2 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.c.a(this.$targetElement$inlined, this.$paymentMethod$inlined, list2);
            t logger = this.this$0.getLogger();
            if (logger != null) {
                String c2 = this.$paymentMethod$inlined.c();
                if (a2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                logger.a((t) c2, (String) z, (boolean) this.$targetElement$inlined.f85288a, (String) null);
            }
            return a2;
        }
    }

    public static final class g extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85511a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommonItemView f85512b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f85513c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85514d;

        static {
            Covode.recordClassIndex(53496);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                CommonItemView commonItemView = this.f85512b;
                commonItemView.setChecked(!commonItemView.d());
                this.f85513c.setUseShippingAddress(this.f85512b.d());
                this.f85513c.getOnUseShippingAddressChange().invoke(Boolean.valueOf(this.f85513c.getUseShippingAddress()));
                this.f85513c.setAllElementsVisible(!this.f85512b.d());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(CommonItemView commonItemView, a aVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
            super(700);
            this.f85512b = commonItemView;
            this.f85513c = aVar;
            this.f85514d = eVar;
        }
    }

    public final void setAllElementsVisible(boolean z) {
        int i2;
        for (View view : new l(this)) {
            if (view instanceof e) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(8074);
        this.f85494a = (int) com.bytedance.common.utility.n.b(context, 14.0f);
        this.f85495b = (int) com.bytedance.common.utility.n.b(context, 4.0f);
        this.f85498g = k.f85521a;
        this.f85500i = i.f85519a;
        this.f85501j = j.f85520a;
        this.f85503l = true;
        this.f85504m = h.i.a((h.f.a.a) new c(this, context));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        View.inflate(context, R.layout.o5, this);
        CommonItemView commonItemView = (CommonItemView) a();
        h.f.b.l.b(commonItemView, "");
        com.bytedance.tux.h.i.b(commonItemView, null, 0, null, null, false, 29);
        v.a(a(), (Drawable) null);
        MethodCollector.o(8074);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r8 != null) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0185  */
    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e r24, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r25, java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> r26, java.lang.Object r27) {
        /*
        // Method dump skipped, instructions count: 578
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.a.a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, java.util.List, java.lang.Object):void");
    }
}
