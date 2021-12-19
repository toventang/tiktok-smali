package com.ss.android.ugc.aweme.commerce.a.a.a;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commerce.a.a.c.a;
import com.ss.android.ugc.aweme.commerce.a.a.e.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<WeakReference<View>> f73323a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f73324b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f73325c = false;

    /* renamed from: d  reason: collision with root package name */
    public String f73326d;

    /* renamed from: e  reason: collision with root package name */
    public long f73327e;

    /* renamed from: f  reason: collision with root package name */
    private final b f73328f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<View> f73329g = new WeakReference<>(null);

    /* renamed from: h  reason: collision with root package name */
    private boolean f73330h = false;

    static {
        Covode.recordClassIndex(45148);
    }

    private void f() {
        if (!this.f73330h) {
            this.f73330h = true;
            this.f73328f.a();
        }
    }

    public final View c() {
        return this.f73329g.get();
    }

    public final boolean d() {
        if (!this.f73324b || this.f73325c) {
            return false;
        }
        return true;
    }

    public final void e() {
        if (!this.f73330h && com.ss.android.ugc.aweme.commerce.a.a.b.c.f73342a.a(this.f73326d, this.f73327e)) {
            f();
        }
        this.f73327e = Long.MAX_VALUE;
    }

    @Override // com.ss.android.ugc.aweme.commerce.a.a.a.a
    public final void a() {
        if (!this.f73324b) {
            this.f73324b = true;
            this.f73330h = false;
            this.f73327e = System.nanoTime();
            a aVar = a.f73347a;
            boolean z = !aVar.f73349c.isEmpty();
            aVar.f73349c.add(this);
            if (!z) {
                b.f73363a.a();
                com.ss.android.ugc.aweme.commerce.a.a.c.b bVar = com.ss.android.ugc.aweme.commerce.a.a.c.b.f73351a;
                bVar.f73353c = new BroadcastReceiver() {
                    /* class com.ss.android.ugc.aweme.commerce.a.a.c.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(45158);
                    }

                    private static Object a(Context context, String str) {
                        Object obj;
                        MethodCollector.i(11369);
                        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                            if (!i.f107220b && "connectivity".equals(str)) {
                                try {
                                    new com.bytedance.platform.godzilla.b.b.b().a();
                                    i.f107220b = true;
                                    obj = context.getSystemService(str);
                                } catch (Throwable unused) {
                                }
                            }
                            obj = context.getSystemService(str);
                        } else if (i.f107219a) {
                            synchronized (ClipboardManager.class) {
                                try {
                                    obj = context.getSystemService(str);
                                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                        try {
                                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                            declaredField.setAccessible(true);
                                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                                        } catch (Exception e2) {
                                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                                        }
                                    }
                                    i.f107219a = false;
                                } finally {
                                    MethodCollector.o(11369);
                                }
                            }
                        } else {
                            obj = context.getSystemService(str);
                        }
                        return obj;
                    }

                    public final void onReceive(Context context, Intent intent) {
                        KeyguardManager keyguardManager;
                        if (intent != null) {
                            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                                b.this.a(true);
                            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                                b.this.a(false);
                            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) a(context, "keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                b.this.a(false);
                            }
                        }
                    }
                };
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                if (bVar.f73352b.get() != null) {
                    com.ss.android.ugc.aweme.commerce.a.a.c.b.a(bVar.f73352b.get(), bVar.f73353c, intentFilter);
                }
                bVar.f73354d = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.a.a.a.a
    public final void b() {
        if (!this.f73325c) {
            e();
            this.f73325c = true;
            this.f73329g.clear();
            if (!this.f73325c) {
                this.f73323a.clear();
            }
            a aVar = a.f73347a;
            boolean isEmpty = true ^ aVar.f73349c.isEmpty();
            aVar.f73348b.remove(this);
            aVar.f73349c.remove(this);
            if (isEmpty && aVar.f73349c.isEmpty()) {
                b.f73363a.b();
                com.ss.android.ugc.aweme.commerce.a.a.c.b bVar = com.ss.android.ugc.aweme.commerce.a.a.c.b.f73351a;
                if (!(bVar.f73352b.get() == null || bVar.f73353c == null)) {
                    bVar.f73352b.get().unregisterReceiver(bVar.f73353c);
                    bVar.f73353c = null;
                }
                bVar.f73354d = false;
                bVar.f73355e = false;
            }
        }
    }

    private void d(View view) {
        this.f73329g = new WeakReference<>(view);
    }

    public c(b bVar) {
        this.f73328f = bVar;
        this.f73326d = UUID.randomUUID().toString();
        d(null);
        a.f73347a.f73348b.add(this);
    }

    @Override // com.ss.android.ugc.aweme.commerce.a.a.a.a
    public final void a(View view) {
        if (!this.f73325c && view != null && c() != view) {
            d(view);
            Iterator<c> it = a.f73347a.f73348b.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next != this && next.c() == view) {
                    next.f73329g.clear();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.a.a.a.a
    public final void b(View view) {
        if (!this.f73325c && view != null) {
            Iterator<WeakReference<View>> it = this.f73323a.iterator();
            while (it.hasNext()) {
                if (it.next().get() == view) {
                    return;
                }
            }
            this.f73323a.add(new WeakReference<>(view));
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.a.a.a.a
    public final void c(View view) {
        if (!this.f73325c && view != null) {
            WeakReference<View> weakReference = null;
            Iterator<WeakReference<View>> it = this.f73323a.iterator();
            while (it.hasNext()) {
                WeakReference<View> next = it.next();
                if (next.get() == view) {
                    weakReference = next;
                }
            }
            this.f73323a.remove(weakReference);
        }
    }
}
