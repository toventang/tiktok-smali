package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class InputResultIndicator extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final a f64756d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f64757a;

    /* renamed from: b  reason: collision with root package name */
    public View f64758b;

    /* renamed from: c  reason: collision with root package name */
    public int f64759c;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f64760e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f64761f;

    /* renamed from: g  reason: collision with root package name */
    private int f64762g;

    /* renamed from: h  reason: collision with root package name */
    private int f64763h;

    /* renamed from: i  reason: collision with root package name */
    private int f64764i;

    /* renamed from: j  reason: collision with root package name */
    private int f64765j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f64766k;

    /* renamed from: l  reason: collision with root package name */
    private int f64767l;

    /* renamed from: m  reason: collision with root package name */
    private int f64768m;

    static {
        Covode.recordClassIndex(39802);
    }

    public InputResultIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39803);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f64757a.setBackgroundColor(this.f64763h);
        this.f64758b.setVisibility(8);
    }

    private final boolean a(int i2) {
        try {
            return l.a((Object) getResources().getResourceTypeName(i2), (Object) "drawable");
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public final void a(String str) {
        l.d(str, "");
        a(str, this.f64766k);
    }

    public final void a(boolean z) {
        int i2;
        this.f64757a.setVisibility(0);
        View view = this.f64757a;
        if (z) {
            i2 = this.f64763h;
        } else {
            i2 = this.f64759c;
        }
        view.setBackgroundColor(i2);
        this.f64758b.setVisibility(8);
    }

    private void a(String str, boolean z) {
        l.d(str, "");
        if (a(0)) {
            this.f64760e.setImageResource(0);
        }
        if (z) {
            this.f64757a.setVisibility(0);
            this.f64757a.setBackgroundColor(this.f64759c);
        } else {
            this.f64757a.setVisibility(8);
        }
        this.f64758b.setVisibility(0);
        this.f64761f.setText(str);
    }

    private /* synthetic */ InputResultIndicator(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InputResultIndicator(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        int i2 = 0;
        MethodCollector.i(8598);
        this.f64766k = true;
        this.f64767l = -1;
        this.f64768m = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842901, R.attr.rp, R.attr.rq, R.attr.rs, R.attr.a4x, R.attr.a9p, R.attr.a9q, R.attr.ac2});
        l.b(obtainStyledAttributes, "");
        this.f64762g = obtainStyledAttributes.getDimensionPixelSize(1, n.a(0.5d));
        this.f64763h = obtainStyledAttributes.getColor(2, b.c(context, R.color.b0));
        this.f64759c = obtainStyledAttributes.getColor(3, b.c(context, R.color.im));
        this.f64764i = obtainStyledAttributes.getColor(6, b.c(context, R.color.im));
        this.f64765j = obtainStyledAttributes.getResourceId(5, 2131231116);
        this.f64766k = obtainStyledAttributes.getBoolean(7, true);
        this.f64767l = obtainStyledAttributes.getDimensionPixelSize(4, -1);
        this.f64768m = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        View.inflate(context, R.layout.h7, this);
        View findViewById = findViewById(R.id.dmc);
        l.b(findViewById, "");
        this.f64757a = findViewById;
        View findViewById2 = findViewById(R.id.dma);
        l.b(findViewById2, "");
        this.f64758b = findViewById2;
        View findViewById3 = findViewById(R.id.dmb);
        l.b(findViewById3, "");
        this.f64760e = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.dmd);
        l.b(findViewById4, "");
        this.f64761f = (TextView) findViewById4;
        if (this.f64767l != -1) {
            ViewGroup.LayoutParams layoutParams = this.f64758b.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f64767l;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                MethodCollector.o(8598);
                throw nullPointerException;
            }
        }
        int i3 = this.f64768m;
        if (i3 != -1) {
            this.f64761f.setTextSize(0, (float) i3);
        }
        View view = this.f64757a;
        int i4 = this.f64762g;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = i4;
            view.setLayoutParams(layoutParams2);
        }
        if (a(this.f64765j)) {
            this.f64760e.setImageResource(this.f64765j);
        }
        this.f64761f.setTextColor(this.f64764i);
        this.f64757a.setVisibility(!this.f64766k ? 8 : i2);
        a();
        MethodCollector.o(8598);
    }
}
