package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.h.i;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.List;

public final class j extends g {

    /* renamed from: b  reason: collision with root package name */
    private o f85627b;

    /* renamed from: c  reason: collision with root package name */
    private e f85628c;

    /* renamed from: d  reason: collision with root package name */
    private TextWatcher f85629d;

    /* renamed from: e  reason: collision with root package name */
    private h.f.a.b<? super List<m>, z> f85630e;

    /* renamed from: g  reason: collision with root package name */
    private PhoneInputView f85631g;

    /* renamed from: h  reason: collision with root package name */
    private final int f85632h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f85633i;

    static {
        Covode.recordClassIndex(53555);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g, com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final View a(int i2) {
        if (this.f85633i == null) {
            this.f85633i = new SparseArray();
        }
        View view = (View) this.f85633i.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85633i.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final e getElementDTO() {
        return this.f85628c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final h.f.a.b<List<m>, z> getOnValueChange() {
        return this.f85630e;
    }

    public final o getPaymentMethod() {
        return this.f85627b;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g
    public final InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) a(R.id.ag8);
        l.b(inputWithIndicator, "");
        return inputWithIndicator;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final View getContentView() {
        Context context = getContext();
        l.b(context, "");
        PhoneInputView phoneInputView = new PhoneInputView(context, (AttributeSet) null, 6);
        phoneInputView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        i.a((View) phoneInputView.getEditText(), (Integer) null, Integer.valueOf(this.f85632h), (Integer) null, Integer.valueOf(this.f85632h), false, 21);
        this.f85631g = phoneInputView;
        return phoneInputView;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final List<m> getValue() {
        PhoneInputView.b bVar;
        e eVar;
        e eVar2;
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        List<e> list;
        List<e> list2;
        PhoneInputView phoneInputView = this.f85631g;
        Boolean bool2 = null;
        if (phoneInputView != null) {
            bVar = phoneInputView.getPhoneModel();
        } else {
            bVar = null;
        }
        e elementDTO = getElementDTO();
        if (elementDTO == null || (list2 = elementDTO.f85296i) == null) {
            eVar = null;
        } else {
            eVar = (e) n.b((List) list2, 0);
        }
        e elementDTO2 = getElementDTO();
        if (elementDTO2 == null || (list = elementDTO2.f85296i) == null) {
            eVar2 = null;
        } else {
            eVar2 = (e) n.b((List) list, 1);
        }
        m[] mVarArr = new m[3];
        if (bVar != null) {
            str = bVar.f84609a;
        } else {
            str = null;
        }
        mVarArr[0] = new m(null, null, str, null, null, 24, null);
        if (eVar2 != null) {
            str2 = eVar2.f85288a;
            str3 = eVar2.f85293f;
        } else {
            str2 = null;
            str3 = null;
        }
        StringBuilder sb = new StringBuilder("+");
        if (bVar != null) {
            str4 = bVar.f84610b;
        } else {
            str4 = null;
        }
        String sb2 = sb.append(str4).toString();
        if (eVar2 != null) {
            bool = eVar2.f85298k;
        } else {
            bool = null;
        }
        mVarArr[1] = new m(str2, str3, sb2, bool, null, 16, null);
        if (eVar != null) {
            str5 = eVar.f85288a;
            str6 = eVar.f85293f;
        } else {
            str5 = null;
            str6 = null;
        }
        if (bVar != null) {
            str7 = bVar.f84611c;
        } else {
            str7 = null;
        }
        if (!hl.a(str7)) {
            str7 = null;
        }
        if (eVar != null) {
            bool2 = eVar.f85298k;
        }
        mVarArr[2] = new m(str5, str6, str7, bool2, null, 16, null);
        return n.b(mVarArr);
    }

    public final void setElementDTO(e eVar) {
        this.f85628c = eVar;
    }

    public final void setPaymentMethod(o oVar) {
        this.f85627b = oVar;
    }

    public static final class b extends com.ss.android.ugc.aweme.ecommerce.util.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f85636a;

        static {
            Covode.recordClassIndex(53557);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(j jVar) {
            this.f85636a = jVar;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.util.l
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            this.f85636a.getOnValueChange().invoke(this.f85636a.getValue());
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<List<? extends m>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f85638a = new d();

        static {
            Covode.recordClassIndex(53559);
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

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void setOnValueChange(h.f.a.b<? super List<m>, z> bVar) {
        l.d(bVar, "");
        this.f85630e = bVar;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f85634a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f85635b;

        static {
            Covode.recordClassIndex(53556);
        }

        a(String str, j jVar) {
            this.f85634a = str;
            this.f85635b = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f85635b.getContext(), this.f85634a).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private j(Context context) {
        super(context, null, 0);
        l.d(context, "");
        this.f85630e = d.f85638a;
        this.f85632h = (int) com.bytedance.common.utility.n.b(context, 15.0f);
        ((InputWithIndicator) a(R.id.ag8)).setInputType(3);
    }

    public /* synthetic */ j(Context context, byte b2) {
        this(context);
    }

    static final class c implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f85637a;

        static {
            Covode.recordClassIndex(53558);
        }

        c(j jVar) {
            this.f85637a = jVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f85637a.a();
                this.f85637a.getOnErrorClear().invoke();
                return;
            }
            String invoke = this.f85637a.getOnVerify().invoke(this.f85637a.getValue());
            if (invoke != null) {
                this.f85637a.a(invoke);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void a(e eVar, o oVar, List<m> list, Object obj) {
        String str;
        String str2;
        PhoneInputView phoneInputView;
        l.d(eVar, "");
        l.d(oVar, "");
        super.a(eVar, oVar, list, obj);
        setPaymentMethod(oVar);
        setElementDTO(eVar);
        String str3 = eVar.f85299l;
        String str4 = null;
        if (!hl.a(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            View a2 = a(R.id.ak3);
            l.b(a2, "");
            a2.setVisibility(0);
            TuxIconView tuxIconView = (TuxIconView) a(R.id.bi7);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) a(R.id.bi7)).setOnClickListener(new a(str3, this));
        } else {
            View a3 = a(R.id.ak3);
            l.b(a3, "");
            a3.setVisibility(8);
            TuxIconView tuxIconView2 = (TuxIconView) a(R.id.bi7);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        ((InputWithIndicator) a(R.id.ag8)).setMaxLines(1);
        TextWatcher textWatcher = this.f85629d;
        if (textWatcher != null) {
            ((DmtEditText) a(R.id.bpu)).removeTextChangedListener(textWatcher);
        }
        this.f85629d = new b(this);
        ((DmtEditText) a(R.id.bpu)).addTextChangedListener(this.f85629d);
        ((InputWithIndicator) a(R.id.ag8)).setOnEditTextFocusChangeListener(new c(this));
        if (list != null) {
            if (list.size() < 3) {
                PhoneInputView phoneInputView2 = this.f85631g;
                if (phoneInputView2 != null) {
                    phoneInputView2.a();
                }
                PhoneInputView phoneInputView3 = this.f85631g;
                if (phoneInputView3 != null) {
                    phoneInputView3.setPhoneNumber("");
                }
            } else {
                m mVar = (m) n.b((List) list, 0);
                if (mVar != null) {
                    str = mVar.getParamValue();
                } else {
                    str = null;
                }
                m mVar2 = (m) n.b((List) list, 1);
                if (mVar2 != null) {
                    str2 = mVar2.getParamValue();
                } else {
                    str2 = null;
                }
                m mVar3 = (m) n.b((List) list, 2);
                if (mVar3 != null) {
                    str4 = mVar3.getParamValue();
                }
                if (!(str == null || str2 == null || str4 == null || (phoneInputView = this.f85631g) == null)) {
                    phoneInputView.setPhoneModel(new PhoneInputView.b(str, p.a(str2, "+", ""), str4));
                }
            }
        }
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        dmtEditText.setImeOptions(6);
    }
}
