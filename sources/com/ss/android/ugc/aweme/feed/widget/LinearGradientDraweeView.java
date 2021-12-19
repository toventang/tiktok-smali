package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;

public class LinearGradientDraweeView extends SmartImageView {

    /* renamed from: a  reason: collision with root package name */
    private int f95187a;

    /* renamed from: b  reason: collision with root package name */
    private int f95188b;

    /* renamed from: d  reason: collision with root package name */
    private int f95189d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f95190e;

    /* renamed from: f  reason: collision with root package name */
    private LinearGradient f95191f;

    static {
        Covode.recordClassIndex(60320);
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    @Override // com.facebook.drawee.view.c
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f95187a > 0) {
            int height = getHeight() - this.f95187a;
            if (this.f95191f == null) {
                LinearGradient linearGradient = new LinearGradient(0.0f, (float) height, 0.0f, (float) getHeight(), new int[]{this.f95188b, this.f95189d}, (float[]) null, Shader.TileMode.CLAMP);
                this.f95191f = linearGradient;
                this.f95190e.setShader(linearGradient);
            }
            canvas.drawRect(0.0f, (float) height, (float) getWidth(), (float) getHeight(), this.f95190e);
        }
    }

    public LinearGradientDraweeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LinearGradientDraweeView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        this.f95190e = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.t2, R.attr.a2d, R.attr.afe});
        this.f95188b = obtainStyledAttributes.getColor(2, 0);
        this.f95189d = obtainStyledAttributes.getColor(0, 0);
        this.f95187a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
