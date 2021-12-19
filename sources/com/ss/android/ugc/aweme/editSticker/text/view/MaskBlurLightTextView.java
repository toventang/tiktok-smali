package com.ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;

public class MaskBlurLightTextView extends AppCompatTextView {
    static {
        Covode.recordClassIndex(55777);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setMaskBlurColor(int i2) {
        setShadowLayer(10.0f, 0.0f, 0.0f, i2);
    }

    public MaskBlurLightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
