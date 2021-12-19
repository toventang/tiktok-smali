package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentAdapter;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t;
import com.ss.android.ugc.aweme.ecommerce.util.i;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d extends g {

    /* renamed from: b  reason: collision with root package name */
    private o f85560b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85561c;

    /* renamed from: d  reason: collision with root package name */
    private TextWatcher f85562d;

    /* renamed from: e  reason: collision with root package name */
    private h.f.a.b<? super List<m>, z> f85563e;

    /* renamed from: g  reason: collision with root package name */
    private String f85564g;

    /* renamed from: h  reason: collision with root package name */
    private t f85565h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f85566i;

    static {
        Covode.recordClassIndex(53521);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g, com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final View a(int i2) {
        if (this.f85566i == null) {
            this.f85566i = new SparseArray();
        }
        View view = (View) this.f85566i.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85566i.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final int getContentViewLayoutId() {
        return R.layout.p9;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final int getFooterViewLayoutId() {
        return R.layout.p_;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e getElementDTO() {
        return this.f85561c;
    }

    public final String getMInputType() {
        return this.f85564g;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final h.f.a.b<List<m>, z> getOnValueChange() {
        return this.f85563e;
    }

    public final t getPaymentLogger() {
        return this.f85565h;
    }

    public final o getPaymentMethod() {
        return this.f85560b;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g
    public final InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) a(R.id.bps);
        l.b(inputWithIndicator, "");
        return inputWithIndicator;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final List<m> getValue() {
        T t;
        T t2;
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> list;
        T t3;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> list2;
        T t4;
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        List<String> b2 = p.b(String.valueOf(dmtEditText.getText()), new String[]{"/"});
        String str5 = (String) n.b((List) b2, 0);
        String str6 = (String) n.b((List) b2, 1);
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO = getElementDTO();
        Boolean bool2 = null;
        if (elementDTO == null || (list2 = elementDTO.f85296i) == null) {
            t = null;
        } else {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t4 = null;
                    break;
                }
                t4 = it.next();
                if (l.a((Object) t4.f85288a, (Object) "eg_ccdc_global_expiration_month")) {
                    break;
                }
            }
            t = t4;
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO2 = getElementDTO();
        if (elementDTO2 == null || (list = elementDTO2.f85296i) == null) {
            t2 = null;
        } else {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t3 = null;
                    break;
                }
                t3 = it2.next();
                if (l.a((Object) t3.f85288a, (Object) "eg_ccdc_global_expiration_year")) {
                    break;
                }
            }
            t2 = t3;
        }
        m[] mVarArr = new m[2];
        if (t != null) {
            str = t.f85288a;
            str2 = t.f85293f;
            bool = t.f85298k;
        } else {
            str = null;
            str2 = null;
            bool = null;
        }
        mVarArr[0] = new m(str, str2, str5, bool, null, 16, null);
        if (t2 != null) {
            str3 = t2.f85288a;
            str4 = t2.f85293f;
            bool2 = t2.f85298k;
        } else {
            str3 = null;
            str4 = null;
        }
        mVarArr[1] = new m(str3, str4, str6, bool2, null, 16, null);
        return n.b(mVarArr);
    }

    public final void setElementDTO(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
        this.f85561c = eVar;
    }

    public final void setPaymentLogger(t tVar) {
        this.f85565h = tVar;
    }

    public final void setPaymentMethod(o oVar) {
        this.f85560b = oVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.d$d  reason: collision with other inner class name */
    static final class C2048d extends h.f.b.m implements h.f.a.b<String, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2048d f85572a = new C2048d();

        static {
            Covode.recordClassIndex(53525);
        }

        C2048d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            return str2;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<List<? extends m>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f85573a = new e();

        static {
            Covode.recordClassIndex(53526);
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

    public final void setMInputType(String str) {
        l.d(str, "");
        this.f85564g = str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void setOnValueChange(h.f.a.b<? super List<m>, z> bVar) {
        l.d(bVar, "");
        this.f85563e = bVar;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f85567a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f85568b;

        static {
            Covode.recordClassIndex(53522);
        }

        a(String str, d dVar) {
            this.f85567a = str;
            this.f85568b = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f85568b.getContext(), this.f85567a).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null, 0);
        l.d(context, "");
        this.f85563e = e.f85573a;
        this.f85564g = "";
        ((InputWithIndicator) a(R.id.bps)).setInputType(2);
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }

    static final class c implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f85570a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85571b;

        static {
            Covode.recordClassIndex(53524);
        }

        c(d dVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
            this.f85570a = dVar;
            this.f85571b = eVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f85570a.a();
                this.f85570a.getOnErrorClear().invoke();
                t paymentLogger = this.f85570a.getPaymentLogger();
                if (paymentLogger != null) {
                    paymentLogger.c(t.d(this.f85571b.f85293f));
                    paymentLogger.a(ab.a(PaymentAdapter.DateElementViewHolder.class).b());
                    return;
                }
                return;
            }
            String invoke = this.f85570a.getOnVerify().invoke(this.f85570a.getValue());
            if (invoke != null) {
                this.f85570a.a(invoke);
            }
        }
    }

    public static final class b extends i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f85569a;

        static {
            Covode.recordClassIndex(53523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, EditText editText, String str) {
            super(editText, 2, str, 4);
            this.f85569a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.util.i
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
            super.onTextChanged(charSequence, i2, i3, i4);
            this.f85569a.getOnValueChange().invoke(this.f85569a.getValue());
            if (TextUtils.isEmpty(charSequence)) {
                this.f85569a.setMInputType("");
            } else {
                this.f85569a.setMInputType("normal");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, o oVar, List<m> list, Object obj) {
        int inputType;
        int i2;
        boolean z;
        Integer num;
        l.d(eVar, "");
        l.d(oVar, "");
        super.a(eVar, oVar, list, obj);
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        String str = eVar.f85299l;
        Integer num2 = null;
        if (!hl.a(str)) {
            str = null;
        }
        if (str != null) {
            View a2 = a(R.id.ak3);
            l.b(a2, "");
            a2.setVisibility(0);
            TuxIconView tuxIconView = (TuxIconView) a(R.id.bi7);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) a(R.id.bi7)).setOnClickListener(new a(str, this));
        } else {
            View a3 = a(R.id.ak3);
            l.b(a3, "");
            a3.setVisibility(8);
            TuxIconView tuxIconView2 = (TuxIconView) a(R.id.bi7);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        InputWithIndicator inputWithIndicator = (InputWithIndicator) a(R.id.bps);
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d dVar = eVar.f85300m;
        if (dVar != null) {
            num2 = dVar.f85285b;
        }
        int ordinal = n.NUMBER.ordinal();
        if (num2 != null && num2.intValue() == ordinal) {
            inputType = ((InputWithIndicator) a(R.id.bps)).getInputType() | 2;
        } else {
            int ordinal2 = n.PHONE.ordinal();
            if (num2 != null && num2.intValue() == ordinal2) {
                inputType = ((InputWithIndicator) a(R.id.bps)).getInputType() | 3;
            } else {
                inputType = ((InputWithIndicator) a(R.id.bps)).getInputType();
            }
        }
        inputWithIndicator.setInputType(inputType);
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) a(R.id.bps);
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d dVar2 = eVar.f85300m;
        int i3 = Integer.MAX_VALUE;
        if (dVar2 == null || (num = dVar2.f85284a) == null) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = num.intValue();
        }
        inputWithIndicator2.setMaxLength(i2);
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d dVar3 = eVar.f85300m;
        boolean z2 = true;
        if (dVar3 == null || !dVar3.f85286c) {
            z = false;
        } else {
            z = true;
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) a(R.id.bps);
        if (!z) {
            i3 = 1;
        }
        inputWithIndicator3.setMaxLines(i3);
        if (z) {
            ((InputWithIndicator) a(R.id.bps)).setInputType(((InputWithIndicator) a(R.id.bps)).getInputType() | 131072);
        }
        String str2 = eVar.n;
        if (!(str2 == null || str2.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.elq);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.elq);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(eVar.n);
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.elq);
            l.b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        }
        TextWatcher textWatcher = this.f85562d;
        if (textWatcher != null) {
            ((DmtEditText) a(R.id.bpu)).removeTextChangedListener(textWatcher);
        }
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        this.f85562d = new b(this, dmtEditText, "/");
        ((DmtEditText) a(R.id.bpu)).addTextChangedListener(this.f85562d);
        ((InputWithIndicator) a(R.id.bps)).setOnEditTextFocusChangeListener(new c(this, eVar));
        if (list != null) {
            InputWithIndicator inputWithIndicator4 = (InputWithIndicator) a(R.id.bps);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String paramValue = it.next().getParamValue();
                if (paramValue != null) {
                    arrayList.add(paramValue);
                }
            }
            inputWithIndicator4.setText(n.a(arrayList, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C2048d.f85572a, 30));
        }
        DmtEditText dmtEditText2 = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText2, "");
        dmtEditText2.setImeOptions(6);
    }
}
