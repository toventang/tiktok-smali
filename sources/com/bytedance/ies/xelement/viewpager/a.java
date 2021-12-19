package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.behavior.j;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f37499a;

    static {
        Covode.recordClassIndex(22559);
    }

    public final int getOverflow() {
        return this.f37499a;
    }

    private Rect getBoundRectForOverflow() {
        int i2;
        if (this.f37499a == 3 || !(getContext() instanceof j)) {
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        DisplayMetrics displayMetrics = ((j) getContext()).p;
        int i3 = 0;
        if ((getOverflow() & 1) != 0) {
            i2 = 0 - displayMetrics.widthPixels;
            width += displayMetrics.widthPixels * 2;
        } else {
            i2 = 0;
        }
        if ((getOverflow() & 2) != 0) {
            i3 = 0 - displayMetrics.heightPixels;
            height += displayMetrics.heightPixels * 2;
        }
        return new Rect(i2, i3, width + i2, height + i3);
    }

    public final void setOverflow(int i2) {
        this.f37499a = i2;
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(6315);
        MethodCollector.o(6315);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(6323);
        super.onLayout(z, i2, i3, i4, i5);
        if (this.f37499a != 0) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).setClipChildren(false);
            }
            setClipChildren(false);
            v.a(this, getBoundRectForOverflow());
            if (getChildAt(0) != null) {
                v.a(getChildAt(0), getBoundRectForOverflow());
            }
        }
        MethodCollector.o(6323);
    }
}
