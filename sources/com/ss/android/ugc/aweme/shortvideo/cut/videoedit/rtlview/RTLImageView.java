package com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.tools.view.widget.AVAutoRTLImageView;

public class RTLImageView extends AVAutoRTLImageView {

    /* renamed from: a  reason: collision with root package name */
    private int f126189a;

    static {
        Covode.recordClassIndex(82845);
    }

    public float getLeftX() {
        return super.getX();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    private void a() {
        this.f126189a = dh.b(eu.a(getContext()));
    }

    public float getStartX() {
        if (v.e(this) == 1) {
            return (((float) this.f126189a) - super.getX()) - ((float) getMeasuredWidth());
        }
        return super.getX();
    }

    public void setLeftX(float f2) {
        super.setX(f2);
    }

    public RTLImageView(Context context) {
        super(context);
        a();
    }

    public void setStartX(float f2) {
        if (v.e(this) == 1) {
            f2 = (((float) this.f126189a) - f2) - ((float) getMeasuredWidth());
        }
        super.setX(f2);
    }

    public RTLImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
