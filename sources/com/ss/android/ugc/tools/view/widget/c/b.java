package com.ss.android.ugc.tools.view.widget.c;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.c;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.CircleProgressView;
import com.ss.android.ugc.tools.view.widget.c.a;
import com.ss.android.ugc.tools.view.widget.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class b extends a {

    /* renamed from: g  reason: collision with root package name */
    public static final C4053b f150404g = new C4053b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private static final int f150405j = ((int) r.a(c.a(), 2.0f));

    /* renamed from: k  reason: collision with root package name */
    private static final int f150406k = ((int) r.a(c.a(), 3.0f));

    /* renamed from: a  reason: collision with root package name */
    private CircleProgressView f150407a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f150408b;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f150409d;

    /* renamed from: e  reason: collision with root package name */
    public final Animation f150410e;

    /* renamed from: f  reason: collision with root package name */
    public final int f150411f;

    /* renamed from: h  reason: collision with root package name */
    private final int f150412h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f150413i;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.view.widget.c.a
    public int a() {
        return R.layout.b4d;
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.c.b$b  reason: collision with other inner class name */
    public static final class C4053b {
        static {
            Covode.recordClassIndex(98915);
        }

        private C4053b() {
        }

        public /* synthetic */ C4053b(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final int getDownloadIconRes() {
        return this.f150411f;
    }

    public final boolean getEnableDotView() {
        return this.f150413i;
    }

    /* access modifiers changed from: protected */
    public final int getLoadingIconRes() {
        return this.f150412h;
    }

    public final void b() {
        ImageView imageView = this.f150409d;
        if (imageView == null) {
            l.a("downloadImg");
        }
        imageView.setVisibility(4);
        CircleProgressView circleProgressView = this.f150407a;
        if (circleProgressView == null) {
            l.a("progressView");
        }
        circleProgressView.setVisibility(4);
    }

    static {
        Covode.recordClassIndex(98913);
    }

    public final void c() {
        ImageView imageView = this.f150409d;
        if (imageView == null) {
            l.a("downloadImg");
        }
        imageView.setVisibility(4);
        CircleProgressView circleProgressView = this.f150407a;
        if (circleProgressView == null) {
            l.a("progressView");
        }
        circleProgressView.setVisibility(0);
        CircleProgressView circleProgressView2 = this.f150407a;
        if (circleProgressView2 == null) {
            l.a("progressView");
        }
        circleProgressView2.setProgress(0);
    }

    public final void d() {
        if (this.f150408b) {
            ImageView imageView = this.f150409d;
            if (imageView == null) {
                l.a("downloadImg");
            }
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = this.f150409d;
            if (imageView2 == null) {
                l.a("downloadImg");
            }
            imageView2.setVisibility(4);
        }
        CircleProgressView circleProgressView = this.f150407a;
        if (circleProgressView == null) {
            l.a("progressView");
        }
        circleProgressView.setVisibility(4);
    }

    public static class a extends a.C4052a {

        /* renamed from: a  reason: collision with root package name */
        public int f150414a = 2131230946;

        /* renamed from: b  reason: collision with root package name */
        public int f150415b = 2131230948;

        /* renamed from: c  reason: collision with root package name */
        public int f150416c = R.color.go;

        static {
            Covode.recordClassIndex(98914);
        }

        /* renamed from: a */
        public final b b() {
            return new b(this.v, this.f150394d, this.f150395e, this.f150397g, this.f150398h, this.f150399i, this.f150400j, this.f150401k, this.f150402l, this.f150416c, this.n, this.o, this.q, this.r, this.s, this.t, c(), this.f150414a, this.f150415b, this.p, this.u);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            l.d(context, "");
        }
    }

    public final void setShowDownloadIcon(boolean z) {
        this.f150408b = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.view.widget.c.a
    public View a(Context context) {
        l.d(context, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        m mVar = new m(context, (byte) 0);
        mVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        mVar.setHorizontalFadingEdgeEnabled(true);
        mVar.setMaxEms(4);
        mVar.setLayoutParams(layoutParams);
        mVar.setGravity(17);
        return mVar;
    }

    public final void a(int i2) {
        ImageView imageView = this.f150409d;
        if (imageView == null) {
            l.a("downloadImg");
        }
        imageView.setVisibility(4);
        CircleProgressView circleProgressView = this.f150407a;
        if (circleProgressView == null) {
            l.a("progressView");
        }
        if (circleProgressView.getVisibility() != 0) {
            CircleProgressView circleProgressView2 = this.f150407a;
            if (circleProgressView2 == null) {
                l.a("progressView");
            }
            circleProgressView2.setVisibility(0);
        }
        CircleProgressView circleProgressView3 = this.f150407a;
        if (circleProgressView3 == null) {
            l.a("progressView");
        }
        circleProgressView3.setProgress(i2);
    }

    public final void a(int i2, int i3) {
        if (i2 == 1) {
            b();
        } else if (i2 == 2) {
            c();
        } else if (i2 == 3) {
            d();
        } else if (i2 == 4) {
            b();
        } else if (i2 == 5) {
            a(i3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, boolean z, int i2, int i3, int i4, int i5, boolean z2, int i6, int i7, int i8, boolean z3, boolean z4, int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z5, boolean z6) {
        super(context, z, i2, i3, i4, i5, z2, i6, i7, i8, z3, z4, i9, i10, i11, i12, i13, z5, z6);
        l.d(context, "");
        MethodCollector.i(7944);
        this.f150411f = i14;
        this.f150412h = i15;
        this.f150413i = z5;
        this.f150410e = AnimationUtils.loadAnimation(context, R.anim.e6);
        View findViewById = findViewById(R.id.bnh);
        ImageView imageView = (ImageView) findViewById;
        imageView.setImageResource(i14);
        l.b(findViewById, "");
        this.f150409d = imageView;
        View findViewById2 = findViewById(R.id.byw);
        CircleProgressView circleProgressView = (CircleProgressView) findViewById2;
        circleProgressView.setBgCircleColor(circleProgressView.getResources().getColor(R.color.tn));
        circleProgressView.setProgressColor(-1);
        circleProgressView.setMaxProgress(100);
        circleProgressView.setCircleWidth(f150405j);
        circleProgressView.setBgCircleWidth(f150406k);
        l.b(findViewById2, "");
        this.f150407a = circleProgressView;
        MethodCollector.o(7944);
    }
}
