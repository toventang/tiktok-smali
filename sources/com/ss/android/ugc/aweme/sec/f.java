package com.ss.android.ugc.aweme.sec;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.sec.d;
import com.ss.android.ugc.aweme.secapi.a;
import org.json.JSONObject;

public class f<T> extends d.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public boolean f121811c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f121812d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f121813e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f121814f;

    static {
        Covode.recordClassIndex(79325);
    }

    @Override // com.ss.android.ugc.aweme.sec.d.a, com.ss.android.ugc.aweme.sec.d
    public T a() {
        if (this.f121810b == null) {
            return null;
        }
        return (T) this.f121810b.a();
    }

    @Override // com.ss.android.ugc.aweme.sec.d.a, com.ss.android.ugc.aweme.sec.d
    public T b() {
        if (this.f121810b == null) {
            return null;
        }
        return (T) this.f121810b.b();
    }

    @Override // com.ss.android.ugc.aweme.sec.d.a
    public final T c() {
        return this.f121811c ? (T) b() : (T) a();
    }

    public final boolean a(int i2) {
        MethodCollector.i(5702);
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 == null || !SecApiImpl.a().needVerifyImage(i2)) {
            MethodCollector.o(5702);
            return false;
        }
        SecApiImpl.a().popCaptcha(j2, i2, new a() {
            /* class com.ss.android.ugc.aweme.sec.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(79326);
            }

            @Override // com.ss.android.ugc.aweme.secapi.a
            public final void a(boolean z, int i2) {
                MethodCollector.i(5998);
                f.this.f121811c = z;
                f.this.f121812d = true;
                synchronized (f.this.f121813e) {
                    try {
                        f.this.f121813e.notifyAll();
                    } finally {
                        MethodCollector.o(5998);
                    }
                }
            }
        });
        synchronized (this.f121813e) {
            int i3 = 4;
            while (!this.f121812d) {
                try {
                    int i4 = i3 - 1;
                    if (i3 <= 0) {
                        break;
                    }
                    this.f121813e.wait(50000);
                    i3 = i4;
                } catch (Throwable th) {
                    MethodCollector.o(5702);
                    throw th;
                }
            }
            this.f121813e.notifyAll();
        }
        MethodCollector.o(5702);
        return true;
    }

    public final boolean a(String str) {
        MethodCollector.i(5704);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(5704);
            return false;
        }
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 == null) {
            MethodCollector.o(5704);
            return false;
        }
        int i2 = 4;
        SecApiImpl.a().popCaptchaV2(j2, str, new a() {
            /* class com.ss.android.ugc.aweme.sec.f.AnonymousClass2 */

            static {
                Covode.recordClassIndex(79327);
            }

            @Override // com.ss.android.ugc.aweme.secapi.a
            public final void a(boolean z, int i2) {
                MethodCollector.i(6066);
                f.this.f121811c = z;
                f.this.f121812d = true;
                synchronized (f.this.f121813e) {
                    try {
                        f.this.f121813e.notifyAll();
                    } finally {
                        MethodCollector.o(6066);
                    }
                }
            }
        });
        synchronized (this.f121813e) {
            while (!this.f121812d) {
                try {
                    int i3 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    this.f121813e.wait(50000);
                    i2 = i3;
                } catch (Throwable th) {
                    MethodCollector.o(5704);
                    throw th;
                }
            }
            this.f121813e.notifyAll();
        }
        MethodCollector.o(5704);
        return true;
    }
}
