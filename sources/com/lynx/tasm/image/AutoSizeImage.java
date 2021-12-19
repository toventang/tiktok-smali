package com.lynx.tasm.image;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.d;

public class AutoSizeImage extends ShadowNode implements d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f56648a;

    /* renamed from: b  reason: collision with root package name */
    private int f56649b;

    /* renamed from: c  reason: collision with root package name */
    private int f56650c;
    private boolean p = true;
    private Handler q;
    private Runnable r;
    private final Object s = new Object();

    static {
        Covode.recordClassIndex(35314);
    }

    public AutoSizeImage() {
        a(this);
    }

    public final void a(final boolean z, final int i2, final int i3, final int i4, final int i5) {
        MethodCollector.i(13747);
        synchronized (this.s) {
            try {
                Handler handler = this.q;
                if (handler == null) {
                    this.r = new Runnable() {
                        /* class com.lynx.tasm.image.AutoSizeImage.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(35316);
                        }

                        public final void run() {
                            AutoSizeImage.this.b(z, i2, i3, i4, i5);
                        }
                    };
                } else {
                    handler.post(new Runnable() {
                        /* class com.lynx.tasm.image.AutoSizeImage.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(35317);
                        }

                        public final void run() {
                            AutoSizeImage.this.b(z, i2, i3, i4, i5);
                        }
                    });
                }
            } finally {
                MethodCollector.o(13747);
            }
        }
    }

    public final void b(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2 = this.f56648a;
        this.f56648a = z;
        this.f56649b = i2;
        this.f56650c = i3;
        if (z2 != z) {
            d();
        } else if (this.p || !z || i2 <= 0 || i3 <= 0) {
        } else {
            if (i4 == 0 || i5 == 0 || ((double) Math.abs((((float) i4) / ((float) i5)) - (((float) i2) / ((float) i3)))) > 0.05d) {
                d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0080, code lost:
        if (r10 > r1) goto L_0x0082;
     */
    @Override // com.lynx.tasm.behavior.shadow.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.lynx.tasm.behavior.shadow.LayoutNode r7, float r8, com.lynx.tasm.behavior.shadow.e r9, float r10, com.lynx.tasm.behavior.shadow.e r11) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.image.AutoSizeImage.a(com.lynx.tasm.behavior.shadow.LayoutNode, float, com.lynx.tasm.behavior.shadow.e, float, com.lynx.tasm.behavior.shadow.e):long");
    }
}
