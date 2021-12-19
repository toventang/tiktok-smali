package com.ss.android.ugc.aweme.aabplugin.core.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.keva.Keva;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.play.core.e.e;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.aabplugin.core.b.e;
import com.ss.android.ugc.aweme.aabplugin.core.base.a.c;
import com.ss.android.ugc.aweme.aabplugin.core.base.n;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class a implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    static volatile boolean f62459a;

    /* renamed from: b  reason: collision with root package name */
    static volatile boolean f62460b;

    /* renamed from: c  reason: collision with root package name */
    static volatile r f62461c;

    /* renamed from: d  reason: collision with root package name */
    static volatile b f62462d;

    /* renamed from: h  reason: collision with root package name */
    private static volatile a f62463h;

    /* renamed from: e  reason: collision with root package name */
    final ConcurrentLinkedDeque<n> f62464e = new ConcurrentLinkedDeque<>();

    /* renamed from: f  reason: collision with root package name */
    final Handler f62465f;

    /* renamed from: g  reason: collision with root package name */
    volatile n f62466g;

    /* renamed from: i  reason: collision with root package name */
    private final ConcurrentLinkedQueue<n> f62467i = new ConcurrentLinkedQueue<>();

    /* renamed from: j  reason: collision with root package name */
    private final ConcurrentHashMap<String, m> f62468j = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(38435);
    }

    public final void b() {
        i.b(new c(this), i.f4824a);
    }

    public final synchronized void c() {
        MethodCollector.i(9819);
        this.f62466g = null;
        MethodCollector.o(9819);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.a$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f62469a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 38436(0x9624, float:5.386E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.ies.ugc.aweme.plugin.b.b[] r0 = com.bytedance.ies.ugc.aweme.plugin.b.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.aabplugin.core.base.a.AnonymousClass1.f62469a = r2
                com.bytedance.ies.ugc.aweme.plugin.b.b r0 = com.bytedance.ies.ugc.aweme.plugin.b.b.APPEND     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.aabplugin.core.base.a.AnonymousClass1.f62469a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.bytedance.ies.ugc.aweme.plugin.b.b r0 = com.bytedance.ies.ugc.aweme.plugin.b.b.REPLACE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.aabplugin.core.base.a.AnonymousClass1.f62469a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.bytedance.ies.ugc.aweme.plugin.b.b r0 = com.bytedance.ies.ugc.aweme.plugin.b.b.KEEP     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aabplugin.core.base.a.AnonymousClass1.<clinit>():void");
        }
    }

    private a() {
        HandlerThread handlerThread = new HandlerThread("df_download_thread");
        handlerThread.start();
        this.f62465f = new Handler(handlerThread.getLooper(), this);
        f.i().d(new j(this));
    }

    public static a a() {
        MethodCollector.i(9122);
        if (f62463h == null) {
            synchronized (a.class) {
                try {
                    if (f62463h == null) {
                        f62463h = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9122);
                    throw th;
                }
            }
        }
        a aVar = f62463h;
        MethodCollector.o(9122);
        return aVar;
    }

    private void d() {
        MethodCollector.i(9823);
        if (!f62459a) {
            synchronized (a.class) {
                try {
                    if (!f62459a) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        f62461c = new r();
                        b(d.a(), f62461c, intentFilter);
                        f62459a = true;
                        f.i().d(new h(this));
                    }
                } finally {
                    MethodCollector.o(9823);
                }
            }
            return;
        }
        MethodCollector.o(9823);
    }

    public final void a(n nVar) {
        i.b(new b(this, nVar), i.f4824a);
    }

    public final m<?> b(String str) {
        return this.f62468j.get(str);
    }

    private void f(n nVar) {
        if (nVar != null) {
            a(nVar, this.f62467i);
            if (nVar.f62508b.f35057e) {
                d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(n nVar) {
        if (nVar != null) {
            nVar.a();
            c.a(nVar, 2, "retry immediately");
            a(nVar, this.f62464e);
        }
    }

    public static void b(n nVar) {
        int a2;
        if (nVar != null) {
            if (nVar instanceof com.ss.android.ugc.aweme.aabplugin.core.b.d) {
                Integer num = e.f62458b.get(((com.ss.android.ugc.aweme.aabplugin.core.b.d) nVar).e());
                if (num != null) {
                    a2 = num.intValue();
                } else {
                    return;
                }
            } else {
                a2 = com.bytedance.m.a.e.a().a(nVar.f62519m);
            }
            if (a2 != -1) {
                c.a(nVar, 4, "sessionId:".concat(String.valueOf(a2)));
                com.bytedance.m.a.b.b().f41313c.a(a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean e(n nVar) {
        if (nVar == null) {
            return false;
        }
        c.a(nVar, 0, null);
        Keva repo = Keva.getRepo("dynamic_task_triggered", 0);
        if (repo != null) {
            if (nVar instanceof com.ss.android.ugc.aweme.aabplugin.core.b.d) {
                repo.storeString(((com.ss.android.ugc.aweme.aabplugin.core.b.d) nVar).e(), nVar.f62519m);
            } else {
                repo.storeString(nVar.f62518l, nVar.f62519m);
            }
        }
        if (nVar.f62510d == 2) {
            return Boolean.valueOf(d(nVar));
        }
        a(nVar, this.f62464e);
        b();
        return false;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1024) {
            Iterator<n> it = this.f62467i.iterator();
            boolean z = false;
            while (it.hasNext()) {
                n next = it.next();
                if (next.f62515i <= System.currentTimeMillis() && (!next.f62508b.f35057e || NetworkUtils.isWifi(d.a()))) {
                    a(next, this.f62464e);
                    this.f62467i.remove(next);
                    z = true;
                }
            }
            if (z) {
                b();
            }
        }
        return true;
    }

    public final synchronized void a(String str) {
        MethodCollector.i(9488);
        m<?> b2 = b(str);
        if (b2 != null) {
            b2.c();
            this.f62468j.remove(str);
        }
        MethodCollector.o(9488);
    }

    public final synchronized boolean d(n nVar) {
        String str;
        MethodCollector.i(9647);
        n nVar2 = this.f62466g;
        m<?> b2 = b(nVar.f62518l);
        if (b2 == null) {
            MethodCollector.o(9647);
            return false;
        }
        boolean z = nVar.f62507a;
        int i2 = 5;
        if (this.f62466g == null || this.f62466g.f62511e == n.b.UNKNOWN) {
            b2.a(nVar);
            if (!nVar.f62508b.f35057e || NetworkUtils.isWifi(d.a())) {
                d.a();
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = com.ss.android.ugc.aweme.aabplugin.core.base.a.e.a();
                }
                if (!j.f107229h) {
                    str = "failed because no network";
                    if (!z) {
                        if (nVar.f62509c == null || nVar.f62509c.f35105i == null) {
                            com.ss.android.ugc.aweme.aabplugin.core.base.a.f.a((int) R.string.de2);
                        } else {
                            com.ss.android.ugc.aweme.aabplugin.core.base.a.f.a(nVar.f62509c.f35105i);
                        }
                    }
                    if (nVar.f62508b.f35054b) {
                        d();
                        c(nVar);
                    }
                } else if (f.f34637l) {
                    str = "failed because app is background";
                    i2 = 6;
                    synchronized (a.class) {
                        try {
                            if (!f62460b) {
                                f62462d = f.g().d(new i(this));
                                f62460b = true;
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(9647);
                            throw th;
                        }
                    }
                    c(nVar);
                } else {
                    if (this.f62466g != null && nVar.f62510d == 2) {
                        b(this.f62466g);
                    }
                    c.a(nVar, 1, "start to execute");
                    this.f62466g = nVar;
                    c.a(nVar, 5, null);
                    String str2 = nVar.f62519m;
                    com.google.android.play.core.e.c cVar = com.bytedance.m.a.b.b().f41313c;
                    if (nVar instanceof com.ss.android.ugc.aweme.aabplugin.core.b.d) {
                        Locale locale = ((com.ss.android.ugc.aweme.aabplugin.core.b.d) nVar).q;
                        e.a a2 = com.google.android.play.core.e.e.a();
                        a2.f53315b.add(locale);
                        cVar.a(a2.a()).a(new d(locale)).a(new e(this, nVar, str2));
                    } else if (!nVar.b()) {
                        e.a a3 = com.google.android.play.core.e.e.a().a(nVar.f62518l);
                        List<String> list = nVar.f62508b.f35061i;
                        if (list != null) {
                            for (String str3 : list) {
                                a3.a(str3);
                            }
                        }
                        cVar.a(a3.a()).a(new f(str2)).a(new g(str2));
                    } else if (com.bytedance.m.c.f41339d) {
                        com.bytedance.m.c.f41336a.a(str2);
                    }
                    MethodCollector.o(9647);
                    return true;
                }
            } else {
                str = "failed because required wifi";
                i2 = 4;
                if (!z) {
                    if (nVar.f62509c == null || nVar.f62509c.f35104h == null) {
                        com.ss.android.ugc.aweme.aabplugin.core.base.a.f.a((int) R.string.bca);
                    } else {
                        com.ss.android.ugc.aweme.aabplugin.core.base.a.f.a(nVar.f62509c.f35104h);
                    }
                }
                if (nVar.f62508b.f35054b) {
                    a(nVar, 0);
                }
            }
        } else {
            str = "Failed because other module is currently executing:" + this.f62466g.f62518l;
            i2 = 7;
            if (nVar.f62510d == 2) {
                if (nVar.equals(this.f62464e.peek())) {
                    this.f62464e.poll();
                }
                this.f62464e.addFirst(nVar);
                c.a(nVar, 1, str);
                b(this.f62466g);
                MethodCollector.o(9647);
                return true;
            }
            c(nVar);
        }
        nVar.a((n) i2, (int) nVar.f62507a);
        c.a(nVar, 1, str);
        MethodCollector.o(9647);
        return false;
    }

    private static void a(n nVar, AbstractCollection<n> abstractCollection) {
        if (abstractCollection.contains(nVar)) {
            int i2 = AnonymousClass1.f62469a[nVar.f62508b.f35059g.ordinal()];
            if (i2 == 2) {
                abstractCollection.remove(nVar);
            } else if (i2 == 3) {
                return;
            }
        }
        abstractCollection.add(nVar);
    }

    public final void a(n nVar, long j2) {
        if (nVar != null) {
            nVar.a();
            if (j2 == 0) {
                nVar.a(j2);
                f(nVar);
                c.a(nVar, 2, "delay:".concat(String.valueOf(j2)));
                return;
            }
            long j3 = nVar.f62514h + j2;
            c.a(nVar, 2, "delay:".concat(String.valueOf(j3)));
            if (j3 / j2 <= 5) {
                nVar.a(j3);
                f(nVar);
                this.f62465f.sendEmptyMessageDelayed(1024, j3);
                return;
            }
            com.bytedance.ies.ugc.aweme.plugin.c.b bVar = nVar.f62517k;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public final synchronized void a(String str, m mVar) {
        MethodCollector.i(9310);
        if (this.f62468j.get(str) == null) {
            this.f62468j.put(str, mVar);
            mVar.b();
        }
        MethodCollector.o(9310);
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aabplugin.core.base.a.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
