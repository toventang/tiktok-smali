package com.bytedance.ies.xelement.alphavideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.view.a;
import h.f.b.l;

public final class d extends a implements m {

    /* renamed from: a  reason: collision with root package name */
    Bitmap f36657a;

    /* renamed from: b  reason: collision with root package name */
    Bitmap f36658b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36659c;

    /* renamed from: d  reason: collision with root package name */
    private n f36660d = new n(this);

    /* renamed from: e  reason: collision with root package name */
    private boolean f36661e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36662f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f36663g = new Paint();

    /* renamed from: h  reason: collision with root package name */
    private RectF f36664h = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());

    static {
        Covode.recordClassIndex(22016);
    }

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        return this.f36660d;
    }

    public final boolean getMAutoPlay() {
        return this.f36659c;
    }

    public final boolean getMIsShowLastFrame() {
        return this.f36661e;
    }

    public final boolean getMIsShowPoster() {
        return this.f36662f;
    }

    public final Bitmap getMLastFrame() {
        return this.f36658b;
    }

    public final n getMLifecycleRegistry() {
        return this.f36660d;
    }

    public final Paint getMPaint() {
        return this.f36663g;
    }

    public final Bitmap getMPoster() {
        return this.f36657a;
    }

    public final RectF getMRectF() {
        return this.f36664h;
    }

    @Override // com.lynx.tasm.behavior.ui.view.a
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36659c) {
            this.f36660d.a(i.a.ON_RESUME);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.a
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36660d.a(i.a.ON_PAUSE);
    }

    public final void setMAutoPlay(boolean z) {
        this.f36659c = z;
    }

    public final void setMIsShowLastFrame(boolean z) {
        this.f36661e = z;
    }

    public final void setMIsShowPoster(boolean z) {
        this.f36662f = z;
    }

    public final void setMLastFrame(Bitmap bitmap) {
        this.f36658b = bitmap;
    }

    public final void setMPoster(Bitmap bitmap) {
        this.f36657a = bitmap;
    }

    public final void setMLifecycleRegistry(n nVar) {
        l.c(nVar, "");
        this.f36660d = nVar;
    }

    public final void setMPaint(Paint paint) {
        l.c(paint, "");
        this.f36663g = paint;
    }

    public final void setMRectF(RectF rectF) {
        l.c(rectF, "");
        this.f36664h = rectF;
    }

    public d(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f36657a;
        if (bitmap != null && this.f36662f) {
            this.f36664h.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            if (canvas == null) {
                l.a();
            }
            canvas.drawBitmap(this.f36657a, (Rect) null, this.f36664h, this.f36663g);
        } else if (this.f36658b != null && this.f36661e) {
            this.f36664h.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            if (canvas == null) {
                l.a();
            }
            canvas.drawBitmap(this.f36658b, (Rect) null, this.f36664h, this.f36663g);
        } else if (bitmap == null) {
            boolean z = this.f36661e;
        }
    }
}
