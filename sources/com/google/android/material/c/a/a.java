package com.google.android.material.c.a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import com.bytedance.covode.number.Covode;
import com.google.android.material.c.c;
import com.google.android.material.c.d;

public class a extends CardView implements d {

    /* renamed from: e  reason: collision with root package name */
    private final c f52356e;

    static {
        Covode.recordClassIndex(32489);
    }

    @Override // com.google.android.material.c.d
    public final void a() {
        this.f52356e.a();
    }

    @Override // com.google.android.material.c.d
    public final void b() {
        this.f52356e.b();
    }

    @Override // com.google.android.material.c.c.a
    public final boolean c() {
        return super.isOpaque();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f52356e.f52360c;
    }

    @Override // com.google.android.material.c.d
    public d.C1219d getRevealInfo() {
        return this.f52356e.c();
    }

    @Override // com.google.android.material.c.d
    public int getCircularRevealScrimColor() {
        return this.f52356e.f52359b.getColor();
    }

    public boolean isOpaque() {
        c cVar = this.f52356e;
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
        this.f52356e.a(drawable);
    }

    @Override // com.google.android.material.c.d
    public void setCircularRevealScrimColor(int i2) {
        this.f52356e.a(i2);
    }

    @Override // com.google.android.material.c.d
    public void setRevealInfo(d.C1219d dVar) {
        this.f52356e.a(dVar);
    }

    public void draw(Canvas canvas) {
        c cVar = this.f52356e;
        if (cVar != null) {
            cVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }
}
