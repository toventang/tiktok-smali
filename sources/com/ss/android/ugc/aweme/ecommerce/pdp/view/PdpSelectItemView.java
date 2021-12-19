package com.ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class PdpSelectItemView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f86830g;

    static {
        Covode.recordClassIndex(54407);
    }

    public PdpSelectItemView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public PdpSelectItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private View b(int i2) {
        if (this.f86830g == null) {
            this.f86830g = new SparseArray();
        }
        View view = (View) this.f86830g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f86830g.put(i2, findViewById);
        return findViewById;
    }

    public final void setDescColor(int i2) {
        ((TuxTextView) b(R.id.dxh)).setTextColor(i2);
    }

    public final void setSubDescColor(int i2) {
        ((TuxTextView) b(R.id.dxj)).setTextColor(i2);
    }

    public final void setSubDescFont(int i2) {
        ((TuxTextView) b(R.id.dxj)).setTuxFont(i2);
    }

    public final void setBackIconVisibility(boolean z) {
        int i2;
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) b(R.id.qh);
        l.b(autoRTLImageView, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        autoRTLImageView.setVisibility(i2);
    }

    public final void setTitle(int i2) {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.dxn);
        l.b(tuxTextView, "");
        tuxTextView.setText(getContext().getText(i2));
    }

    public final void setDesc(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.dxh);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(4);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.dxh);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(str);
        TuxTextView tuxTextView3 = (TuxTextView) b(R.id.dxh);
        l.b(tuxTextView3, "");
        tuxTextView3.setVisibility(0);
    }

    public final void setSecondLineDescExtra(SpannableStringBuilder spannableStringBuilder) {
        boolean z;
        if (spannableStringBuilder == null || spannableStringBuilder.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.dxl);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.dxl);
        l.b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = (TuxTextView) b(R.id.dxl);
        l.b(tuxTextView3, "");
        tuxTextView3.setText(spannableStringBuilder);
    }

    public final void setSecondLineDescL1(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.dxm);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.dxm);
        l.b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = (TuxTextView) b(R.id.dxm);
        l.b(tuxTextView3, "");
        tuxTextView3.setText(str);
    }

    public final void setSecondLineDescL2(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.dxi);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.dxi);
        l.b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = (TuxTextView) b(R.id.dxi);
        l.b(tuxTextView3, "");
        tuxTextView3.setText(str);
    }

    public final void setSubDesc(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.dxj);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.dxj);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(str);
        TuxTextView tuxTextView3 = (TuxTextView) b(R.id.dxj);
        l.b(tuxTextView3, "");
        tuxTextView3.setVisibility(0);
    }

    public final void setTitle(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) b(R.id.dxn);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setDescLineThru(boolean z) {
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.dxh);
            l.b(tuxTextView, "");
            TextPaint paint = tuxTextView.getPaint();
            l.b(paint, "");
            TuxTextView tuxTextView2 = (TuxTextView) b(R.id.dxh);
            l.b(tuxTextView2, "");
            TextPaint paint2 = tuxTextView2.getPaint();
            l.b(paint2, "");
            paint.setFlags(paint2.getFlags() | 16);
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) b(R.id.dxh);
        l.b(tuxTextView3, "");
        TextPaint paint3 = tuxTextView3.getPaint();
        l.b(paint3, "");
        TuxTextView tuxTextView4 = (TuxTextView) b(R.id.dxh);
        l.b(tuxTextView4, "");
        TextPaint paint4 = tuxTextView4.getPaint();
        l.b(paint4, "");
        paint3.setFlags(paint4.getFlags() & -17);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ PdpSelectItemView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PdpSelectItemView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        a.a(LayoutInflater.from(context), R.layout.q3, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aiy});
        String string = obtainStyledAttributes.getString(0);
        if (string != null && string.length() > 0) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.dxn);
            l.b(tuxTextView, "");
            tuxTextView.setText(string);
        }
        obtainStyledAttributes.recycle();
    }
}
