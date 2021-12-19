package com.ss.android.ugc.aweme.ecommerce.sku.view;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.jedi.arch.ah;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.z;

public final class SkuPanelCounterWidget extends SkuPanelBaseWidget implements au {

    /* renamed from: k  reason: collision with root package name */
    public static final a f87434k = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public TuxIconView f87435h;

    /* renamed from: i  reason: collision with root package name */
    public TuxIconView f87436i;

    /* renamed from: j  reason: collision with root package name */
    public DmtEditText f87437j;

    /* renamed from: l  reason: collision with root package name */
    private final int f87438l = R.layout.qx;

    static {
        Covode.recordClassIndex(54926);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54927);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class f extends NumberKeyListener {
        static {
            Covode.recordClassIndex(54936);
        }

        public final int getInputType() {
            return 3;
        }

        f() {
        }

        /* access modifiers changed from: protected */
        public final char[] getAcceptedChars() {
            return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        }
    }

    @Override // com.bytedance.widget.Widget
    public final int b() {
        return this.f87438l;
    }

    @Override // com.bytedance.widget.Widget
    public final void i() {
        super.i();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    public final void m() {
        super.m();
        SkuPanelViewModel l2 = l();
        f.a.b.b unused = selectSubscribe(l2, c.f87456a, d.f87457a, new ah(), new g(this));
        f.a.b.b unused2 = selectSubscribe(l2, e.f87458a, new ah(), new h(l2, this));
    }

    public final void o() {
        String str;
        IEventCenter a2 = EventCenter.a();
        SkuPanelStarter.SkuEnterParams skuEnterParams = l().f87504e;
        if (skuEnterParams == null || (str = skuEnterParams.getProductId()) == null) {
            str = "";
        }
        String b2 = dg.a().b(new SkuPanelStarter.SkuOperationParams(str, 1));
        l.b(b2, "");
        a2.a("ec_sku_panel_operated", b2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    public final void n() {
        super.n();
        this.f87435h = (TuxIconView) a(R.id.e5c);
        this.f87436i = (TuxIconView) a(R.id.e5d);
        this.f87437j = (DmtEditText) a(R.id.e5b);
        if (gb.a()) {
            int i2 = Build.VERSION.SDK_INT;
            TuxIconView tuxIconView = this.f87435h;
            if (tuxIconView == null) {
                l.a("minusBtn");
            }
            tuxIconView.setBackground(androidx.core.content.b.a(a().getContext(), (int) R.drawable.xq));
            TuxIconView tuxIconView2 = this.f87436i;
            if (tuxIconView2 == null) {
                l.a("plusBtn");
            }
            tuxIconView2.setBackground(androidx.core.content.b.a(a().getContext(), (int) R.drawable.xp));
        }
        TuxIconView tuxIconView3 = this.f87436i;
        if (tuxIconView3 == null) {
            l.a("plusBtn");
        }
        tuxIconView3.setOnClickListener(new c(this));
        TuxIconView tuxIconView4 = this.f87435h;
        if (tuxIconView4 == null) {
            l.a("minusBtn");
        }
        tuxIconView4.setOnClickListener(new d(this));
        DmtEditText dmtEditText = this.f87437j;
        if (dmtEditText == null) {
            l.a("counterInput");
        }
        dmtEditText.setOnTouchListener(new e(dmtEditText));
        DmtEditText dmtEditText2 = this.f87437j;
        if (dmtEditText2 == null) {
            l.a("counterInput");
        }
        dmtEditText2.addTextChangedListener(new b(dmtEditText2, this));
        DmtEditText dmtEditText3 = this.f87437j;
        if (dmtEditText3 == null) {
            l.a("counterInput");
        }
        dmtEditText3.setKeyListener(new f());
    }

    public static final /* synthetic */ DmtEditText a(SkuPanelCounterWidget skuPanelCounterWidget) {
        DmtEditText dmtEditText = skuPanelCounterWidget.f87437j;
        if (dmtEditText == null) {
            l.a("counterInput");
        }
        return dmtEditText;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuPanelCounterWidget f87441a;

        static {
            Covode.recordClassIndex(54930);
        }

        c(SkuPanelCounterWidget skuPanelCounterWidget) {
            this.f87441a = skuPanelCounterWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SkuPanelCounterWidget skuPanelCounterWidget = this.f87441a;
            skuPanelCounterWidget.withState(skuPanelCounterWidget.l(), new h.f.a.b<SkuState, SkuState>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(54931);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ SkuState invoke(SkuState skuState) {
                    SkuState skuState2 = skuState;
                    l.d(skuState2, "");
                    if (skuState2.getCurrentQuantity() < skuState2.getCurrentMaxQuantity()) {
                        this.this$0.f87441a.l().a(skuState2.getCurrentQuantity() + 1);
                    } else {
                        Context context = this.this$0.f87441a.a().getContext();
                        l.b(context, "");
                        String string = context.getResources().getString(R.string.bgq, Integer.valueOf(skuState2.getCurrentMaxQuantity()));
                        l.b(string, "");
                        new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f87441a.a().getContext()).a(string).a();
                    }
                    return skuState2;
                }
            });
            this.f87441a.o();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuPanelCounterWidget f87442a;

        static {
            Covode.recordClassIndex(54932);
        }

        d(SkuPanelCounterWidget skuPanelCounterWidget) {
            this.f87442a = skuPanelCounterWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SkuPanelCounterWidget skuPanelCounterWidget = this.f87442a;
            skuPanelCounterWidget.withState(skuPanelCounterWidget.l(), new h.f.a.b<SkuState, SkuState>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(54933);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ SkuState invoke(SkuState skuState) {
                    SkuState skuState2 = skuState;
                    l.d(skuState2, "");
                    if (skuState2.getCurrentQuantity() > 1) {
                        this.this$0.f87442a.l().a(skuState2.getCurrentQuantity() - 1);
                    } else {
                        new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f87442a.a().getContext()).a(R.string.bgr).a();
                    }
                    return skuState2;
                }
            });
            this.f87442a.o();
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DmtEditText f87439a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelCounterWidget f87440b;

        static {
            Covode.recordClassIndex(54928);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            int i2 = 0;
            if (str == null || str.length() == 0) {
                this.f87440b.l().a(0);
                return;
            }
            final int parseInt = Integer.parseInt(str);
            SkuPanelCounterWidget skuPanelCounterWidget = this.f87440b;
            skuPanelCounterWidget.withState(skuPanelCounterWidget.l(), new h.f.a.b<SkuState, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(54929);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(SkuState skuState) {
                    SkuState skuState2 = skuState;
                    l.d(skuState2, "");
                    if (parseInt > skuState2.getCurrentMaxQuantity()) {
                        View view = this.this$0.f87440b.f46127e;
                        if (view != null) {
                            Context context = this.this$0.f87440b.a().getContext();
                            l.b(context, "");
                            String string = context.getResources().getString(R.string.bgq, Integer.valueOf(skuState2.getCurrentMaxQuantity()));
                            l.b(string, "");
                            new com.bytedance.tux.g.b(view).a(string).b();
                        }
                        this.this$0.f87439a.setText(String.valueOf(skuState2.getCurrentMaxQuantity()));
                    } else if (parseInt <= 0) {
                        View view2 = this.this$0.f87440b.f46127e;
                        if (view2 != null) {
                            Context context2 = this.this$0.f87440b.a().getContext();
                            l.b(context2, "");
                            String string2 = context2.getResources().getString(R.string.bgr);
                            l.b(string2, "");
                            new com.bytedance.tux.g.b(view2).a(string2).b();
                        }
                        this.this$0.f87439a.setText("1");
                    } else {
                        this.this$0.f87440b.l().a(parseInt);
                    }
                    return z.f158842a;
                }
            });
            DmtEditText dmtEditText = this.f87439a;
            Editable text = dmtEditText.getText();
            if (text != null) {
                i2 = text.length();
            }
            dmtEditText.setSelection(i2);
        }

        b(DmtEditText dmtEditText, SkuPanelCounterWidget skuPanelCounterWidget) {
            this.f87439a = dmtEditText;
            this.f87440b = skuPanelCounterWidget;
        }
    }

