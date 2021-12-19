package com.ss.android.ugc.aweme.shortvideo.preview.a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

final class b implements SurfaceHolder {

    /* renamed from: a  reason: collision with root package name */
    public boolean f129599a;

    /* renamed from: b  reason: collision with root package name */
    public int f129600b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f129601c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f129602d = -1;

    /* renamed from: e  reason: collision with root package name */
    public List<SurfaceHolder.Callback> f129603e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final SurfaceHolder f129604f;

    /* renamed from: g  reason: collision with root package name */
    private SurfaceHolder.Callback f129605g;

    static {
        Covode.recordClassIndex(85072);
    }

    public final void setType(int i2) {
    }

    public final Surface getSurface() {
        return this.f129604f.getSurface();
    }

    public final Rect getSurfaceFrame() {
        return this.f129604f.getSurfaceFrame();
    }

    public final boolean isCreating() {
        return this.f129604f.isCreating();
    }

    public final Canvas lockCanvas() {
        return this.f129604f.lockCanvas();
    }

    public final void setSizeFromLayout() {
        this.f129604f.setSizeFromLayout();
    }

    public final void removeCallback(SurfaceHolder.Callback callback) {
        this.f129603e.remove(callback);
    }

    public final void setFormat(int i2) {
        this.f129604f.setFormat(i2);
    }

    public final void setKeepScreenOn(boolean z) {
        this.f129604f.setKeepScreenOn(z);
    }

    public final void unlockCanvasAndPost(Canvas canvas) {
        this.f129604f.unlockCanvasAndPost(canvas);
    }

    public final Canvas lockCanvas(Rect rect) {
        return this.f129604f.lockCanvas(rect);
    }

    public b(SurfaceHolder surfaceHolder) {
        AnonymousClass1 r0 = new SurfaceHolder.Callback() {
            /* class com.ss.android.ugc.aweme.shortvideo.preview.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(85073);
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                b.this.f129599a = true;
                for (SurfaceHolder.Callback callback : b.this.f129603e) {
                    callback.surfaceCreated(surfaceHolder);
                }
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                b.this.f129599a = false;
                for (SurfaceHolder.Callback callback : b.this.f129603e) {
                    callback.surfaceDestroyed(surfaceHolder);
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                b.this.f129600b = i2;
                b.this.f129601c = i3;
                b.this.f129602d = i4;
                for (SurfaceHolder.Callback callback : b.this.f129603e) {
                    callback.surfaceChanged(surfaceHolder, i2, i3, i4);
                }
            }
        };
        this.f129605g = r0;
        this.f129604f = surfaceHolder;
        surfaceHolder.addCallback(r0);
    }

    public final void addCallback(SurfaceHolder.Callback callback) {
        int i2;
        int i3;
        if (!this.f129603e.contains(callback)) {
            this.f129603e.add(callback);
        }
        if (this.f129599a) {
            callback.surfaceCreated(this);
            int i4 = this.f129600b;
            if (i4 != -1 && (i2 = this.f129601c) != -1 && (i3 = this.f129602d) != -1) {
                callback.surfaceChanged(this, i4, i2, i3);
            }
        }
    }

    public final void setFixedSize(int i2, int i3) {
        this.f129604f.setFixedSize(i2, i3);
    }
}
