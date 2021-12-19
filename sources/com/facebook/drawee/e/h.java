package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

public final class h extends g {

    /* renamed from: a  reason: collision with root package name */
    public Matrix f47378a;

    /* renamed from: b  reason: collision with root package name */
    private Matrix f47379b;

    /* renamed from: c  reason: collision with root package name */
    private int f47380c;

    /* renamed from: d  reason: collision with root package name */
    private int f47381d;

    static {
        Covode.recordClassIndex(28769);
    }

    private void a() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f47380c = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f47381d = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f47379b = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f47379b = this.f47378a;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.drawee.e.g
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // com.facebook.drawee.e.g
    public final Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        a();
        return current;
    }

    @Override // com.facebook.drawee.e.g, com.facebook.drawee.e.s
    public final void getTransform(Matrix matrix) {
        super.getTransform(matrix);
        Matrix matrix2 = this.f47379b;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // com.facebook.drawee.e.g
    public final void draw(Canvas canvas) {
        if (!(this.f47380c == getCurrent().getIntrinsicWidth() && this.f47381d == getCurrent().getIntrinsicHeight())) {
            a();
        }
        if (this.f47379b != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f47379b);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }
}
