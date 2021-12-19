package com.google.android.material.c;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.c.d;

public class b extends FrameLayout implements d {

    /* renamed from: a  reason: collision with root package name */
    private final c f52357a;

    static {
        Covode.recordClassIndex(32490);
    }

    @Override // com.google.android.material.c.d
    public final void a() {
        this.f52357a.a();
    }

    @Override // com.google.android.material.c.d
    public final void b() {
        this.f52357a.b();
    }

    @Override // com.google.android.material.c.c.a
    public final boolean c() {
        return super.isOpaque();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f52357a.f52360c;
    }

    @Override // com.google.android.material.c.d
    public d.C1219d getRevealInfo() {
        return this.f52357a.c();
    }

    @Override // com.google.android.material.c.d
    public int getCircularRevealScrimColor() {
        return this.f52357a.f52359b.getColor();
    }

    public boolean isOpaque() {
        c cVar = this.f52357a;
        if (cVar != null) {
            return cVar.d();
        }
        return super.isOpaque();
    }

    @Override // com.google.android.material.c.c.a
    public final void a(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.c.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f52357a.a(drawable);
    }

    @Override // com.google.android.material.c.d
    public void setCircularRevealScrimColor(int i2) {
        this.f52357a.a(i2);
    }

    @Override // com.google.android.material.c.d
    public void setRevealInfo(d.C1219d dVar) {
        this.f52357a.a(dVar);
    }

    public void draw(Canvas canvas) {
        c cVar = this.f52357a;
        if (cVar != null) {
            cVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }
}
