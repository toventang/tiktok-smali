package com.ss.bytertc.engine.utils;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TextureHelper$$Lambda$2 implements Callable {
    private final EglBase.Context arg$1;
    private final Handler arg$2;
    private final int arg$3;
    private final int arg$4;
    private final String arg$5;

    static {
        Covode.recordClassIndex(101063);
    }

    TextureHelper$$Lambda$2(EglBase.Context context, Handler handler, int i2, int i3, String str) {
        this.arg$1 = context;
        this.arg$2 = handler;
        this.arg$3 = i2;
        this.arg$4 = i3;
        this.arg$5 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return TextureHelper.lambda$create$2$TextureHelper(this.arg$1, this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}
