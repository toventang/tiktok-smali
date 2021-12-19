package com.bytedance.ies.dmt.ui.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.zhiliaoapp.musically.R;

public final class a extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    private int f33374a;

    /* renamed from: b  reason: collision with root package name */
    private int f33375b;

    /* renamed from: c  reason: collision with root package name */
    private int f33376c;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f33377e;

    static {
        Covode.recordClassIndex(19924);
    }

    private void a() {
        int measuredHeight = getMeasuredHeight();
        if (this.f33376c != measuredHeight) {
            this.f33376c = measuredHeight;
            a(measuredHeight, this.f33374a);
        }
    }

    private void c() {
        int i2;
        int i3;
        if (this.f33375b == 2) {
            i2 = (int) n.b(getContext(), 4.0f);
            i3 = i2;
        } else {
            i2 = 0;
            i3 = 0;
        }
        super.setPadding(i2, 0, i3, 0);
    }

    private void b() {
        float b2;
        int i2;
        int i3;
        int i4 = this.f33375b;
        if (i4 == 1) {
            b2 = n.b(getContext(), 8.0f);
        } else if (i4 != 2) {
            b2 = n.b(getContext(), 6.0f);
        } else {
            i2 = (int) n.b(getContext(), 16.0f);
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth >= i2) {
                i3 = i2;
                i2 = measuredWidth;
                setMeasuredDimension(i2, i3);
                a();
            }
            i3 = i2;
            setMeasuredDimension(i2, i3);
            a();
        }
        i2 = (int) b2;
        i3 = i2;
        setMeasuredDimension(i2, i3);
        a();
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    public final void setBadgeColor(int i2) {
        this.f33374a = i2;
        a(this.f33376c, i2);
    }

    public final void setCount(int i2) {
        setText(String.valueOf(i2));
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtTextView
    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        b(attributeSet);
        setTextSize(1, 12.0f);
        setGravity(17);
    }

    public final void setMode(int i2) {
        if (this.f33375b != i2) {
            this.f33375b = i2;
            if (i2 != 2) {
                this.f33377e = getText();
                setText("");
            } else if (TextUtils.isEmpty(getText()) && !TextUtils.isEmpty(this.f33377e)) {
                setText(this.f33377e);
            }
            c();
            b();
        }
    }

    private void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.jk, R.attr.jl});
        this.f33374a = obtainStyledAttributes.getColor(0, getContext().getResources().getColor(R.color.b9));
        setMode(obtainStyledAttributes.getInt(1, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public final void setTextSize(int i2, float f2) {
        super.setTextSize(1, 12.0f);
    }

    private a(Context context, byte b2) {
        this(context, (char) 0);
    }

    private a(Context context, char c2) {
        super(context, null, 0);
        this.f33375b = -1;
        a(null);
    }

    private void a(int i2, int i3) {
        float b2 = (float) ((int) n.b(getContext(), (float) i2));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{b2, b2, b2, b2, b2, b2, b2, b2}, null, null));
        shapeDrawable.getPaint().setColor(i3);
        setBackground(shapeDrawable);
    }

    @Override // android.widget.TextView, com.bytedance.ies.dmt.ui.widget.DmtTextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        SpannableStringBuilder spannableStringBuilder;
        String str = "";
        if (this.f33375b != 2 || TextUtils.isEmpty(charSequence)) {
            this.f33377e = charSequence;
            spannableStringBuilder = str;
        } else {
            try {
                Integer valueOf = Integer.valueOf(charSequence.toString());
                if (valueOf.intValue() > 99) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("99+");
                    spannableStringBuilder2.setSpan(new c("+"), 2, 3, 17);
                    spannableStringBuilder = spannableStringBuilder2;
                } else {
                    if (valueOf.intValue() < 0) {
                        charSequence = str;
                    }
                    spannableStringBuilder = charSequence;
                }
            } catch (Exception unused) {
                throw new IllegalArgumentException("Excepted a int but get ".concat(String.valueOf(charSequence)));
            }
        }
        super.setText(spannableStringBuilder, bufferType);
    }

    public final void setPadding(int i2, int i3, int i4, int i5) {
        c();
    }
}
