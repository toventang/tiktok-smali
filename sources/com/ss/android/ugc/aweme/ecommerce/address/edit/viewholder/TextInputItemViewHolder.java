package com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.address.edit.j;
import com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import java.lang.reflect.Field;
import java.util.Objects;

public final class TextInputItemViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.address.a.a> implements au {

    /* renamed from: f  reason: collision with root package name */
    public final CandHelper f84501f;

    /* renamed from: g  reason: collision with root package name */
    public long f84502g = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f84503j;

    /* renamed from: k  reason: collision with root package name */
    private final h f84504k;

    /* renamed from: l  reason: collision with root package name */
    private TextWatcher f84505l;

    static {
        Covode.recordClassIndex(52729);
    }

    public final AddressEditViewModel m() {
        return (AddressEditViewModel) this.f84504k.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<AddressEditViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(52730);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_address_edit_viewholder_TextInputItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
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
        final /* synthetic */ TextInputItemViewHolder f84515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.a.a f84516b;

        static {
            Covode.recordClassIndex(52734);
        }

        e(TextInputItemViewHolder textInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
            this.f84515a = textInputItemViewHolder;
            this.f84516b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            j jVar = this.f84515a.m().f84362l;
            if (jVar != null) {
                jVar.c(this.f84516b.f84261a.f84310d);
            }
        }
    }

