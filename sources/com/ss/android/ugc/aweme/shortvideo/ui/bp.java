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
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;

public final class bp extends PopupWindow implements com.bytedance.ies.dmt.ui.frameworkui.a, p {

    /* renamed from: a  reason: collision with root package name */
    public final View f131539a;

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f131540b;

    /* renamed from: c  reason: collision with root package name */
    private PullUpLayout f131541c;

    /* renamed from: d  reason: collision with root package name */
    private o f131542d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f131543e;

    /* renamed from: f  reason: collision with root package name */
    private final e f131544f;

    /* renamed from: g  reason: collision with root package name */
    private final c f131545g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f131546h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f131547i;

    static {
        Covode.recordClassIndex(86156);
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
        return this.f131544f;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bp f131548a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f131549b;

        static {
            Covode.recordClassIndex(86157);
        }

        a(bp bpVar, boolean z) {
            this.f131548a = bpVar;
            this.f131549b = z;
        }

        public final void run() {
            int i2;
            if (this.f131549b) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            this.f131548a.f131539a.setVisibility(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.p
    public final void dismiss() {
        if (isShowing() && !this.f131544f.isFinishing()) {
            PullUpLayout pullUpLayout = this.f131541c;
            if (pullUpLayout == null) {
                l.b();
            }
            if (pullUpLayout.hasWindowFocus()) {
                PullUpLayout pullUpLayout2 = this.f131541c;
                if (pullUpLayout2 == null) {
                    l.b();
                }
                pullUpLayout2.a(0.0f, true);
            }
        }
        o oVar = this.f131542d;
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
        if (!this.f131544f.isFinishing()) {
            o oVar = this.f131542d;
            if (oVar != null) {
                oVar.a();
            }
            PullUpLayout pullUpLayout = this.f131541c;
            if (pullUpLayout == null) {
                l.b();
            }
            pullUpLayout.a();
            try {
                Window window = this.f131544f.getWindow();
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
        o oVar = this.f131542d;
        if (oVar != null) {
            oVar.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.p
    public final void a(boolean z) {
        this.f131539a.post(new a(this, z));
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(10010);
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
                    MethodCollector.o(10010);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bp(e eVar, c cVar, boolean z, boolean z2) {
        super(eVar);
        int i2;
        o boVar;
        l.d(eVar, "");
        l.d(cVar, "");
        MethodCollector.i(10007);
        this.f131544f = eVar;
        this.f131545g = cVar;
        this.f131546h = z;
        this.f131547i = z2;
        Object a2 = a(b.a(), "layout_inflater");
        if (a2 != null) {
            LayoutInflater layoutInflater = (LayoutInflater) a2;
            boolean a3 = com.ss.android.ugc.aweme.compliance.api.a.c().a(1);
            this.f131543e = a3;
            if (a3) {
                i2 = R.layout.aiw;
            } else {
                i2 = R.layout.aiy;
            }
            View inflate = layoutInflater.inflate(i2, (ViewGroup) null);
            l.b(inflate, "");
            this.f131539a = inflate;
            View findViewById = inflate.findViewById(R.id.dp0);
            if (findViewById != null) {
                this.f131540b = (RelativeLayout) findViewById;
                View findViewById2 = inflate.findViewById(R.id.ddo);
                if (findViewById2 != null) {
                    PullUpLayout pullUpLayout = (PullUpLayout) findViewById2;
                    this.f131541c = pullUpLayout;
                    if (pullUpLayout == null) {
                        l.b();
                    }
                    pullUpLayout.a(this.f131540b);
                    PullUpLayout pullUpLayout2 = this.f131541c;
                    if (pullUpLayout2 == null) {
                        l.b();
                    }
                    pullUpLayout2.setPullUpListener(this);
                    if (this.f131543e) {
                        RelativeLayout relativeLayout = this.f131540b;
                        if (relativeLayout == null) {
                            l.b();
                        }
                        boVar = new bn(eVar, cVar, this, relativeLayout);
                    } else {
                        RelativeLayout relativeLayout2 = this.f131540b;
                        if (relativeLayout2 == null) {
                            l.b();
                        }
                        boVar = new bo(eVar, cVar, this, relativeLayout2, z2);
                    }
                    this.f131542d = boVar;
                    setBackgroundDrawable(new ColorDrawable(0));
                    setContentView(inflate);
                    setWidth(n.a(b.a()));
                    setHeight(-2);
                    setAnimationStyle(R.style.a17);
                    MethodCollector.o(10007);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout");
                MethodCollector.o(10007);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
            MethodCollector.o(10007);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.o(10007);
        throw nullPointerException3;
    }
}