    static final class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DmtEditText f87443a;

        static {
            Covode.recordClassIndex(54934);
        }

        e(DmtEditText dmtEditText) {
            this.f87443a = dmtEditText;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            this.f87443a.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f87444a;

                static {
                    Covode.recordClassIndex(54935);
                }

                {
                    this.f87444a = r1;
                }

                public final void run() {
                    int i2;
                    DmtEditText dmtEditText = this.f87444a.f87443a;
                    Editable text = this.f87444a.f87443a.getText();
                    if (text != null) {
                        i2 = text.length();
                    } else {
                        i2 = 0;
                    }
                    dmtEditText.setSelection(i2);
                }
            });
            return false;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ SkuPanelViewModel $this_apply;
        final /* synthetic */ SkuPanelCounterWidget this$0;

        static {
            Covode.recordClassIndex(54938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SkuPanelViewModel skuPanelViewModel, SkuPanelCounterWidget skuPanelCounterWidget) {
            super(2);
            this.$this_apply = skuPanelViewModel;
            this.this$0 = skuPanelCounterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            final Boolean bool2 = bool;
            l.d(iVar2, "");
            iVar2.withState(this.this$0.l(), new h.f.a.b<SkuState, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(54939);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(SkuState skuState) {
                    int i2;
                    SkuState skuState2 = skuState;
                    l.d(skuState2, "");
                    Boolean bool = bool2;
                    if (bool != null && !l.a((Object) bool, (Object) true)) {
                        try {
                            String valueOf = String.valueOf(SkuPanelCounterWidget.a(this.this$0.this$0).getText());
                            if (l.a((Object) valueOf, (Object) "")) {
                                i2 = 0;
                            } else {
                                i2 = Integer.parseInt(valueOf);
                            }
                            if (i2 > skuState2.getCurrentMaxQuantity()) {
                                this.this$0.$this_apply.a(skuState2.getCurrentMaxQuantity());
                                SkuPanelCounterWidget.a(this.this$0.this$0).setText(String.valueOf(skuState2.getCurrentMaxQuantity()));
                                Context context = this.this$0.this$0.a().getContext();
                                l.b(context, "");
                                String string = context.getResources().getString(R.string.bgq, Integer.valueOf(skuState2.getCurrentMaxQuantity()));
                                l.b(string, "");
                                new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.this$0.a().getContext()).a(string).a();
                            } else if (i2 <= 0) {
                                this.this$0.$this_apply.a(1);
                                SkuPanelCounterWidget.a(this.this$0.this$0).setText("1");
                                new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.this$0.a().getContext()).a(R.string.bgr).a();
                            } else {
                                this.this$0.$this_apply.a(i2);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        KeyboardUtils.c(SkuPanelCounterWidget.a(this.this$0.this$0));
                        SkuPanelCounterWidget.a(this.this$0.this$0).post(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelCounterWidget.h.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f87445a;

                            static {
                                Covode.recordClassIndex(54940);
                            }

                            {
                                this.f87445a = r1;
                            }

                            public final void run() {
                                SkuPanelCounterWidget.a(this.f87445a.this$0.this$0).clearFocus();
                            }
                        });
                        this.this$0.this$0.o();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements q<com.bytedance.jedi.arch.i, Integer, Integer, z> {
        final /* synthetic */ SkuPanelCounterWidget this$0;

        static {
            Covode.recordClassIndex(54937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SkuPanelCounterWidget skuPanelCounterWidget) {
            super(3);
            this.this$0 = skuPanelCounterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num, Integer num2) {
            int i2;
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            String str = "";
            l.d(iVar, str);
            DmtEditText a2 = SkuPanelCounterWidget.a(this.this$0);
            if (intValue != 0) {
                str = String.valueOf(intValue);
            }
            a2.setText(str);
            int c2 = androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.g.a(), R.color.bz);
            int c3 = androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.g.a(), R.color.bx);
            TuxIconView tuxIconView = this.this$0.f87436i;
            if (tuxIconView == null) {
                l.a("plusBtn");
            }
            if (intValue >= intValue2) {
                i2 = c2;
            } else {
                i2 = c3;
            }
            tuxIconView.setTintColor(i2);
            TuxIconView tuxIconView2 = this.this$0.f87435h;
            if (tuxIconView2 == null) {
                l.a("minusBtn");
            }
            if (intValue > 1) {
                c2 = c3;
            }
            tuxIconView2.setTintColor(c2);
            return z.f158842a;
        }
    }
}
