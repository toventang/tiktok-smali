package com.ss.ttm.player;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttm.a.a;
import com.ss.ttm.a.b;
import com.ss.ttm.net.AVResolver;
import com.ss.ttm.player.m;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TTPlayerClient extends n implements Handler.Callback, j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f151991a = TTPlayerClient.class.getSimpleName();
    private int A;
    private StringBuilder B;
    private int C;
    private int D;
    private m.f E;
    private m.e F;
    private m.c G;
    private m.g H;
    private m.b I;
    private m.d J;
    private m.i K;
    private m.a L;
    private m.j M;
    private m.k N;
    private HashMap<Integer, Integer> O;
    private int P;

    /* renamed from: b  reason: collision with root package name */
    LinkedList<String> f151992b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    final Object f151993c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f151994d;

    /* renamed from: e  reason: collision with root package name */
    int f151995e;

    /* renamed from: f  reason: collision with root package name */
    public k f151996f;

    /* renamed from: g  reason: collision with root package name */
    String f151997g;

    /* renamed from: h  reason: collision with root package name */
    String f151998h;

    /* renamed from: i  reason: collision with root package name */
    Handler f151999i;

    /* renamed from: j  reason: collision with root package name */
    private m f152000j;

    /* renamed from: k  reason: collision with root package name */
    private SurfaceHolder f152001k;

    /* renamed from: l  reason: collision with root package name */
    private Surface f152002l;

    /* renamed from: m  reason: collision with root package name */
    private Context f152003m;
    private String n;
    private boolean o;
    private boolean p = true;
    private x q;
    private PowerManager.WakeLock r;
    private boolean s;
    private long t = 0;
    private volatile boolean u = false;
    private int v = -1;
    private final ReentrantLock w = new ReentrantLock();
    private final ReentrantLock x = new ReentrantLock();
    private final ReentrantReadWriteLock y;
    private final ReentrantReadWriteLock.WriteLock z;

    @Override // com.ss.ttm.player.n
    public final void a(int i2, int i3) {
        if (this.f151996f != null) {
            this.f151994d.lock();
            try {
                if (t()) {
                    this.f151996f.c(i2, i3);
                }
            } finally {
                this.f151994d.unlock();
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(Context context, Uri uri, Map<String, String> map) {
        if (uri != null) {
            a(context, uri);
            if (map != null && map.size() != 0) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey()).append(":").append(entry.getValue()).append("\r\n");
                }
                this.f151994d.lock();
                try {
                    if (t()) {
                        this.f151996f.a(20, sb.toString());
                    }
                } finally {
                    this.f151994d.unlock();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (0 == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (0 == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        b(r6.toString());
        com.bytedance.frameworks.apm.trace.MethodCollector.o(269);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        return;
     */
    @Override // com.ss.ttm.player.n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r5, android.net.Uri r6) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.a(android.content.Context, android.net.Uri):void");
    }

    @Override // com.ss.ttm.player.n
    public final void a(FileDescriptor fileDescriptor, long j2, long j3) {
        a(fileDescriptor);
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(135, j2);
                this.f151996f.a(136, j3);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(IMediaDataSource iMediaDataSource) {
        if (iMediaDataSource != null) {
            this.f151994d.lock();
            try {
                if (t()) {
                    this.f151996f.a(iMediaDataSource);
                }
            } finally {
                this.f151994d.unlock();
            }
        } else {
            throw new IllegalArgumentException("null mediadatasource pointer.");
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(boolean z2) {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.b(z2 ? 1 : 0);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(Surface surface) {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f152002l = surface;
                this.f151996f.a(surface);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(String str) {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(str, 1);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r9, int r10, int r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 692
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.a(int, int, int, java.lang.String):void");
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.a aVar) {
        this.L = aVar;
        this.t |= 8;
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(this.t);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.b bVar) {
        this.I = bVar;
        this.t |= 8192;
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(this.t);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.c cVar) {
        this.G = cVar;
        this.t |= 35184372088833L;
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(this.t);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.e eVar) {
        this.F = eVar;
        this.t |= 7385488862257088434L;
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(this.t);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.d dVar) {
        this.J = dVar;
        this.t |= -8646883788170199040L;
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(this.t);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(f fVar) {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(fVar);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.g gVar) {
        this.H = gVar;
        this.t |= 4;
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(this.t);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.i iVar) {
        this.K = iVar;
        this.t |= 4096;
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(this.t);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.j jVar) {
        this.M = jVar;
        this.t |= 64;
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(this.t);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.k kVar) {
        this.N = kVar;
        this.t |= 8388608;
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(this.t);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.j
    public final void a(SurfaceHolder surfaceHolder) {
        this.f152001k = surfaceHolder;
        if (!this.u) {
            this.f151994d.lock();
            try {
                if (t()) {
                    SurfaceHolder surfaceHolder2 = this.f152001k;
                    if (surfaceHolder != surfaceHolder2) {
                        if (surfaceHolder2 != null) {
                            surfaceHolder2.removeCallback(this.q);
                        }
                        this.f152001k = surfaceHolder;
                        if (surfaceHolder != null) {
                            surfaceHolder.addCallback(this.q);
                        }
                    }
                    this.f151996f.a(surfaceHolder.getSurface());
                }
            } finally {
                this.f151994d.unlock();
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(p pVar) {
        this.f151994d.lock();
        try {
            if (!(!t() || pVar == null || pVar.f152093d == -1.0f)) {
                this.f151996f.a(60, pVar.f152093d);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.j
    public final void b() {
        b.a(f151991a, "surface is change");
    }

    @Override // com.ss.ttm.player.n
    public final void q() {
        if (!this.o) {
            this.o = true;
            v();
        }
    }

    public final boolean t() {
        k kVar = this.f151996f;
        if (kVar == null || !kVar.i()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(101320);
        TTVersion.a();
    }

    private void v() {
        boolean z2;
        SurfaceHolder surfaceHolder = this.f152001k;
        if (surfaceHolder != null && this.D == 0) {
            if (!this.o || !this.s) {
                z2 = false;
            } else {
                z2 = true;
            }
            surfaceHolder.setKeepScreenOn(z2);
        }
    }

    @Override // com.ss.ttm.player.n
    public final int l() {
        this.f151994d.lock();
        try {
            int i2 = 0;
            if (t()) {
                i2 = this.f151996f.a(2, 0);
            }
            return i2;
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final int m() {
        this.f151994d.lock();
        try {
            int i2 = 0;
            if (t()) {
                i2 = this.f151996f.a(4, 0);
            }
            return i2;
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final int n() {
        this.f151994d.lock();
        try {
            int i2 = 0;
            if (t()) {
                i2 = this.f151996f.a(3, 0);
            }
            return i2;
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final int o() {
        this.f151994d.lock();
        try {
            int i2 = 0;
            if (t()) {
                i2 = this.f151996f.a(1, 0);
            }
            return i2;
        } finally {
            this.f151994d.unlock();
        }
    }

    private void u() {
        try {
            this.w.lock();
            this.v = this.f151996f.j();
        } finally {
            if (this.w.isLocked()) {
                this.w.unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.n
    public final void f() {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.d();
            }
            this.f151994d.unlock();
            c(false);
        } catch (Throwable th) {
            this.f151994d.unlock();
            throw th;
        }
    }

    @Override // com.ss.ttm.player.n
    public final void g() {
        this.z.lock();
        try {
            if (t()) {
                this.f151996f.e();
                SurfaceHolder surfaceHolder = this.f152001k;
                if (surfaceHolder != null) {
                    this.f151996f.a(surfaceHolder.getSurface());
                }
                this.f151999i.removeCallbacksAndMessages(null);
                this.f151995e = 0;
                this.f151992b.clear();
                u();
            }
        } finally {
            this.z.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.n
    public final void h() {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.f();
            }
            this.f151994d.unlock();
            c(false);
        } catch (Throwable th) {
            this.f151994d.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.n
    public final void i() {
        this.u = true;
        SurfaceHolder surfaceHolder = this.f152001k;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.q);
        }
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a();
            }
            this.f151994d.unlock();
            this.f152002l = null;
        } catch (Throwable th) {
            this.f151994d.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.n
    public final void j() {
        this.u = true;
        SurfaceHolder surfaceHolder = this.f152001k;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.q);
        }
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a();
            }
            this.f151994d.unlock();
            this.f152002l = null;
            new Thread(new Runnable() {
                /* class com.ss.ttm.player.TTPlayerClient.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101321);
                }

                public final void run() {
                    TTPlayerClient.this.d();
                }
            }).start();
        } catch (Throwable th) {
            this.f151994d.unlock();
            throw th;
        }
    }

    @Override // com.ss.ttm.player.n
    public final void k() {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151995e = 0;
                this.f151992b.clear();
                if (this.u) {
                    this.f151996f.a(this.f152001k.getSurface());
                    this.u = false;
                }
                this.f151996f.g();
                u();
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final boolean p() {
        this.f151994d.lock();
        try {
            boolean z2 = false;
            if (t() && this.f151996f.a(6, 0) == 1) {
                z2 = true;
            }
            return z2;
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final int r() {
        this.f151994d.lock();
        try {
            int i2 = 0;
            if (t()) {
                i2 = this.f151996f.a(11, 0);
            }
            return i2;
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final boolean s() {
        this.f151994d.lock();
        try {
            boolean z2 = false;
            if (t() && this.f151996f.a(12, 0) == 1) {
                z2 = true;
            }
            return z2;
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final int c() {
        this.f151994d.lock();
        try {
            return t() ? 1 : 0;
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void d() {
        String w2;
        MethodCollector.i(263);
        c(false);
        v();
        this.z.lock();
        try {
            k kVar = this.f151996f;
            this.f151996f = null;
            this.v = -1;
            if (kVar != null) {
                kVar.b();
            }
            this.z.unlock();
            SurfaceHolder surfaceHolder = this.f152001k;
            if (surfaceHolder != null) {
                surfaceHolder.removeCallback(this.q);
                this.f152001k = null;
                this.u = true;
            }
            this.f152002l = null;
            synchronized (this.f151993c) {
                try {
                    Handler handler = this.f151999i;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        this.f151999i = null;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(263);
                    throw th;
                }
            }
            if (!(this.E == null || (w2 = w()) == null)) {
                w2.length();
            }
            this.f152003m = null;
            MethodCollector.o(263);
        } catch (Throwable th2) {
            this.z.unlock();
            MethodCollector.o(263);
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.n
    public final void e() {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.c();
                u();
                this.A = this.f151996f.a(800, 0);
            }
            this.f151994d.unlock();
            c(true);
        } catch (Throwable th) {
            this.f151994d.unlock();
            throw th;
        }
    }

    private String w() {
        try {
            StringBuilder sb = new StringBuilder();
            LinkedList<String> linkedList = this.f151992b;
            if (!((linkedList == null || linkedList.size() <= 0) && this.f151997g == null && this.f151998h == null)) {
                Context context = this.f152003m;
                if (a.f151882a == null) {
                    a.f151882a = new StringBuilder();
                    a.a(context, a.f151882a);
                }
                sb.append((CharSequence) a.f151882a);
                sb.append("\r\n").append("error").append(":").append("play error");
                Iterator<String> it = this.f151992b.iterator();
                while (it.hasNext()) {
                    sb.append(it.next()).append("\n");
                }
                String str = this.f151997g;
                if (str != null) {
                    sb.append(str).append("\n");
                    this.f151997g = null;
                }
                String str2 = this.f151998h;
                if (str2 != null) {
                    sb.append(str2).append("\n");
                    this.f151998h = null;
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.ttm.player.j
    public final void a() {
        if (!this.u) {
            if (this.P > 0) {
                try {
                    b.a(new Callable<String>() {
                        /* class com.ss.ttm.player.TTPlayerClient.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(101322);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public String call() {
                            try {
                                TTPlayerClient.this.f151994d.lockInterruptibly();
                                try {
                                    if (TTPlayerClient.this.t()) {
                                        TTPlayerClient.this.f151996f.a((Surface) null);
                                    }
                                    return "OK";
                                } finally {
                                    TTPlayerClient.this.f151994d.unlock();
                                }
                            } catch (InterruptedException unused) {
                                return "OK";
                            }
                        }
                    }).get((long) this.P, TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                }
            } else {
                this.f151994d.lock();
                try {
                    if (t()) {
                        this.f151996f.a((Surface) null);
                    }
                } finally {
                    this.f151994d.unlock();
                }
            }
        }
    }

    private void a(FileDescriptor fileDescriptor) {
        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
        try {
            this.f151996f.a(dup.getFd());
            dup.close();
        } catch (Throwable th) {
            if (dup != null) {
                dup.close();
            }
            throw th;
        }
    }

    private void d(int i2) {
        m.i iVar;
        if (!this.p && (iVar = this.K) != null) {
            this.p = true;
            if (i2 >= this.v) {
                iVar.a();
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final float c(int i2) {
        this.f151994d.lock();
        try {
            float f2 = 0.0f;
            if (t()) {
                f2 = this.f151996f.b(i2, 0.0f);
            }
            return f2;
        } finally {
            this.f151994d.unlock();
        }
    }

    public Object getObjectOption(int i2) {
        Object obj;
        this.f151994d.lock();
        try {
            if (t()) {
                obj = this.f151996f.e(i2);
            } else {
                obj = null;
            }
            return obj;
        } finally {
            this.f151994d.unlock();
        }
    }

    public boolean handleMessage(Message message) {
        String str;
        int i2 = message.arg2;
        int i3 = message.what;
        int i4 = message.arg1;
        if (message.obj instanceof String) {
            str = (String) message.obj;
        } else {
            str = null;
        }
        a(i2, i3, i4, str);
        return true;
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(audioProcessor);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    public void setLoadControl(LoadControl loadControl) {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(loadControl);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    public void setMaskInfo(MaskInfo maskInfo) {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(maskInfo);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    public void setSubInfo(SubInfo subInfo) {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(subInfo);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    private void b(String str) {
        if (str.toLowerCase(Locale.US).indexOf("://") <= 0) {
            this.n = "file://".concat(String.valueOf(str));
        } else {
            this.n = str;
        }
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(this.n);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    private void c(boolean z2) {
        PowerManager.WakeLock wakeLock = this.r;
        if (wakeLock != null) {
            if (z2) {
                if (!wakeLock.isHeld()) {
                    this.r.acquire();
                }
            } else if (this.r.isHeld()) {
                this.r.release();
            }
        }
        this.s = z2;
        v();
    }

    private void e(int i2) {
        try {
            this.w.lock();
            m.b bVar = this.I;
            if (bVar != null && i2 >= this.v) {
                bVar.a(this.f152000j);
            }
        } finally {
            if (this.w.isLocked()) {
                this.w.unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.ttm.player.n
    public final void b(SurfaceHolder surfaceHolder) {
        SurfaceHolder surfaceHolder2 = this.f152001k;
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this.q);
        }
        this.f152001k = surfaceHolder;
        Surface surface = null;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.q);
            surface = this.f152001k.getSurface();
        }
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(surface);
            }
            this.f151994d.unlock();
            v();
        } catch (Throwable th) {
            this.f151994d.unlock();
            throw th;
        }
    }

    @Override // com.ss.ttm.player.n
    public final void b(boolean z2) {
        int i2;
        this.f151994d.lock();
        try {
            if (t()) {
                k kVar = this.f151996f;
                if (z2) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                kVar.b(12, i2);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if (new java.io.File(r2).exists() != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017d, code lost:
        if (new java.io.File(r2).exists() != false) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    @Override // com.ss.ttm.player.n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(int r14) {
        /*
        // Method dump skipped, instructions count: 685
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerClient.b(int):java.lang.String");
    }

    @Override // com.ss.ttm.player.n
    public final void a(int i2) {
        this.f151994d.lock();
        try {
            if (t()) {
                this.p = false;
                this.f151996f.c(i2);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    public static synchronized TTPlayerClient create(m mVar, Context context) {
        TTPlayerClient create;
        synchronized (TTPlayerClient.class) {
            MethodCollector.i(243);
            create = create(mVar, context, null);
            MethodCollector.o(243);
        }
        return create;
    }

    @Override // com.ss.ttm.player.n
    public final long b(int i2, long j2) {
        this.f151994d.lock();
        try {
            if (t()) {
                j2 = this.f151996f.b(i2, j2);
            }
            return j2;
        } finally {
            this.f151994d.unlock();
        }
    }

    private void d(int i2, int i3) {
        try {
            this.w.lock();
            m.c cVar = this.G;
            if (cVar != null && i3 >= this.v) {
                int i4 = this.f151995e;
                if (i4 != 0) {
                    i2 = i4;
                } else if (i2 == 0) {
                    i2 = -1048575;
                }
                cVar.a(this.f152000j, i2, 0);
            }
        } finally {
            if (this.w.isLocked()) {
                this.w.unlock();
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final int a(int i2, float f2) {
        int i3;
        this.f151994d.lock();
        try {
            if (t()) {
                i3 = this.f151996f.a(i2, f2);
            } else {
                i3 = -1;
            }
            return i3;
        } finally {
            this.f151994d.unlock();
        }
    }

    private TTPlayerClient(Context context, HashMap<Integer, Integer> hashMap) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.y = reentrantReadWriteLock;
        this.f151994d = reentrantReadWriteLock.readLock();
        this.z = reentrantReadWriteLock.writeLock();
        this.f151995e = 0;
        this.A = 0;
        this.B = new StringBuilder(1024);
        this.C = -1;
        this.D = 0;
        this.O = null;
        this.P = -1;
        this.O = hashMap;
        this.u = false;
        this.q = new x(this);
        this.f152003m = context;
        if (Looper.myLooper() != null) {
            this.f151999i = new Handler(this);
        } else {
            this.f151999i = new Handler(Looper.getMainLooper(), this);
        }
    }

    @Override // com.ss.ttm.player.n
    public final int a(int i2, long j2) {
        int i3;
        this.f151994d.lock();
        try {
            if (t()) {
                i3 = this.f151996f.a(i2, j2);
            } else {
                i3 = -1;
            }
            return i3;
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final int b(int i2, int i3) {
        int i4;
        if (i2 == 41) {
            AVResolver.f151896d = i3;
            return 0;
        } else if (i2 == 5003) {
            this.D = i3;
            return 0;
        } else if (i2 == 952) {
            this.P = i3;
            return 0;
        } else {
            this.f151994d.lock();
            try {
                if (t()) {
                    i4 = this.f151996f.b(i2, i3);
                } else {
                    i4 = -1;
                }
                return i4;
            } finally {
                this.f151994d.unlock();
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final int a(int i2, String str) {
        int i3;
        this.f151994d.lock();
        try {
            if (t()) {
                i3 = this.f151996f.a(i2, str);
            } else {
                i3 = -1;
            }
            return i3;
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final int c(int i2, int i3) {
        if (i2 == 5000) {
            return this.f151995e;
        }
        if (i2 == 26) {
            return this.C;
        }
        this.f151994d.lock();
        try {
            if (t()) {
                i3 = this.f151996f.a(i2, i3);
            }
            return i3;
        } finally {
            this.f151994d.unlock();
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(float f2, float f3) {
        this.f151994d.lock();
        try {
            if (t()) {
                this.f151996f.a(f2, f3);
            }
        } finally {
            this.f151994d.unlock();
        }
    }

    public static synchronized TTPlayerClient create(m mVar, Context context, HashMap<Integer, Integer> hashMap) {
        synchronized (TTPlayerClient.class) {
            MethodCollector.i(244);
            TTVersion.a();
            TTPlayerClient tTPlayerClient = new TTPlayerClient(context, hashMap);
            k a2 = k.a(context, tTPlayerClient, hashMap);
            if (a2 == null) {
                MethodCollector.o(244);
                return null;
            }
            tTPlayerClient.f151996f = a2;
            tTPlayerClient.f152000j = mVar;
            MethodCollector.o(244);
            return tTPlayerClient;
        }
    }
}
