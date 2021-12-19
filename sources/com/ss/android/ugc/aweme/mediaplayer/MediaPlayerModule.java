package com.ss.android.ugc.aweme.mediaplayer;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public class MediaPlayerModule implements TextureView.SurfaceTextureListener, au {

    /* renamed from: a  reason: collision with root package name */
    public String f109434a;

    /* renamed from: b  reason: collision with root package name */
    public a f109435b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f109436c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f109437d;

    /* renamed from: e  reason: collision with root package name */
    boolean f109438e;

    /* renamed from: f  reason: collision with root package name */
    g f109439f;

    /* renamed from: g  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f109440g;

    /* renamed from: h  reason: collision with root package name */
    public t<h> f109441h;

    static {
        Covode.recordClassIndex(70080);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        b();
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_RESUME)
    public void onResume() {
        a();
    }

    public final void a() {
        if (!this.f109436c && !this.f109437d) {
            this.f109435b.c();
            this.f109441h.postValue(new h(4, true));
        }
    }

    public final void b() {
        this.f109435b.b();
        this.f109441h.postValue(new h(3, true));
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f109435b.b();
        this.f109435b.d();
        this.f109435b.e();
        this.f109441h.postValue(new h(6, true));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f109440g;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        this.f109435b.d();
        this.f109441h.postValue(new h(5, true));
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f109440g;
        if (surfaceTextureListener != null) {
            return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return false;
    }

    public MediaPlayerModule(a aVar, g gVar) {
        t<h> tVar = new t<>();
        this.f109441h = tVar;
        this.f109435b = aVar;
        this.f109439f = gVar;
        tVar.observeForever(new b(this));
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f109440g;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f109440g;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i2, i3);
        }
        b.i.b(new c(this), b.i.f4824a).a(new d(this), b.i.f4826c, null).a((g) new e(this, surfaceTexture)).a(new f(this), b.i.f4826c, null);
    }
}
