package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.lighten.a.e;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.a;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t;
import com.ss.android.ugc.aweme.ecommerce.payment.api.PaymentApi;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c extends g {

    /* renamed from: d  reason: collision with root package name */
    public static boolean f85536d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f85537e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final int f85538b;

    /* renamed from: c  reason: collision with root package name */
    public final b f85539c;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f85540g;

    /* renamed from: h  reason: collision with root package name */
    private String f85541h;

    /* renamed from: i  reason: collision with root package name */
    private t f85542i;

    /* renamed from: j  reason: collision with root package name */
    private o f85543j;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85544k;

    /* renamed from: l  reason: collision with root package name */
    private List<o> f85545l;

    /* renamed from: m  reason: collision with root package name */
    private String f85546m;
    private TextWatcher n;
    private final int o;
    private final int p;
    private final int q;
    private h.f.a.b<? super o, z> r;
    private final com.bytedance.lighten.a.e s;
    private h.f.a.b<? super List<m>, z> t;
    private SparseArray u;

    static {
        Covode.recordClassIndex(53509);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g, com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final View a(int i2) {
        if (this.u == null) {
            this.u = new SparseArray();
        }
        View view = (View) this.u.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.u.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final int getContentViewLayoutId() {
        return R.layout.p8;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53510);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final List<String> getAllCardIcons() {
        return h.a.z.INSTANCE;
    }

    public final com.bytedance.lighten.a.e getCircleOption() {
        return this.s;
    }

    public final String getCurrentPaymentId() {
        return this.f85546m;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e getElementDTO() {
        return this.f85544k;
    }

    public final String getMInputType() {
        return this.f85541h;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, h.z>, h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, h.z> */
    public final h.f.a.b<o, z> getOnPaymentMethodIdentify() {
        return this.r;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final h.f.a.b<List<m>, z> getOnValueChange() {
        return this.t;
    }

    public final List<o> getPaymentList() {
        return this.f85545l;
    }

    public final t getPaymentLogger() {
        return this.f85542i;
    }

    public final o getPaymentMethod() {
        return this.f85543j;
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f85559a;

        static {
            Covode.recordClassIndex(53520);
        }

        j(c cVar) {
            this.f85559a = cVar;
        }

        public final void run() {
            this.f85559a.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g
    public final InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) a(R.id.bps);
        l.b(inputWithIndicator, "");
        return inputWithIndicator;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        new Handler(Looper.getMainLooper()).removeCallbacks(this.f85540g);
    }

    public final void b() {
        PaymentApi.a.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new a.C2040a());
        new Handler(Looper.getMainLooper()).postDelayed(this.f85540g, 300000);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final List<m> getValue() {
        String str;
        String str2;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO = getElementDTO();
        Boolean bool = null;
        if (elementDTO != null) {
            str = elementDTO.f85288a;
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO2 = getElementDTO();
        if (elementDTO2 != null) {
            str2 = elementDTO2.f85293f;
        } else {
            str2 = null;
        }
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        String a2 = p.a(String.valueOf(dmtEditText.getText()), " ", "");
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO3 = getElementDTO();
        if (elementDTO3 != null) {
            bool = elementDTO3.f85298k;
        }
        return n.a(new m(str, str2, a2, bool, null, 16, null));
    }

    public static final class b implements com.bytedance.android.ecommerce.c.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f85547a;

        static {
            Covode.recordClassIndex(53511);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f85548a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f85549b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.ecommerce.a.b.b f85550c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f85551d;

            static {
                Covode.recordClassIndex(53512);
            }

            a(b bVar, int i2, com.bytedance.android.ecommerce.a.b.b bVar2, String str) {
                this.f85548a = bVar;
                this.f85549b = i2;
                this.f85550c = bVar2;
                this.f85551d = str;
            }

            public final void run() {
                try {
                    String invoke = this.f85548a.f85547a.getOnVerify().invoke(this.f85548a.f85547a.getValue());
                    if (invoke != null) {
                        this.f85548a.f85547a.a(invoke);
                    }
                    DmtEditText dmtEditText = (DmtEditText) this.f85548a.f85547a.a(R.id.bpu);
                    l.b(dmtEditText, "");
                    dmtEditText.setFocusableInTouchMode(true);
                    ((DmtEditText) this.f85548a.f85547a.a(R.id.bpu)).requestFocus();
                    long j2 = 0;
                    if (this.f85549b != this.f85548a.f85547a.f85538b || this.f85550c == null) {
                        t paymentLogger = this.f85548a.f85547a.getPaymentLogger();
                        if (paymentLogger != null) {
                            t paymentLogger2 = this.f85548a.f85547a.getPaymentLogger();
                            if (paymentLogger2 != null) {
                                j2 = paymentLogger2.b("ocr_scanning");
                            }
                            paymentLogger.a(j2, "back");
                        }
                        new com.bytedance.tux.g.b(this.f85548a.f85547a).a(this.f85551d).b();
                        return;
                    }
                    this.f85548a.f85547a.setMInputType("card_number_ocr");
                    ((DmtEditText) this.f85548a.f85547a.a(R.id.bpu)).setText(this.f85550c.f6918h);
                    ((DmtEditText) this.f85548a.f85547a.a(R.id.bpu)).setSelection((this.f85550c.f6918h.length() + (this.f85550c.f6918h.length() / 4)) - 1);
                    t paymentLogger3 = this.f85548a.f85547a.getPaymentLogger();
                    if (paymentLogger3 != null) {
                        t paymentLogger4 = this.f85548a.f85547a.getPaymentLogger();
                        if (paymentLogger4 != null) {
                            j2 = paymentLogger4.b("ocr_scanning");
                        }
                        paymentLogger3.a(j2, "card_result");
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f85547a = cVar;
        }

        @Override // com.bytedance.android.ecommerce.c.d
        public final void a(int i2, int i3, String str, com.bytedance.android.ecommerce.a.b.b bVar) {
            new Handler(Looper.getMainLooper()).post(new a(this, i2, bVar, str));
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<o, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f85557a = new h();

        static {
            Covode.recordClassIndex(53518);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(o oVar) {
            return z.f158842a;
        }
    }

    public final void setCurrentPaymentId(String str) {
        this.f85546m = str;
    }

    public final void setElementDTO(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
        this.f85544k = eVar;
    }

    public final void setPaymentList(List<o> list) {
        this.f85545l = list;
    }

    public final void setPaymentLogger(t tVar) {
        this.f85542i = tVar;
    }

    public final void setPaymentMethod(o oVar) {
        this.f85543j = oVar;
    }

    static final class i extends h.f.b.m implements h.f.a.b<List<? extends m>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f85558a = new i();

        static {
            Covode.recordClassIndex(53519);
        }

        i() {
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

    public final void setMInputType(String str) {
        l.d(str, "");
        this.f85541h = str;
    }

    public final void setOnPaymentMethodIdentify(h.f.a.b<? super o, z> bVar) {
        l.d(bVar, "");
        this.r = bVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void setOnValueChange(h.f.a.b<? super List<m>, z> bVar) {
        l.d(bVar, "");
        this.t = bVar;
    }

    public final void setDelimiterVisible(boolean z) {
        int i2;
        View a2 = a(R.id.ak3);
        l.b(a2, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        a2.setVisibility(i2);
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f85553a;

        static {
            Covode.recordClassIndex(53514);
        }

        d(c cVar) {
            this.f85553a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f85553a.setMInputType("");
            ((DmtEditText) this.f85553a.a(R.id.bpu)).setText("");
            DmtEditText dmtEditText = (DmtEditText) this.f85553a.a(R.id.bpu);
            dmtEditText.setFocusableInTouchMode(true);
            dmtEditText.requestFocus();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(53517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            c cVar = this.this$0;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) cVar.a(R.id.dse);
            l.b(linearLayoutCompat, "");
            int childCount = linearLayoutCompat.getChildCount();
            boolean z = true;
            if (childCount == 0 || !booleanValue) {
                z = false;
            }
            cVar.setDelimiterVisible(z);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC2047c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f85552a;

        static {
            Covode.recordClassIndex(53513);
        }

        View$OnClickListenerC2047c(c cVar) {
            this.f85552a = cVar;
        }

        public final void onClick(View view) {
            String str;
            Map<String, Long> map;
            t paymentLogger;
            ClickAgent.onClick(view);
            t paymentLogger2 = this.f85552a.getPaymentLogger();
            if (!(paymentLogger2 == null || (map = paymentLogger2.f85432f) == null || map.containsKey(c.class.getSimpleName()) || (paymentLogger = this.f85552a.getPaymentLogger()) == null)) {
                paymentLogger.c("card_number");
                paymentLogger.a(c.class.getSimpleName());
            }
            c.f85536d = true;
            b bVar = this.f85552a.f85539c;
            l.d(bVar, "");
            com.bytedance.android.ecommerce.e.d dVar = com.bytedance.android.ecommerce.a.f6869a;
            com.ss.android.ugc.aweme.ecommerce.payment.a.b bVar2 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.a.f85244a;
            if (bVar2 != null) {
                str = bVar2.f86269b;
            } else {
                str = null;
            }
            dVar.a(str, bVar);
            t paymentLogger3 = this.f85552a.getPaymentLogger();
            if (paymentLogger3 != null) {
                paymentLogger3.a("card_number_ocr", null, null, t.f85424g, null);
            }
            t paymentLogger4 = this.f85552a.getPaymentLogger();
            if (paymentLogger4 != null) {
                paymentLogger4.a("ocr_scanning");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        this.f85540g = new j(this);
        this.f85541h = "";
        this.f85538b = 1;
        this.o = (int) com.bytedance.common.utility.n.b(context, 4.0f);
        this.p = (int) com.bytedance.common.utility.n.b(context, 25.0f);
        this.q = (int) com.bytedance.common.utility.n.b(context, 16.0f);
        this.r = h.f85557a;
        e.a aVar = new e.a();
        aVar.f39831e = com.bytedance.common.utility.n.b(context, 2.0f);
        this.s = aVar.a();
        this.t = i.f85558a;
        this.f85539c = new b(this);
    }

    public final void b(String str) {
        T t2;
        if (str == null) {
            a(h.a.z.INSTANCE);
        } else if (str.length() != 0) {
            List<o> list = this.f85545l;
            String str2 = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    if (l.a((Object) t2.f85334a, (Object) str)) {
                        break;
                    }
                }
                T t3 = t2;
                if (t3 != null) {
                    str2 = t3.f85338e;
                }
            }
            a(n.a(str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0058 A[LOOP:0: B:9:0x0056->B:10:0x0058, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<java.lang.String> r20) {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c.a(java.util.List):void");
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }

    static final class f implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f85556a;

        static {
            Covode.recordClassIndex(53516);
        }

        f(c cVar) {
            this.f85556a = cVar;
        }

        public final void onFocusChange(View view, boolean z) {
            t paymentLogger;
            if (z) {
                if (!c.f85536d && (paymentLogger = this.f85556a.getPaymentLogger()) != null) {
                    paymentLogger.c("card_number");
                    paymentLogger.a(ab.a(this.f85556a.getClass()).b());
                }
                c.f85536d = false;
                this.f85556a.a();
                this.f85556a.getOnErrorClear().invoke();
            } else {
                t paymentLogger2 = this.f85556a.getPaymentLogger();
                if (paymentLogger2 != null && !c.f85536d) {
                    paymentLogger2.a("card_number", paymentLogger2.b(ab.a(this.f85556a.getClass()).b()), this.f85556a.getMInputType());
                }
                DmtEditText dmtEditText = (DmtEditText) this.f85556a.a(R.id.bpu);
                l.b(dmtEditText, "");
                Editable text = dmtEditText.getText();
                if (text == null || text.length() == 0) {
                    c cVar = this.f85556a;
                    cVar.a(cVar.getAllCardIcons());
                }
                String invoke = this.f85556a.getOnVerify().invoke(this.f85556a.getValue());
                if (invoke != null) {
                    this.f85556a.a(invoke);
                }
            }
            String currentPaymentId = this.f85556a.getCurrentPaymentId();
            if (currentPaymentId == null || currentPaymentId.length() == 0) {
                this.f85556a.a(h.a.z.INSTANCE);
            }
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.ecommerce.util.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f85554a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85555b;

        static {
            Covode.recordClassIndex(53515);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.util.i
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            String str;
            l.d(charSequence, "");
            super.onTextChanged(charSequence, i2, i3, i4);
            if (TextUtils.isEmpty(charSequence)) {
                this.f85554a.setMInputType("");
            } else if (i3 == 1 || i4 == 1) {
                this.f85554a.setMInputType("normal");
            }
            com.bytedance.android.ecommerce.a.h a2 = com.bytedance.android.ecommerce.a.f6869a.a(this.f85554a.getValue().get(0).getParamValue());
            T t = null;
            if (a2 != null) {
                str = a2.f6979h;
            } else {
                str = null;
            }
            this.f85554a.b(str);
            if (true ^ l.a((Object) str, (Object) this.f85554a.getCurrentPaymentId())) {
                h.f.a.b<o, z> onPaymentMethodIdentify = this.f85554a.getOnPaymentMethodIdentify();
                List<o> paymentList = this.f85554a.getPaymentList();
                if (paymentList != null) {
                    Iterator<T> it = paymentList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (l.a((Object) next.f85334a, (Object) str)) {
                            t = next;
                            break;
                        }
                    }
                }
                onPaymentMethodIdentify.invoke(t);
            }
            this.f85554a.setCurrentPaymentId(str);
            this.f85554a.getOnValueChange().invoke(this.f85554a.getValue());
            if (TextUtils.isEmpty(charSequence)) {
                TuxIconView tuxIconView = (TuxIconView) this.f85554a.a(R.id.bid);
                l.b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                TuxIconView tuxIconView2 = (TuxIconView) this.f85554a.a(R.id.bi9);
                l.b(tuxIconView2, "");
                tuxIconView2.setVisibility(8);
            } else {
                TuxIconView tuxIconView3 = (TuxIconView) this.f85554a.a(R.id.bid);
                l.b(tuxIconView3, "");
                tuxIconView3.setVisibility(8);
                TuxIconView tuxIconView4 = (TuxIconView) this.f85554a.a(R.id.bi9);
                l.b(tuxIconView4, "");
                tuxIconView4.setVisibility(0);
            }
            if (this.f85554a.getCurrentPaymentId() != null) {
                c cVar = this.f85554a;
                cVar.b(cVar.getCurrentPaymentId());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, EditText editText, String str, int i2) {
            super(editText, 4, str, i2);
            this.f85554a = cVar;
            this.f85555b = eVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, o oVar, List<m> list, Object obj) {
        int i2;
        m mVar;
        String paramValue;
        Integer num;
        l.d(eVar, "");
        l.d(oVar, "");
        super.a(eVar, oVar, list, obj);
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        this.f85545l = oVar.f85341h;
        b();
        ((TuxIconView) a(R.id.bi9)).setOnClickListener(new d(this));
        TextWatcher textWatcher = this.n;
        if (textWatcher != null) {
            ((DmtEditText) a(R.id.bpu)).removeTextChangedListener(textWatcher);
        }
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d dVar = eVar.f85300m;
        if (dVar == null || (num = dVar.f85284a) == null) {
            i2 = 19;
        } else {
            i2 = num.intValue();
        }
        this.n = new e(this, eVar, dmtEditText, " ", i2);
        ((DmtEditText) a(R.id.bpu)).addTextChangedListener(this.n);
        ((InputWithIndicator) a(R.id.bps)).setOnEditTextFocusChangeListener(new f(this));
        ((InputWithIndicator) a(R.id.bps)).setOnIndicatorVisibleChangeListener(new g(this));
        if (!(list == null || (mVar = (m) n.b((List) list, 0)) == null || (paramValue = mVar.getParamValue()) == null || paramValue.length() == 0)) {
            ((InputWithIndicator) a(R.id.bps)).setText(paramValue);
        }
        DmtEditText dmtEditText2 = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText2, "");
        dmtEditText2.setImeOptions(6);
        ((TuxIconView) a(R.id.bid)).setOnClickListener(new View$OnClickListenerC2047c(this));
    }
}
