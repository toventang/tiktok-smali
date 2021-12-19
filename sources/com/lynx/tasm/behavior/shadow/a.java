package com.lynx.tasm.behavior.shadow;

import android.view.Choreographer;
import com.bytedance.covode.number.Covode;

public class a implements c {
    static {
        Covode.recordClassIndex(34961);
    }

    @Override // com.lynx.tasm.behavior.shadow.c
    public final void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() {
            /* class com.lynx.tasm.behavior.shadow.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34962);
            }

            public final void doFrame(long j2) {
                runnable.run();
            }
        });
    }
}
