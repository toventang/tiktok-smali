package com.ss.android.ugc.aweme.share.silent;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.UIUXBugsExperimentService;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SilentSharePopupWindow extends PopupWindow implements au {

    /* renamed from: f  reason: collision with root package name */
    public static final a f124271f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Runnable f124272a;

    /* renamed from: b  reason: collision with root package name */
    int f124273b;

    /* renamed from: c  reason: collision with root package name */
    int f124274c;

    /* renamed from: d  reason: collision with root package name */
    final Context f124275d;

    /* renamed from: e  reason: collision with root package name */
    final int f124276e;

    /* renamed from: g  reason: collision with root package name */
    private final TextView f124277g;

    /* renamed from: h  reason: collision with root package name */
    private final FrameLayout f124278h;

    /* renamed from: i  reason: collision with root package name */
    private final String f124279i;

    static {
        Covode.recordClassIndex(81609);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onHostDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81610);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SilentSharePopupWindow f124280a;

        static {
            Covode.recordClassIndex(81611);
        }

        b(SilentSharePopupWindow silentSharePopupWindow) {
            this.f124280a = silentSharePopupWindow;
        }

        public final void run() {
            this.f124280a.dismiss();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onHostDestroy() {
        dismiss();
        getContentView().removeCallbacks(this.f124272a);
    }

    public final void dismiss() {
        if (isShowing()) {
            Context context = this.f124275d;
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                int i2 = Build.VERSION.SDK_INT;
                Context context2 = this.f124275d;
                if (!(context2 instanceof Activity) || !((Activity) context2).isDestroyed()) {
                    super.dismiss();
                }
            }
        }
    }

    private SilentSharePopupWindow(Context context, String str, int i2) {
        Context context2;
        i lifecycle;
        l.d(context, "");
        l.d(str, "");
        MethodCollector.i(10867);
        this.f124275d = context;
        this.f124279i = str;
        this.f124276e = i2;
        this.f124272a = new b(this);
        if (!(context instanceof m)) {
            context2 = null;
        } else {
            context2 = context;
        }
        m mVar = (m) context2;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.a(this);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.azy, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.exf);
        l.b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f124277g = textView;
        textView.setText(str);
        if (UIUXBugsExperimentService.b().a()) {
            textView.setTextColor(androidx.core.content.b.c(context, R.color.a_));
            textView.setBackgroundColor(androidx.core.content.b.c(context, R.color.bm));
        }
        View findViewById2 = inflate.findViewById(R.id.b69);
        l.b(findViewById2, "");
        this.f124278h = (FrameLayout) findViewById2;
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.fo);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        l.b(inflate, "");
        this.f124274c = inflate.getMeasuredHeight();
        this.f124273b = inflate.getMeasuredWidth();
        MethodCollector.o(10867);
    }

    public /* synthetic */ SilentSharePopupWindow(Context context, String str, int i2, byte b2) {
        this(context, str, i2);
    }
}
