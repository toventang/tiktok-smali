package com.facebook.drawee.f;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.g;
import com.facebook.drawee.e.t;
import com.facebook.drawee.e.u;

public final class d extends g implements t {

    /* renamed from: a  reason: collision with root package name */
    Drawable f47473a;

    /* renamed from: b  reason: collision with root package name */
    private u f47474b;

    static {
        Covode.recordClassIndex(28800);
    }

    @Override // com.facebook.drawee.e.g
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.e.g
    public final int getIntrinsicWidth() {
        return -1;
    }

    public d(Drawable drawable) {
        super(drawable);
    }

    @Override // com.facebook.drawee.e.t
    public final void a(u uVar) {
        this.f47474b = uVar;
    }

    @Override // com.facebook.drawee.e.g
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            u uVar = this.f47474b;
            if (uVar != null) {
                uVar.a();
            }
            super.draw(canvas);
            Drawable drawable = this.f47473a;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f47473a.draw(canvas);
            }
        }
    }

    @Override // com.facebook.drawee.e.g
    public final boolean setVisible(boolean z, boolean z2) {
        u uVar = this.f47474b;
        if (uVar != null) {
            uVar.a(z);
        }
        return super.setVisible(z, z2);
    }
}
