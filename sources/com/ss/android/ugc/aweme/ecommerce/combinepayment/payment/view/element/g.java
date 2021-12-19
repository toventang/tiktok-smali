package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

public abstract class g extends InputItem implements e {

    /* renamed from: b  reason: collision with root package name */
    private h.f.a.b<? super List<m>, String> f85577b = c.f85585a;

    /* renamed from: c  reason: collision with root package name */
    private h.f.a.a<z> f85578c = b.f85584a;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f85579d;

    static {
        Covode.recordClassIndex(53530);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    public View a(int i2) {
        if (this.f85579d == null) {
            this.f85579d = new SparseArray();
        }
        View view = (View) this.f85579d.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85579d.put(i2, findViewById);
        return findViewById;
    }

    public abstract InputWithIndicator getInputView();

    static final class b extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f85584a = new b();

        static {
            Covode.recordClassIndex(53532);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    public final h.f.a.a<z> getOnErrorClear() {
        return this.f85578c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, java.lang.String>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, java.lang.String> */
    public final h.f.a.b<List<m>, String> getOnVerify() {
        return this.f85577b;
    }

    static final class c extends h.f.b.m implements h.f.a.b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f85585a = new c();

        static {
            Covode.recordClassIndex(53533);
        }

        c() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            l.d(obj, "");
            return null;
        }
    }

    public final void setOnErrorClear(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f85578c = aVar;
    }

    public final void setOnVerify(h.f.a.b<? super List<m>, String> bVar) {
        l.d(bVar, "");
        this.f85577b = bVar;
    }

    public static final class a extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85580a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputWithIndicator f85581b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f85582c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f85583d;

        static {
            Covode.recordClassIndex(53531);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                EditText editText = this.f85581b.getEditText();
                FrameLayout frameLayout = (FrameLayout) this.f85582c.a(R.id.adq);
                l.b(frameLayout, "");
                Object a2 = a(frameLayout.getContext(), "input_method");
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                editText.requestFocus();
                ((InputMethodManager) a2).showSoftInput(editText, 0);
            }
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(8280);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(8280);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(InputWithIndicator inputWithIndicator, g gVar, e eVar) {
            super(700);
            this.f85581b = inputWithIndicator;
            this.f85582c = gVar;
            this.f85583d = eVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i2) {
        super(context, (AttributeSet) null, 0);
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public void a(e eVar, o oVar, List<m> list, Object obj) {
        Integer num;
        int i2;
        int i3;
        boolean z;
        Integer num2;
        l.d(eVar, "");
        l.d(oVar, "");
        InputWithIndicator inputView = getInputView();
        if (inputView != null) {
            DmtEditText dmtEditText = (DmtEditText) inputView.a(R.id.bpu);
            l.b(dmtEditText, "");
            dmtEditText.setHint(eVar.f85295h);
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d dVar = eVar.f85300m;
            if (dVar != null) {
                num = dVar.f85285b;
            } else {
                num = null;
            }
            int ordinal = n.NUMBER.ordinal();
            int i4 = 1;
            if (num != null && num.intValue() == ordinal) {
                i2 = 2;
            } else {
                int ordinal2 = n.PHONE.ordinal();
                if (num != null && num.intValue() == ordinal2) {
                    i2 = 3;
                } else {
                    int ordinal3 = n.TEXT.ordinal();
                    if (num != null && num.intValue() == ordinal3) {
                        i2 = 1;
                    } else {
                        i2 = inputView.getInputType();
                    }
                }
            }
            inputView.setInputType(i2);
            FrameLayout frameLayout = (FrameLayout) a(R.id.adq);
            l.b(frameLayout, "");
            frameLayout.setOnClickListener(new a(inputView, this, eVar));
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d dVar2 = eVar.f85300m;
            if (dVar2 == null || (num2 = dVar2.f85284a) == null) {
                i3 = Integer.MAX_VALUE;
            } else {
                i3 = num2.intValue();
            }
            inputView.setMaxLength(i3);
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d dVar3 = eVar.f85300m;
            if (dVar3 == null || !dVar3.f85286c) {
                z = false;
            } else {
                z = true;
                i4 = Integer.MAX_VALUE;
            }
            inputView.setMaxLines(i4);
            if (z) {
                inputView.setInputType(inputView.getInputType() | 131072);
            }
        }
        if (obj instanceof String) {
            a((String) obj);
        } else {
            a();
        }
    }
}
