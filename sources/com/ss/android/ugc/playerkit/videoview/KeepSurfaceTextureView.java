package com.ss.android.ugc.playerkit.videoview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.m.a;
import com.ss.android.ugc.aweme.feed.m.b;
import com.ss.android.ugc.aweme.player.sdk.api.o;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import com.ss.android.ugc.playerkit.model.c;
import h.a.n;
import h.f.b.l;
import h.m.p;

public class KeepSurfaceTextureView extends TextureView {

    /* renamed from: a  reason: collision with root package name */
    private boolean f148875a;

    /* renamed from: c  reason: collision with root package name */
    public SurfaceTexture f148876c;

    /* renamed from: d  reason: collision with root package name */
    public SurfaceWrapper f148877d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f148878e;

    /* renamed from: f  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f148879f;

    static {
        Covode.recordClassIndex(98040);
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public Surface getSurface() {
        return this.f148877d;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f148875a = true;
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT > 19 || !c.f148702a.shouldForceToKeepSurfaceBelowKITKAT()) {
            return false;
        }
        return true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (d()) {
            a(true);
        }
        this.f148875a = false;
    }

    public final void c() {
        SurfaceWrapper surfaceWrapper;
        if (this.f148876c == null || (surfaceWrapper = this.f148877d) == null || !surfaceWrapper.isValid()) {
            a(!d());
        } else if (this.f148878e) {
        } else {
            if (this.f148876c != getSurfaceTexture()) {
                setSurfaceTexture(this.f148876c);
                this.f148878e = true;
                TextureView.SurfaceTextureListener surfaceTextureListener = this.f148879f;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(this.f148876c, getWidth(), getHeight());
                    return;
                }
                return;
            }
            a(!d());
        }
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f148879f = surfaceTextureListener;
    }

    public KeepSurfaceTextureView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0 && this.f148875a) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        SurfaceWrapper surfaceWrapper;
        o oVar;
        SurfaceTexture surfaceTexture = this.f148876c;
        if (surfaceTexture != null && z) {
            surfaceTexture.release();
            this.f148876c = null;
        }
        if (!(c.f148702a == null || !c.f148702a.isEnableSurfaceLifeCycleNotification() || (surfaceWrapper = this.f148877d) == null || surfaceWrapper.f115441a == null || (oVar = this.f148877d.f115441a.get()) == null)) {
            oVar.b(this.f148877d);
        }
        SurfaceWrapper surfaceWrapper2 = this.f148877d;
        if (surfaceWrapper2 != null) {
            surfaceWrapper2.release();
            this.f148877d = null;
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            try {
                if (b.f93600a == null) {
                    b.f93600a = Boolean.valueOf(SettingsManager.a().a("video_textureView_monitor", true));
                }
                Boolean bool = b.f93600a;
                if (bool == null) {
                    l.b();
                }
                if (bool.booleanValue() && a.f93595a > 0 && a.f93596b > 0 && layoutParams.height > 0) {
                    if (layoutParams.width > 0) {
                        if (!(a.f93595a == layoutParams.width && a.f93596b == layoutParams.height)) {
                            String stackTraceString = Log.getStackTraceString(new Throwable());
                            l.b(stackTraceString, "");
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("VideoTextureViewMonitor>>>pageWidth:" + a.f93595a + " , pageHeight:" + a.f93596b + ",  pageWidth:" + a.f93595a + ", pageHeight:" + a.f93596b + " , videoWidth:" + a.f93597c + ", videoHeight:" + a.f93598d + ' ' + "\n");
                            int i2 = 0;
                            for (Object obj : p.c(stackTraceString, new String[]{"\n"})) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    n.a();
                                }
                                String str = (String) obj;
                                if (i2 < 15) {
                                    stringBuffer.append(str + "\n");
                                }
                                i2 = i3;
                            }
                            com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoTextureViewMonitor", stringBuffer.toString());
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(6510);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(98041);
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                KeepSurfaceTextureView.this.f148878e = false;
                if (KeepSurfaceTextureView.this.f148879f == null || !KeepSurfaceTextureView.this.f148879f.onSurfaceTextureDestroyed(surfaceTexture) || KeepSurfaceTextureView.d()) {
                    return false;
                }
                KeepSurfaceTextureView.this.a(true);
                return true;
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (KeepSurfaceTextureView.this.f148879f != null) {
                    KeepSurfaceTextureView.this.f148879f.onSurfaceTextureUpdated(surfaceTexture);
                }
                if (c.f148702a != null && c.f148702a.isEnableSurfaceLifeCycleNotification() && KeepSurfaceTextureView.this.f148877d != null && KeepSurfaceTextureView.this.f148877d.f115441a != null) {
                    KeepSurfaceTextureView.this.f148877d.f115441a.get();
                }
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                if (KeepSurfaceTextureView.this.f148879f != null) {
                    KeepSurfaceTextureView.this.f148879f.onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                if (surfaceTexture != KeepSurfaceTextureView.this.f148876c) {
                    KeepSurfaceTextureView.this.a(true);
                }
                if (KeepSurfaceTextureView.this.f148876c == null) {
                    KeepSurfaceTextureView.this.f148876c = surfaceTexture;
                    KeepSurfaceTextureView.this.f148877d = new SurfaceWrapper(KeepSurfaceTextureView.this.f148876c);
                }
                KeepSurfaceTextureView.this.f148878e = true;
                if (KeepSurfaceTextureView.this.f148879f != null) {
                    KeepSurfaceTextureView.this.f148879f.onSurfaceTextureAvailable(KeepSurfaceTextureView.this.f148876c, i2, i3);
                }
                if (c.f148702a != null && c.f148702a.isEnableSurfaceLifeCycleNotification() && KeepSurfaceTextureView.this.f148877d != null && KeepSurfaceTextureView.this.f148877d.f115441a != null) {
                    KeepSurfaceTextureView.this.f148877d.f115441a.get();
                }
            }
        });
        MethodCollector.o(6510);
    }
}
