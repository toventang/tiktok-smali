package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class MVRecycleView extends RecyclerView {
    private double O;

    static {
        Covode.recordClassIndex(82811);
    }

    public void setflingScale(double d2) {
        this.O = d2;
    }

    public MVRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean b(int i2, int i3) {
        double d2 = (double) i2;
        double d3 = this.O;
        Double.isNaN(d2);
        return super.b((int) (d2 * d3), i3);
    }
}
