package com.ss.android.ugc.aweme.mediaplayer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final MediaPlayerModule f109445a;

    /* renamed from: b  reason: collision with root package name */
    private final SurfaceTexture f109446b;

    static {
        Covode.recordClassIndex(70085);
    }

    e(MediaPlayerModule mediaPlayerModule, SurfaceTexture surfaceTexture) {
        this.f109445a = mediaPlayerModule;
        this.f109446b = surfaceTexture;
    }

    @Override // b.g
    public final Object then(i iVar) {
        MediaPlayerModule mediaPlayerModule = this.f109445a;
        SurfaceTexture surfaceTexture = this.f109446b;
        if (iVar.c() || iVar.b() || ((Integer) iVar.d()).intValue() < 0) {
            return null;
        }
        Surface surface = new Surface(surfaceTexture);
        mediaPlayerModule.f109435b.a();
        surface.release();
        return true;
    }
}
