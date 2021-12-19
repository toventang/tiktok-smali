package com.ss.android.ugc.aweme.player.sdk.c;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.api.i;
import com.ss.android.ugc.aweme.player.sdk.api.k;
import com.ss.android.ugc.aweme.player.sdk.b.d;
import com.ss.android.ugc.aweme.player.sdk.c.c;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.model.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public final class f implements c.b {

    /* renamed from: i  reason: collision with root package name */
    public static volatile boolean f115409i;

    /* renamed from: a  reason: collision with root package name */
    public m.e f115410a;

    /* renamed from: b  reason: collision with root package name */
    List<c> f115411b;

    /* renamed from: c  reason: collision with root package name */
    public c f115412c;

    /* renamed from: d  reason: collision with root package name */
    c f115413d;

    /* renamed from: e  reason: collision with root package name */
    c f115414e;

    /* renamed from: f  reason: collision with root package name */
    boolean f115415f;

    /* renamed from: g  reason: collision with root package name */
    public i f115416g;

    /* renamed from: h  reason: collision with root package name */
    public d f115417h;

    /* renamed from: j  reason: collision with root package name */
    public HandlerThread f115418j;

    /* renamed from: k  reason: collision with root package name */
    public a f115419k;

    /* renamed from: l  reason: collision with root package name */
    public k f115420l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f115421m = new Object();
    private List<HandlerThread> n;
    private List<HandlerThread> o;
    private List<c> p;
    private boolean q;
    private boolean r;
    private long s;
    private long t;
    private long u;
    private long v;
    private String w;
    private String x;
    private String y;
    private int z = -1;

    static {
        Covode.recordClassIndex(74098);
    }

    public class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f115422a;

        /* renamed from: b  reason: collision with root package name */
        volatile a f115423b;

        /* renamed from: c  reason: collision with root package name */
        public volatile boolean f115424c;

        static {
            Covode.recordClassIndex(74099);
        }

        public final void a() {
            if (!this.f115424c) {
                sendEmptyMessage(3);
            }
        }

        public final void handleMessage(Message message) {
            MethodCollector.i(3756);
            int i2 = message.what;
            k kVar = null;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.f115423b != null) {
                            this.f115423b.g();
                            this.f115423b.h();
                            this.f115423b = null;
                        } else {
                            new Handler(Looper.getMainLooper()).post(new Runnable() {
                                /* class com.ss.android.ugc.aweme.player.sdk.c.f.a.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(74100);
                                }

                                public final void run() {
                                    if (f.this.f115418j != null) {
                                        int i2 = Build.VERSION.SDK_INT;
                                        f.this.f115418j.quitSafely();
                                    }
                                }
                            });
                        }
                        this.f115424c = true;
                    }
                    MethodCollector.o(3756);
                } else if (this.f115424c) {
                    MethodCollector.o(3756);
                } else {
                    synchronized (f.this.f115421m) {
                        try {
                            if (!this.f115422a && !f.f115409i && (this.f115423b == null || !this.f115423b.f115361a)) {
                                if (this.f115423b == null) {
                                    a(f.this.f115420l, 2);
                                }
                                if (message.obj instanceof d) {
                                    d dVar = (d) message.obj;
                                    p pVar = dVar.f115333a;
                                    b bVar = dVar.f115334b;
                                    if (f.this.f115420l != null) {
                                        f.this.f115420l.a();
                                    }
                                    if (this.f115423b != null && !this.f115423b.f115375i && !this.f115423b.f115376j && !this.f115423b.f115361a && !TextUtils.equals(pVar.f148803j, this.f115423b.f115369c)) {
                                        if (pVar.u != null) {
                                            this.f115423b.a(pVar.u);
                                        }
                                        pVar.t = true;
                                        this.f115423b.a(bVar);
                                        this.f115423b.a(pVar);
                                        this.f115423b.f115361a = true;
                                    }
                                }
                                MethodCollector.o(3756);
                            }
                        } finally {
                            MethodCollector.o(3756);
                        }
                    }
                }
            } else if (this.f115424c) {
                MethodCollector.o(3756);
            } else {
                synchronized (f.this.f115421m) {
                    try {
                        if (!this.f115422a && !f.f115409i && this.f115423b == null) {
                            if (message.obj instanceof k) {
                                kVar = (k) message.obj;
                            }
                            a(kVar, 1);
                            MethodCollector.o(3756);
                        }
                    } finally {
                        MethodCollector.o(3756);
                    }
                }
            }
        }

        public a(HandlerThread handlerThread) {
            super(handlerThread.getLooper());
        }

        private void a(k kVar, int i2) {
            boolean z;
            if (kVar != null) {
                kVar.a(i2);
            }
            if (f.this.f115417h == null || !f.this.f115417h.q) {
                z = false;
            } else {
                z = true;
            }
            this.f115423b = new a(f.this.f115410a, f.this.f115418j, new c.b() {
                /* class com.ss.android.ugc.aweme.player.sdk.c.f.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(74101);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.c.c.b
                public final void a(final c cVar, final HandlerThread handlerThread) {
                    if (handlerThread != null && handlerThread.getLooper() != Looper.getMainLooper()) {
                        f.this.f115419k.post(new Runnable() {
                            /* class com.ss.android.ugc.aweme.player.sdk.c.f.a.AnonymousClass2.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(74102);
                            }

                            public final void run() {
                                c cVar = cVar;
                                if (cVar != null) {
                                    cVar.f115376j = true;
                                }
                                new Handler(Looper.getMainLooper()).post(new Runnable() {
                                    /* class com.ss.android.ugc.aweme.player.sdk.c.f.a.AnonymousClass2.AnonymousClass1.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(74103);
                                    }

                                    public final void run() {
                                        int i2 = Build.VERSION.SDK_INT;
                                        handlerThread.quitSafely();
                                    }
                                });
                            }
                        });
                    }
                }
            }, f.this.f115416g, z);
            this.f115423b.a(kVar);
            this.f115423b.a();
            if (com.ss.android.ugc.playerkit.exp.b.j()) {
                this.f115423b.d();
            }
            if (kVar != null) {
                kVar.b(i2);
            }
        }
    }

    private boolean d() {
        if (this.f115417h.f115402g - (this.n.size() + this.o.size()) > 0) {
            return true;
        }
        return false;
    }

    public final void b() {
        if (this.f115418j == null || this.f115419k == null) {
            HandlerThread handlerThread = new HandlerThread("acceleratePlayHandlerThread");
            this.f115418j = handlerThread;
            handlerThread.start();
            this.f115419k = new a(this.f115418j);
        }
    }

    private void c() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("PlaySessionManager", "initThreadPool max:" + this.f115417h.f115402g + ", core:" + this.f115417h.f115403h);
        }
        for (int i2 = 0; i2 < this.f115417h.f115403h; i2++) {
            try {
                HandlerThread handlerThread = new HandlerThread("play_thread_".concat(String.valueOf(i2)), 0);
                handlerThread.start();
                this.n.add(handlerThread);
            } catch (Exception unused) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("PlaySessionManager", "create init thread fail, may use main looper");
                }
            }
        }
        this.s = System.currentTimeMillis();
    }

    public final void a() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("PlaySessionManager", "release mCurrentSession:" + this.f115412c);
        }
        c cVar = this.f115412c;
        if (cVar != null) {
            cVar.h();
        }
        this.f115412c = null;
        c cVar2 = this.f115413d;
        if (cVar2 != null) {
            cVar2.h();
        }
        this.f115413d = null;
        c cVar3 = this.f115414e;
        if (cVar3 != null) {
            cVar3.h();
        }
        this.f115414e = null;
        a aVar = this.f115419k;
        if (aVar != null) {
            aVar.a();
        }
        for (HandlerThread handlerThread : this.n) {
            int i2 = Build.VERSION.SDK_INT;
            handlerThread.quitSafely();
        }
        if (this.p != null) {
            if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                com.ss.android.ugc.aweme.player.sdk.a.a("PlaySessionManager", "release session pool:" + this.p.size());
            }
            if (this.p.size() > 0) {
                for (c cVar4 : this.p) {
                    cVar4.h();
                }
            }
            this.p.clear();
        }
        this.n.clear();
        this.o.clear();
        this.f115411b.clear();
        this.f115415f = true;
        this.u = System.currentTimeMillis();
        this.y = Thread.currentThread().getName();
    }

    static boolean b(c cVar) {
        if (cVar == null || !cVar.c()) {
            return true;
        }
        return false;
    }

    static void a(c cVar) {
        Message obtainMessage = cVar.f115371e.obtainMessage(17);
        cVar.a(4, 10, obtainMessage);
        cVar.f();
        cVar.e();
        obtainMessage.sendToTarget();
    }

    private static boolean c(p pVar) {
        com.ss.android.ugc.playerkit.model.d dVar;
        if (pVar == null || (dVar = pVar.R) == null) {
            return false;
        }
        if (dVar.f148705a == null && TextUtils.isEmpty(dVar.f148707c)) {
            return false;
        }
        return true;
    }

    private boolean e(c cVar) {
        if (!com.ss.android.ugc.playerkit.exp.b.l() || cVar.f115379m) {
            this.p.add(cVar);
            return true;
        }
        cVar.g();
        cVar.h();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        if (r4 != null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.player.sdk.c.c b(com.ss.android.ugc.playerkit.model.p r6) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.c.f.b(com.ss.android.ugc.playerkit.model.p):com.ss.android.ugc.aweme.player.sdk.c.c");
    }

    /* access modifiers changed from: package-private */
    public final boolean c(c cVar) {
        if (cVar == null || cVar.f115375i || cVar.f115376j || !this.q) {
            return false;
        }
        if (!this.f115417h.f115406k && c(cVar.f115374h)) {
            return false;
        }
        boolean z2 = true;
        if (this.f115417h.n ? this.p == null : this.f115414e != null) {
            z2 = false;
        }
        if (this.f115417h.f115407l && this.p != null && cVar.f115378l == 0 && !this.p.isEmpty()) {
            z2 = false;
        }
        if (!com.ss.android.ugc.playerkit.exp.b.l() || cVar.f115379m) {
            return z2;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void d(c cVar) {
        List<c> list;
        if (cVar != null && (list = this.p) != null && !list.contains(cVar)) {
            if (this.p.size() < this.f115417h.f115404i) {
                this.p.add(cVar);
                return;
            }
            ArrayList arrayList = new ArrayList(3);
            Iterator<c> it = this.p.iterator();
            while (true) {
                if (it.hasNext()) {
                    c next = it.next();
                    if (next.f115378l == cVar.f115378l) {
                        break;
                    } else if (arrayList.contains(Integer.valueOf(next.f115378l))) {
                        this.p.remove(next);
                        next.h();
                        this.p.add(cVar);
                        return;
                    } else {
                        arrayList.add(Integer.valueOf(next.f115378l));
                    }
                } else if (1 == this.p.size()) {
                    c cVar2 = this.p.get(0);
                    if (cVar2 != null) {
                        cVar2.h();
                    }
                    this.p.remove(0);
                    this.p.add(cVar);
                    return;
                }
            }
            cVar.h();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        if (r7 == null) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.player.sdk.c.c a(com.ss.android.ugc.playerkit.model.p r14) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.c.f.a(com.ss.android.ugc.playerkit.model.p):com.ss.android.ugc.aweme.player.sdk.c.c");
    }

    public f(m.e eVar, d dVar) {
        this.f115410a = eVar;
        this.f115411b = new ArrayList();
        this.f115417h = dVar;
        if (dVar == null) {
            this.f115417h = new d();
        }
        if (this.f115417h.f115400e && this.f115417h.f115404i > 0) {
            this.p = new ArrayList(this.f115417h.f115404i);
        }
        if (this.f115417h.f115399d) {
            this.f115417h.f115402g = 1;
            this.f115417h.f115403h = 1;
        }
        if (this.f115417h.f115402g == 1 && this.f115417h.f115403h == 1 && this.f115417h.f115400e) {
            this.f115417h.f115404i = 0;
        }
        if (dVar.f115402g <= 0) {
            dVar.f115402g = d.f115396a;
        }
        if (dVar.f115403h > dVar.f115402g || dVar.f115403h <= 0) {
            dVar.f115403h = dVar.f115402g;
        }
        if (this.f115417h.f115400e && this.f115417h.f115404i > this.f115417h.f115403h) {
            d dVar2 = this.f115417h;
            dVar2.f115404i = dVar2.f115403h;
        }
        this.q = this.f115417h.f115405j;
        this.r = this.f115417h.f115406k;
        this.n = new ArrayList(dVar.f115402g);
        this.o = new ArrayList(dVar.f115402g);
        c();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.c.c.b
    public final void a(c cVar, HandlerThread handlerThread) {
        Object valueOf;
        this.f115411b.remove(cVar);
        this.x = Thread.currentThread().getName();
        this.z = 0;
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            StringBuilder append = new StringBuilder("onSessionRelease session:").append(cVar).append(", idle size:").append(this.n.size()).append(", working size:").append(this.o.size()).append(", session list size:").append(this.f115411b.size()).append(", session pool size:");
            List<c> list = this.p;
            if (list == null) {
                valueOf = "null";
            } else {
                valueOf = Integer.valueOf(list.size());
            }
            com.ss.android.ugc.aweme.player.sdk.a.a("PlaySessionManager", append.append(valueOf).toString());
        }
        if (handlerThread.getLooper() == Looper.getMainLooper()) {
            this.o.removeAll(Collections.singleton(handlerThread));
            this.n.removeAll(Collections.singleton(handlerThread));
            this.w = handlerThread.toString();
            this.v = System.currentTimeMillis();
            this.z = 1;
            if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                com.ss.android.ugc.aweme.player.sdk.a.b("PlaySessionManager", "onSessionRelease main looper thread");
            }
        } else if (this.f115415f) {
            int i2 = Build.VERSION.SDK_INT;
            handlerThread.quitSafely();
            this.w = handlerThread.toString();
            this.v = System.currentTimeMillis();
            this.z = 2;
            this.o.clear();
            this.n.clear();
        } else {
            for (c cVar2 : this.f115411b) {
                if (cVar2.f115370d == handlerThread) {
                    return;
                }
            }
            if (this.n.size() < this.f115417h.f115403h) {
                if (!this.n.contains(handlerThread)) {
                    this.n.add(handlerThread);
                }
                this.o.removeAll(Collections.singleton(handlerThread));
                this.w = handlerThread.toString();
                this.v = System.currentTimeMillis();
                this.z = 3;
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("PlaySessionManager", "onSessionRelease recycle to idle pool");
                    return;
                }
                return;
            }
            int i3 = Build.VERSION.SDK_INT;
            handlerThread.quitSafely();
            this.w = handlerThread.toString();
            this.v = System.currentTimeMillis();
            this.z = 4;
            this.o.removeAll(Collections.singleton(handlerThread));
            this.n.removeAll(Collections.singleton(handlerThread));
            if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                com.ss.android.ugc.aweme.player.sdk.a.a("PlaySessionManager", "onSessionRelease quit thread");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v24, types: [int, boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0463, code lost:
        r9 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0223  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.playerkit.model.p r13, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener r14, com.ss.android.ugc.aweme.player.sdk.api.b r15) {
        /*
        // Method dump skipped, instructions count: 1764
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.c.f.a(com.ss.android.ugc.playerkit.model.p, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.player.sdk.api.b):void");
    }
}
