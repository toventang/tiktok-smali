package com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder;

import android.os.SystemClock;
import android.text.TextWatcher;
import android.view.View;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.address.edit.j;
import com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView;
import com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.m.p;
import h.z;
import java.util.Objects;

public final class PhoneInputItemViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.address.a.a> implements au {

    /* renamed from: k  reason: collision with root package name */
    public static final b f84471k = new b((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final CandHelper f84472f;

    /* renamed from: g  reason: collision with root package name */
    public long f84473g = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f84474j;

    /* renamed from: l  reason: collision with root package name */
    private final h f84475l;

    /* renamed from: m  reason: collision with root package name */
    private TextWatcher f84476m;

    static {
        Covode.recordClassIndex(52708);
    }

    public final AddressEditViewModel m() {
        return (AddressEditViewModel) this.f84475l.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(52710);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.a.a $item$inlined;
        final /* synthetic */ InputItem $this_with;
        final /* synthetic */ PhoneInputItemViewHolder this$0;

        static {
            Covode.recordClassIndex(52712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(InputItem inputItem, PhoneInputItemViewHolder phoneInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
            super(0);
            this.$this_with = inputItem;
            this.this$0 = phoneInputItemViewHolder;
            this.$item$inlined = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$item$inlined.f84262b = ((PhoneInputView) this.$this_with.a(R.id.d4_)).getFullPhoneNumber();
            return z.f158842a;
        }
    }

    public final void n() {
        View view = this.itemView;
        l.b(view, "");
        if (p.a((CharSequence) ((PhoneInputView) view.findViewById(R.id.d4_)).getFullPhoneNumber().getSecond(), (CharSequence) "*", false)) {
            View view2 = this.itemView;
            l.b(view2, "");
            ((PhoneInputView) view2.findViewById(R.id.d4_)).setPhoneNumber("");
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<AddressEditViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(52709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_address_edit_viewholder_PhoneInputItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PhoneInputItemViewHolder f84480a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.a.a f84481b;

        static {
            Covode.recordClassIndex(52713);
        }

        e(PhoneInputItemViewHolder phoneInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
            this.f84480a = phoneInputItemViewHolder;
            this.f84481b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f84480a.n();
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PhoneInputItemViewHolder f84485a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.a.a f84486b;

        static {
            Covode.recordClassIndex(52715);
        }

        g(PhoneInputItemViewHolder phoneInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
            this.f84485a = phoneInputItemViewHolder;
            this.f84486b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            j jVar = this.f84485a.m().f84362l;
            if (jVar != null) {
                jVar.c(this.f84486b.f84261a.f84310d);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PhoneInputItemViewHolder(android.view.ViewGroup r6) {
        /*
            r5 = this;
            java.lang.String r4 = ""
            h.f.b.l.d(r6, r4)
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558947(0x7f0d0223, float:1.8743224E38)
            r0 = 0
            android.view.View r0 = com.a.a(r2, r1, r6, r0)
            h.f.b.l.b(r0, r4)
            r5.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder$a
            r0.<init>(r5, r1, r1)
            h.h r0 = h.i.a(r0)
            r5.f84475l = r0
            com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper r3 = new com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper
            android.content.Context r2 = r6.getContext()
            h.f.b.l.b(r2, r4)
            android.view.View r1 = r5.itemView
            h.f.b.l.b(r1, r4)
            r0 = 2131367051(0x7f0a148b, float:1.8354013E38)
            android.view.View r0 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView r0 = (com.ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView) r0
            android.widget.EditText r0 = r0.getEditText()
            r3.<init>(r2, r0)
            r5.f84472f = r3
            r0 = -1
            r5.f84473g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
        com.ss.android.ugc.aweme.ecommerce.address.a.a aVar2 = aVar;
        l.d(aVar2, "");
        this.f84472f.a(m(), aVar2.f84261a.f84310d);
        View view = this.itemView;
        l.b(view, "");
        PhoneInputView phoneInputView = (PhoneInputView) view.findViewById(R.id.d4_);
        l.b(phoneInputView, "");
        ((InputWithIndicator) phoneInputView.a(R.id.ag8)).setIndicatorClickListener(new g(this, aVar2));
        View view2 = this.itemView;
        Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
        InputItem inputItem = (InputItem) view2;
        TextWatcher textWatcher = this.f84476m;
        if (textWatcher != null) {
            PhoneInputView phoneInputView2 = (PhoneInputView) inputItem.a(R.id.d4_);
            l.b(phoneInputView2, "");
            ((InputWithIndicator) phoneInputView2.a(R.id.ag8)).getEditText().removeTextChangedListener(textWatcher);
        }
        inputItem.setTitle(aVar2.f84261a.f84313g);
        ((PhoneInputView) inputItem.a(R.id.d4_)).setHint(aVar2.f84261a.f84309c);
        PhoneInputView phoneInputView3 = (PhoneInputView) inputItem.a(R.id.d4_);
        Object obj = aVar2.f84262b;
        if (!(obj instanceof h.p)) {
            obj = null;
        }
        phoneInputView3.setFullPhoneNumber((h.p) obj);
        String str = aVar2.f84263c;
        if (str != null) {
            inputItem.a(str);
        } else {
            inputItem.a();
        }
        if (l.a((Object) this.f84472f.f84274d, (Object) "sug")) {
            PhoneInputView phoneInputView4 = (PhoneInputView) inputItem.a(R.id.d4_);
            l.b(phoneInputView4, "");
            this.f84474j = ((InputWithIndicator) phoneInputView4.a(R.id.ag8)).getEditText().getText().length();
        }
        this.f84476m = new c(inputItem, this, aVar2);
        PhoneInputView phoneInputView5 = (PhoneInputView) inputItem.a(R.id.d4_);
        l.b(phoneInputView5, "");
        ((InputWithIndicator) phoneInputView5.a(R.id.ag8)).getEditText().addTextChangedListener(this.f84476m);
        ((PhoneInputView) inputItem.a(R.id.d4_)).setOnCountryCodeChangeListener(new d(inputItem, this, aVar2));
        ((PhoneInputView) inputItem.a(R.id.d4_)).setOnCountryCodeClickListener(new e(this, aVar2));
        PhoneInputView phoneInputView6 = (PhoneInputView) inputItem.a(R.id.d4_);
        l.b(phoneInputView6, "");
        ((InputWithIndicator) phoneInputView6.a(R.id.ag8)).setOnEditTextFocusChangeListener(new f(inputItem, this, aVar2));
    }

    static final class f implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputItem f84482a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PhoneInputItemViewHolder f84483b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.a.a f84484c;

        static {
            Covode.recordClassIndex(52714);
        }

        f(InputItem inputItem, PhoneInputItemViewHolder phoneInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
            this.f84482a = inputItem;
            this.f84483b = phoneInputItemViewHolder;
            this.f84484c = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                PhoneInputItemViewHolder phoneInputItemViewHolder = this.f84483b;
                PhoneInputView phoneInputView = (PhoneInputView) this.f84482a.a(R.id.d4_);
                l.b(phoneInputView, "");
                phoneInputItemViewHolder.f84474j = ((InputWithIndicator) phoneInputView.a(R.id.ag8)).getEditText().getText().length();
                this.f84483b.f84473g = SystemClock.elapsedRealtime();
                j jVar = this.f84483b.m().f84362l;
                if (jVar != null) {
                    jVar.a(this.f84484c.f84261a.f84310d);
                }
                if (this.f84484c.f84262b == null) {
                    this.f84484c.f84262b = ((PhoneInputView) this.f84482a.a(R.id.d4_)).getFullPhoneNumber();
                }
                CandHelper candHelper = this.f84483b.f84472f;
                View view2 = this.f84483b.itemView;
                l.b(view2, "");
                candHelper.a(((PhoneInputView) view2.findViewById(R.id.d4_)).getEditText(), this.f84484c.f84261a.f84310d, this.f84483b.m());
                this.f84483b.n();
                this.f84482a.a();
                this.f84484c.f84263c = null;
                return;
            }
            PhoneInputView phoneInputView2 = (PhoneInputView) this.f84482a.a(R.id.d4_);
            l.b(phoneInputView2, "");
            PhoneInputView phoneInputView3 = (PhoneInputView) this.f84482a.a(R.id.d4_);
            l.b(phoneInputView3, "");
            ((InputWithIndicator) phoneInputView2.a(R.id.ag8)).setText(((InputWithIndicator) phoneInputView3.a(R.id.ag8)).getText());
            this.f84483b.m();
            String a2 = AddressEditViewModel.a(this.f84484c.f84261a.f84315i, this.f84484c.f84262b);
            if (a2 != null) {
                this.f84482a.a(a2);
                this.f84484c.f84263c = a2;
            }
            this.f84483b.f84472f.b(this.f84483b.m(), this.f84484c.f84261a.f84310d);
            PhoneInputView phoneInputView4 = (PhoneInputView) this.f84482a.a(R.id.d4_);
            l.b(phoneInputView4, "");
            int length = ((InputWithIndicator) phoneInputView4.a(R.id.ag8)).getEditText().getText().length() - this.f84483b.f84474j;
            if (length == 0) {
                if (!l.a((Object) this.f84483b.f84472f.f84274d, (Object) "sug")) {
                    this.f84483b.f84472f.f84274d = "";
                }
            } else if (length > 0) {
                this.f84483b.f84472f.f84274d = "add";
            } else {
                this.f84483b.f84472f.f84274d = "del";
            }
            if (this.f84483b.f84473g != -1) {
                j jVar2 = this.f84483b.m().f84362l;
                if (jVar2 != null) {
                    jVar2.a(this.f84484c.f84261a.f84310d, SystemClock.elapsedRealtime() - this.f84483b.f84473g, this.f84483b.f84472f.f84274d);
                }
                this.f84483b.f84473g = -1;
            }
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.ecommerce.util.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputItem f84477a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PhoneInputItemViewHolder f84478b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.a.a f84479c;

        static {
            Covode.recordClassIndex(52711);
        }

        c(InputItem inputItem, PhoneInputItemViewHolder phoneInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
            this.f84477a = inputItem;
            this.f84478b = phoneInputItemViewHolder;
            this.f84479c = aVar;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.util.l
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            super.onTextChanged(charSequence, i2, i3, i4);
            if (charSequence != null) {
                h.p<String, String> fullPhoneNumber = ((PhoneInputView) this.f84477a.a(R.id.d4_)).getFullPhoneNumber();
                String second = fullPhoneNumber.getSecond();
                Object obj = this.f84479c.f84262b;
                Object obj2 = null;
                if (!(obj instanceof h.p)) {
                    obj = null;
                }
                h.p pVar = (h.p) obj;
                if (pVar != null) {
                    obj2 = pVar.getSecond();
                }
                if (!l.a((Object) second, obj2)) {
                    this.f84478b.m().f84358e = true;
                }
                this.f84479c.f84262b = fullPhoneNumber;
            }
            if (this.f84478b.f84472f.f84273c == 0) {
                this.f84478b.f84472f.f84273c = 1;
                this.f84478b.f84472f.b(this.f84478b.m(), this.f84479c.f84261a.f84310d);
                return;
            }
            CandHelper candHelper = this.f84478b.f84472f;
            View view = this.f84478b.itemView;
            l.b(view, "");
            candHelper.a(((PhoneInputView) view.findViewById(R.id.d4_)).getEditText(), this.f84479c.f84261a.f84310d, this.f84478b.m());
        }
    }
}
