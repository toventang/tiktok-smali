package com.ss.android.ugc.aweme.ecommerce.address.widget;

import android.app.Activity;
import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ax;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.m.l;
import h.m.p;
import h.v;
import h.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

public final class PhoneInputView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.account.login.model.a f84601a = com.ss.android.ugc.aweme.account.login.model.a.f63491f;

    /* renamed from: b  reason: collision with root package name */
    public static final a f84602b = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private static final l f84603e = new l("\\D+");

    /* renamed from: c  reason: collision with root package name */
    private View.OnClickListener f84604c;

    /* renamed from: d  reason: collision with root package name */
    private h.f.a.a<z> f84605d;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f84606f;

    public PhoneInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final View a(int i2) {
        if (this.f84606f == null) {
            this.f84606f = new SparseArray();
        }
        View view = (View) this.f84606f.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f84606f.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52811);
        }

        private a() {
        }

        public static com.ss.android.ugc.aweme.account.login.model.a a() {
            boolean z;
            Object a2 = a(g.a(), "phone");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String simCountryIso = ((TelephonyManager) a2).getSimCountryIso();
            if (simCountryIso == null || simCountryIso.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Locale locale = Locale.getDefault();
                h.f.b.l.b(locale, "");
                simCountryIso = locale.getCountry();
            }
            if (simCountryIso == null || simCountryIso.length() == 0) {
                return PhoneInputView.f84601a;
            }
            for (T t : com.ss.android.ugc.aweme.account.login.model.a.f63493h) {
                if (p.a(t.f63497c, simCountryIso, true)) {
                    h.f.b.l.b(t, "");
                    return t;
                }
            }
            return PhoneInputView.f84601a;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static Object a(Application application, String str) {
            Object obj;
            MethodCollector.i(5229);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        obj = application.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = application.getSystemService(str);
            } else if (i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = application.getSystemService(str);
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
                        MethodCollector.o(5229);
                    }
                }
            } else {
                obj = application.getSystemService(str);
            }
            return obj;
        }
    }

    static final class c extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f84612a = new c();

        static {
            Covode.recordClassIndex(52813);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    public final h.f.a.a<z> getOnCountryCodeChangeListener() {
        return this.f84605d;
    }

    public final View.OnClickListener getOnCountryCodeClickListener() {
        return this.f84604c;
    }

    private final int getCountryCode() {
        try {
            return Integer.parseInt(getCountryCodeString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private final long getPhoneNumber() {
        try {
            return Long.parseLong(getPhoneNumberString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private final String getPhoneNumberString() {
        return ((InputWithIndicator) a(R.id.ag8)).getText();
    }

    public final void a() {
        com.ss.android.ugc.aweme.account.login.model.a a2 = a.a();
        a(a2.f63498d, a2.f63497c);
    }

    public final EditText getEditText() {
        return ((InputWithIndicator) a(R.id.ag8)).getEditText();
    }

    static {
        Covode.recordClassIndex(52808);
    }

    private final String getCountryCodeString() {
        String replace;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ag6);
        h.f.b.l.b(tuxTextView, "");
        CharSequence text = tuxTextView.getText();
        if (text == null || (replace = f84603e.replace(text, "")) == null) {
            return "";
        }
        return replace;
    }

    public final h.p<String, String> getFullPhoneNumber() {
        return v.a(getCountryName(), b(getCountryCodeString(), getPhoneNumberString()));
    }

    public final b getPhoneModel() {
        return new b(getCountryName(), getCountryCodeString(), getPhoneNumberString());
    }

    public final String getCountryName() {
        String obj;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ag5);
        h.f.b.l.b(tuxTextView, "");
        CharSequence text = tuxTextView.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj2 = p.b((CharSequence) obj).toString();
        if (obj2 == null) {
            return "";
        }
        return obj2;
    }

    public final void setOnCountryCodeClickListener(View.OnClickListener onClickListener) {
        this.f84604c = onClickListener;
    }

    public final void setHint(String str) {
        getEditText().setHint(str);
    }

    public final void setOnCountryCodeChangeListener(h.f.a.a<z> aVar) {
        h.f.b.l.d(aVar, "");
        this.f84605d = aVar;
    }

    private static CharSequence a(String str) {
        if (p.a((CharSequence) str, (CharSequence) "*", false)) {
            return new a.C0730a().b(str).f33382a;
        }
        return str;
    }

    private final void setCountryCode(String str) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ag6);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    private final void setCountryName(String str) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ag5);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setPhoneModel(b bVar) {
        h.f.b.l.d(bVar, "");
        setFullPhoneNumber(v.a(bVar.f84609a, b(bVar.f84610b, bVar.f84611c)));
    }

    public final void setPhoneNumber(String str) {
        h.f.b.l.d(str, "");
        ((InputWithIndicator) a(R.id.ag8)).setText(a(str));
    }

    public final void setFullPhoneNumber(h.p<String, String> pVar) {
        String str;
        String str2;
        Object obj = null;
        if (pVar != null) {
            str = pVar.getSecond();
            str2 = pVar.getFirst();
        } else {
            str = null;
            str2 = null;
        }
        if (!(pVar == null || str == null)) {
            try {
                if (str.length() != 0) {
                    int a2 = p.a((CharSequence) str, ")", 0, false, 6);
                    if (str != null) {
                        String substring = str.substring(1, a2);
                        h.f.b.l.b(substring, "");
                        String substring2 = str.substring(p.a((CharSequence) str, ")", 0, false, 6) + 1);
                        h.f.b.l.b(substring2, "");
                        com.google.c.c.z<com.ss.android.ugc.aweme.account.login.model.a> zVar = com.ss.android.ugc.aweme.account.login.model.a.f63493h;
                        ArrayList arrayList = new ArrayList();
                        for (T t : zVar) {
                            if (h.f.b.l.a((Object) t.f63498d, (Object) substring)) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        if (str2 != null && str2.length() != 0) {
                            Iterator it = arrayList2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (h.f.b.l.a((Object) ((com.ss.android.ugc.aweme.account.login.model.a) next).f63497c, (Object) str2)) {
                                    obj = next;
                                    break;
                                }
                            }
                            com.ss.android.ugc.aweme.account.login.model.a aVar = (com.ss.android.ugc.aweme.account.login.model.a) obj;
                            if (aVar != null) {
                                a(aVar.f63498d, aVar.f63497c);
                            }
                        } else if (arrayList2.size() == 1) {
                            a(((com.ss.android.ugc.aweme.account.login.model.a) arrayList2.get(0)).f63498d, ((com.ss.android.ugc.aweme.account.login.model.a) arrayList2.get(0)).f63497c);
                        } else {
                            a(substring, "");
                        }
                        ((InputWithIndicator) a(R.id.ag8)).setText(a(substring2));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } catch (Exception unused) {
                com.bytedance.services.apm.api.a.a("phone is not correct");
                return;
            }
        }
        ((InputWithIndicator) a(R.id.ag8)).setText("");
    }

    private static String b(String str, String str2) {
        boolean z;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        String str3 = "(+" + str + ")" + str2;
        h.f.b.l.b(str3, "");
        return str3;
    }

    public final void a(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        setCountryCode(str);
        setCountryName(str2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhoneInputView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f84609a;

        /* renamed from: b  reason: collision with root package name */
        public final String f84610b;

        /* renamed from: c  reason: collision with root package name */
        public final String f84611c;

        static {
            Covode.recordClassIndex(52812);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.f.b.l.a(this.f84609a, bVar.f84609a) && h.f.b.l.a(this.f84610b, bVar.f84610b) && h.f.b.l.a(this.f84611c, bVar.f84611c);
        }

        public final int hashCode() {
            String str = this.f84609a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f84610b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f84611c;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "PhoneModel(iso=" + this.f84609a + ", countryCode=" + this.f84610b + ", number=" + this.f84611c + ")";
        }

        public b(String str, String str2, String str3) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            this.f84609a = str;
            this.f84610b = str2;
            this.f84611c = str3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PhoneInputView(final Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(5498);
        View.inflate(context, R.layout.rn, this);
        com.bytedance.ies.dmt.ui.f.c.a(a(R.id.d4i), 0.5f);
        a();
        ((LinearLayout) a(R.id.d4i)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PhoneInputView f84607a;

            static {
                Covode.recordClassIndex(52809);
            }

            {
                this.f84607a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onCountryCodeClickListener = this.f84607a.getOnCountryCodeClickListener();
                if (onCountryCodeClickListener != null) {
                    onCountryCodeClickListener.onClick(view);
                }
                bo g2 = AccountService.a().g();
                Context context = context;
                if (!(context instanceof Activity)) {
                    context = null;
                }
                g2.openCountryListActivity((Activity) context, new ax(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView.AnonymousClass1.AnonymousClass1 */
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(52810);
                    }

                    @Override // com.ss.android.ugc.aweme.ax
                    public final void onExit() {
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.this$0 = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.ax
                    public final void onChanged(String str, String str2) {
                        h.f.b.l.d(str, "");
                        h.f.b.l.d(str2, "");
                        this.this$0.f84607a.a(str, str2);
                        this.this$0.f84607a.getOnCountryCodeChangeListener().invoke();
                    }
                });
            }
        });
        this.f84605d = c.f84612a;
        MethodCollector.o(5498);
    }
}
