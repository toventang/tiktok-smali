package com.bytedance.android.livesdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.j.u;
import com.bytedance.android.livesdk.model.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.lang.reflect.Field;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    static long f22348a;

    static {
        Covode.recordClassIndex(13194);
    }

    public static final boolean a(Boolean bool) {
        return l.a((Object) bool, (Object) true);
    }

    public static final void a(View view, boolean z) {
        if (z) {
            b(view);
        } else {
            a(view);
        }
    }

    public static final boolean a(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0;
    }

    public static final boolean a(Activity activity) {
        return b(activity != null ? Boolean.valueOf(activity.isFinishing()) : null);
    }

    public static final void a(ConstraintLayout constraintLayout, int i2, int i3) {
        if (constraintLayout != null) {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.a(constraintLayout);
            bVar.b(i2, i3);
            bVar.b(constraintLayout);
        }
    }

    public static final void a(View view, h.f.a.b<? super View, z> bVar) {
        l.d(view, "");
        l.d(bVar, "");
        view.setOnClickListener(new b(bVar));
    }

    public static final void a() {
        ao.a(y.e(), (int) R.string.gme);
    }

    public static final void a(String str) {
        l.d(str, "");
        ao.a(y.e(), str, 0);
    }

    public static final boolean b() {
        return l.a(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean f() {
        if (!e()) {
            return true;
        }
        return false;
    }

    public static final boolean e() {
        Boolean bool;
        k kVar = (k) DataChannelGlobal.f34575d.b(u.class);
        if (kVar != null) {
            bool = Boolean.valueOf(kVar.isAudience());
        } else {
            bool = null;
        }
        return a(bool);
    }

    public static final boolean c() {
        Boolean bool;
        k kVar = (k) DataChannelGlobal.f34575d.b(u.class);
        if (kVar != null) {
            bool = Boolean.valueOf(kVar.isPreviewPage());
        } else {
            bool = null;
        }
        return a(bool);
    }

    public static final boolean d() {
        Boolean bool;
        k kVar = (k) DataChannelGlobal.f34575d.b(u.class);
        if (kVar != null) {
            bool = Boolean.valueOf(kVar.isVideoPage());
        } else {
            bool = null;
        }
        return a(bool);
    }

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f22349a;

        static {
            Covode.recordClassIndex(13195);
        }

        a(View view) {
            this.f22349a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            p.a(this.f22349a);
        }
    }

    public static final void a(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static final void b(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static final void c(View view) {
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static final boolean c(Boolean bool) {
        return !l.a((Object) bool, (Object) true);
    }

    public static final boolean d(Boolean bool) {
        return !l.a((Object) bool, (Object) false);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f22350a;

        static {
            Covode.recordClassIndex(13196);
        }

        b(h.f.a.b bVar) {
            this.f22350a = bVar;
        }

        public final void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - p.f22348a >= 500) {
                p.f22348a = currentTimeMillis;
                h.f.a.b bVar = this.f22350a;
                l.b(view, "");
                bVar.invoke(view);
            }
        }
    }

    public static final Dialog a(Dialog dialog) {
        if (dialog == null) {
            return null;
        }
        if (a((Activity) a(dialog.getContext())) && !dialog.isShowing()) {
            dialog.show();
        }
        return dialog;
    }

    public static final Dialog b(Dialog dialog) {
        if (dialog == null) {
            return null;
        }
        if (a((Activity) a(dialog.getContext())) && dialog.isShowing()) {
            dialog.dismiss();
        }
        return dialog;
    }

    public static final View d(View view) {
        if (view == null) {
            return null;
        }
        view.animate().alpha(0.0f).setDuration(150).setListener(new a(view));
        return view;
    }

    public static final Boolean b(EditText editText) {
        Object obj;
        l.d(editText, "");
        Context context = editText.getContext();
        if (context != null) {
            obj = a(context, "input_method");
        } else {
            obj = null;
        }
        if (!(obj instanceof InputMethodManager)) {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager != null) {
            return Boolean.valueOf(inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0));
        }
        return null;
    }

    public static final boolean b(Boolean bool) {
        return l.a((Object) bool, (Object) false);
    }

    public static final e a(Context context) {
        while (!(context instanceof e)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (e) context;
    }

    public static final Boolean a(EditText editText) {
        Object obj;
        l.d(editText, "");
        Context context = editText.getContext();
        if (context != null) {
            obj = a(context, "input_method");
        } else {
            obj = null;
        }
        if (!(obj instanceof InputMethodManager)) {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager != null) {
            return Boolean.valueOf(inputMethodManager.showSoftInput(editText, 1));
        }
        return null;
    }

    public static final z a(TextView textView, int i2) {
        if (textView == null) {
            return null;
        }
        textView.setTextColor(y.b(i2));
        return z.f158842a;
    }

    public static final View c(View view, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = i2;
        }
        view.requestLayout();
        return view;
    }

    public static final View b(View view, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.bottomMargin = i2;
        }
        view.requestLayout();
        return view;
    }

    public static final View d(View view, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = i2;
        }
        view.requestLayout();
        return view;
    }

    public static final View a(View view, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = i2;
        }
        view.requestLayout();
        return view;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(10692);
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
                    MethodCollector.o(10692);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static final Uri a(Uri uri, String str, String str2) {
        String queryParameter;
        l.d(uri, "");
        l.d(str, "");
        l.d(str2, "");
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str3 : uri.getQueryParameterNames()) {
            if (l.a((Object) str3, (Object) str)) {
                queryParameter = str2;
            } else {
                queryParameter = uri.getQueryParameter(str3);
            }
            clearQuery.appendQueryParameter(str3, queryParameter);
        }
        Uri build = clearQuery.build();
        l.b(build, "");
        return build;
    }

    public static final View a(ViewGroup viewGroup, int i2, boolean z) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), i2, viewGroup, z);
        l.b(a2, "");
        return a2;
    }
}