    public final void a(boolean z) {
        Integer num = ((com.ss.android.ugc.aweme.ecommerce.address.a.a) aI_()).f84261a.f84314h;
        if (num != null && num.intValue() == 5) {
            m().a(z);
        }
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f84506a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputItem f84507b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextInputItemViewHolder f84508c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.a.a f84509d;

        static {
            Covode.recordClassIndex(52731);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                EditText editText = ((InputWithIndicator) this.f84507b.a(R.id.bps)).getEditText();
                Object a2 = a(this.f84508c.itemView.getContext(), "input_method");
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                editText.requestFocus();
                ((InputMethodManager) a2).showSoftInput(editText, 0);
            }
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(5519);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                    } finally {
                        MethodCollector.o(5519);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(InputItem inputItem, TextInputItemViewHolder textInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
            super(700);
            this.f84507b = inputItem;
            this.f84508c = textInputItemViewHolder;
            this.f84509d = aVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputItemViewHolder(android.view.ViewGroup r6) {
        /*
            r5 = this;
            java.lang.String r4 = ""
            h.f.b.l.d(r6, r4)
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558950(0x7f0d0226, float:1.874323E38)
            r0 = 0
            android.view.View r0 = com.a.a(r2, r1, r6, r0)
            h.f.b.l.b(r0, r4)
            r5.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder$a
            r0.<init>(r5, r1, r1)
            h.h r0 = h.i.a(r0)
            r5.f84504k = r0
            com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper r3 = new com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper
            android.content.Context r2 = r6.getContext()
            h.f.b.l.b(r2, r4)
            android.view.View r1 = r5.itemView
            h.f.b.l.b(r1, r4)
            r0 = 2131365144(0x7f0a0d18, float:1.8350145E38)
            android.view.View r0 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator r0 = (com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator) r0
            android.widget.EditText r0 = r0.getEditText()
            r3.<init>(r2, r0)
            r5.f84501f = r3
            r0 = -1
            r5.f84502g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
        int i2;
        com.ss.android.ugc.aweme.ecommerce.address.a.a aVar2 = aVar;
        l.d(aVar2, "");
        this.f84501f.a(m(), aVar2.f84261a.f84310d);
        View view = this.itemView;
        l.b(view, "");
        ((InputWithIndicator) view.findViewById(R.id.bps)).setIndicatorClickListener(new e(this, aVar2));
        Integer num = aVar2.f84261a.f84314h;
        int i3 = 0;
        if (num != null) {
            if (num.intValue() == 0) {
                View view2 = this.itemView;
                l.b(view2, "");
                ((InputWithIndicator) view2.findViewById(R.id.bps)).getEditText().setTag(0);
                View view3 = this.itemView;
                l.b(view3, "");
                ((InputWithIndicator) view3.findViewById(R.id.bps)).setInputType(1);
            } else if (num.intValue() == 5) {
                View view4 = this.itemView;
                l.b(view4, "");
                ((InputWithIndicator) view4.findViewById(R.id.bps)).getEditText().setTag(5);
                View view5 = this.itemView;
                l.b(view5, "");
                ((InputWithIndicator) view5.findViewById(R.id.bps)).setInputType(32);
            }
        }
        View view6 = this.itemView;
        Objects.requireNonNull(view6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
        InputItem inputItem = (InputItem) view6;
        TextWatcher textWatcher = this.f84505l;
        if (textWatcher != null) {
            ((InputWithIndicator) inputItem.a(R.id.bps)).getEditText().removeTextChangedListener(textWatcher);
        }
        inputItem.setTitle(aVar2.f84261a.f84313g);
        ((InputWithIndicator) inputItem.a(R.id.bps)).setHint(aVar2.f84261a.f84309c);
        Integer num2 = aVar2.f84261a.f84312f;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = Integer.MAX_VALUE;
        }
        ((InputWithIndicator) inputItem.a(R.id.bps)).setMaxLines(i2);
        if (i2 > 1 && (true ^ l.a((Object) aVar2.f84261a.f84310d, (Object) "address"))) {
            ((InputWithIndicator) inputItem.a(R.id.bps)).setInputType(((InputWithIndicator) inputItem.a(R.id.bps)).getInputType() | 131072);
        }
        Integer num3 = aVar2.f84261a.f84311e;
        if (num3 != null) {
            i3 = num3.intValue();
        }
        ((InputWithIndicator) inputItem.a(R.id.bps)).setMaxLength(i3);
        Object obj = aVar2.f84262b;
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            ((InputWithIndicator) inputItem.a(R.id.bps)).setText(str);
        } else {
            ((InputWithIndicator) inputItem.a(R.id.bps)).setText("");
        }
        String str2 = aVar2.f84263c;
        if (str2 != null) {
            inputItem.a(str2);
        } else {
            inputItem.a();
        }
        View view7 = this.itemView;
        l.b(view7, "");
        FrameLayout frameLayout = (FrameLayout) view7.findViewById(R.id.adq);
        l.b(frameLayout, "");
        frameLayout.setOnClickListener(new b(inputItem, this, aVar2));
        if (l.a((Object) this.f84501f.f84274d, (Object) "sug")) {
            this.f84503j = ((InputWithIndicator) inputItem.a(R.id.bps)).getEditText().getText().length();
        }
        this.f84505l = new c(this, aVar2);
        ((InputWithIndicator) inputItem.a(R.id.bps)).getEditText().addTextChangedListener(this.f84505l);
        ((InputWithIndicator) inputItem.a(R.id.bps)).setOnEditTextFocusChangeListener(new d(inputItem, this, aVar2));
    }

    public static final class c extends com.ss.android.ugc.aweme.ecommerce.util.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextInputItemViewHolder f84510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.a.a f84511b;

        static {
            Covode.recordClassIndex(52732);
        }

        c(TextInputItemViewHolder textInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
            this.f84510a = textInputItemViewHolder;
            this.f84511b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.util.l
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            super.onTextChanged(charSequence, i2, i3, i4);
            if (charSequence != null) {
                if (!l.a((Object) charSequence.toString(), this.f84511b.f84262b)) {
                    this.f84510a.m().f84358e = true;
                }
                this.f84511b.f84262b = charSequence.toString();
            }
            if (this.f84510a.f84501f.f84273c == 0) {
                this.f84510a.f84501f.f84273c = 1;
                this.f84510a.f84501f.b(this.f84510a.m(), this.f84511b.f84261a.f84310d);
                return;
            }
            CandHelper candHelper = this.f84510a.f84501f;
            View view = this.f84510a.itemView;
            l.b(view, "");
            candHelper.a(((InputWithIndicator) view.findViewById(R.id.bps)).getEditText(), this.f84511b.f84261a.f84310d, this.f84510a.m());
        }
    }

    static final class d implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputItem f84512a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextInputItemViewHolder f84513b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.a.a f84514c;

        static {
            Covode.recordClassIndex(52733);
        }

        d(InputItem inputItem, TextInputItemViewHolder textInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.address.a.a aVar) {
            this.f84512a = inputItem;
            this.f84513b = textInputItemViewHolder;
            this.f84514c = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            String str;
            if (l.a((Object) this.f84514c.f84261a.f84310d, (Object) "address")) {
                this.f84513b.m().c(new AddressEditViewModel.t(z));
            }
            if (z) {
                this.f84513b.f84503j = ((InputWithIndicator) this.f84512a.a(R.id.bps)).getEditText().getText().length();
                if (!(!l.a((Object) this.f84514c.f84261a.f84310d, (Object) "address") || (str = this.f84514c.f84261a.f84316j) == null || str.length() == 0)) {
                    InputItem inputItem = this.f84512a;
                    String str2 = this.f84514c.f84261a.f84316j;
                    if (!(str2 == null || str2.length() == 0)) {
                        TuxTextView tuxTextView = (TuxTextView) inputItem.a(R.id.hv);
                        l.b(tuxTextView, "");
                        tuxTextView.setVisibility(0);
                        TuxTextView tuxTextView2 = (TuxTextView) inputItem.a(R.id.hv);
                        l.b(tuxTextView2, "");
                        tuxTextView2.setText(str2);
                    }
                }
                this.f84513b.f84502g = SystemClock.elapsedRealtime();
                j jVar = this.f84513b.m().f84362l;
                if (jVar != null) {
                    jVar.a(this.f84514c.f84261a.f84310d);
                }
                if (this.f84514c.f84262b == null) {
                    this.f84514c.f84262b = "";
                }
                CandHelper candHelper = this.f84513b.f84501f;
                View view2 = this.f84513b.itemView;
                l.b(view2, "");
                candHelper.a(((InputWithIndicator) view2.findViewById(R.id.bps)).getEditText(), this.f84514c.f84261a.f84310d, this.f84513b.m());
                this.f84512a.a();
                this.f84514c.f84263c = null;
                this.f84513b.a(true);
                return;
            }
            if (l.a((Object) this.f84514c.f84261a.f84310d, (Object) "address")) {
                InputItem inputItem2 = this.f84512a;
                TuxTextView tuxTextView3 = (TuxTextView) inputItem2.a(R.id.hv);
                l.b(tuxTextView3, "");
                tuxTextView3.setText("");
                TuxTextView tuxTextView4 = (TuxTextView) inputItem2.a(R.id.hv);
                l.b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
            }
            ((InputWithIndicator) this.f84512a.a(R.id.bps)).getEditText().setText(((InputWithIndicator) this.f84512a.a(R.id.bps)).getEditText().getText());
            this.f84513b.m();
            String a2 = AddressEditViewModel.a(this.f84514c.f84261a.f84315i, this.f84514c.f84262b);
            if (a2 != null) {
                this.f84512a.a(a2);
                this.f84514c.f84263c = a2;
            }
            this.f84513b.a(false);
            this.f84513b.f84501f.b(this.f84513b.m(), this.f84514c.f84261a.f84310d);
            int length = ((InputWithIndicator) this.f84512a.a(R.id.bps)).getEditText().getText().length() - this.f84513b.f84503j;
            if (length == 0) {
                if (!l.a((Object) this.f84513b.f84501f.f84274d, (Object) "sug")) {
                    this.f84513b.f84501f.f84274d = "";
                }
            } else if (length > 0) {
                this.f84513b.f84501f.f84274d = "add";
            } else {
                this.f84513b.f84501f.f84274d = "del";
            }
            if (this.f84513b.f84502g != -1) {
                j jVar2 = this.f84513b.m().f84362l;
                if (jVar2 != null) {
                    jVar2.a(this.f84514c.f84261a.f84310d, SystemClock.elapsedRealtime() - this.f84513b.f84502g, this.f84513b.f84501f.f84274d);
                }
                this.f84513b.f84502g = -1;
            }
        }
    }
}
