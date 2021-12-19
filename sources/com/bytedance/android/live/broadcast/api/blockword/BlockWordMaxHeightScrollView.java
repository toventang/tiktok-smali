package com.bytedance.android.live.broadcast.api.blockword;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class BlockWordMaxHeightScrollView extends ScrollView {
    static {
        Covode.recordClassIndex(3678);
    }

    public BlockWordMaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3308);
        MethodCollector.o(3308);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(3310);
        if (b.f7517a) {
            i3 = View.MeasureSpec.makeMeasureSpec(y.a(148.0f), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        MethodCollector.o(3310);
    }
}
