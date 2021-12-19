package com.ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TextureHelper$$Lambda$6 implements Callable {
    private final TextureHelper arg$1;
    private final int arg$2;
    private final int arg$3;
    private final int arg$4;

    static {
        Covode.recordClassIndex(101067);
    }

    TextureHelper$$Lambda$6(TextureHelper textureHelper, int i2, int i3, int i4) {
        this.arg$1 = textureHelper;
        this.arg$2 = i2;
        this.arg$3 = i3;
        this.arg$4 = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.arg$1.lambda$generateTexture$6$TextureHelper(this.arg$2, this.arg$3, this.arg$4);
    }
}
