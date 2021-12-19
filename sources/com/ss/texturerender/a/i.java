package com.ss.texturerender.a;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.ss.texturerender.g;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f151802a;

    static {
        Covode.recordClassIndex(101234);
    }

    public i() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        g.a("createFbo");
        this.f151802a = iArr[0];
    }

    public final int a(int i2) {
        GLES20.glBindFramebuffer(36160, this.f151802a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
            return -1;
        }
        return 0;
    }
}
