package com.bytedance.android.ecommerce.ocr.a;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public SurfaceHolder f7212a;

    /* renamed from: b  reason: collision with root package name */
    public SurfaceTexture f7213b;

    static {
        Covode.recordClassIndex(3464);
    }

    public e(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f7213b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public e(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f7212a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }
}
