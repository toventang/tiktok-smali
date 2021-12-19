package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.h;
import com.facebook.common.d.i;
import com.facebook.drawee.e.q;

public class p extends g {

    /* renamed from: a  reason: collision with root package name */
    public q.b f47429a;

    /* renamed from: b  reason: collision with root package name */
    Object f47430b;

    /* renamed from: c  reason: collision with root package name */
    public PointF f47431c = null;

    /* renamed from: d  reason: collision with root package name */
    int f47432d = 0;

    /* renamed from: e  reason: collision with root package name */
    int f47433e = 0;

    /* renamed from: f  reason: collision with root package name */
    Matrix f47434f;

    /* renamed from: g  reason: collision with root package name */
    private Matrix f47435g = new Matrix();

    static {
        Covode.recordClassIndex(28779);
    }

    private void a() {
        boolean z;
        q.b bVar = this.f47429a;
        if (bVar instanceof q.l) {
            Object a2 = ((q.l) bVar).a();
            if (a2 == null || !a2.equals(this.f47430b)) {
                z = true;
            } else {
                z = false;
            }
            this.f47430b = a2;
        } else {
            z = false;
        }
        if (this.f47432d != getCurrent().getIntrinsicWidth() || this.f47433e != getCurrent().getIntrinsicHeight() || z) {
            b();
        }
    }

    private void b() {
        float f2;
        float f3;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f47432d = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f47433e = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f47434f = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f47434f = null;
        } else if (this.f47429a == q.b.f47436b) {
            current.setBounds(bounds);
            this.f47434f = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            q.b bVar = this.f47429a;
            Matrix matrix = this.f47435g;
            PointF pointF = this.f47431c;
            if (pointF != null) {
                f2 = pointF.x;
            } else {
                f2 = 0.5f;
            }
            PointF pointF2 = this.f47431c;
            if (pointF2 != null) {
                f3 = pointF2.y;
            } else {
                f3 = 0.5f;
            }
            bVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, f2, f3);
            this.f47434f = this.f47435g;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.drawee.e.g
    public void onBoundsChange(Rect rect) {
        b();
    }

    @Override // com.facebook.drawee.e.g
    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        b();
        return current;
    }

    @Override // com.facebook.drawee.e.g, com.facebook.drawee.e.s
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        a();
        Matrix matrix2 = this.f47434f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    public final void a(PointF pointF) {
        if (!h.a(this.f47431c, pointF)) {
            if (this.f47431c == null) {
                this.f47431c = new PointF();
            }
            this.f47431c.set(pointF);
            b();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.e.g
    public void draw(Canvas canvas) {
        a();
        if (this.f47434f != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f47434f);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public final void a(q.b bVar) {
        if (!h.a(this.f47429a, bVar)) {
            this.f47429a = bVar;
            this.f47430b = null;
            b();
            invalidateSelf();
        }
    }

    public p(Drawable drawable, q.b bVar) {
        super((Drawable) i.a(drawable));
        this.f47429a = bVar;
    }
}
