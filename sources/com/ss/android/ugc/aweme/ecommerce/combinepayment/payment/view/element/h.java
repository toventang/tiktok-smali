package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.text.Editable;
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
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.List;
import java.util.Objects;

public class h extends g {

    /* renamed from: b  reason: collision with root package name */
    private o f85586b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85587c;

    /* renamed from: d  reason: collision with root package name */
    private TextWatcher f85588d;

    /* renamed from: e  reason: collision with root package name */
    private h.f.a.b<? super Boolean, z> f85589e;

    /* renamed from: g  reason: collision with root package name */
    private h.f.a.b<? super List<m>, z> f85590g;

    /* renamed from: h  reason: collision with root package name */
    private String f85591h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f85592i;

    static {
        Covode.recordClassIndex(53534);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g, com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public final View a(int i2) {
        if (this.f85592i == null) {
            this.f85592i = new SparseArray();
        }
        View view = (View) this.f85592i.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85592i.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public int getContentViewLayoutId() {
        return R.layout.p9;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public int getFooterViewLayoutId() {
        return R.layout.p_;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e getElementDTO() {
        return this.f85587c;
    }

    public final String getMInputMethod() {
        return this.f85591h;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final h.f.a.b<Boolean, z> getOnFocusChange() {
        return this.f85589e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public h.f.a.b<List<m>, z> getOnValueChange() {
        return this.f85590g;
    }

    public o getPaymentMethod() {
        return this.f85586b;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g
    public InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) a(R.id.bps);
        l.b(inputWithIndicator, "");
        return inputWithIndicator;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public List<m> getValue() {
        Integer num;
        String str;
        String str2;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d dVar;
        String str3;
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        String str4 = "";
        l.b(dmtEditText, str4);
        String valueOf = String.valueOf(dmtEditText.getText());
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO = getElementDTO();
        Boolean bool = null;
        if (elementDTO != null) {
            num = elementDTO.f85290c;
        } else {
            num = null;
        }
        int ordinal = f.CPF.ordinal();
        if (num != null && num.intValue() == ordinal) {
            valueOf = p.a(p.a(valueOf, ".", str4, false), "-", str4, false);
        }
        if (valueOf.length() > 0) {
            StringBuilder sb = new StringBuilder();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO2 = getElementDTO();
            if (!(elementDTO2 == null || (dVar = elementDTO2.f85300m) == null || (str3 = dVar.f85287d) == null)) {
                str4 = str3;
            }
            str4 = sb.append(str4).append(valueOf).toString();
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO3 = getElementDTO();
        if (elementDTO3 != null) {
            str = elementDTO3.f85288a;
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO4 = getElementDTO();
        if (elementDTO4 != null) {
            str2 = elementDTO4.f85293f;
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO5 = getElementDTO();
        if (elementDTO5 != null) {
            bool = elementDTO5.f85298k;
        }
        return n.a(new m(str, str2, str4, bool, null, 16, null));
    }

    public void setElementDTO(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
        this.f85587c = eVar;
    }

    public void setPaymentMethod(o oVar) {
        this.f85586b = oVar;
    }

    public static final class e extends com.ss.android.ugc.aweme.ecommerce.util.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f85601a;

        static {
            Covode.recordClassIndex(53539);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(h hVar) {
            this.f85601a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.util.l
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            String str;
            super.onTextChanged(charSequence, i2, i3, i4);
            this.f85601a.getOnValueChange().invoke(this.f85601a.getValue());
            h hVar = this.f85601a;
            if (TextUtils.isEmpty(charSequence)) {
                str = "";
            } else {
                str = "normal";
            }
            hVar.setMInputMethod(str);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f85602a = new f();

        static {
            Covode.recordClassIndex(53540);
        }

        f() {
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

    static final class g extends h.f.b.m implements h.f.a.b<List<? extends m>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f85603a = new g();

        static {
            Covode.recordClassIndex(53541);
        }

        g() {
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

    public final void setMInputMethod(String str) {
        l.d(str, "");
        this.f85591h = str;
    }

    public final void setOnFocusChange(h.f.a.b<? super Boolean, z> bVar) {
        l.d(bVar, "");
        this.f85589e = bVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public void setOnValueChange(h.f.a.b<? super List<m>, z> bVar) {
        l.d(bVar, "");
        this.f85590g = bVar;
    }

    public static class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f85593a;

        /* renamed from: b  reason: collision with root package name */
        private final int f85594b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f85595c;

        /* renamed from: d  reason: collision with root package name */
        private final int f85596d;

        static {
            Covode.recordClassIndex(53535);
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        private a(EditText editText) {
            l.d(editText, "");
            this.f85593a = editText;
            this.f85594b = 3;
            this.f85595c = n.b(".", "-");
            this.f85596d = 14;
        }

        public void afterTextChanged(Editable editable) {
            l.d(editable, "");
            if (this.f85594b > 0) {
                String obj = editable.toString();
                int selectionStart = this.f85593a.getSelectionStart();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                int i2 = 0;
                String substring = obj.substring(0, selectionStart);
                l.b(substring, "");
                int length = p.a(p.a(substring, this.f85595c.get(0), ""), this.f85595c.get(1), "").length();
                StringBuilder sb = new StringBuilder();
                int length2 = obj.length();
                int i3 = 0;
                for (int i4 = 0; i4 < length2; i4++) {
                    char charAt = obj.charAt(i4);
                    if (!(charAt == this.f85595c.get(0).charAt(0) || charAt == this.f85595c.get(1).charAt(0))) {
                        sb.append(charAt);
                        if ((sb.length() - i3) % this.f85594b == 0) {
                            if (i3 >= 2) {
                                sb.append(this.f85595c.get(1));
                            } else {
                                sb.append(this.f85595c.get(0));
                            }
                            i3++;
                        }
                    }
                }
                int lastIndexOf = sb.lastIndexOf(this.f85595c.get(0));
                int lastIndexOf2 = sb.lastIndexOf(this.f85595c.get(1));
                if (lastIndexOf2 > lastIndexOf) {
                    lastIndexOf = lastIndexOf2;
                }
                if (lastIndexOf >= 0 && lastIndexOf == sb.length() - 1) {
                    sb.deleteCharAt(lastIndexOf);
                }
                String sb2 = sb.toString();
                if (sb2.length() > this.f85596d) {
                    l.b(sb2, "");
                    int i5 = this.f85596d;
                    Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
                    sb2 = sb2.substring(0, i5);
                    l.b(sb2, "");
                } else {
                    l.b(sb2, "");
                }
                int i6 = this.f85594b;
                int i7 = ((length / i6) * (i6 + 1)) + (length % i6);
                if (i7 % (i6 + 1) == 0) {
                    i7--;
                }
                int length3 = sb2.length();
                if (i7 >= 0) {
                    i2 = i7;
                }
                if (i2 <= length3) {
                    length3 = i2;
                }
                if (!l.a((Object) sb2, (Object) obj)) {
                    this.f85593a.setText(sb2);
                }
                this.f85593a.setSelection(length3);
            }
        }

        public /* synthetic */ a(EditText editText, byte b2) {
            this(editText);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f85597a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f85598b;

        static {
            Covode.recordClassIndex(53536);
        }

        b(String str, h hVar) {
            this.f85597a = str;
            this.f85598b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f85598b.getContext(), this.f85597a).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private h(Context context) {
        super(context, null, 0);
        l.d(context, "");
        this.f85589e = f.f85602a;
        this.f85590g = g.f85603a;
        this.f85591h = "";
    }

    public /* synthetic */ h(Context context, byte b2) {
        this(context);
    }

    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f85600a;

        static {
            Covode.recordClassIndex(53538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar, EditText editText) {
            super(editText, (byte) 0);
            this.f85600a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.h.a
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            String str = "";
            l.d(charSequence, str);
            this.f85600a.getOnValueChange().invoke(this.f85600a.getValue());
            h hVar = this.f85600a;
            if (!TextUtils.isEmpty(charSequence)) {
                str = "normal";
            }
            hVar.setMInputMethod(str);
        }
    }

    static final class c implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f85599a;

        static {
            Covode.recordClassIndex(53537);
        }

        c(h hVar) {
            this.f85599a = hVar;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f85599a.getOnFocusChange().invoke(Boolean.valueOf(z));
            if (z) {
                this.f85599a.a();
                this.f85599a.getOnErrorClear().invoke();
                return;
            }
            String invoke = this.f85599a.getOnVerify().invoke(this.f85599a.getValue());
            if (invoke != null) {
                this.f85599a.a(invoke);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, o oVar, List<m> list, Object obj) {
        TextWatcher dVar;
        boolean z;
        String str;
        String str2;
        String str3;
        l.d(eVar, "");
        l.d(oVar, "");
        super.a(eVar, oVar, list, obj);
        setElementDTO(eVar);
        setPaymentMethod(oVar);
        DmtEditText dmtEditText = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText, "");
        dmtEditText.setTag(eVar.f85290c);
        ((InputWithIndicator) a(R.id.bps)).setOnEditTextFocusChangeListener(new c(this));
        TextWatcher textWatcher = this.f85588d;
        if (textWatcher != null) {
            ((DmtEditText) a(R.id.bpu)).removeTextChangedListener(textWatcher);
        }
        Integer num = eVar.f85290c;
        int ordinal = f.CPF.ordinal();
        if (num != null && num.intValue() == ordinal) {
            DmtEditText dmtEditText2 = (DmtEditText) a(R.id.bpu);
            l.b(dmtEditText2, "");
            dVar = new d(this, dmtEditText2);
        } else {
            dVar = new e(this);
        }
        this.f85588d = dVar;
        ((DmtEditText) a(R.id.bpu)).addTextChangedListener(this.f85588d);
        boolean z2 = true;
        String str4 = null;
        if (list != null) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d dVar2 = eVar.f85300m;
            if (dVar2 != null) {
                str2 = dVar2.f85287d;
            } else {
                str2 = null;
            }
            m mVar = (m) n.b((List) list, 0);
            if (mVar == null || (str3 = mVar.getParamValue()) == null) {
                str3 = "";
            }
            if (!(str2 == null || str2.length() == 0)) {
                str3 = p.b(str3, str2, "", false);
            }
            ((InputWithIndicator) a(R.id.bps)).setText(str3);
        }
        String str5 = eVar.f85299l;
        if (!hl.a(str5)) {
            str5 = null;
        }
        if (str5 != null) {
            View a2 = a(R.id.ak3);
            l.b(a2, "");
            a2.setVisibility(0);
            TuxIconView tuxIconView = (TuxIconView) a(R.id.bi7);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            ((TuxIconView) a(R.id.bi7)).setOnClickListener(new b(str5, this));
        } else {
            View a3 = a(R.id.ak3);
            l.b(a3, "");
            a3.setVisibility(8);
            TuxIconView tuxIconView2 = (TuxIconView) a(R.id.bi7);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        String str6 = eVar.n;
        if (str6 == null || str6.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
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
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d dVar3 = eVar.f85300m;
        if (!(dVar3 == null || (str = dVar3.f85287d) == null || str.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            TuxTextView tuxTextView4 = (TuxTextView) a(R.id.d87);
            l.b(tuxTextView4, "");
            tuxTextView4.setVisibility(0);
            TuxTextView tuxTextView5 = (TuxTextView) a(R.id.d87);
            l.b(tuxTextView5, "");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d dVar4 = eVar.f85300m;
            if (dVar4 != null) {
                str4 = dVar4.f85287d;
            }
            tuxTextView5.setText(str4);
        } else {
            TuxTextView tuxTextView6 = (TuxTextView) a(R.id.d87);
            l.b(tuxTextView6, "");
            tuxTextView6.setVisibility(8);
        }
        DmtEditText dmtEditText3 = (DmtEditText) a(R.id.bpu);
        l.b(dmtEditText3, "");
        dmtEditText3.setImeOptions(6);
    }
}
