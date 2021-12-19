package com.ttnet.org.chromium.base.task;

import android.view.Choreographer;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class e implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Choreographer f155317a;

    static {
        Covode.recordClassIndex(103344);
    }

    @Override // com.ttnet.org.chromium.base.task.n
    public final void a() {
    }

    @Override // com.ttnet.org.chromium.base.task.n
    public final void b() {
    }

    @Override // com.ttnet.org.chromium.base.task.n
    public final void c() {
    }

    e(Choreographer choreographer) {
        this.f155317a = choreographer;
    }

    @Override // com.ttnet.org.chromium.base.task.n
    public final void a(final Runnable runnable, long j2) {
        this.f155317a.postFrameCallbackDelayed(new Choreographer.FrameCallback() {
            /* class com.ttnet.org.chromium.base.task.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103345);
            }

            public final void doFrame(long j2) {
                runnable.run();
            }
        }, 0);
    }
}
