package com.ss.optimizer.live.sdk.dns;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.optimizer.live.sdk.a.d;
import com.ss.optimizer.live.sdk.a.e;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public class a implements e {

    /* renamed from: e  reason: collision with root package name */
    static final Map<String, h> f151691e = new androidx.c.a();

    /* renamed from: a  reason: collision with root package name */
    public d f151692a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f151693b = new Handler(Looper.getMainLooper()) {
        /* class com.ss.optimizer.live.sdk.dns.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(101192);
        }

        public final void handleMessage(Message message) {
            if (message != null && message.what == 1024) {
                if (a.this.f151703m) {
                    a.this.b();
                } else {
                    d.a().f151670c.a();
                }
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public final Context f151694c;

    /* renamed from: d  reason: collision with root package name */
    public final BroadcastReceiver f151695d = new BroadcastReceiver() {
        /* class com.ss.optimizer.live.sdk.dns.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(101193);
        }

        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                return;
            }
            if (!a.a(context)) {
                a.this.f151693b.removeMessages(1024);
                a.this.a();
                return;
            }
            a.this.f151693b.removeMessages(1024);
            a.this.a();
            a.this.b();
        }
    };

    /* renamed from: f  reason: collision with root package name */
    public final List<Callable<?>> f151696f = new LinkedList();

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f151697g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public boolean f151698h = false;

    /* renamed from: i  reason: collision with root package name */
    public Set<String> f151699i;

    /* renamed from: j  reason: collision with root package name */
    public long f151700j = 300000;

    /* renamed from: k  reason: collision with root package name */
    boolean f151701k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f151702l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f151703m = true;
    public int n = 0;
    private final ThreadPoolExecutor o;
    private final Map<String, h> p = new androidx.c.a();
    private boolean q = false;
    private int r = -1;
    private e.a s = null;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.optimizer.live.sdk.dns.a$a  reason: collision with other inner class name */
    public interface AbstractC4063a<T> {
        static {
            Covode.recordClassIndex(101202);
        }

        void a(T t);
    }

    @Override // com.ss.optimizer.live.sdk.dns.e
    public final int d() {
        return this.r;
    }

    public final void a() {
        Set<String> set = this.f151699i;
        if (set == null || set.size() == 0) {
            f151691e.clear();
            return;
        }
        for (String str : this.f151699i) {
            h hVar = f151691e.get(str);
            if (hVar != null) {
                hVar.b(null);
                hVar.a((k) null);
            }
        }
    }

    @Override // com.ss.optimizer.live.sdk.dns.e
    public final void a(String str, int i2, int i3) {
        com.ss.optimizer.live.sdk.dns.b.b a2 = com.ss.optimizer.live.sdk.dns.b.b.a();
        com.ss.optimizer.live.sdk.dns.b.a aVar = new com.ss.optimizer.live.sdk.dns.b.a();
        aVar.f151725a = str;
        aVar.f151726b = i2;
        aVar.f151727c = i3;
        aVar.f151728d = System.currentTimeMillis();
        a2.f151734f = str;
        a2.f151735g.put(str, aVar);
    }

    public final <T> void a(final Callable<T> callable, final AbstractC4063a<T> aVar) {
        MethodCollector.i(6419);
        if (!this.f151698h) {
            MethodCollector.o(6419);
            return;
        }
        synchronized (this.f151696f) {
            try {
                this.f151696f.add(callable);
            } catch (Throwable th) {
                MethodCollector.o(6419);
                throw th;
            }
        }
        this.o.submit(new Runnable() {
            /* class com.ss.optimizer.live.sdk.dns.a.AnonymousClass8 */

            static {
                Covode.recordClassIndex(101200);
            }

            public final void run() {
                boolean z;
                MethodCollector.i(5047);
                synchronized (a.this.f151696f) {
                    try {
                        if (!a.this.f151696f.contains(callable)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(5047);
                        throw th;
                    }
                }
                if (z) {
                    MethodCollector.o(5047);
                    return;
                }
                final Object obj = null;
                try {
                    obj = callable.call();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                a.this.f151693b.post(new Runnable() {
                    /* class com.ss.optimizer.live.sdk.dns.a.AnonymousClass8.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(101201);
                    }

                    public final void run() {
                        boolean z;
                        MethodCollector.i(5850);
                        synchronized (a.this.f151696f) {
                            try {
                                if (!a.this.f151696f.remove(callable)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } catch (Throwable th) {
                                MethodCollector.o(5850);
                                throw th;
                            }
                        }
                        if (z) {
                            MethodCollector.o(5850);
                            return;
                        }
                        aVar.a(obj);
                        MethodCollector.o(5850);
                    }
                });
                MethodCollector.o(5047);
            }
        });
        MethodCollector.o(6419);
    }

    public final void a(com.ss.optimizer.live.sdk.a.a.a aVar) {
        if (aVar != null) {
            HashSet hashSet = new HashSet();
            if (aVar.f151643a == 0 && aVar.f151644b != null && aVar.f151644b.length() > 0) {
                Iterator<String> keys = aVar.f151644b.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && !next.equals("")) {
                        hashSet.add(next);
                    }
                }
            }
            this.f151699i = hashSet;
            long j2 = 300000;
            if (((long) (aVar.f151646d * 1000)) >= 300000) {
                j2 = (long) (aVar.f151646d * 1000);
            }
            this.f151700j = j2;
            this.f151701k = aVar.f151647e;
            this.f151703m = aVar.f151648f;
            Set<String> set = this.f151699i;
            if (set == null || set.size() == 0) {
                f151691e.clear();
                return;
            }
            for (String str : this.f151699i) {
                Map<String, h> map = f151691e;
                h hVar = map.get(str);
                if (hVar == null) {
                    hVar = new h(str);
                }
                List<String> a2 = aVar.a(str);
                hVar.a(new k(str, a2));
                hVar.f151748f = aVar.f151645c;
                map.put(str, hVar);
                if (this.q && a2 != null && !a2.isEmpty()) {
                    a(new m(a2, this.f151697g), new AbstractC4063a<List<String>>() {
                        /* class com.ss.optimizer.live.sdk.dns.a.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(101198);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.ss.optimizer.live.sdk.dns.a.AbstractC4063a
                        public final /* synthetic */ void a(List<String> list) {
                            a.this.f151697g.addAll(list);
                        }
                    });
                }
            }
        }
    }

    @Override // com.ss.optimizer.live.sdk.dns.e
    public final boolean c() {
        if (!this.f151698h) {
            return false;
        }
        return this.f151701k;
    }

    static {
        Covode.recordClassIndex(101191);
        g.f151742a = false;
    }

    static class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadGroup f151722a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f151723b;

        /* renamed from: c  reason: collision with root package name */
        private final String f151724c;

        static {
            Covode.recordClassIndex(101203);
        }

        private b() {
            ThreadGroup threadGroup;
            this.f151723b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f151722a = threadGroup;
            this.f151724c = "dns-optimizer-";
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.i(5877);
            Thread thread = new Thread(this.f151722a, runnable, this.f151724c + this.f151723b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            MethodCollector.o(5877);
            return thread;
        }
    }

    public final void b() {
        Map<String, h> map;
        if (this.f151703m && (map = f151691e) != null) {
            if (map.size() == 0) {
                a(new c(), new AbstractC4063a<com.ss.optimizer.live.sdk.a.a.a>() {
                    /* class com.ss.optimizer.live.sdk.dns.a.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(101195);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.ss.optimizer.live.sdk.dns.a.AbstractC4063a
                    public final /* synthetic */ void a(com.ss.optimizer.live.sdk.a.a.a aVar) {
                        a.this.a(aVar);
                        a.this.f151693b.removeMessages(1024);
                        a.this.f151693b.sendEmptyMessageDelayed(1024, a.this.f151700j);
                    }
                });
                return;
            }
            this.n = 0;
            for (final h hVar : map.values()) {
                a(new f(hVar.f151743a), new AbstractC4063a<k>() {
                    /* class com.ss.optimizer.live.sdk.dns.a.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(101196);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.ss.optimizer.live.sdk.dns.a.AbstractC4063a
                    public final /* synthetic */ void a(k kVar) {
                        k kVar2 = kVar;
                        if (kVar2 == null) {
                            kVar2 = new k(hVar.f151743a, null);
                        }
                        hVar.b(kVar2);
                        a.this.n++;
                        if (a.this.n == a.this.f151699i.size()) {
                            a.this.a(new c(), new AbstractC4063a<com.ss.optimizer.live.sdk.a.a.a>() {
                                /* class com.ss.optimizer.live.sdk.dns.a.AnonymousClass5.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(101197);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.ss.optimizer.live.sdk.dns.a.AbstractC4063a
                                public final /* synthetic */ void a(com.ss.optimizer.live.sdk.a.a.a aVar) {
                                    a.this.a(aVar);
                                    a.this.f151693b.removeMessages(1024);
                                    a.this.f151693b.sendEmptyMessageDelayed(1024, a.this.f151700j);
                                }
                            });
                        }
                        if (a.this.f151702l) {
                            a aVar = a.this;
                            h hVar = hVar;
                            List<String> unmodifiableList = Collections.unmodifiableList(hVar.f151745c);
                            if (!unmodifiableList.isEmpty()) {
                                for (String str : unmodifiableList) {
                                    aVar.a(new j(str), new AbstractC4063a<i>(hVar) {
                                        /* class com.ss.optimizer.live.sdk.dns.a.AnonymousClass7 */

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ h f151712a;

                                        static {
                                            Covode.recordClassIndex(101199);
                                        }

                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // com.ss.optimizer.live.sdk.dns.a.AbstractC4063a
                                        public final /* synthetic */ void a(i iVar) {
                                            i iVar2 = iVar;
                                            h hVar = this.f151712a;
                                            hVar.f151746d.put(iVar2.f151753a, iVar2);
                                            if (hVar.f151746d.size() == hVar.f151745c.size()) {
                                                ArrayList arrayList = new ArrayList(hVar.f151745c);
                                                Collections.sort(arrayList, 
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0026: INVOKE  
                                                      (r2v0 'arrayList' java.util.ArrayList)
                                                      (wrap: com.ss.optimizer.live.sdk.dns.h$1 : 0x0023: CONSTRUCTOR  (r0v5 com.ss.optimizer.live.sdk.dns.h$1) = (r4v0 'hVar' com.ss.optimizer.live.sdk.dns.h) call: com.ss.optimizer.live.sdk.dns.h.1.<init>(com.ss.optimizer.live.sdk.dns.h):void type: CONSTRUCTOR)
                                                     type: STATIC call: java.util.Collections.sort(java.util.List, java.util.Comparator):void in method: com.ss.optimizer.live.sdk.dns.a.7.a(com.ss.optimizer.live.sdk.dns.i):void, file: classes2.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0023: CONSTRUCTOR  (r0v5 com.ss.optimizer.live.sdk.dns.h$1) = (r4v0 'hVar' com.ss.optimizer.live.sdk.dns.h) call: com.ss.optimizer.live.sdk.dns.h.1.<init>(com.ss.optimizer.live.sdk.dns.h):void type: CONSTRUCTOR in method: com.ss.optimizer.live.sdk.dns.a.7.a(com.ss.optimizer.live.sdk.dns.i):void, file: classes2.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                                    	... 19 more
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.optimizer.live.sdk.dns.h, state: GENERATED_AND_UNLOADED
                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                                    	... 25 more
                                                    */
                                                /*
                                                    this = this;
                                                    com.ss.optimizer.live.sdk.dns.i r6 = (com.ss.optimizer.live.sdk.dns.i) r6
                                                    com.ss.optimizer.live.sdk.dns.h r4 = r5.f151712a
                                                    java.util.Map<java.lang.String, com.ss.optimizer.live.sdk.dns.i> r1 = r4.f151746d
                                                    java.lang.String r0 = r6.f151753a
                                                    r1.put(r0, r6)
                                                    java.util.Map<java.lang.String, com.ss.optimizer.live.sdk.dns.i> r0 = r4.f151746d
                                                    int r1 = r0.size()
                                                    java.util.List<java.lang.String> r0 = r4.f151745c
                                                    int r0 = r0.size()
                                                    r3 = 0
                                                    if (r1 != r0) goto L_0x0044
                                                    java.util.ArrayList r2 = new java.util.ArrayList
                                                    java.util.List<java.lang.String> r0 = r4.f151745c
                                                    r2.<init>(r0)
                                                    com.ss.optimizer.live.sdk.dns.h$1 r0 = new com.ss.optimizer.live.sdk.dns.h$1
                                                    r0.<init>()
                                                    java.util.Collections.sort(r2, r0)
                                                    java.util.List<java.lang.String> r0 = r4.f151747e
                                                    r0.clear()
                                                    int r1 = r2.size()
                                                    r0 = 3
                                                    if (r1 > r0) goto L_0x003b
                                                    java.util.List<java.lang.String> r0 = r4.f151747e
                                                    r0.addAll(r2)
                                                    return
                                                L_0x003b:
                                                    java.util.List<java.lang.String> r1 = r4.f151747e
                                                    java.util.List r0 = r2.subList(r3, r0)
                                                    r1.addAll(r0)
                                                L_0x0044:
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.ss.optimizer.live.sdk.dns.a.AnonymousClass7.a(java.lang.Object):void");
                                            }

                                            {
                                                this.f151712a = r2;
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    });
                }
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

        public static boolean a(Context context) {
            NetworkInfo a2;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) a(context, "connectivity");
                if (connectivityManager == null || (a2 = a(connectivityManager)) == null || !a2.isConnected()) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
            }
        }

        @Override // com.ss.optimizer.live.sdk.dns.e
        public final List<String> b(String str) {
            if (!this.f151698h) {
                return null;
            }
            h hVar = f151691e.get(str);
            if (hVar != null) {
                return hVar.b();
            }
            h hVar2 = this.p.get(str);
            if (hVar2 != null) {
                return hVar2.b();
            }
            return null;
        }

        @Override // com.ss.optimizer.live.sdk.dns.e
        public final List<String> c(String str) {
            if (!this.f151698h) {
                return null;
            }
            h hVar = f151691e.get(str);
            if (hVar != null) {
                return hVar.c();
            }
            h hVar2 = this.p.get(str);
            if (hVar2 != null) {
                return hVar2.c();
            }
            return null;
        }

        public a(Context context) {
            MethodCollector.i(6237);
            this.f151694c = context;
            this.s = new e.a() {
                /* class com.ss.optimizer.live.sdk.dns.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(101194);
                }

                @Override // com.ss.optimizer.live.sdk.a.e.a
                public final void a(com.ss.optimizer.live.sdk.a.a.a aVar) {
                    a aVar2 = a.this;
                    if (aVar != null && aVar2.f151698h) {
                        aVar2.a(aVar);
                        if (aVar2.f151701k) {
                            aVar2.b();
                        }
                    }
                }
            };
            e eVar = d.a().f151670c;
            eVar.f151674a.add(this.s);
            ThreadPoolExecutor threadPoolExecutor = d.a().f151671d;
            if (threadPoolExecutor == null) {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b((byte) 0));
                this.o = threadPoolExecutor2;
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
            } else {
                this.o = threadPoolExecutor;
            }
            boolean z = d.a().f151672e;
            this.q = z;
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.a("vctfo", false, (Context) null);
                m.a(uptimeMillis, "vctfo");
            }
            MethodCollector.o(6237);
        }

        @Override // com.ss.optimizer.live.sdk.dns.e
        public final String a(String str) {
            h hVar;
            String str2 = null;
            if (this.f151698h && this.f151701k) {
                h hVar2 = f151691e.get(str);
                if ((hVar2 == null || (str2 = hVar2.a()) == null) && (hVar = this.p.get(str)) != null) {
                    str2 = hVar.a();
                }
                if (this.q) {
                    if (this.f151697g.isEmpty() || TextUtils.isEmpty(str2) || !this.f151697g.contains(str2)) {
                        this.r = 0;
                    } else {
                        this.r = 1;
                    }
                }
            }
            return str2;
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(6290);
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
                                com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(6290);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        @Override // com.ss.optimizer.live.sdk.dns.e
        public final <T> T a(String str, T t) {
            if (this.f151692a == null) {
                return t;
            }
            str.hashCode();
            return !str.equals("TTNet_NQE_INFO") ? t : (T) this.f151692a.a(str, t);
        }

        @Override // com.ss.optimizer.live.sdk.dns.e
        public final String a(String str, String str2) {
            if (!this.f151698h) {
                return null;
            }
            h hVar = f151691e.get(str);
            if (hVar != null) {
                return hVar.a(str2);
            }
            h hVar2 = this.p.get(str);
            if (hVar2 != null) {
                return hVar2.a(str2);
            }
            return null;
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.optimizer.live.sdk.dns.a.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }

        @Override // com.ss.optimizer.live.sdk.dns.e
        public final <T> T a(String str, T t, int i2, int i3) {
            com.ss.optimizer.live.sdk.dns.b.b a2 = com.ss.optimizer.live.sdk.dns.b.b.a();
            str.hashCode();
            return !str.equals("net_effective_connection_type_strategy") ? (str.equals("live_start_play_buffer_thres") && t.getClass() == Long.class) ? (T) Long.valueOf(a2.a(t.longValue(), i2, i3)) : t : t.getClass() == JSONObject.class ? (T) a2.a(t) : t;
        }
    }
