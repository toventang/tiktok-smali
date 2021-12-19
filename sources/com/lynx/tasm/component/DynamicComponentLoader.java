package com.lynx.tasm.component;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.component.a;
import java.lang.ref.WeakReference;

public final class DynamicComponentLoader {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<LynxTemplateRender> f56502a;

    /* renamed from: b  reason: collision with root package name */
    private a f56503b;

    static {
        Covode.recordClassIndex(35255);
    }

    public final native void nativeLoadComponent(long j2, String str, byte[] bArr, boolean z, int i2);

    public DynamicComponentLoader(a aVar, LynxTemplateRender lynxTemplateRender) {
        this.f56503b = aVar;
        this.f56502a = new WeakReference<>(lynxTemplateRender);
    }

    public final void a(final int i2, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.lynx.tasm.component.DynamicComponentLoader.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35257);
            }

            public final void run() {
                LynxTemplateRender lynxTemplateRender = DynamicComponentLoader.this.f56502a.get();
                if (lynxTemplateRender != null) {
                    lynxTemplateRender.onErrorOccurred(i2, str);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void requireTemplate(final String str, final int i2, final long j2) {
        a aVar = this.f56503b;
        if (aVar != null) {
            final boolean[] zArr = {true};
            aVar.a(str, new a.AbstractC1268a() {
                /* class com.lynx.tasm.component.DynamicComponentLoader.AnonymousClass1 */

                /* renamed from: f  reason: collision with root package name */
                private boolean f56509f;

                static {
                    Covode.recordClassIndex(35256);
                }

                @Override // com.lynx.tasm.component.a.AbstractC1268a
                public final synchronized void a(byte[] bArr, Throwable th) {
                    MethodCollector.i(11704);
                    if (this.f56509f) {
                        LLog.a(8, "DynamicComponent", "Illegal callback invocation from native. The loaded callback can only be invoked once! The url is " + str);
                        MethodCollector.o(11704);
                        return;
                    }
                    this.f56509f = true;
                    if (th != null) {
                        DynamicComponentLoader.this.a(1601, "Load dynamic component failed, the url is " + str + ", and the error message is " + th.getMessage());
                        MethodCollector.o(11704);
                    } else if (bArr == null || bArr.length == 0) {
                        DynamicComponentLoader.this.a(1602, "The dynamic component's binary template is empty, the url is " + str);
                        MethodCollector.o(11704);
                    } else {
                        DynamicComponentLoader.this.nativeLoadComponent(j2, str, bArr, zArr[0], i2);
                        MethodCollector.o(11704);
                    }
                }
            });
            zArr[0] = false;
        }
    }
}
