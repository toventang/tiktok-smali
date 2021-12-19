package com.lynx.tasm.ui.image;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.c.b;
import com.facebook.drawee.e.q;
import com.lynx.tasm.behavior.ui.text.a;
import com.lynx.tasm.ui.image.a.d;

public final class c extends a {

    /* renamed from: f  reason: collision with root package name */
    private Drawable f56969f;

    /* renamed from: g  reason: collision with root package name */
    private final b f56970g;

    /* renamed from: h  reason: collision with root package name */
    private final com.facebook.drawee.view.b<com.facebook.drawee.f.a> f56971h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f56972i = null;

    /* renamed from: j  reason: collision with root package name */
    private final com.facebook.drawee.c.c f56973j;

    /* renamed from: k  reason: collision with root package name */
    private Uri f56974k;

    /* renamed from: l  reason: collision with root package name */
    private q.b f56975l;

    static {
        Covode.recordClassIndex(35440);
    }

    @Override // com.lynx.tasm.behavior.ui.text.a
    public final Drawable a() {
        return this.f56969f;
    }

    @Override // com.lynx.tasm.behavior.ui.text.a
    public final void b() {
        this.f56971h.c();
    }

    @Override // com.lynx.tasm.behavior.ui.text.a
    public final void c() {
        this.f56971h.c();
    }

    @Override // com.lynx.tasm.behavior.ui.text.a
    public final void d() {
        this.f56971h.b();
    }

    @Override // com.lynx.tasm.behavior.ui.text.a
    public final void e() {
        this.f56971h.b();
    }

    @Override // com.lynx.tasm.behavior.ui.text.a
    public final void a(Drawable.Callback callback) {
        super.a(callback);
        if (callback != null && this.f56969f == null) {
            com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(this.f56974k);
            com.lynx.tasm.ui.image.b.b.a(a2);
            b bVar = this.f56970g;
            bVar.b();
            bVar.f47325m = this.f56971h.f47495b;
            bVar.f47314b = this.f56972i;
            bVar.f47315c = (REQUEST) d.a(a2, null);
            bVar.f47319g = this.f56973j;
            this.f56971h.a(bVar.e());
            this.f56970g.b();
            Drawable f2 = this.f56971h.f();
            this.f56969f = f2;
            if (f2 != null) {
                f2.setBounds(0, 0, this.f56358b, this.f56357a);
                this.f56969f.setCallback(this.f56361e);
                this.f56971h.d().a(this.f56975l);
            }
        }
        Drawable drawable = this.f56969f;
        if (drawable != null) {
            drawable.setCallback(callback);
        }
    }

    public c(Resources resources, int i2, int i3, int[] iArr, Uri uri, q.b bVar, b bVar2, com.facebook.drawee.c.c cVar) {
        super(i2, i3, iArr);
        this.f56971h = new com.facebook.drawee.view.b<>(com.facebook.drawee.f.b.a(resources).a());
        this.f56970g = bVar2;
        this.f56974k = uri == null ? Uri.EMPTY : uri;
        this.f56975l = bVar;
        this.f56973j = cVar;
    }

    @Override // com.lynx.tasm.behavior.ui.text.a
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        if (this.f56361e != null) {
            super.draw(canvas, charSequence, i2, i3, f2, i4, i5, i6, paint);
        }
    }
}
