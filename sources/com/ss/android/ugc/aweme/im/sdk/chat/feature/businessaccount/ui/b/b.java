package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final Toast f100484a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f100485b;

    /* renamed from: c  reason: collision with root package name */
    public final String f100486c;

    static {
        Covode.recordClassIndex(64231);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5664);
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
                    MethodCollector.o(5664);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public b(Context context, String str, int i2) {
        l.d(context, "");
        l.d(str, "");
        MethodCollector.i(5660);
        this.f100485b = context;
        this.f100486c = str;
        Toast toast = new Toast(context);
        this.f100484a = toast;
        Object a2 = a(context, "layout_inflater");
        if (a2 != null) {
            View inflate = ((LayoutInflater) a2).inflate(R.layout.a8k, (ViewGroup) null);
            l.b(inflate, "");
            l.d(inflate, "");
            TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.clf);
            l.b(tuxTextView, "");
            tuxTextView.setText(str);
            toast.setView(inflate);
            toast.setGravity(55, 0, 0);
            toast.setDuration(i2);
            MethodCollector.o(5660);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.o(5660);
        throw nullPointerException;
    }
}
