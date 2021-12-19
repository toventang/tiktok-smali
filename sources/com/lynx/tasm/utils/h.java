package com.lynx.tasm.utils;

import android.os.Build;
import android.view.Choreographer;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<a> f57034a;

    /* renamed from: b  reason: collision with root package name */
    public Choreographer f57035b;

    /* renamed from: c  reason: collision with root package name */
    public final Choreographer.FrameCallback f57036c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f57037d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f57038e;

    public interface a {
        static {
            Covode.recordClassIndex(35479);
        }

        void OnVSync(long j2);
    }

    static {
        Covode.recordClassIndex(35477);
    }

    public final void b() {
        Choreographer choreographer = this.f57035b;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this.f57036c);
        }
        this.f57037d = false;
    }

    public final void a() {
        if (!this.f57037d) {
            Choreographer choreographer = this.f57035b;
            if (choreographer != null) {
                choreographer.postFrameCallback(this.f57036c);
            }
            this.f57037d = true;
        }
    }

    public h(a aVar) {
        this.f57034a = new WeakReference<>(aVar);
        int i2 = Build.VERSION.SDK_INT;
        try {
            this.f57035b = Choreographer.getInstance();
        } catch (Throwable unused) {
        }
        this.f57036c = new Choreographer.FrameCallback() {
            /* class com.lynx.tasm.utils.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35478);
            }

            public final void doFrame(long j2) {
                a aVar;
                if (h.this.f57034a != null && (aVar = h.this.f57034a.get()) != null) {
                    try {
                        aVar.OnVSync(j2);
                        h.this.f57035b.postFrameCallback(h.this.f57036c);
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
            }
        };
    }
}
