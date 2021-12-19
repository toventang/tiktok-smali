package com.google.android.material.c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.android.material.c.d;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f52358a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f52359b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f52360c;

    /* renamed from: d  reason: collision with root package name */
    private final a f52361d;

    /* renamed from: e  reason: collision with root package name */
    private final View f52362e;

    /* renamed from: f  reason: collision with root package name */
    private final Path f52363f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f52364g;

    /* renamed from: h  reason: collision with root package name */
    private d.C1219d f52365h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f52366i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f52367j;

    public interface a {
        static {
            Covode.recordClassIndex(32492);
        }

        void a(Canvas canvas);

        boolean c();
    }

    private boolean h() {
        if (this.f52366i || this.f52360c == null || this.f52365h == null) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(32491);
        if (Build.VERSION.SDK_INT >= 21) {
            f52358a = 2;
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        f52358a = 1;
    }

    private boolean f() {
        boolean z;
        d.C1219d dVar = this.f52365h;
        if (dVar == null || dVar.a()) {
            z = true;
        } else {
            z = false;
        }
        if (f52358a == 0) {
            if (z || !this.f52367j) {
                return false;
            }
            return true;
        } else if (!z) {
            return true;
        } else {
            return false;
        }
    }

    private boolean g() {
        if (this.f52366i || Color.alpha(this.f52359b.getColor()) == 0) {
            return false;
        }
        return true;
    }

    public final d.C1219d c() {
        if (this.f52365h == null) {
            return null;
        }
        d.C1219d dVar = new d.C1219d(this.f52365h);
        if (dVar.a()) {
            dVar.f52374c = b(dVar);
        }
        return dVar;
    }

    public final boolean d() {
        if (!this.f52361d.c() || f()) {
            return false;
        }
        return true;
    }

    private void e() {
        if (f52358a == 1) {
            this.f52363f.rewind();
            d.C1219d dVar = this.f52365h;
            if (dVar != null) {
                this.f52363f.addCircle(dVar.f52372a, this.f52365h.f52373b, this.f52365h.f52374c, Path.Direction.CW);
            }
        }
        this.f52362e.invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r5 != null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r7 = this;
            r6 = 2476(0x9ac, float:3.47E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            int r0 = com.google.android.material.c.c.f52358a
            if (r0 != 0) goto L_0x005a
            r4 = 1
            r7.f52366i = r4
            r3 = 0
            r7.f52367j = r3
            android.view.View r0 = r7.f52362e
            r0.buildDrawingCache()
            android.view.View r0 = r7.f52362e
            android.graphics.Bitmap r5 = r0.getDrawingCache()
            if (r5 != 0) goto L_0x004a
            android.view.View r0 = r7.f52362e
            int r0 = r0.getWidth()
            if (r0 == 0) goto L_0x0056
            android.view.View r0 = r7.f52362e
            int r0 = r0.getHeight()
            if (r0 == 0) goto L_0x0056
            android.view.View r0 = r7.f52362e
            int r2 = r0.getWidth()
            android.view.View r0 = r7.f52362e
            int r1 = r0.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r5)
            android.view.View r0 = r7.f52362e
            r0.draw(r1)
            if (r5 == 0) goto L_0x0056
        L_0x004a:
            android.graphics.Paint r2 = r7.f52364g
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            r1.<init>(r5, r0, r0)
            r2.setShader(r1)
        L_0x0056:
            r7.f52366i = r3
            r7.f52367j = r4
        L_0x005a:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.c.c.a():void");
    }

    public final void b() {
        if (f52358a == 0) {
            this.f52367j = false;
            this.f52362e.destroyDrawingCache();
            this.f52364g.setShader(null);
            this.f52362e.invalidate();
        }
    }

    public final void a(Drawable drawable) {
        this.f52360c = drawable;
        this.f52362e.invalidate();
    }

    public final void a(int i2) {
        this.f52359b.setColor(i2);
        this.f52362e.invalidate();
    }

    private float b(d.C1219d dVar) {
        return com.google.android.material.e.a.a(dVar.f52372a, dVar.f52373b, (float) this.f52362e.getWidth(), (float) this.f52362e.getHeight());
    }

    private void b(Canvas canvas) {
        if (h()) {
            Rect bounds = this.f52360c.getBounds();
            float width = this.f52365h.f52372a - (((float) bounds.width()) / 2.0f);
            float height = this.f52365h.f52373b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f52360c.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    public final void a(d.C1219d dVar) {
        if (dVar == null) {
            this.f52365h = null;
        } else {
            d.C1219d dVar2 = this.f52365h;
            if (dVar2 == null) {
                this.f52365h = new d.C1219d(dVar);
            } else {
                dVar2.a(dVar);
            }
            if (com.google.android.material.e.a.a(dVar.f52374c, b(dVar))) {
                this.f52365h.f52374c = Float.MAX_VALUE;
            }
        }
        e();
    }

    public final void a(Canvas canvas) {
        if (f()) {
            int i2 = f52358a;
            if (i2 == 0) {
                canvas.drawCircle(this.f52365h.f52372a, this.f52365h.f52373b, this.f52365h.f52374c, this.f52364g);
                if (g()) {
                    canvas.drawCircle(this.f52365h.f52372a, this.f52365h.f52373b, this.f52365h.f52374c, this.f52359b);
                }
            } else if (i2 == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f52363f);
                this.f52361d.a(canvas);
                if (g()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f52362e.getWidth(), (float) this.f52362e.getHeight(), this.f52359b);
                }
                canvas.restoreToCount(save);
            } else if (i2 == 2) {
                this.f52361d.a(canvas);
                if (g()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f52362e.getWidth(), (float) this.f52362e.getHeight(), this.f52359b);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy " + i2);
            }
        } else {
            this.f52361d.a(canvas);
            if (g()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f52362e.getWidth(), (float) this.f52362e.getHeight(), this.f52359b);
            }
        }
        b(canvas);
    }
}
