package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.h.v;
import androidx.core.widget.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.d;
import com.zhiliaoapp.musically.R;

public class MtEmptyView extends LinearLayout implements d, g {

    /* renamed from: a  reason: collision with root package name */
    public static final Float f33620a = Float.valueOf(24.0f);

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f33621b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f33622c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f33623d;

    /* renamed from: e  reason: collision with root package name */
    private DmtTextView f33624e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f33625f;

    /* renamed from: g  reason: collision with root package name */
    private int f33626g = b.a.f33348a.f33347a;

    /* renamed from: h  reason: collision with root package name */
    private d f33627h;

    /* renamed from: i  reason: collision with root package name */
    private FrameLayout f33628i;

    /* renamed from: j  reason: collision with root package name */
    private DmtTextView f33629j;

    /* renamed from: k  reason: collision with root package name */
    private RelativeLayout f33630k;

    static {
        Covode.recordClassIndex(20023);
    }

    private void a() {
        int color;
        int i2;
        int color2;
        if (this.f33621b != null && this.f33627h != null) {
            Resources resources = getResources();
            if (this.f33624e != null) {
                if (this.f33627h.r) {
                    DmtTextView dmtTextView = this.f33624e;
                    if (this.f33626g == 0) {
                        color2 = resources.getColor(R.color.c4);
                    } else {
                        color2 = resources.getColor(R.color.aa);
                    }
                    dmtTextView.setTextColor(color2);
                } else {
                    DmtTextView dmtTextView2 = this.f33624e;
                    if (this.f33626g == 0) {
                        i2 = R.color.bx;
                    } else {
                        i2 = R.color.a_;
                    }
                    dmtTextView2.setTextColor(resources.getColor(i2));
                }
            }
            DmtTextView dmtTextView3 = this.f33625f;
            if (dmtTextView3 != null) {
                if (this.f33626g == 0) {
                    color = resources.getColor(R.color.c4);
                } else {
                    color = resources.getColor(R.color.aa);
                }
                dmtTextView3.setTextColor(color);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f33621b = (LinearLayout) findViewById(R.id.c6u);
        this.f33622c = (FrameLayout) findViewById(R.id.c66);
        this.f33623d = (ImageView) findViewById(R.id.bwo);
        this.f33624e = (DmtTextView) findViewById(R.id.f9l);
        this.f33625f = (DmtTextView) findViewById(R.id.eyc);
        this.f33628i = (FrameLayout) findViewById(R.id.b5b);
        this.f33629j = (DmtTextView) findViewById(R.id.avw);
        this.f33630k = (RelativeLayout) findViewById(R.id.dog);
        if (v.e(this) == 1) {
            int i2 = Build.VERSION.SDK_INT;
            setLayoutDirection(0);
            this.f33621b.setLayoutDirection(1);
        }
    }

    @Override // com.bytedance.ies.dmt.ui.common.d
    public final void a(int i2) {
        if (this.f33626g != i2) {
            this.f33626g = i2;
            a();
        }
    }

    public static MtEmptyView a(Context context) {
        MethodCollector.i(10566);
        MtEmptyView mtEmptyView = (MtEmptyView) LayoutInflater.from(context).inflate(R.layout.agl, (ViewGroup) null);
        MethodCollector.o(10566);
        return mtEmptyView;
    }

    public void setTopUsedHeight(int i2) {
        d dVar = this.f33627h;
        if (dVar != null && dVar.s) {
            this.f33628i.setPadding(0, 0, 0, ((int) n.b(getContext(), f33620a.floatValue())) + i2);
        }
    }

    @Override // com.bytedance.ies.dmt.ui.widget.g
    public void setStatus(d dVar) {
        if (dVar != null) {
            this.f33627h = dVar;
            if (dVar.n) {
                this.f33622c.setVisibility(0);
                this.f33623d.setImageDrawable(this.f33627h.f33636b);
            } else {
                this.f33622c.setVisibility(8);
            }
            if (this.f33627h.o) {
                this.f33624e.setText(this.f33627h.f33639e);
            }
            if (this.f33627h.r) {
                h.a(this.f33624e, (int) R.style.wa);
            }
            if (this.f33627h.p) {
                this.f33625f.setText(this.f33627h.f33640f);
                if (this.f33627h.q) {
                    this.f33625f.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            if (this.f33627h.s) {
                this.f33629j.setText(this.f33627h.f33643i);
                this.f33628i.setVisibility(0);
                this.f33629j.setVisibility(0);
                this.f33629j.setOnClickListener(this.f33627h.f33644j);
            }
            a();
        }
    }

    public MtEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10723);
        MethodCollector.o(10723);
    }

    public final void a(int i2, Drawable drawable, int i3, int i4) {
        d dVar = this.f33627h;
        if (dVar != null && dVar.s) {
            this.f33629j.setTextColor(i2);
            this.f33629j.setAlpha(1.0f);
            this.f33629j.setFontSize(4);
            this.f33629j.setFontWeight(3);
            this.f33629j.setBackgroundDrawable(drawable);
            this.f33628i.setPadding(i3, 0, i3, i4);
        }
    }
}
