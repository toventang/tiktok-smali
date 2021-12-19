package com.bytedance.android.live.design.widget.shapecontrol;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.tintable.c;
import com.bytedance.covode.number.Covode;

public class ShapeControllableConstraintLayout extends c {

    /* renamed from: g  reason: collision with root package name */
    private a<ShapeControllableConstraintLayout> f9596g;

    static {
        Covode.recordClassIndex(4868);
    }

    public float getBottomLeftRadius() {
        return this.f9596g.f9606f;
    }

    public float getBottomRightRadius() {
        return this.f9596g.f9607g;
    }

    public float getRadius() {
        return this.f9596g.f9603c;
    }

    public ColorStateList getStrokeColor() {
        return this.f9596g.f9602b;
    }

    public float getStrokeWidth() {
        return this.f9596g.f9601a;
    }

    public float getTopLeftRadius() {
        return this.f9596g.f9604d;
    }

    public float getTopRightRadius() {
        return this.f9596g.f9605e;
    }

    public final void c(int i2) {
        this.f9596g.e(i2);
    }

    public void setBottomLeftCircular(boolean z) {
        this.f9596g.d(z);
    }

    public void setBottomLeftRadius(float f2) {
        this.f9596g.e(f2);
    }

    public void setBottomRightCircular(boolean z) {
        this.f9596g.e(z);
    }

    public void setBottomRightRadius(float f2) {
        this.f9596g.f(f2);
    }

    public void setCircular(boolean z) {
        this.f9596g.a(z);
    }

    public void setGradientColors(int i2) {
        this.f9596g.b(i2);
    }

    public void setGradientOrientation(int i2) {
        this.f9596g.d(i2);
    }

    public void setGradientPositions(int i2) {
        this.f9596g.c(i2);
    }

    public void setRadius(float f2) {
        this.f9596g.b(f2);
    }

    public void setStrokeColor(int i2) {
        this.f9596g.a(i2);
    }

    public void setStrokeWidth(float f2) {
        this.f9596g.a(f2);
    }

    public void setTopLeftCircular(boolean z) {
        this.f9596g.b(z);
    }

    public void setTopLeftRadius(float f2) {
        this.f9596g.c(f2);
    }

    public void setTopRightCircular(boolean z) {
        this.f9596g.c(z);
    }

    public void setTopRightRadius(float f2) {
        this.f9596g.d(f2);
    }

    public void draw(Canvas canvas) {
        this.f9596g.b(canvas);
        super.draw(canvas);
        this.f9596g.c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f9596g.a(canvas);
    }

    public void setGradientColors(int[] iArr) {
        this.f9596g.a(iArr);
    }

    public void setGradientPositions(float[] fArr) {
        this.f9596g.a(fArr);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f9596g.a(colorStateList);
    }

    public ShapeControllableConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    private void a(AttributeSet attributeSet, int i2) {
        a<ShapeControllableConstraintLayout> aVar = new a<>(this);
        this.f9596g = aVar;
        aVar.a(attributeSet, 0, 0);
    }

    public ShapeControllableConstraintLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        a(attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f9596g.b();
    }
}
