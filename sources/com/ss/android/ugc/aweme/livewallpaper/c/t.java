package com.ss.android.ugc.aweme.livewallpaper.c;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.covode.number.Covode;

public final class t extends e {

    /* renamed from: b  reason: collision with root package name */
    private Surface f108868b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f108869c;

    static {
        Covode.recordClassIndex(69716);
    }

    public t(d dVar, SurfaceTexture surfaceTexture) {
        super(dVar);
        a(surfaceTexture);
    }

    public t(d dVar, Surface surface) {
        super(dVar);
        a(surface);
        this.f108868b = surface;
        this.f108869c = true;
    }
}
