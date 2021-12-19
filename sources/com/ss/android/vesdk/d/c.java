package com.ss.android.vesdk.d;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.i;
import com.ss.android.vesdk.d.b;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public Surface f151259a;

    /* renamed from: b  reason: collision with root package name */
    public int f151260b;

    static {
        Covode.recordClassIndex(99428);
    }

    @Override // com.ss.android.vesdk.d.b
    public final boolean b() {
        if (!super.b() || this.f151259a == null) {
            return false;
        }
        return true;
    }

    public c(TEFrameSizei tEFrameSizei, b.a aVar, int i2, SurfaceTexture surfaceTexture, Surface surface) {
        super(i.b.PIXEL_FORMAT_Recorder, tEFrameSizei, aVar, surfaceTexture);
        this.f151259a = surface;
        this.f151260b = i2;
    }
}
