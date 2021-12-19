package com.ss.android.ugc.aweme.framework.d;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    Dialog f96679a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f96680b;

    /* renamed from: c  reason: collision with root package name */
    TextView f96681c;

    /* renamed from: d  reason: collision with root package name */
    View f96682d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f96683e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f96684f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f96685g;

    /* renamed from: h  reason: collision with root package name */
    final Handler f96686h = new Handler();

    /* renamed from: i  reason: collision with root package name */
    final Runnable f96687i = new Runnable() {
        /* class com.ss.android.ugc.aweme.framework.d.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(61344);
        }

        public final void run() {
            c.this.c();
        }
    };

    static {
        Covode.recordClassIndex(61343);
    }

    private void d() {
        int i2 = Build.VERSION.SDK_INT;
        this.f96679a.getWindow().getDecorView().setSystemUiVisibility(5380);
    }

    public final void a() {
        if (!this.f96683e && !this.f96684f) {
            this.f96686h.removeCallbacks(this.f96687i);
            c();
            this.f96683e = true;
        }
    }

    public final void b() {
        if (!this.f96683e && !this.f96684f) {
            this.f96686h.removeCallbacks(this.f96687i);
            c();
            this.f96684f = true;
        }
    }

    public final void c() {
        if (!this.f96683e) {
            try {
                if (this.f96679a.isShowing()) {
                    this.f96679a.dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(String str) {
        a(0, str, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    public c(Context context) {
        MethodCollector.i(11065);
        LayoutInflater from = LayoutInflater.from(context);
        this.f96679a = new Dialog(context, R.style.zw);
        try {
            View inflate = from.inflate(R.layout.amz, (ViewGroup) null);
            this.f96682d = inflate;
            this.f96680b = (ImageView) inflate.findViewById(R.id.bi7);
            this.f96681c = (TextView) inflate.findViewById(R.id.text);
            double width = (double) ((WindowManager) a(context, "window")).getDefaultDisplay().getWidth();
            Double.isNaN(width);
            this.f96681c.setMaxWidth((int) ((width * 0.68d) - 80.0d));
            this.f96679a.setContentView(this.f96682d);
            this.f96679a.getWindow().setBackgroundDrawable(new ColorDrawable(b.c(context, R.color.c9)));
            this.f96679a.getWindow().addFlags(8);
            this.f96679a.getWindow().addFlags(32);
            this.f96679a.getWindow().addFlags(16);
            this.f96679a.getWindow().setLayout(-2, -2);
            this.f96679a.getWindow().setGravity(17);
            MethodCollector.o(11065);
        } catch (Throwable unused) {
            MethodCollector.o(11065);
        }
    }

    public final void a(int i2, String str) {
        a(i2, str, 3500);
    }

    public final void b(int i2, String str) {
        a(i2, str, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11222);
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
                    MethodCollector.o(11222);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final void a(int i2, String str, int i3) {
        if (!this.f96683e && i3 > 0) {
            boolean z = false;
            if (i2 > 0) {
                this.f96680b.setImageResource(i2);
                this.f96680b.setVisibility(0);
                z = true;
            } else {
                this.f96680b.setVisibility(8);
            }
            if (!m.a(str)) {
                this.f96681c.setText(str);
            } else if (!z) {
                return;
            }
            this.f96686h.removeCallbacks(this.f96687i);
            c();
            try {
                this.f96679a.getWindow().setGravity(17);
                if (this.f96685g) {
                    d();
                }
                this.f96679a.show();
                this.f96686h.postDelayed(this.f96687i, (long) i3);
            } catch (Exception unused) {
            }
        }
    }
}
