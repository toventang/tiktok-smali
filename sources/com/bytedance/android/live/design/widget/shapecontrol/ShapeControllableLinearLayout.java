package com.bytedance.android.live.design.widget.shapecontrol;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.tintable.e;
import com.bytedance.covode.number.Covode;

public class ShapeControllableLinearLayout extends e {

    /* renamed from: a  reason: collision with root package name */
    private a<ShapeControllableLinearLayout> f9598a;

    static {
        Covode.recordClassIndex(4870);
    }

    public float getBottomLeftRadius() {
        return this.f9598a.f9606f;
    }

    public float getBottomRightRadius() {
        return this.f9598a.f9607g;
    }

    public float getRadius() {
        return this.f9598a.f9603c;
    }

    public ColorStateList getStrokeColor() {
        return this.f9598a.f9602b;
    }

    public float getStrokeWidth() {
        return this.f9598a.f9601a;
    }

    public float getTopLeftRadius() {
        return this.f9598a.f9604d;
    }

    public float getTopRightRadius() {
        return this.f9598a.f9605e;
    }

    public void setBottomLeftCircular(boolean z) {
        this.f9598a.d(z);
    }

    public void setBottomLeftRadius(float f2) {
        this.f9598a.e(f2);
    }

    public void setBottomRightCircular(boolean z) {
        this.f9598a.e(z);
    }

    public void setBottomRightRadius(float f2) {
        this.f9598a.f(f2);
    }

    public void setCircular(boolean z) {
        this.f9598a.a(z);
    }

    public void setGradientColors(int i2) {
        this.f9598a.b(i2);
    }

    public void setGradientOrientation(int i2) {
        this.f9598a.d(i2);
    }

    public void setGradientPositions(int i2) {
        this.f9598a.c(i2);
    }

    public void setRadius(float f2) {
        this.f9598a.b(f2);
    }

    public void setStrokeColor(int i2) {
        this.f9598a.a(i2);
    }

    public void setStrokeWidth(float f2) {
        this.f9598a.a(f2);
    }

    public void setTopLeftCircular(boolean z) {
        this.f9598a.b(z);
    }

    public void setTopLeftRadius(float f2) {
        this.f9598a.c(f2);
    }

    public void setTopRightCircular(boolean z) {
        this.f9598a.c(z);
    }

    public void setTopRightRadius(float f2) {
        this.f9598a.d(f2);
    }

    public void draw(Canvas canvas) {
        this.f9598a.b(canvas);
        super.draw(canvas);
        this.f9598a.c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f9598a.a(canvas);
    }

    public void setGradientColors(int[] iArr) {
        this.f9598a.a(iArr);
    }

    public void setGradientPositions(float[] fArr) {
        this.f9598a.a(fArr);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f9598a.a(colorStateList);
    }

    public ShapeControllableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a<ShapeControllableLinearLayout> aVar = new a<>(this);
        this.f9598a = aVar;
        aVar.a(attributeSet, 0, 0);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f9598a.b();
    }
}
