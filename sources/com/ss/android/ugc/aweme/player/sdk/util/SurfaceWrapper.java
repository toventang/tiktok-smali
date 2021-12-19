package com.ss.android.ugc.aweme.player.sdk.util;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.o;
import java.lang.ref.WeakReference;

public final class SurfaceWrapper extends Surface {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<o> f115441a;

    static {
        Covode.recordClassIndex(74107);
    }

    public SurfaceWrapper(SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
    }
}
