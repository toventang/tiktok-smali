package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;

public class BDASplashVideoView extends FrameLayout implements TextureView.SurfaceTextureListener, h {

    /* renamed from: a  reason: collision with root package name */
    private e f58818a;

    /* renamed from: b  reason: collision with root package name */
    private i f58819b;

    static {
        Covode.recordClassIndex(36417);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.ss.android.ad.splash.core.video2.h
    public final void a() {
        e eVar = this.f58818a;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.h
    public Surface getSurface() {
        e eVar = this.f58818a;
        if (eVar != null) {
            return eVar.getSurface();
        }
        return null;
    }

    @Override // com.ss.android.ad.splash.core.video2.h
    public Context getApplicationContext() {
        Context applicationContext = getContext().getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    @Override // com.ss.android.ad.splash.core.video2.h
    public void setVideoViewCallback(i iVar) {
        this.f58819b = iVar;
    }

    @Override // com.ss.android.ad.splash.core.video2.h
    public void setSurfaceLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            this.f58818a.setLayoutParams(layoutParams);
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.h
    public void setSurfaceViewVisibility(int i2) {
        e eVar = this.f58818a;
        if (eVar != null) {
            eVar.setVisibility(i2);
        }
    }

    public void setTextureViewOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f58818a.setOnTouchListener(onTouchListener);
    }

    public BDASplashVideoView(Context context) {
        super(context);
        MethodCollector.i(3727);
        a(context);
        MethodCollector.o(3727);
    }

    private void a(Context context) {
        e eVar = new e(context);
        this.f58818a = eVar;
        eVar.setSurfaceTextureListener(this);
        addView(this.f58818a, new FrameLayout.LayoutParams(-1, -1));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f58818a.setKeepScreenOn(false);
        i iVar = this.f58819b;
        if (iVar != null) {
            iVar.b(surfaceTexture);
        }
        e eVar = this.f58818a;
        if (!eVar.f58877b || !eVar.f58879d) {
            return true;
        }
        return false;
    }

    public BDASplashVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3998);
        a(context);
        MethodCollector.o(3998);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.f58818a.setKeepScreenOn(true);
        i iVar = this.f58819b;
        if (iVar != null) {
            iVar.a(surfaceTexture);
        }
    }
}
