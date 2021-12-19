package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.f.c;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class LoadingButton extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65392a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private LoadingCircleView f65393b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f65394c;

    /* renamed from: d  reason: collision with root package name */
    private String f65395d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f65396e;

    static {
        Covode.recordClassIndex(40206);
    }

    public LoadingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40207);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean getDisableWhileLoading() {
        return this.f65396e;
    }

    private void a() {
        if (this.f65393b.getVisibility() != 0) {
            this.f65393b.setVisibility(0);
        }
        this.f65393b.a();
    }

    private void b() {
        if (this.f65393b.getVisibility() != 8) {
            this.f65393b.setVisibility(8);
        }
        this.f65393b.b();
    }

    public final void setDisableWhileLoading(boolean z) {
        this.f65396e = z;
    }

    public final void a(boolean z) {
        this.f65396e = z;
        setEnabled(!z);
        a();
        setText("");
    }

    public final void b(boolean z) {
        this.f65396e = false;
        setEnabled(z);
        b();
        setText(this.f65395d);
    }

    public final void setButtonText(String str) {
        l.d(str, "");
        this.f65395d = str;
        this.f65394c.setText(str);
    }

    public final void setText(String str) {
        l.d(str, "");
        this.f65394c.setText(str);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z || this.f65396e) {
            this.f65394c.setTextColor(b.c(getContext(), R.color.a9));
            this.f65394c.setBackground(b.a(getContext(), (int) R.drawable.ii));
        } else {
            this.f65394c.setTextColor(b.c(getContext(), R.color.bz));
            this.f65394c.setBackground(b.a(getContext(), (int) R.drawable.kv));
        }
        this.f65394c.setEnabled(z);
    }

    private /* synthetic */ LoadingButton(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LoadingButton(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9459);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842901, 16842904, 16842964, 16843087, R.attr.a3j, R.attr.a3l, R.attr.a3m, R.attr.a3o});
        l.b(obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(4, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, n.a(20.0d));
        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(5, n.a(3.0d));
        int color2 = obtainStyledAttributes.getColor(1, -16777216);
        String string = obtainStyledAttributes.getString(3);
        this.f65395d = string == null ? "" : string;
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        View.inflate(context, R.layout.gv, this);
        if (drawable != null) {
            setBackground(drawable);
        }
        View findViewById = findViewById(R.id.chm);
        l.b(findViewById, "");
        this.f65393b = (LoadingCircleView) findViewById;
        View findViewById2 = findViewById(R.id.chn);
        l.b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        this.f65394c = textView;
        textView.setText(this.f65395d);
        this.f65394c.setTextColor(color2);
        ViewGroup.LayoutParams layoutParams = this.f65393b.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = dimensionPixelSize;
            layoutParams2.width = dimensionPixelSize;
            this.f65393b.setLayoutParams(layoutParams2);
            this.f65393b.setLoadingColor(color);
            this.f65393b.setLineWidth(dimensionPixelSize2);
            if (dimensionPixelSize3 != -1) {
                this.f65394c.setTextSize(0, (float) dimensionPixelSize3);
            }
            setEnabled(false);
            c.a(this, 0.5f);
            MethodCollector.o(9459);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        MethodCollector.o(9459);
        throw nullPointerException;
    }
}
