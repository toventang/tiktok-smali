package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;

public class TopCropImageView extends AppCompatImageView {
    static {
        Covode.recordClassIndex(75847);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    private void a() {
        float f2;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth * height > intrinsicHeight * width) {
                f2 = ((float) height) / ((float) intrinsicHeight);
            } else {
                f2 = ((float) width) / ((float) intrinsicWidth);
            }
            imageMatrix.setScale(f2, f2);
            setImageMatrix(imageMatrix);
        }
    }

    public TopCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i2, int i3, int i4, int i5) {
        a();
        return super.setFrame(i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        a();
    }
}
