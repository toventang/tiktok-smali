package com.google.android.play.core.b;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class l<T extends IInterface> {

    /* renamed from: l  reason: collision with root package name */
    private static final Map<String, Handler> f53155l = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    final Context f53156a;

    /* renamed from: b  reason: collision with root package name */
    final b f53157b;

    /* renamed from: c  reason: collision with root package name */
    final String f53158c;

    /* renamed from: d  reason: collision with root package name */
    final List<c> f53159d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    boolean f53160e;

    /* renamed from: f  reason: collision with root package name */
    final Intent f53161f;

    /* renamed from: g  reason: collision with root package name */
    final h<T> f53162g;

    /* renamed from: h  reason: collision with root package name */
    final WeakReference<g> f53163h;

    /* renamed from: i  reason: collision with root package name */
    final IBinder.DeathRecipient f53164i = new d(this);

    /* renamed from: j  reason: collision with root package name */
    ServiceConnection f53165j;

    /* renamed from: k  reason: collision with root package name */
    public T f53166k;

    static {
        Covode.recordClassIndex(32851);
    }

    public l(Context context, b bVar, String str, Intent intent, h<T> hVar) {
        this.f53156a = context;
        this.f53157b = bVar;
        this.f53158c = str;
        this.f53161f = intent;
        this.f53162g = hVar;
        this.f53163h = new WeakReference<>(null);
    }

    public final void a() {
        b(new f(this));
    }

    public final void a(c cVar) {
        b(new e(this, cVar.f53146g, cVar));
    }

    /* access modifiers changed from: package-private */
    public final void b(c cVar) {
        Handler handler;
        MethodCollector.i(6762);
        Map<String, Handler> map = f53155l;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f53158c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f53158c, 10);
                    handlerThread.start();
                    map.put(this.f53158c, new Handler(handlerThread.getLooper()));
                }
                handler = map.get(this.f53158c);
            } catch (Throwable th) {
                MethodCollector.o(6762);
                throw th;
            }
        }
        handler.post(cVar);
        MethodCollector.o(6762);
    }
}
