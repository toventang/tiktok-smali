package com.bytedance.webx.h.b;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.h.a.b;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

public final class a implements com.bytedance.webx.h.a.a {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f46016f = true;

    /* renamed from: a  reason: collision with root package name */
    public final Object f46017a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Context f46018b;

    /* renamed from: c  reason: collision with root package name */
    public MessageQueue f46019c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, com.bytedance.webx.h.c.a> f46020d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private b f46021e;

    static {
        Covode.recordClassIndex(28141);
    }

    public a(Context context) {
        this.f46018b = context;
    }

    private void b(final com.bytedance.webx.h.c.a aVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f46019c = Looper.getMainLooper().getQueue();
            a(aVar);
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f46019c = Looper.myQueue();
            a(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.bytedance.webx.h.b.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(28143);
                }

                public final void run() {
                    a.this.f46019c = Looper.myQueue();
                    a.this.a(aVar);
                }
            });
        }
    }

    public final void a(final com.bytedance.webx.h.c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            MessageQueue messageQueue = this.f46019c;
            if (messageQueue != null) {
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() {
                    /* class com.bytedance.webx.h.b.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(28142);
                    }

                    public final boolean queueIdle() {
                        MethodCollector.i(6729);
                        synchronized (a.this.f46017a) {
                            try {
                                if (aVar.f46027b.size() < aVar.f46029d) {
                                    WebView a2 = aVar.f46028c.a(new MutableContextWrapper(a.this.f46018b));
                                    aVar.f46027b.add(new SoftReference<>(a2));
                                    com.bytedance.webx.h.d.a.a(a2, true);
                                }
                            } catch (Throwable th) {
                                MethodCollector.o(6729);
                                throw th;
                            }
                        }
                        MethodCollector.o(6729);
                        return false;
                    }
                });
            } else {
                b(aVar);
            }
        }
    }

    @Override // com.bytedance.webx.h.a.a
    public final com.bytedance.webx.h.a.a a(String str, com.bytedance.webx.h.c.a aVar) {
        if (!this.f46020d.containsKey(str) && aVar != null) {
            aVar.f46026a = str;
            this.f46020d.put(str, aVar);
            if (aVar.f46030e) {
                a(str, aVar.f46029d);
            }
        }
        return this;
    }

    private void a(String str, int i2) {
        MethodCollector.i(3334);
        synchronized (this.f46017a) {
            try {
                com.bytedance.webx.h.c.a aVar = this.f46020d.get(str);
                if (aVar != null) {
                    int size = aVar.f46027b.size();
                    aVar.f46029d = i2;
                    int i3 = 0;
                    if (size < i2) {
                        while (i3 < i2 - size) {
                            a(aVar);
                            i3++;
                        }
                    } else {
                        while (i3 < size - i2) {
                            com.bytedance.webx.h.d.a.a(aVar.f46027b.remove((size - 1) - i3).get(), this.f46018b);
                            i3++;
                        }
                    }
                    MethodCollector.o(3334);
                }
            } finally {
                MethodCollector.o(3334);
            }
        }
    }

    @Override // com.bytedance.webx.h.a.a
    public final WebView a(Context context, String str) {
        WebView webView;
        MethodCollector.i(3330);
        SystemClock.uptimeMillis();
        com.bytedance.webx.h.c.a aVar = this.f46020d.get(str);
        if (aVar == null) {
            webView = null;
        } else if (!aVar.f46027b.isEmpty()) {
            synchronized (this.f46017a) {
                try {
                    webView = aVar.f46027b.remove(0).get();
                    if (webView != null) {
                        com.bytedance.webx.h.d.a.b(webView, context);
                    }
                    if (aVar.f46027b.size() < aVar.f46029d) {
                        a(aVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3330);
                    throw th;
                }
            }
        } else {
            webView = aVar.f46028c.a(new MutableContextWrapper(context));
            com.bytedance.webx.h.d.a.a(webView, false);
            a(str, aVar.f46029d);
        }
        if (!(aVar == null || this.f46021e == null)) {
            SystemClock.uptimeMillis();
            f46016f = false;
        }
        MethodCollector.o(3330);
        return webView;
    }
}
