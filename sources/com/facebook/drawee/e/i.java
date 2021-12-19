package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;

public final class i extends g {

    /* renamed from: a  reason: collision with root package name */
    final Matrix f47382a;

    /* renamed from: b  reason: collision with root package name */
    private int f47383b;

    /* renamed from: c  reason: collision with root package name */
    private int f47384c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f47385d = new Matrix();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f47386e = new RectF();

    static {
        Covode.recordClassIndex(28770);
    }

    @Override // com.facebook.drawee.e.g
    public final int getIntrinsicHeight() {
        int i2 = this.f47384c;
        if (i2 == 5 || i2 == 7 || this.f47383b % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.e.g
    public final int getIntrinsicWidth() {
        int i2 = this.f47384c;
        if (i2 == 5 || i2 == 7 || this.f47383b % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.e.g
    public final void draw(Canvas canvas) {
        int i2;
        if (this.f47383b > 0 || !((i2 = this.f47384c) == 0 || i2 == 1)) {
            int save = canvas.save();
            canvas.concat(this.f47382a);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.e.g, com.facebook.drawee.e.s
    public final void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        if (!this.f47382a.isIdentity()) {
            matrix.preConcat(this.f47382a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.drawee.e.g
    public final void onBoundsChange(Rect rect) {
        int i2;
        Drawable current = getCurrent();
        int i3 = this.f47383b;
        if (i3 > 0 || !((i2 = this.f47384c) == 0 || i2 == 1)) {
            int i4 = this.f47384c;
            if (i4 == 2) {
                this.f47382a.setScale(-1.0f, 1.0f);
            } else if (i4 == 7) {
                this.f47382a.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.f47382a.postScale(-1.0f, 1.0f);
            } else if (i4 == 4) {
                this.f47382a.setScale(1.0f, -1.0f);
            } else if (i4 != 5) {
                this.f47382a.setRotate((float) i3, (float) rect.centerX(), (float) rect.centerY());
            } else {
                this.f47382a.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.f47382a.postScale(1.0f, -1.0f);
            }
            this.f47385d.reset();
            this.f47382a.invert(this.f47385d);
            this.f47386e.set(rect);
            this.f47385d.mapRect(this.f47386e);
            current.setBounds((int) this.f47386e.left, (int) this.f47386e.top, (int) this.f47386e.right, (int) this.f47386e.bottom);
            return;
        }
        current.setBounds(rect);
    }

    public i(Drawable drawable, int i2, int i3) {
        super(drawable);
        boolean z;
        boolean z2 = true;
        if (i2 % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        com.facebook.common.d.i.a(z);
        com.facebook.common.d.i.a((i3 < 0 || i3 > 8) ? false : z2);
        this.f47382a = new Matrix();
        this.f47383b = i2;
        this.f47384c = i3;
    }
}
