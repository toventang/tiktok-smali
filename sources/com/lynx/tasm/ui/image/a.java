package com.lynx.tasm.ui.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.j.b;
import com.lynx.tasm.behavior.ui.a.c;
import com.lynx.tasm.ui.image.j;
import com.lynx.tasm.utils.m;

public class a extends c implements Drawable.Callback, j.a {

    /* renamed from: a  reason: collision with root package name */
    public int f56892a;

    /* renamed from: b  reason: collision with root package name */
    public int f56893b;

    /* renamed from: c  reason: collision with root package name */
    private j f56894c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f56895d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56896e;

    /* renamed from: f  reason: collision with root package name */
    private int f56897f;

    /* renamed from: h  reason: collision with root package name */
    private int f56898h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f56899i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f56900j;

    static {
        Covode.recordClassIndex(35421);
    }

    @Override // com.lynx.tasm.ui.image.j.a
    public final void O_() {
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final int b() {
        return this.f56892a;
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final int c() {
        return this.f56893b;
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final void d() {
        f();
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final boolean a() {
        if (this.f56895d != null) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final void e() {
        this.f56894c.b();
        this.f56896e = false;
    }

    private void f() {
        if (!this.f56896e) {
            this.f56894c.a();
            this.f56896e = true;
            this.f56894c.n = true;
            this.f56894c.a(this.f56897f, this.f56898h, 0, 0, 0, 0);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final void a(Bitmap.Config config) {
        this.f56894c.a(config);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f56895d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.f56895d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // com.lynx.tasm.ui.image.j.a
    public final void a(Drawable drawable) {
        if (!this.f56899i) {
            this.f56895d = drawable;
            drawable.setBounds(getBounds());
            this.f56895d.setCallback(this);
            invalidateSelf();
        }
    }

    @Override // com.lynx.tasm.ui.image.j.a
    public final void a(com.facebook.common.h.a<?> aVar) {
        Bitmap bitmap;
        MethodCollector.i(3160);
        if (aVar != null && aVar.d()) {
            Object a2 = aVar.a();
            if (a2 instanceof b) {
                bitmap = ((b) a2).d();
            } else if (a2 instanceof Bitmap) {
                bitmap = (Bitmap) a2;
            }
            if (bitmap != null) {
                this.f56899i = true;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f56900j.getResources(), bitmap.copy(bitmap.getConfig(), true));
                this.f56895d = bitmapDrawable;
                bitmapDrawable.setBounds(getBounds());
                this.f56895d.setCallback(this);
                this.f56892a = bitmap.getWidth();
                this.f56893b = bitmap.getHeight();
                invalidateSelf();
            }
        }
        MethodCollector.o(3160);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        m.a(runnable, drawable);
    }

    @Override // com.lynx.tasm.behavior.ui.a.c
    public final void a(int i2, int i3) {
        this.f56897f = i2;
        this.f56898h = i3;
        this.f56894c.a(i2, i3, 0, 0, 0, 0);
        f();
    }

    a(final Context context, final String str) {
        this.f56900j = context;
        j jVar = new j(context, com.facebook.drawee.a.a.c.b(), this, true);
        this.f56894c = jVar;
        jVar.F = true;
        this.f56894c.u = new d() {
            /* class com.lynx.tasm.ui.image.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35422);
            }

            @Override // com.lynx.tasm.ui.image.d
            public final void a(String str) {
                Context context = context;
                if (context instanceof com.lynx.tasm.behavior.j) {
                    ((com.lynx.tasm.behavior.j) context).a(str, "image", str);
                }
            }

            @Override // com.lynx.tasm.ui.image.d
            public final void a(int i2, int i3) {
                a.this.f56892a = i2;
                a.this.f56893b = i3;
            }
        };
        this.f56894c.a(str);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        m.a(runnable, drawable, j2);
    }
}
