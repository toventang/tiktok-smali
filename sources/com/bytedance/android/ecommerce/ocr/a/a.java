package com.bytedance.android.ecommerce.ocr.a;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collection;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    private static final Collection<String> f7148h;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f7149a;

    /* renamed from: b  reason: collision with root package name */
    public final Camera f7150b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f7151c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<Camera.Area> f7152d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7153e = 5000;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7154f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f7155g;

    /* renamed from: i  reason: collision with root package name */
    private final Handler.Callback f7156i;

    /* renamed from: j  reason: collision with root package name */
    private final Camera.AutoFocusCallback f7157j;

    public final void b() {
        this.f7154f = false;
        c();
    }

    static {
        Covode.recordClassIndex(3444);
        ArrayList arrayList = new ArrayList(2);
        f7148h = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public final void c() {
        if (this.f7155g && !this.f7154f && !this.f7149a) {
            try {
                this.f7150b.autoFocus(this.f7157j);
                this.f7149a = true;
            } catch (RuntimeException unused) {
                a();
            }
        }
    }

    public final void d() {
        this.f7154f = true;
        this.f7149a = false;
        this.f7151c.removeMessages(1);
        if (this.f7155g) {
            try {
                this.f7150b.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    public final synchronized void a() {
        MethodCollector.i(7095);
        if (!this.f7154f && !this.f7151c.hasMessages(1)) {
            Handler handler = this.f7151c;
            handler.sendMessageDelayed(handler.obtainMessage(1), 5000);
        }
        MethodCollector.o(7095);
    }

    public a(Camera camera, d dVar) {
        boolean z = true;
        this.f7152d = new ArrayList<>(1);
        AnonymousClass1 r1 = new Handler.Callback() {
            /* class com.bytedance.android.ecommerce.ocr.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3445);
            }

            public final boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                a.this.c();
                return true;
            }
        };
        this.f7156i = r1;
        this.f7157j = new Camera.AutoFocusCallback() {
            /* class com.bytedance.android.ecommerce.ocr.a.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(3446);
            }

            public final void onAutoFocus(boolean z, Camera camera) {
                a.this.f7151c.post(new Runnable() {
                    /* class com.bytedance.android.ecommerce.ocr.a.a.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(3447);
                    }

                    public final void run() {
                        a.this.f7149a = false;
                        a.this.a();
                    }
                });
            }
        };
        this.f7151c = new Handler(r1);
        this.f7150b = camera;
        this.f7155g = (!dVar.f7208e || !f7148h.contains(camera.getParameters().getFocusMode())) ? false : z;
        b();
    }
}
