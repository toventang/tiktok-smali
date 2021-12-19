package com.ss.android.ugc.aweme.im.sdk.common.ui.widget;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class KeepSurfaceTextureView extends TextureView {

    /* renamed from: a  reason: collision with root package name */
    public SurfaceTexture f102548a;

    /* renamed from: b  reason: collision with root package name */
    public Surface f102549b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f102550c;

    /* renamed from: d  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f102551d;

    static {
        Covode.recordClassIndex(65673);
    }

    public Surface getSurface() {
        return this.f102549b;
    }

    public final void a() {
        SurfaceTexture surfaceTexture = this.f102548a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f102548a = null;
        }
        Surface surface = this.f102549b;
        if (surface != null) {
            surface.release();
            this.f102549b = null;
        }
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f102551d = surfaceTextureListener;
    }

    public void setClipBorder(final float f2) {
        if (Build.VERSION.SDK_INT > 20) {
            setOutlineProvider(new ViewOutlineProvider() {
                /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.KeepSurfaceTextureView.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(65675);
                }

                public final void getOutline(View view, Outline outline) {
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), f2);
                }
            });
            setClipToOutline(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        Surface surface;
        super.onWindowVisibilityChanged(i2);
        if (i2 != 0) {
            return;
        }
        if (this.f102548a == null || (surface = this.f102549b) == null || !surface.isValid()) {
            a();
        } else if (this.f102550c) {
        } else {
            if (this.f102548a != getSurfaceTexture()) {
                setSurfaceTexture(this.f102548a);
                this.f102550c = true;
                TextureView.SurfaceTextureListener surfaceTextureListener = this.f102551d;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(this.f102548a, getWidth(), getHeight());
                    return;
                }
                return;
            }
            a();
        }
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private KeepSurfaceTextureView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8059);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.KeepSurfaceTextureView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(65674);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (KeepSurfaceTextureView.this.f102551d != null) {
                    KeepSurfaceTextureView.this.f102551d.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                KeepSurfaceTextureView.this.f102550c = false;
                if (KeepSurfaceTextureView.this.f102551d == null || !KeepSurfaceTextureView.this.f102551d.onSurfaceTextureDestroyed(surfaceTexture)) {
                    return false;
                }
                KeepSurfaceTextureView.this.a();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                if (KeepSurfaceTextureView.this.f102551d != null) {
                    KeepSurfaceTextureView.this.f102551d.onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                KeepSurfaceTextureView.this.a();
                if (KeepSurfaceTextureView.this.f102548a == null) {
                    KeepSurfaceTextureView.this.f102548a = surfaceTexture;
                    KeepSurfaceTextureView.this.f102549b = new Surface(KeepSurfaceTextureView.this.f102548a);
                }
                KeepSurfaceTextureView.this.f102550c = true;
                if (KeepSurfaceTextureView.this.f102551d != null) {
                    KeepSurfaceTextureView.this.f102551d.onSurfaceTextureAvailable(KeepSurfaceTextureView.this.f102548a, i2, i3);
                }
            }
        });
        MethodCollector.o(8059);
    }
}
