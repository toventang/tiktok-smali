package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class FpsRecyclerView extends RecyclerView {
    long Q = -1;
    long R = Long.MIN_VALUE;
    String S = "unKnown";

    static {
        Covode.recordClassIndex(94577);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void setLabel(String str) {
        this.S = str;
    }

    public FpsRecyclerView(Context context) {
        super(context);
    }

    public FpsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
