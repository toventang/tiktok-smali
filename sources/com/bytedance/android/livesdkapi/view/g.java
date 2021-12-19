package com.bytedance.android.livesdkapi.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.chatroom.g.d;
import com.bytedance.covode.number.Covode;

public final class g extends TextureRenderView {

    /* renamed from: a  reason: collision with root package name */
    public SurfaceTexture f23377a;

    /* renamed from: b  reason: collision with root package name */
    public Surface f23378b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23379c;

    /* renamed from: d  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f23380d;

    static {
        Covode.recordClassIndex(13903);
    }

    public final Surface getSurface() {
        return this.f23378b;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        SurfaceTexture surfaceTexture = this.f23377a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f23377a = null;
        }
        Surface surface = this.f23378b;
        if (surface != null) {
            surface.release();
            this.f23378b = null;
        }
    }

    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f23380d = surfaceTextureListener;
    }

    public g(Context context) {
        this(context, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        Surface surface;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            a.a(4, "KeepSurfaceTextureRenderView", "resume");
            if (this.f23377a == null || (surface = this.f23378b) == null || !surface.isValid()) {
                b();
            } else if (this.f23379c) {
            } else {
                if (this.f23377a != getSurfaceTexture()) {
                    try {
                        int i3 = Build.VERSION.SDK_INT;
                        setSurfaceTexture(this.f23377a);
                    } catch (Exception unused) {
                    }
                    this.f23379c = true;
                    TextureView.SurfaceTextureListener surfaceTextureListener = this.f23380d;
                    if (surfaceTextureListener != null) {
                        surfaceTextureListener.onSurfaceTextureAvailable(this.f23377a, getWidth(), getHeight());
                        return;
                    }
                    return;
                }
                b();
            }
        }
    }

    private g(Context context, byte b2) {
        this(context, (char) 0);
    }

    private g(Context context, char c2) {
        super(context, null, (byte) 0);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.bytedance.android.livesdkapi.view.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13904);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (g.this.f23380d != null) {
                    g.this.f23380d.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                d.a("KeepSurfaceTextureRenderView", "onSurfaceTextureDestroyed");
                g.this.f23379c = false;
                if (g.this.f23380d != null && !g.this.f23380d.onSurfaceTextureDestroyed(surfaceTexture)) {
                    return false;
                }
                g.this.b();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                d.a("KeepSurfaceTextureRenderView", "onSurfaceTextureSizeChanged");
                if (g.this.f23380d != null) {
                    g.this.f23380d.onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                d.a("KeepSurfaceTextureRenderView", "onSurfaceTextureAvailable");
                g.this.b();
                if (g.this.f23377a == null) {
                    g.this.f23377a = surfaceTexture;
                    g.this.f23378b = new Surface(g.this.f23377a);
                }
                g.this.f23379c = true;
                if (g.this.f23380d != null) {
                    g.this.f23380d.onSurfaceTextureAvailable(g.this.f23377a, i2, i3);
                }
            }
        });
    }
}
