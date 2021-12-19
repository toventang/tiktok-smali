package com.squareup.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.b.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    final b f58029a;

    /* renamed from: b  reason: collision with root package name */
    final Context f58030b;

    /* renamed from: c  reason: collision with root package name */
    final ExecutorService f58031c;

    /* renamed from: d  reason: collision with root package name */
    final j f58032d;

    /* renamed from: e  reason: collision with root package name */
    final Map<String, c> f58033e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    final Map<Object, a> f58034f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<Object, a> f58035g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    final Set<Object> f58036h = new HashSet();

    /* renamed from: i  reason: collision with root package name */
    final Handler f58037i;

    /* renamed from: j  reason: collision with root package name */
    final Handler f58038j;

    /* renamed from: k  reason: collision with root package name */
    final d f58039k;

    /* renamed from: l  reason: collision with root package name */
    final aa f58040l;

    /* renamed from: m  reason: collision with root package name */
    final List<c> f58041m;
    final c n;
    final boolean o;
    public boolean p;

    static {
        Covode.recordClassIndex(36057);
    }

    static class b extends HandlerThread {
        static {
            Covode.recordClassIndex(36060);
        }

        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final i f58045a;

        static {
            Covode.recordClassIndex(36061);
        }

        c(i iVar) {
            this.f58045a = iVar;
        }

        private static NetworkInfo a(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                return com.ss.android.ugc.aweme.net.e.a.a();
            }
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        i iVar = this.f58045a;
                        iVar.f58037i.sendMessage(iVar.f58037i.obtainMessage(10, intent.getBooleanExtra("state", false) ? 1 : 0, 0));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    i iVar2 = this.f58045a;
                    iVar2.f58037i.sendMessage(iVar2.f58037i.obtainMessage(9, a((ConnectivityManager) ae.a(context, "connectivity"))));
                }
            }
        }

        private static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e2) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e2;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r2 = move-exception;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            r0 = r2.getMessage();
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 != null) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.Intent a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
                com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
                android.content.Intent r0 = b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                return r0
            L_0x000c:
                android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                r2 = move-exception
                java.lang.String r0 = r2.getMessage()
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r2.getMessage()
                java.lang.String r0 = "regist too many Broadcast Receivers"
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                throw r2
            L_0x0026:
                r2 = move-exception
            L_0x0027:
                java.lang.String r0 = "Register Receiver Exception"
                com.bytedance.c.a.a.a.b.a(r2, r0)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.b.i.c.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    private void b(a aVar) {
        Object c2 = aVar.c();
        if (c2 != null) {
            aVar.f57965k = true;
            this.f58034f.put(c2, aVar);
        }
    }

    private void e(c cVar) {
        a aVar = cVar.f58014k;
        if (aVar != null) {
            b(aVar);
        }
        List<a> list = cVar.f58015l;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(list.get(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        Handler handler = this.f58037i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: package-private */
    public final void b(c cVar) {
        Handler handler = this.f58037i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: package-private */
    public final void d(c cVar) {
        if (!cVar.b()) {
            this.f58041m.add(cVar);
            if (!this.f58037i.hasMessages(7)) {
                this.f58037i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(c cVar) {
        Handler handler = this.f58037i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    static void a(List<c> list) {
        if (!list.isEmpty() && list.get(0).f58005b.f58085m) {
            StringBuilder sb = new StringBuilder();
            for (c cVar : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ae.a(cVar));
            }
            ae.a("Dispatcher", "delivered", sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f58031c;
        if (executorService instanceof v) {
            v vVar = (v) executorService;
            if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
                vVar.a(3);
            } else {
                int type = networkInfo.getType();
                if (type == 0) {
                    int subtype = networkInfo.getSubtype();
                    switch (subtype) {
                        case 1:
                        case 2:
                            vVar.a(1);
                            break;
                        default:
                            switch (subtype) {
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                    break;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                case ABRConfig.ABR_SELECT_SCENE:
                                case 15:
                                    vVar.a(3);
                                    break;
                                default:
                                    vVar.a(3);
                                    break;
                            }
                        case 3:
                        case 4:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            vVar.a(2);
                            break;
                    }
                } else if (type == 1 || type == 6 || type == 9) {
                    vVar.a(4);
                } else {
                    vVar.a(3);
                }
                if (networkInfo.isConnected() && !this.f58034f.isEmpty()) {
                    Iterator<a> it = this.f58034f.values().iterator();
                    while (it.hasNext()) {
                        a next = it.next();
                        it.remove();
                        if (next.f57955a.f58085m) {
                            ae.a("Dispatcher", "replaying", next.f57956b.a());
                        }
                        a(next, false);
                    }
                    return;
                }
            }
        }
        if (networkInfo == null) {
            return;
        }
        if (networkInfo.isConnected()) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(c cVar) {
        boolean z;
        boolean z2;
        if (!cVar.b()) {
            boolean z3 = false;
            if (this.f58031c.isShutdown()) {
                a(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.o) {
                networkInfo = a((ConnectivityManager) ae.a(this.f58030b, "connectivity"));
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            if (cVar.r > 0) {
                cVar.r--;
                z2 = cVar.f58013j.a(networkInfo);
            } else {
                z2 = false;
            }
            boolean b2 = cVar.f58013j.b();
            if (!z2) {
                if (this.o && b2) {
                    z3 = true;
                }
                a(cVar, z3);
                if (z3) {
                    e(cVar);
                }
            } else if (!this.o || z) {
                if (cVar.f58005b.f58085m) {
                    ae.a("Dispatcher", "retrying", ae.a(cVar, ""));
                }
                if (cVar.p instanceof r.a) {
                    cVar.f58012i |= q.NO_CACHE.index;
                }
                cVar.n = this.f58031c.submit(cVar);
            } else {
                a(cVar, b2);
                if (b2) {
                    e(cVar);
                }
            }
        }
    }

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final i f58042a;

        static {
            Covode.recordClassIndex(36058);
        }

        public final void handleMessage(final Message message) {
            boolean z;
            boolean z2;
            switch (message.what) {
                case 1:
                    this.f58042a.a((a) message.obj, true);
                    return;
                case 2:
                    a aVar = (a) message.obj;
                    i iVar = this.f58042a;
                    String str = aVar.f57963i;
                    c cVar = iVar.f58033e.get(str);
                    if (cVar != null) {
                        cVar.b(aVar);
                        if (cVar.a()) {
                            iVar.f58033e.remove(str);
                            if (aVar.f57955a.f58085m) {
                                ae.a("Dispatcher", "canceled", aVar.f57956b.a());
                            }
                        }
                    }
                    if (iVar.f58036h.contains(aVar.f57964j)) {
                        iVar.f58035g.remove(aVar.c());
                        if (aVar.f57955a.f58085m) {
                            ae.a("Dispatcher", "canceled", aVar.f57956b.a(), "because paused request got canceled");
                        }
                    }
                    a remove = iVar.f58034f.remove(aVar.c());
                    if (remove != null && remove.f57955a.f58085m) {
                        ae.a("Dispatcher", "canceled", remove.f57956b.a(), "from replaying");
                        return;
                    }
                    return;
                case 3:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                default:
                    t.f58073a.post(new Runnable() {
                        /* class com.squareup.b.i.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(36059);
                        }

                        public final void run() {
                            throw new AssertionError("Unknown handler message received: " + message.what);
                        }
                    });
                    return;
                case 4:
                    c cVar2 = (c) message.obj;
                    i iVar2 = this.f58042a;
                    if ((cVar2.f58011h & p.NO_STORE.index) == 0) {
                        iVar2.f58039k.a(cVar2.f58009f, cVar2.f58016m);
                    }
                    iVar2.f58033e.remove(cVar2.f58009f);
                    iVar2.d(cVar2);
                    if (cVar2.f58005b.f58085m) {
                        ae.a("Dispatcher", "batched", ae.a(cVar2), "for completion");
                        return;
                    }
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.f58042a.c((c) message.obj);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    this.f58042a.a((c) message.obj, false);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    i iVar3 = this.f58042a;
                    ArrayList arrayList = new ArrayList(iVar3.f58041m);
                    iVar3.f58041m.clear();
                    iVar3.f58038j.sendMessage(iVar3.f58038j.obtainMessage(8, arrayList));
                    i.a((List<c>) arrayList);
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    this.f58042a.a((NetworkInfo) message.obj);
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    i iVar4 = this.f58042a;
                    if (message.arg1 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iVar4.p = z;
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    Object obj = message.obj;
                    i iVar5 = this.f58042a;
                    if (iVar5.f58036h.add(obj)) {
                        Iterator<c> it = iVar5.f58033e.values().iterator();
                        while (it.hasNext()) {
                            c next = it.next();
                            boolean z3 = next.f58005b.f58085m;
                            a aVar2 = next.f58014k;
                            List<a> list = next.f58015l;
                            if (list == null || list.isEmpty()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (aVar2 != null || z2) {
                                if (aVar2 != null && aVar2.f57964j.equals(obj)) {
                                    next.b(aVar2);
                                    iVar5.f58035g.put(aVar2.c(), aVar2);
                                    if (z3) {
                                        ae.a("Dispatcher", "paused", aVar2.f57956b.a(), "because tag '" + obj + "' was paused");
                                    }
                                }
                                if (z2) {
                                    for (int size = list.size() - 1; size >= 0; size--) {
                                        a aVar3 = list.get(size);
                                        if (aVar3.f57964j.equals(obj)) {
                                            next.b(aVar3);
                                            iVar5.f58035g.put(aVar3.c(), aVar3);
                                            if (z3) {
                                                ae.a("Dispatcher", "paused", aVar3.f57956b.a(), "because tag '" + obj + "' was paused");
                                            }
                                        }
                                    }
                                }
                                if (next.a()) {
                                    it.remove();
                                    if (z3) {
                                        ae.a("Dispatcher", "canceled", ae.a(next), "all actions paused");
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    this.f58042a.a(message.obj);
                    return;
            }
        }

        public a(Looper looper, i iVar) {
            super(looper);
            this.f58042a = iVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj) {
        if (this.f58036h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<a> it = this.f58035g.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f57964j.equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f58038j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar, boolean z) {
        if (this.f58036h.contains(aVar.f57964j)) {
            this.f58035g.put(aVar.c(), aVar);
            if (aVar.f57955a.f58085m) {
                ae.a("Dispatcher", "paused", aVar.f57956b.a(), "because tag '" + aVar.f57964j + "' is paused");
                return;
            }
            return;
        }
        c cVar = this.f58033e.get(aVar.f57963i);
        if (cVar != null) {
            cVar.a(aVar);
        } else if (!this.f58031c.isShutdown()) {
            c a2 = c.a(aVar.f57955a, this, this.f58039k, this.f58040l, aVar);
            a2.n = this.f58031c.submit(a2);
            this.f58033e.put(aVar.f57963i, a2);
            if (z) {
                this.f58034f.remove(aVar.c());
            }
            if (aVar.f57955a.f58085m) {
                ae.a("Dispatcher", "enqueued", aVar.f57956b.a());
            }
        } else if (aVar.f57955a.f58085m) {
            ae.a("Dispatcher", "ignored", aVar.f57956b.a(), "because shut down");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(c cVar, boolean z) {
        if (cVar.f58005b.f58085m) {
            String str = "";
            String a2 = ae.a(cVar, str);
            StringBuilder sb = new StringBuilder("for error");
            if (z) {
                str = " (will replay)";
            }
            ae.a("Dispatcher", "batched", a2, sb.append(str).toString());
        }
        this.f58033e.remove(cVar.f58009f);
        d(cVar);
    }

    i(Context context, ExecutorService executorService, Handler handler, j jVar, d dVar, aa aaVar) {
        boolean z;
        b bVar = new b();
        this.f58029a = bVar;
        bVar.start();
        ae.a(bVar.getLooper());
        this.f58030b = context;
        this.f58031c = executorService;
        this.f58037i = new a(bVar.getLooper(), this);
        this.f58032d = jVar;
        this.f58038j = handler;
        this.f58039k = dVar;
        this.f58040l = aaVar;
        this.f58041m = new ArrayList(4);
        this.p = ae.c(context);
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        this.o = z;
        c cVar = new c(this);
        this.n = cVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (cVar.f58045a.o) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        c.a(cVar.f58045a.f58030b, cVar, intentFilter);
    }
}
