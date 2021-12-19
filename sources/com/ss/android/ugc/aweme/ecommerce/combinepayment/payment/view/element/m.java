package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.h.i;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.h;
import h.z;
import java.util.List;

public final class m extends LinearLayout implements e {

    /* renamed from: d  reason: collision with root package name */
    public static final String f85653d = "need_save";

    /* renamed from: e  reason: collision with root package name */
    public static final a f85654e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f85655a;

    /* renamed from: b  reason: collision with root package name */
    public final int f85656b;

    /* renamed from: c  reason: collision with root package name */
    public final int f85657c;

    /* renamed from: g  reason: collision with root package name */
    private o f85658g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85659h;

    /* renamed from: i  reason: collision with root package name */
    private final int f85660i;

    /* renamed from: j  reason: collision with root package name */
    private h.f.a.b<? super List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, z> f85661j;

    /* renamed from: k  reason: collision with root package name */
    private final h f85662k;

    /* renamed from: l  reason: collision with root package name */
    private final h f85663l;

    /* renamed from: m  reason: collision with root package name */
    private final h f85664m;

    private final TuxIconView getIconView() {
        return (TuxIconView) this.f85664m.getValue();
    }

    private final TuxTextView getTitleView() {
        return (TuxTextView) this.f85663l.getValue();
    }

    public final TuxCheckBox getCheckBox() {
        return (TuxCheckBox) this.f85662k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53570);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e getElementDTO() {
        return this.f85659h;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final h.f.a.b<List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, z> getOnValueChange() {
        return this.f85661j;
    }

    public final o getPaymentMethod() {
        return this.f85658g;
    }

    static final class b extends h.f.b.m implements h.f.a.a<TuxCheckBox> {
        final /* synthetic */ Context $context;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(53571);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar, Context context) {
            super(0);
            this.this$0 = mVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxCheckBox invoke() {
            TuxCheckBox tuxCheckBox = new TuxCheckBox(this.$context, null, 0, 6);
            tuxCheckBox.setSize(0);
            tuxCheckBox.setClickable(false);
            this.this$0.addView(tuxCheckBox);
            return tuxCheckBox;
        }
    }

    static {
        Covode.recordClassIndex(53569);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> getValue() {
        return n.a(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m(f85653d, null, String.valueOf(getCheckBox().isChecked()), null, null, 24, null));
    }

    static final class g extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ Context $context;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(53576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(m mVar, Context context) {
            super(0);
            this.this$0 = mVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            TuxTextView tuxTextView = new TuxTextView(this.$context, null, 0, 6);
            tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            tuxTextView.setTextColor(androidx.core.content.b.c(this.$context, R.color.c4));
            tuxTextView.setTuxFont(41);
            i.b(tuxTextView, Integer.valueOf(this.this$0.f85657c), null, null, null, false, 30);
            this.this$0.addView(tuxTextView);
            return tuxTextView;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ Context $context;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(53572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar, Context context) {
            super(0);
            this.this$0 = mVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            TuxIconView tuxIconView = new TuxIconView(this.$context, null, 0, 6);
            tuxIconView.setIconRes(R.raw.icon_info_circle);
            tuxIconView.setTintColorRes(R.attr.bj);
            tuxIconView.setIconHeight(this.this$0.f85655a);
            tuxIconView.setIconWidth(this.this$0.f85655a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.this$0.f85655a, this.this$0.f85655a);
            layoutParams.gravity = 16;
            tuxIconView.setLayoutParams(layoutParams);
            i.b(tuxIconView, Integer.valueOf(this.this$0.f85656b), null, null, null, false, 30);
            this.this$0.addView(tuxIconView);
            return tuxIconView;
        }
    }

    public final void setElementDTO(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
        this.f85659h = eVar;
    }

    public final void setPaymentMethod(o oVar) {
        this.f85658g = oVar;
    }

    static final class f extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f85668a = new f();

        static {
            Covode.recordClassIndex(53575);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
            l.d(list, "");
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void setOnValueChange(h.f.a.b<? super List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, z> bVar) {
        l.d(bVar, "");
        this.f85661j = bVar;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f85665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f85666b;

        static {
            Covode.recordClassIndex(53573);
        }

        d(String str, m mVar) {
            this.f85665a = str;
            this.f85666b = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f85666b.getContext(), this.f85665a).open();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f85667a;

        static {
            Covode.recordClassIndex(53574);
        }

        e(m mVar) {
            this.f85667a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f85667a.getCheckBox().setChecked(!this.f85667a.getCheckBox().isChecked());
            this.f85667a.getOnValueChange().invoke(this.f85667a.getValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private m(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(7924);
        this.f85655a = (int) com.bytedance.common.utility.n.b(context, 14.0f);
        this.f85660i = (int) com.bytedance.common.utility.n.b(context, 16.0f);
        this.f85656b = (int) com.bytedance.common.utility.n.b(context, 4.0f);
        int b2 = (int) com.bytedance.common.utility.n.b(context, 8.0f);
        this.f85657c = b2;
        this.f85661j = f.f85668a;
        this.f85662k = h.i.a((h.f.a.a) new b(this, context));
        this.f85663l = h.i.a((h.f.a.a) new g(this, context));
        this.f85664m = h.i.a((h.f.a.a) new c(this, context));
        setOrientation(0);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        setGravity(16);
        i.a((View) this, (Integer) null, Integer.valueOf(b2), (Integer) null, Integer.valueOf(b2), false, 21);
        MethodCollector.o(7924);
    }

    public /* synthetic */ m(Context context, byte b2) {
        this(context);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, o oVar, List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list, Object obj) {
        boolean z;
        String paramValue;
        l.d(eVar, "");
        l.d(oVar, "");
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        if (list != null) {
            TuxCheckBox checkBox = getCheckBox();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m mVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m) n.b((List) list, 0);
            if (mVar == null || (paramValue = mVar.getParamValue()) == null) {
                z = false;
            } else {
                z = Boolean.parseBoolean(paramValue);
            }
            checkBox.setChecked(z);
        }
        getTitleView().setText(eVar.f85297j);
        String str = oVar.q;
        if (!hl.a(str) || str == null) {
            getIconView().setVisibility(8);
        } else {
            getIconView().setVisibility(0);
            getIconView().setOnClickListener(new d(str, this));
        }
        setOnClickListener(new e(this));
    }
}
