package com.ss.bytertc.engine.utils;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TextureHelper$$Lambda$5 implements Runnable {
    private final int arg$1;

    static {
        Covode.recordClassIndex(101066);
    }

    TextureHelper$$Lambda$5(int i2) {
        this.arg$1 = i2;
    }

    public final void run() {
        GLES20.glDeleteTextures(1, new int[]{this.arg$1}, 0);
    }
}
