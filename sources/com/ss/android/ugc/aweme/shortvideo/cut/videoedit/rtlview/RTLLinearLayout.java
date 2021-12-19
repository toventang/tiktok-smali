package com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.eu;

public class RTLLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f126190a = dh.b(eu.a(getContext()));

    static {
        Covode.recordClassIndex(82846);
    }

    public float getLeftX() {
        return super.getX();
    }

    public float getStartX() {
        if (v.e(this) == 1) {
            return (((float) this.f126190a) - super.getX()) - ((float) getMeasuredWidth());
        }
        return super.getX();
    }

    public void setLeftX(float f2) {
        super.setX(f2);
    }

    public void setStartX(float f2) {
        if (v.e(this) == 1) {
            super.setX((((float) this.f126190a) - f2) - ((float) getMeasuredWidth()));
        } else {
            super.setX(f2);
        }
    }

    public RTLLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(6161);
        MethodCollector.o(6161);
    }
}
