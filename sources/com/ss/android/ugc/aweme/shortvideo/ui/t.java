package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.fragment.app.e;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout;
import com.ss.android.ugc.aweme.df.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;

public final class t extends PopupWindow implements com.bytedance.ies.dmt.ui.frameworkui.a, p {

    /* renamed from: a  reason: collision with root package name */
    public final View f131898a;

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f131899b;

    /* renamed from: c  reason: collision with root package name */
    private PullUpLayout f131900c;

    /* renamed from: d  reason: collision with root package name */
    private o f131901d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f131902e;

    /* renamed from: f  reason: collision with root package name */
    private final e f131903f;

    /* renamed from: g  reason: collision with root package name */
    private final Aweme f131904g;

    static {
        Covode.recordClassIndex(86420);
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public final void b() {
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public final void a() {
        dismiss();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.p
    public final e c() {
        return this.f131903f;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f131905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f131906b;

        static {
            Covode.recordClassIndex(86421);
        }

        a(t tVar, boolean z) {
            this.f131905a = tVar;
            this.f131906b = z;
        }

        public final void run() {
            int i2;
            if (this.f131906b) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            this.f131905a.f131898a.setVisibility(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.p
    public final void dismiss() {
        if (isShowing() && !this.f131903f.isFinishing()) {
            PullUpLayout pullUpLayout = this.f131900c;
            if (pullUpLayout == null) {
                l.b();
            }
            if (pullUpLayout.hasWindowFocus()) {
                PullUpLayout pullUpLayout2 = this.f131900c;
                if (pullUpLayout2 == null) {
                    l.b();
                }
                pullUpLayout2.a(0.0f, true);
            }
        }
        o oVar = this.f131901d;
        if (oVar != null) {
            oVar.b();
        }
        try {
            super.dismiss();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.p
    public final void d() {
        if (!this.f131903f.isFinishing()) {
            o oVar = this.f131901d;
            if (oVar != null) {
                oVar.a();
            }
            PullUpLayout pullUpLayout = this.f131900c;
            if (pullUpLayout == null) {
                l.b();
            }
            pullUpLayout.a();
            try {
                Window window = this.f131903f.getWindow();
                l.b(window, "");
                View decorView = window.getDecorView();
                int i2 = Build.VERSION.SDK_INT;
                showAtLocation(decorView, 48, 0, -n.e(b.a()));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.p
    public final void a(String str) {
        l.d(str, "");
        o oVar = this.f131901d;
        if (oVar != null) {
            oVar.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.p
    public final void a(boolean z) {
        this.f131898a.post(new a(this, z));
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(12711);
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
                    MethodCollector.o(12711);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(e eVar, Aweme aweme) {
        super(eVar);
        l.d(eVar, "");
        l.d(aweme, "");
        MethodCollector.i(12594);
        this.f131903f = eVar;
        this.f131904g = aweme;
        Object a2 = a(b.a(), "layout_inflater");
        if (a2 != null) {
            this.f131902e = com.ss.android.ugc.aweme.compliance.api.a.c().a(1);
            View inflate = ((LayoutInflater) a2).inflate(R.layout.ait, (ViewGroup) null);
            l.b(inflate, "");
            this.f131898a = inflate;
            View findViewById = inflate.findViewById(R.id.dp0);
            if (findViewById != null) {
                this.f131899b = (RelativeLayout) findViewById;
                View findViewById2 = inflate.findViewById(R.id.ddo);
                if (findViewById2 != null) {
                    PullUpLayout pullUpLayout = (PullUpLayout) findViewById2;
                    this.f131900c = pullUpLayout;
                    if (pullUpLayout == null) {
                        l.b();
                    }
                    pullUpLayout.a(this.f131899b);
                    PullUpLayout pullUpLayout2 = this.f131900c;
                    if (pullUpLayout2 == null) {
                        l.b();
                    }
                    pullUpLayout2.setPullUpListener(this);
                    RelativeLayout relativeLayout = this.f131899b;
                    if (relativeLayout == null) {
                        l.b();
                    }
                    this.f131901d = new s(eVar, aweme, this, relativeLayout);
                    setBackgroundDrawable(new ColorDrawable(0));
                    setContentView(inflate);
                    setWidth(n.a(b.a()));
                    setHeight(-2);
                    setAnimationStyle(R.style.a17);
                    MethodCollector.o(12594);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout");
                MethodCollector.o(12594);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
            MethodCollector.o(12594);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.o(12594);
        throw nullPointerException3;
    }
}
