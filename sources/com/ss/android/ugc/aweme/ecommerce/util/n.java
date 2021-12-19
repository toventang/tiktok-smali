package com.ss.android.ugc.aweme.ecommerce.util;

import android.app.Activity;
import android.app.Application;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.aweme.lancet.i;
import h.a.i;
import h.f.b.l;
import h.m.p;
import java.lang.reflect.Field;
import java.util.Objects;

public final class n {
    static {
        Covode.recordClassIndex(55056);
    }

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f87585a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f87586b;

        static {
            Covode.recordClassIndex(55057);
        }

        public final void onClick(View view) {
            l.d(view, "");
            h.f.a.a aVar = this.f87585a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setColor(b.c(g.a(), this.f87586b));
        }

        a(h.f.a.a aVar, int i2) {
            this.f87585a = aVar;
            this.f87586b = i2;
        }
    }

    public static final View a(View view) {
        l.d(view, "");
        do {
            ViewParent parent = view.getParent();
            if (!(parent instanceof CoordinatorLayout)) {
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return (View) parent;
            }
        } while (view != null);
        return null;
    }

    public static final void a(Activity activity) {
        l.d(activity, "");
        Object a2 = a(activity.getApplication(), "input_method");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) a2;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            currentFocus.clearFocus();
        }
    }

    public static final void a(View view, int i2) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static final SpannableStringBuilder a(CharSequence charSequence, String... strArr) {
        l.d(charSequence, "");
        l.d(strArr, "");
        try {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            for (int i2 = 0; i2 <= 0; i2++) {
                String str = strArr[0];
                int a2 = p.a(charSequence, str, 0, false, 6);
                if (a2 != -1) {
                    valueOf.setSpan(new com.bytedance.tux.f.a.b(52, true), a2, str.length() + a2, 18);
                }
            }
            l.b(valueOf, "");
            return valueOf;
        } catch (Exception e2) {
            com.bytedance.services.apm.api.a.a((Throwable) e2, "bold failed " + charSequence + ' ' + i.a(strArr, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
            return new SpannableStringBuilder(charSequence);
        }
    }

    public static final CharSequence a(CharSequence charSequence, e... eVarArr) {
        l.d(charSequence, "");
        l.d(eVarArr, "");
        try {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            for (int i2 = 0; i2 < 2; i2++) {
                e eVar = eVarArr[i2];
                String str = eVar.f87562a;
                h.f.a.a<Object> aVar = eVar.f87563b;
                int i3 = eVar.f87564c;
                l.b(valueOf, "");
                int a2 = p.a((CharSequence) valueOf, str, 0, false, 6);
                if (a2 != -1) {
                    valueOf.setSpan(new a(aVar, i3), a2, str.length() + a2, 18);
                }
            }
            l.b(valueOf, "");
            return valueOf;
        } catch (Exception unused) {
            return charSequence;
        }
    }

    private static Object a(Application application, String str) {
        Object obj;
        MethodCollector.i(5334);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = application.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
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
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(5334);
                }
            }
        } else {
            obj = application.getSystemService(str);
        }
        return obj;
    }

    public static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, Object obj) {
        l.d(spannableStringBuilder, "");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }
}
