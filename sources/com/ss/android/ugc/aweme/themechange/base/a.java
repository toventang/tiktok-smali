package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private SimpleDraweeView f138698a;

    /* renamed from: b  reason: collision with root package name */
    private AVDmtTextView f138699b;

    /* renamed from: c  reason: collision with root package name */
    private View f138700c;

    /* renamed from: d  reason: collision with root package name */
    private int f138701d;

    /* renamed from: e  reason: collision with root package name */
    private int f138702e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f138703f;

    static {
        Covode.recordClassIndex(90732);
    }

    public final int getSelectColor() {
        return this.f138701d;
    }

    public final int getUnSelectColor() {
        return this.f138702e;
    }

    public final void a(boolean z) {
        int i2;
        View view = this.f138700c;
        if (view == null) {
            l.a("dotView");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void setText(int i2) {
        Context context = getContext();
        l.b(context, "");
        String string = context.getResources().getString(i2);
        l.b(string, "");
        setText(string);
    }

    public final void setTextPaddingLR(float f2) {
        int b2 = (int) n.b(getContext(), f2);
        AVDmtTextView aVDmtTextView = this.f138699b;
        if (aVDmtTextView == null) {
            l.a("textView");
        }
        aVDmtTextView.setPadding(b2, aVDmtTextView.getPaddingTop(), b2, aVDmtTextView.getPaddingBottom());
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            AVDmtTextView aVDmtTextView = this.f138699b;
            if (aVDmtTextView == null) {
                l.a("textView");
            }
            aVDmtTextView.setVisibility(0);
            SimpleDraweeView simpleDraweeView = this.f138698a;
            if (simpleDraweeView == null) {
                l.a("iconImgView");
            }
            simpleDraweeView.setVisibility(8);
            AVDmtTextView aVDmtTextView2 = this.f138699b;
            if (aVDmtTextView2 == null) {
                l.a("textView");
            }
            aVDmtTextView2.setText(str);
        }
    }

    public final void setSelected(boolean z) {
        int i2;
        super.setSelected(z);
        if (z) {
            i2 = this.f138701d;
        } else {
            i2 = this.f138702e;
        }
        AVDmtTextView aVDmtTextView = this.f138699b;
        if (aVDmtTextView == null) {
            l.a("textView");
        }
        aVDmtTextView.setTextColor(i2);
        SimpleDraweeView simpleDraweeView = this.f138698a;
        if (simpleDraweeView == null) {
            l.a("iconImgView");
        }
        simpleDraweeView.setImageAlpha(Color.alpha(i2));
        if (!com.ss.android.ugc.tools.a.f149054l.f149058c) {
            return;
        }
        if (z) {
            AVDmtTextView aVDmtTextView2 = this.f138699b;
            if (aVDmtTextView2 == null) {
                l.a("textView");
            }
            aVDmtTextView2.b();
            AVDmtTextView aVDmtTextView3 = this.f138699b;
            if (aVDmtTextView3 == null) {
                l.a("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(1));
            return;
        }
        AVDmtTextView aVDmtTextView4 = this.f138699b;
        if (aVDmtTextView4 == null) {
            l.a("textView");
        }
        aVDmtTextView4.setTypeface(Typeface.defaultFromStyle(0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(8324);
        this.f138701d = -1;
        this.f138702e = -1;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.a9p, this, true);
        View findViewById = a2.findViewById(R.id.eha);
        l.b(findViewById, "");
        this.f138698a = (SimpleDraweeView) findViewById;
        View findViewById2 = a2.findViewById(R.id.ehc);
        l.b(findViewById2, "");
        this.f138699b = (AVDmtTextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.eh_);
        l.b(findViewById3, "");
        this.f138700c = findViewById3;
        int c2 = b.c(context, R.color.b9);
        View view = this.f138700c;
        if (view == null) {
            l.a("dotView");
        }
        view.setBackground(com.ss.android.ugc.tools.view.a.a(c2, c2, 0));
        AVDmtTextView aVDmtTextView = this.f138699b;
        if (aVDmtTextView == null) {
            l.a("textView");
        }
        aVDmtTextView.setTextSize(15.0f);
        if (com.ss.android.ugc.tools.a.f149054l.f149057b) {
            AVDmtTextView aVDmtTextView2 = this.f138699b;
            if (aVDmtTextView2 == null) {
                l.a("textView");
            }
            aVDmtTextView2.b();
        } else {
            AVDmtTextView aVDmtTextView3 = this.f138699b;
            if (aVDmtTextView3 == null) {
                l.a("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
        }
        AVDmtTextView aVDmtTextView4 = this.f138699b;
        if (aVDmtTextView4 == null) {
            l.a("textView");
        }
        aVDmtTextView4.setSingleLine();
        if (!AVUIUXBugsExperimentServiceDiff.b().a()) {
            AVDmtTextView aVDmtTextView5 = this.f138699b;
            if (aVDmtTextView5 == null) {
                l.a("textView");
            }
            aVDmtTextView5.setEllipsize(TextUtils.TruncateAt.END);
        }
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        MethodCollector.o(8324);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Context context, byte b2) {
        this(context);
        l.d(context, "");
        this.f138703f = false;
        int i2 = c.f138713a;
        this.f138701d = i2;
        this.f138702e = (i2 & 16777215) | Integer.MIN_VALUE;
    }

    public final void a(int i2, int i3) {
        if (!com.ss.android.ugc.tools.a.f149054l.f149059d) {
            setLayoutParams(new FrameLayout.LayoutParams((int) (((float) n.a(getContext())) / 4.5f), -2));
        } else if (i2 == 0) {
            setPadding((int) n.b(getContext(), 6.0f), 0, 0, 0);
        } else if (i2 == i3 - 1) {
            setPadding(0, 0, (int) n.b(getContext(), 6.0f), 0);
        }
    }
}
