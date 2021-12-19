package com.ss.android.ugc.aweme.account.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.f.c;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.f.a;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.m.l;
import h.m.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

public final class PhoneInputView extends LinearLayout implements a.AbstractC1394a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65407a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final l f65408b = new l("\\D+");

    /* renamed from: c  reason: collision with root package name */
    private static final com.ss.android.ugc.aweme.account.login.model.a f65409c = com.ss.android.ugc.aweme.account.login.model.a.f63491f;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f65410d;

    public PhoneInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View a(int i2) {
        if (this.f65410d == null) {
            this.f65410d = new HashMap();
        }
        View view = (View) this.f65410d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f65410d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40213);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getCountryCode() {
        try {
            return Integer.parseInt(getCountryCodeString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final EditText getEditText() {
        return ((InputWithIndicator) a(R.id.ag8)).getEditText();
    }

    public final String getFullPhoneNumber() {
        String a2 = com.ss.android.ugc.aweme.account.login.h.a.a(getPhoneNumberObject());
        h.f.b.l.b(a2, "");
        return a2;
    }

    public final InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) a(R.id.ag8);
        h.f.b.l.b(inputWithIndicator, "");
        return inputWithIndicator;
    }

    public final long getPhoneNumber() {
        try {
            return Long.parseLong(getPhoneNumberString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final String getPhoneNumberString() {
        return ((InputWithIndicator) a(R.id.ag8)).getText();
    }

    static {
        Covode.recordClassIndex(40211);
    }

    public final String getCountryCodeString() {
        String replace;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ag6);
        h.f.b.l.b(tuxTextView, "");
        CharSequence text = tuxTextView.getText();
        if (text == null || (replace = f65408b.replace(text, "")) == null) {
            return "";
        }
        return replace;
    }

    public final a.C1412a getPhoneNumberObject() {
        a.C1412a create = a.C1412a.create(getCountryCode(), getPhoneNumber());
        h.f.b.l.b(create, "");
        return create;
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

    public final void a() {
        Object a2 = a(getContext(), "phone");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String simCountryIso = ((TelephonyManager) a2).getSimCountryIso();
        boolean z = false;
        if (simCountryIso == null || simCountryIso.length() == 0) {
            Locale locale = Locale.getDefault();
            h.f.b.l.b(locale, "");
            simCountryIso = locale.getCountry();
        }
        if (simCountryIso == null || simCountryIso.length() == 0) {
            setCountry(f65409c);
            return;
        }
        for (T t : com.ss.android.ugc.aweme.account.login.model.a.f63493h) {
            if (p.a(t.f63497c, simCountryIso, true)) {
                setCountry(t);
                z = true;
            }
        }
        if (!z) {
            setCountry(f65409c);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.f.a.AbstractC1394a
    public final void a(com.ss.android.ugc.aweme.account.login.model.a aVar) {
        setCountry(aVar);
    }

    public final void setCountry(com.ss.android.ugc.aweme.account.login.model.a aVar) {
        String str;
        String str2;
        String str3 = "";
        if (aVar == null || (str = aVar.f63498d) == null) {
            str = str3;
        }
        setCountryCode(str);
        if (!(aVar == null || (str2 = aVar.f63497c) == null)) {
            str3 = str2;
        }
        setCountryName(str3);
    }

    public final void setCountryName(String str) {
        h.f.b.l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ag5);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setPhoneNumber(String str) {
        h.f.b.l.d(str, "");
        ((InputWithIndicator) a(R.id.ag8)).setText(str);
    }

    public final void setCountryCode(String str) {
        boolean z;
        h.f.b.l.d(str, "");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "+";
        if (!z || p.b(str, str2, false)) {
            str2 = "";
        }
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ag6);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(str2 + str);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9463);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                    MethodCollector.o(9463);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private /* synthetic */ PhoneInputView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PhoneInputView(final Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(9466);
        View.inflate(context, R.layout.hy, this);
        c.a(a(R.id.d4i), 0.5f);
        synchronized (com.ss.android.ugc.aweme.account.f.a.class) {
            try {
                com.ss.android.ugc.aweme.account.f.a.f63029a.add(new WeakReference<>(this));
            } catch (Throwable th) {
                MethodCollector.o(9466);
                throw th;
            }
        }
        ((LinearLayout) a(R.id.d4i)).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.account.ui.PhoneInputView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(40212);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                Context context = context;
                Intent intent = new Intent(context, MusCountryListActivity.class);
                com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                context.startActivity(intent);
            }
        });
        MethodCollector.o(9466);
    }
}
