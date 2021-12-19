package com.ss.android.ugc.aweme.story.base.widget.surfaceView;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a implements SurfaceHolder {

    /* renamed from: a  reason: collision with root package name */
    public boolean f136942a;

    /* renamed from: b  reason: collision with root package name */
    public int f136943b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f136944c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f136945d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final List<SurfaceHolder.Callback> f136946e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final SurfaceHolder.Callback f136947f;

    /* renamed from: g  reason: collision with root package name */
    private final SurfaceHolder f136948g;

    static {
        Covode.recordClassIndex(89505);
    }

    public final void setType(int i2) {
    }

    public final boolean isCreating() {
        return this.f136948g.isCreating();
    }

    public final void setSizeFromLayout() {
        this.f136948g.setSizeFromLayout();
    }

    public final Surface getSurface() {
        Surface surface = this.f136948g.getSurface();
        l.b(surface, "");
        return surface;
    }

    public final Rect getSurfaceFrame() {
        Rect surfaceFrame = this.f136948g.getSurfaceFrame();
        l.b(surfaceFrame, "");
        return surfaceFrame;
    }

    public final Canvas lockCanvas() {
        Canvas lockCanvas = this.f136948g.lockCanvas();
        l.b(lockCanvas, "");
        return lockCanvas;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.widget.surfaceView.a$a  reason: collision with other inner class name */
    public static final class SurfaceHolder$CallbackC3580a implements SurfaceHolder.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f136949a;

        static {
            Covode.recordClassIndex(89506);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        SurfaceHolder$CallbackC3580a(a aVar) {
            this.f136949a = aVar;
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            l.d(surfaceHolder, "");
            this.f136949a.f136942a = true;
            for (SurfaceHolder.Callback callback : new ArrayList(this.f136949a.f136946e)) {
                callback.surfaceCreated(surfaceHolder);
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            l.d(surfaceHolder, "");
            this.f136949a.f136942a = false;
            for (SurfaceHolder.Callback callback : new ArrayList(this.f136949a.f136946e)) {
                callback.surfaceDestroyed(surfaceHolder);
            }
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            l.d(surfaceHolder, "");
            this.f136949a.f136943b = i2;
            this.f136949a.f136944c = i3;
            this.f136949a.f136945d = i4;
            for (SurfaceHolder.Callback callback : new ArrayList(this.f136949a.f136946e)) {
                callback.surfaceChanged(surfaceHolder, i2, i3, i4);
            }
        }
    }

    public final void setFormat(int i2) {
        this.f136948g.setFormat(i2);
    }

    public final void setKeepScreenOn(boolean z) {
        this.f136948g.setKeepScreenOn(z);
    }

    public final void removeCallback(SurfaceHolder.Callback callback) {
        l.d(callback, "");
        this.f136946e.remove(callback);
    }

    public final void unlockCanvasAndPost(Canvas canvas) {
        l.d(canvas, "");
        this.f136948g.unlockCanvasAndPost(canvas);
    }

    public final Canvas lockCanvas(Rect rect) {
        l.d(rect, "");
        Canvas lockCanvas = this.f136948g.lockCanvas(rect);
        l.b(lockCanvas, "");
        return lockCanvas;
    }

    public a(SurfaceHolder surfaceHolder) {
        l.d(surfaceHolder, "");
        this.f136948g = surfaceHolder;
        SurfaceHolder$CallbackC3580a aVar = new SurfaceHolder$CallbackC3580a(this);
        this.f136947f = aVar;
        surfaceHolder.addCallback(aVar);
    }

    public final void addCallback(SurfaceHolder.Callback callback) {
        int i2;
        int i3;
        l.d(callback, "");
        if (!this.f136946e.contains(callback)) {
            this.f136946e.add(callback);
        }
        if (this.f136942a) {
            callback.surfaceCreated(this);
            int i4 = this.f136943b;
            if (i4 != -1 && (i2 = this.f136944c) != -1 && (i3 = this.f136945d) != -1) {
                callback.surfaceChanged(this, i4, i2, i3);
            }
        }
    }

    public final void setFixedSize(int i2, int i3) {
        this.f136948g.setFixedSize(i2, i3);
    }
}
