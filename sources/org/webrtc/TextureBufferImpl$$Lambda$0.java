package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TextureBufferImpl$$Lambda$0 implements Callable {
    private final TextureBufferImpl arg$1;

    static {
        Covode.recordClassIndex(106679);
    }

    TextureBufferImpl$$Lambda$0(TextureBufferImpl textureBufferImpl) {
        this.arg$1 = textureBufferImpl;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.arg$1.lambda$toI420$0$TextureBufferImpl();
    }
}
