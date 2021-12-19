package net.openid.appauth.a;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.a.b;
import androidx.browser.a.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import net.openid.appauth.c.a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<b> f159580a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f159581b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Context> f159582c;

    /* renamed from: d  reason: collision with root package name */
    private d f159583d;

    static {
        Covode.recordClassIndex(106063);
    }

    public final b b() {
        try {
            this.f159581b.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            a.b("Interrupted while waiting for browser connection", new Object[0]);
            this.f159581b.countDown();
        }
        return this.f159580a.get();
    }

    public final synchronized void a() {
        MethodCollector.i(10557);
        if (this.f159583d == null) {
            MethodCollector.o(10557);
            return;
        }
        Context context = this.f159582c.get();
        if (context != null) {
            context.unbindService(this.f159583d);
        }
        this.f159580a.set(null);
        a.a("CustomTabsService is disconnected", new Object[0]);
        MethodCollector.o(10557);
    }

    public e(Context context) {
        this.f159582c = new WeakReference<>(context);
    }

    public final synchronized void a(String str) {
        MethodCollector.i(10556);
        if (this.f159583d != null) {
            MethodCollector.o(10556);
            return;
        }
        this.f159583d = new d() {
            /* class net.openid.appauth.a.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106064);
            }

            private void b(b bVar) {
                e.this.f159580a.set(bVar);
                e.this.f159581b.countDown();
            }

            @Override // androidx.browser.a.d
            public final void a(b bVar) {
                a.a("CustomTabsService is connected", new Object[0]);
                bVar.a();
                b(bVar);
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                a.a("CustomTabsService is disconnected", new Object[0]);
                b(null);
            }
        };
        Context context = this.f159582c.get();
        if (context == null || !b.a(context, str, this.f159583d)) {
            a.b("Unable to bind custom tabs service", new Object[0]);
            this.f159581b.countDown();
        }
        MethodCollector.o(10556);
    }
}
