package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.aweme.views.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class StickPointModeChangeView extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    public static final a f126036h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AVDmtTextView f126037a;

    /* renamed from: b  reason: collision with root package name */
    public AVDmtTextView f126038b;

    /* renamed from: c  reason: collision with root package name */
    public DmtThreeAngleView f126039c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f126040d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f126041e;

    /* renamed from: f  reason: collision with root package name */
    public int f126042f;

    /* renamed from: g  reason: collision with root package name */
    public int f126043g;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a f126044i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f126045j;

    static {
        Covode.recordClassIndex(82782);
    }

    public StickPointModeChangeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82783);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getCurrentMode() {
        return this.f126042f;
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickPointModeChangeView f126048a;

        static {
            Covode.recordClassIndex(82786);
        }

        d(StickPointModeChangeView stickPointModeChangeView) {
            this.f126048a = stickPointModeChangeView;
        }

        public final void run() {
            StickPointModeChangeView.b(this.f126048a).getLocationOnScreen(this.f126048a.f126040d);
            StickPointModeChangeView.c(this.f126048a).getLocationOnScreen(this.f126048a.f126041e);
            ViewGroup.LayoutParams layoutParams = StickPointModeChangeView.a(this.f126048a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (this.f126048a.f126042f == 1) {
                layoutParams2.leftMargin = (this.f126048a.f126040d[0] + (StickPointModeChangeView.b(this.f126048a).getMeasuredWidth() / 2)) - (StickPointModeChangeView.a(this.f126048a).getMeasuredWidth() / 2);
            } else {
                layoutParams2.leftMargin = (this.f126048a.f126041e[0] + (StickPointModeChangeView.c(this.f126048a).getMeasuredWidth() / 2)) - (StickPointModeChangeView.a(this.f126048a).getMeasuredWidth() / 2);
            }
            StickPointModeChangeView.a(this.f126048a).setLayoutParams(layoutParams2);
            StickPointModeChangeView stickPointModeChangeView = this.f126048a;
            stickPointModeChangeView.f126043g = (stickPointModeChangeView.f126041e[0] - this.f126048a.f126040d[0]) + ((StickPointModeChangeView.c(this.f126048a).getMeasuredWidth() - StickPointModeChangeView.b(this.f126048a).getMeasuredWidth()) / 2);
        }
    }

    public final void setStickPointModeChangeListener(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a aVar) {
        l.d(aVar, "");
        this.f126044i = aVar;
    }

    public static final class b extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickPointModeChangeView f126046a;

        static {
            Covode.recordClassIndex(82784);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StickPointModeChangeView stickPointModeChangeView) {
            super(500, false, 2);
            this.f126046a = stickPointModeChangeView;
        }

        @Override // com.ss.android.ugc.aweme.views.k
        public final void a(View view) {
            l.d(view, "");
            StickPointModeChangeView.a(this.f126046a).animate().translationX(0.0f).setDuration(200).start();
            this.f126046a.a(1);
        }
    }

    public static final class c extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickPointModeChangeView f126047a;

        static {
            Covode.recordClassIndex(82785);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(StickPointModeChangeView stickPointModeChangeView) {
            super(500, false, 2);
            this.f126047a = stickPointModeChangeView;
        }

        @Override // com.ss.android.ugc.aweme.views.k
        public final void a(View view) {
            l.d(view, "");
            StickPointModeChangeView.a(this.f126047a).animate().translationX((float) this.f126047a.f126043g).setDuration(200).start();
            this.f126047a.a(2);
        }
    }

    public static final /* synthetic */ DmtThreeAngleView a(StickPointModeChangeView stickPointModeChangeView) {
        DmtThreeAngleView dmtThreeAngleView = stickPointModeChangeView.f126039c;
        if (dmtThreeAngleView == null) {
            l.a("angleView");
        }
        return dmtThreeAngleView;
    }

    public static final /* synthetic */ AVDmtTextView b(StickPointModeChangeView stickPointModeChangeView) {
        AVDmtTextView aVDmtTextView = stickPointModeChangeView.f126037a;
        if (aVDmtTextView == null) {
            l.a("stickPointModeView");
        }
        return aVDmtTextView;
    }

    public static final /* synthetic */ AVDmtTextView c(StickPointModeChangeView stickPointModeChangeView) {
        AVDmtTextView aVDmtTextView = stickPointModeChangeView.f126038b;
        if (aVDmtTextView == null) {
            l.a("normalModeView");
        }
        return aVDmtTextView;
    }

    public final void a(int i2) {
        this.f126042f = i2;
        if (i2 == 1) {
            AVDmtTextView aVDmtTextView = this.f126037a;
            if (aVDmtTextView == null) {
                l.a("stickPointModeView");
            }
            aVDmtTextView.setSelected(true);
            AVDmtTextView aVDmtTextView2 = this.f126038b;
            if (aVDmtTextView2 == null) {
                l.a("normalModeView");
            }
            aVDmtTextView2.setSelected(false);
            AVDmtTextView aVDmtTextView3 = this.f126038b;
            if (aVDmtTextView3 == null) {
                l.a("normalModeView");
            }
            aVDmtTextView3.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            AVDmtTextView aVDmtTextView4 = this.f126038b;
            if (aVDmtTextView4 == null) {
                l.a("normalModeView");
            }
            TextPaint paint = aVDmtTextView4.getPaint();
            l.b(paint, "");
            paint.setFakeBoldText(false);
            AVDmtTextView aVDmtTextView5 = this.f126037a;
            if (aVDmtTextView5 == null) {
                l.a("stickPointModeView");
            }
            aVDmtTextView5.b();
            AVDmtTextView aVDmtTextView6 = this.f126037a;
            if (aVDmtTextView6 == null) {
                l.a("stickPointModeView");
            }
            TextPaint paint2 = aVDmtTextView6.getPaint();
            l.b(paint2, "");
            paint2.setFakeBoldText(true);
        } else {
            AVDmtTextView aVDmtTextView7 = this.f126037a;
            if (aVDmtTextView7 == null) {
                l.a("stickPointModeView");
            }
            aVDmtTextView7.setSelected(false);
            AVDmtTextView aVDmtTextView8 = this.f126038b;
            if (aVDmtTextView8 == null) {
                l.a("normalModeView");
            }
            aVDmtTextView8.setSelected(true);
            AVDmtTextView aVDmtTextView9 = this.f126037a;
            if (aVDmtTextView9 == null) {
                l.a("stickPointModeView");
            }
            aVDmtTextView9.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            AVDmtTextView aVDmtTextView10 = this.f126037a;
            if (aVDmtTextView10 == null) {
                l.a("stickPointModeView");
            }
            TextPaint paint3 = aVDmtTextView10.getPaint();
            l.b(paint3, "");
            paint3.setFakeBoldText(false);
            AVDmtTextView aVDmtTextView11 = this.f126038b;
            if (aVDmtTextView11 == null) {
                l.a("normalModeView");
            }
            aVDmtTextView11.b();
            AVDmtTextView aVDmtTextView12 = this.f126038b;
            if (aVDmtTextView12 == null) {
                l.a("normalModeView");
            }
            TextPaint paint4 = aVDmtTextView12.getPaint();
            l.b(paint4, "");
            paint4.setFakeBoldText(true);
        }
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a aVar = this.f126044i;
        if (aVar != null) {
            aVar.a(i2);
        }
    }

    private /* synthetic */ StickPointModeChangeView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StickPointModeChangeView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(6155);
        this.f126040d = new int[2];
        this.f126041e = new int[2];
        this.f126042f = 1;
        d dVar = new d(this);
        this.f126045j = dVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.aig, this);
        View findViewById = inflate.findViewById(R.id.ea8);
        l.b(findViewById, "");
        this.f126037a = (AVDmtTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.cwc);
        l.b(findViewById2, "");
        this.f126038b = (AVDmtTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.kk);
        l.b(findViewById3, "");
        DmtThreeAngleView dmtThreeAngleView = (DmtThreeAngleView) findViewById3;
        this.f126039c = dmtThreeAngleView;
        if (dmtThreeAngleView == null) {
            l.a("angleView");
        }
        dmtThreeAngleView.setBgColor(com.ss.android.ugc.aweme.themechange.base.c.a(true, true, false, false));
        DmtThreeAngleView dmtThreeAngleView2 = this.f126039c;
        if (dmtThreeAngleView2 == null) {
            l.a("angleView");
        }
        l.b(inflate, "");
        dmtThreeAngleView2.setRoundRadius((int) n.b(inflate.getContext(), 4.0f));
        AVDmtTextView aVDmtTextView = this.f126037a;
        if (aVDmtTextView == null) {
            l.a("stickPointModeView");
        }
        aVDmtTextView.setOnClickListener(new b(this));
        AVDmtTextView aVDmtTextView2 = this.f126038b;
        if (aVDmtTextView2 == null) {
            l.a("normalModeView");
        }
        aVDmtTextView2.setOnClickListener(new c(this));
        this.f126042f = 1;
        AVDmtTextView aVDmtTextView3 = this.f126037a;
        if (aVDmtTextView3 == null) {
            l.a("stickPointModeView");
        }
        aVDmtTextView3.post(dVar);
        a(this.f126042f);
        MethodCollector.o(6155);
    }
}
