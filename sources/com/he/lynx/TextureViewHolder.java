package com.he.lynx;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class TextureViewHolder implements SurfaceHolder, TextureView.SurfaceTextureListener {
    private SurfaceHolder.Callback callback;
    private SurfaceTexture saved;
    private Surface surface;
    private final TextureView tv;

    static {
        Covode.recordClassIndex(34210);
    }

    public final Rect getSurfaceFrame() {
        return null;
    }

    public final boolean isCreating() {
        return false;
    }

    public final Canvas lockCanvas() {
        return null;
    }

    public final Canvas lockCanvas(Rect rect) {
        return null;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void setFixedSize(int i2, int i3) {
    }

    public final void setFormat(int i2) {
    }

    public final void setKeepScreenOn(boolean z) {
    }

    public final void setSizeFromLayout() {
    }

    public final void setType(int i2) {
    }

    public final void unlockCanvasAndPost(Canvas canvas) {
    }

    public final Surface getSurface() {
        return this.surface;
    }

    public final void releaseSurfaceTexture() {
        MethodCollector.i(5287);
        synchronized (this.tv) {
            try {
                SurfaceTexture surfaceTexture = this.saved;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.saved = null;
                }
            } finally {
                MethodCollector.o(5287);
            }
        }
    }

    public final void addCallback(SurfaceHolder.Callback callback2) {
        this.callback = callback2;
    }

    public final void removeCallback(SurfaceHolder.Callback callback2) {
        this.callback = null;
    }

    public TextureViewHolder(TextureView textureView) {
        this.tv = textureView;
        textureView.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (surfaceTexture != null && !surfaceTexture.isReleased()) {
            this.saved = surfaceTexture;
            this.surface = new Surface(surfaceTexture);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z;
        MethodCollector.i(5533);
        synchronized (this.tv) {
            try {
                if (this.saved != surfaceTexture) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.o(5533);
            }
        }
        return z;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        SurfaceHolder.Callback callback2 = this.callback;
        if (callback2 != null) {
            callback2.surfaceChanged(this, 0, i2, i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        r4.surface = new android.view.Surface(r5);
        r1 = r4.tv;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.saved = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r0 = r4.callback;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r0 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r0.surfaceCreated(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5529);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r5, int r6, int r7) {
        /*
            r4 = this;
            r3 = 5529(0x1599, float:7.748E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            android.view.TextureView r2 = r4.tv
            monitor-enter(r2)
            android.graphics.SurfaceTexture r0 = r4.saved     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isReleased()     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0020
            android.graphics.SurfaceTexture r1 = r4.saved     // Catch:{ all -> 0x003f }
            if (r1 == r5) goto L_0x0020
            android.view.TextureView r0 = r4.tv     // Catch:{ all -> 0x003f }
            r0.setSurfaceTexture(r1)     // Catch:{ all -> 0x003f }
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0020:
            monitor-exit(r2)
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r5)
            r4.surface = r0
            android.view.TextureView r1 = r4.tv
            monitor-enter(r1)
            r4.saved = r5     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            android.view.SurfaceHolder$Callback r0 = r4.callback
            if (r0 == 0) goto L_0x0035
            r0.surfaceCreated(r4)
        L_0x0035:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x003f:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.he.lynx.TextureViewHolder.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }
}
