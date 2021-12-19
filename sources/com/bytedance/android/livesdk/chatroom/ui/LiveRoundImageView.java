package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;

public class LiveRoundImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private int f15807a;

    /* renamed from: b  reason: collision with root package name */
    private int f15808b;

    /* renamed from: c  reason: collision with root package name */
    private int f15809c;

    /* renamed from: d  reason: collision with root package name */
    private int f15810d;

    /* renamed from: e  reason: collision with root package name */
    private Path f15811e = new Path();

    static {
        Covode.recordClassIndex(8722);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(this.f15807a, this.f15809c) + Math.max(this.f15808b, this.f15810d);
        int max2 = Math.max(this.f15807a, this.f15808b) + Math.max(this.f15809c, this.f15810d);
        if (width >= max && height > max2) {
            this.f15811e.reset();
            this.f15811e.moveTo((float) this.f15807a, 0.0f);
            this.f15811e.lineTo((float) (width - this.f15808b), 0.0f);
            float f2 = (float) width;
            this.f15811e.quadTo(f2, 0.0f, f2, (float) this.f15808b);
            this.f15811e.lineTo(f2, (float) (height - this.f15810d));
            float f3 = (float) height;
            this.f15811e.quadTo(f2, f3, (float) (width - this.f15810d), f3);
            this.f15811e.lineTo((float) this.f15809c, f3);
            this.f15811e.quadTo(0.0f, f3, 0.0f, (float) (height - this.f15809c));
            this.f15811e.lineTo(0.0f, (float) this.f15807a);
            this.f15811e.quadTo(0.0f, 0.0f, (float) this.f15807a, 0.0f);
            canvas.clipPath(this.f15811e);
        }
        super.onDraw(canvas);
    }

    public LiveRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.an9, R.attr.an_, R.attr.ana, R.attr.anb, R.attr.anc});
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            this.f15807a = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f15808b = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
            this.f15809c = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            this.f15810d = dimensionPixelOffset2;
            if (this.f15807a == 0) {
                this.f15807a = dimensionPixelOffset;
            }
            if (this.f15808b == 0) {
                this.f15808b = dimensionPixelOffset;
            }
            if (this.f15809c == 0) {
                this.f15809c = dimensionPixelOffset;
            }
            if (dimensionPixelOffset2 == 0) {
                this.f15810d = dimensionPixelOffset;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
