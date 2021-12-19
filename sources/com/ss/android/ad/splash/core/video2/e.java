package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class e extends TextureView {

    /* renamed from: a  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f58876a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f58877b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f58878c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f58879d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f58880e;

    /* renamed from: f  reason: collision with root package name */
    public Surface f58881f;

    /* renamed from: g  reason: collision with root package name */
    public SurfaceTexture f58882g;

    /* renamed from: h  reason: collision with root package name */
    private final String f58883h;

    /* renamed from: i  reason: collision with root package name */
    private Context f58884i;

    /* renamed from: j  reason: collision with root package name */
    private int f58885j;

    /* renamed from: k  reason: collision with root package name */
    private int f58886k;

    static {
        Covode.recordClassIndex(36445);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
    }

    public final Surface getSurface() {
        return this.f58881f;
    }

    public final void a() {
        this.f58878c = false;
        this.f58879d = false;
        this.f58881f = null;
        this.f58882g = null;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f58876a = surfaceTextureListener;
    }

    public e(Context context) {
        this(context, (byte) 0);
    }

    private e(Context context, byte b2) {
        super(context, null);
        MethodCollector.i(1893);
        this.f58883h = "TextureVideoView";
        this.f58877b = true;
        this.f58884i = context;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f58886k = displayMetrics.heightPixels;
        this.f58885j = displayMetrics.widthPixels;
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.ad.splash.core.video2.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36446);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (e.this.f58876a != null) {
                    e.this.f58876a.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (e.this.f58877b && !e.this.f58878c && e.this.f58881f != null) {
                    e.this.f58881f.release();
                    e.this.f58881f = null;
                    e.this.f58882g = null;
                }
                e.this.f58880e = false;
                if (e.this.f58876a == null || !e.this.f58876a.onSurfaceTextureDestroyed(surfaceTexture)) {
                    return false;
                }
                e.this.a();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                if (e.this.f58876a != null) {
                    e.this.f58876a.onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                if (e.this.f58877b) {
                    e.this.f58879d = true;
                    if (e.this.f58881f != null && (!e.this.f58878c || !e.this.f58881f.isValid())) {
                        e.this.f58881f.release();
                        e.this.f58881f = null;
                        e.this.f58882g = null;
                    }
                    if (e.this.f58881f == null) {
                        e.this.f58881f = new Surface(surfaceTexture);
                        e.this.f58882g = surfaceTexture;
                    } else {
                        try {
                            int i4 = Build.VERSION.SDK_INT;
                            if (e.this.f58882g != null) {
                                e eVar = e.this;
                                eVar.setSurfaceTexture(eVar.f58882g);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    e.this.f58880e = true;
                    e.this.f58878c = true;
                } else {
                    e.this.f58881f = new Surface(surfaceTexture);
                    e.this.f58882g = surfaceTexture;
                }
                if (e.this.f58876a != null) {
                    e.this.f58876a.onSurfaceTextureAvailable(e.this.f58882g, i2, i3);
                }
            }
        });
        MethodCollector.o(1893);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }
}
