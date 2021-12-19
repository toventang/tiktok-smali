package com.bytedance.ies.dmt.ui.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.d;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;

public abstract class a extends FrameLayout implements d {

    /* renamed from: a  reason: collision with root package name */
    protected DmtTextView f33530a;

    /* renamed from: b  reason: collision with root package name */
    protected int f33531b;

    static {
        Covode.recordClassIndex(19994);
    }

    @Override // com.bytedance.ies.dmt.ui.common.d
    public abstract void a(int i2);

    public abstract void a(boolean z);

    public abstract void setDividerLineBackground(int i2);

    public int getColorMode() {
        return this.f33531b;
    }

    public DmtTextView getTitleView() {
        return this.f33530a;
    }

    public void setColorMode(int i2) {
        if (this.f33531b != i2) {
            this.f33531b = i2;
            a(i2);
        }
        this.f33531b = i2;
    }

    public void setTitle(int i2) {
        DmtTextView dmtTextView = this.f33530a;
        if (dmtTextView != null) {
            dmtTextView.setText(i2);
        }
    }

    public void setTitleColor(int i2) {
        DmtTextView dmtTextView = this.f33530a;
        if (dmtTextView != null) {
            dmtTextView.setTextColor(i2);
        }
    }

    public void setTitleSize(float f2) {
        DmtTextView dmtTextView = this.f33530a;
        if (dmtTextView != null) {
            dmtTextView.setTextSize(f2);
        }
    }

    public void setTitle(CharSequence charSequence) {
        DmtTextView dmtTextView = this.f33530a;
        if (dmtTextView != null) {
            dmtTextView.setText(charSequence);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
    }
}
