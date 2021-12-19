package com.ss.android.ugc.aweme.livewallpaper.c;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Object f108814a;

    /* renamed from: b  reason: collision with root package name */
    Object f108815b;

    /* renamed from: c  reason: collision with root package name */
    e f108816c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f108817d;

    /* renamed from: e  reason: collision with root package name */
    List<k> f108818e;

    /* renamed from: f  reason: collision with root package name */
    f f108819f;

    /* renamed from: g  reason: collision with root package name */
    q f108820g;

    /* renamed from: h  reason: collision with root package name */
    s f108821h;

    /* renamed from: i  reason: collision with root package name */
    s f108822i;

    /* renamed from: j  reason: collision with root package name */
    float[] f108823j;

    /* renamed from: k  reason: collision with root package name */
    int f108824k;

    /* renamed from: l  reason: collision with root package name */
    int f108825l;

    /* renamed from: m  reason: collision with root package name */
    public int f108826m;
    float[] n;
    public Pair<Float, Float> o;
    private d p;
    private Thread q;
    private List<k> r;
    private boolean s;
    private Object t = new Object();
    private int u = 8;

    static {
        Covode.recordClassIndex(69702);
    }

    public final void e() {
        this.f108817d.sendEmptyMessage(5);
    }

    public final void a() {
        if (this.f108826m != 3) {
            g();
            this.f108826m = 3;
        }
    }

    public final void b() {
        try {
            a(this.f108814a);
            this.f108826m = 4;
        } catch (Throwable unused) {
        }
    }

    public final void d() {
        this.f108817d.sendEmptyMessage(8);
        i();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0008 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0008 A[LOOP:0: B:2:0x0008->B:14:0x0008, LOOP_START, SYNTHETIC, Splitter:B:2:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r5 = this;
            r4 = 7236(0x1c44, float:1.014E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            java.lang.Object r3 = r5.t
            monitor-enter(r3)
        L_0x0008:
            boolean r0 = r5.s     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0014
            java.lang.Object r2 = r5.t     // Catch:{ InterruptedException -> 0x0008 }
            r0 = 10
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x0008 }
            goto L_0x0008
        L_0x0014:
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.c.j.h():void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0008 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0008 A[LOOP:0: B:2:0x0008->B:14:0x0008, LOOP_START, SYNTHETIC, Splitter:B:2:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
            r5 = this;
            r4 = 7339(0x1cab, float:1.0284E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            java.lang.Object r3 = r5.t
            monitor-enter(r3)
        L_0x0008:
            boolean r0 = r5.s     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r5.t     // Catch:{ InterruptedException -> 0x0008 }
            r0 = 10
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x0008 }
            goto L_0x0008
        L_0x0014:
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.c.j.i():void");
    }

    public final k f() {
        h j2 = j();
        if (j2 == null) {
            return null;
        }
        k kVar = new k(j2);
        j2.b();
        kVar.setOnFrameAvailableListener(this);
        return kVar;
    }

    private void g() {
        s sVar = this.f108821h;
        if (sVar != null) {
            sVar.b();
        }
        s sVar2 = this.f108822i;
        if (sVar2 != null) {
            sVar2.b();
        }
        f fVar = this.f108819f;
        if (fVar != null) {
            fVar.c();
            this.f108819f = null;
        }
        q qVar = this.f108820g;
        if (qVar != null) {
            qVar.c();
            this.f108820g = null;
        }
        e eVar = this.f108816c;
        if (eVar != null) {
            eVar.d();
            this.f108816c = null;
        }
        d dVar = this.p;
        if (dVar != null) {
            dVar.a();
            this.p = null;
        }
    }

    private h j() {
        MethodCollector.i(7346);
        Message obtainMessage = this.f108817d.obtainMessage(3);
        Message message = new Message();
        message.arg1 = 1;
        obtainMessage.arg1 = 0;
        obtainMessage.arg2 = 0;
        obtainMessage.obj = message;
        this.f108817d.sendMessage(obtainMessage);
        try {
            synchronized (message) {
                while (message.arg1 != 0) {
                    try {
                        message.wait(10);
                    } catch (Throwable th) {
                        MethodCollector.o(7346);
                        throw th;
                    }
                }
            }
            h hVar = (h) message.obj;
            MethodCollector.o(7346);
            return hVar;
        } catch (InterruptedException unused) {
            MethodCollector.o(7346);
            return null;
        }
    }

    public final void run() {
        MethodCollector.i(7356);
        Looper.prepare();
        this.f108817d = new a(this);
        synchronized (this.t) {
            try {
                this.s = true;
                this.t.notify();
            } finally {
                MethodCollector.o(7356);
            }
        }
        Looper.loop();
        synchronized (this.t) {
            try {
                this.s = false;
                this.t.notify();
            } finally {
                MethodCollector.o(7356);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        e eVar = this.f108816c;
        if (eVar != null) {
            eVar.d();
        }
        Object obj = this.f108815b;
        if (obj == null) {
            this.f108816c = new l(this.p);
        } else if (obj instanceof Surface) {
            this.f108816c = new t(this.p, (Surface) this.f108815b);
        } else if (obj instanceof SurfaceTexture) {
            this.f108816c = new t(this.p, (SurfaceTexture) this.f108815b);
        } else {
            throw new AndroidRuntimeException("UnsupportedOperation");
        }
        this.f108825l = this.f108816c.b();
        this.f108824k = this.f108816c.c();
        this.f108816c.e();
        this.f108814a = d.b();
    }

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<j> f108827a;

        static {
            Covode.recordClassIndex(69703);
        }

        a(j jVar) {
            this.f108827a = new WeakReference<>(jVar);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        public final void handleMessage(Message message) {
            MethodCollector.i(6991);
            j jVar = this.f108827a.get();
            if (jVar != null) {
                switch (message.what) {
                    case 1:
                        jVar.a(message.obj);
                        MethodCollector.o(6991);
                        return;
                    case 2:
                        Object obj = message.obj;
                        if (obj != null) {
                            h hVar = (h) obj;
                            if (jVar.f108826m == 4) {
                                if (jVar.f108820g == null) {
                                    jVar.f108820g = new q();
                                    if (!jVar.f108820g.a(jVar.f108825l, jVar.f108824k)) {
                                        jVar.a();
                                    }
                                }
                                if (!(jVar.f108820g == null || hVar == null || jVar.f108815b == null)) {
                                    Matrix.setIdentityM(jVar.n, 0);
                                    jVar.f108820g.a(hVar.c(), jVar.n);
                                    hVar.d();
                                    jVar.f108816c.a(System.nanoTime());
                                    jVar.f108816c.f();
                                }
                            }
                            hVar.b();
                            MethodCollector.o(6991);
                            return;
                        }
                        synchronized (jVar.f108818e) {
                            while (!jVar.f108818e.isEmpty()) {
                                try {
                                    k remove = jVar.f108818e.remove(0);
                                    if (jVar.f108826m == 4) {
                                        if (jVar.f108819f == null) {
                                            jVar.f108819f = new f();
                                            if (!jVar.f108819f.a(jVar.f108825l, jVar.f108824k)) {
                                                jVar.a();
                                            }
                                            jVar.f108823j = new float[16];
                                        }
                                        if (jVar.f108819f != null) {
                                            if (remove != null) {
                                                if (jVar.f108815b != null) {
                                                    synchronized (remove) {
                                                        try {
                                                            if (!remove.f108830c) {
                                                                remove.updateTexImage();
                                                                long timestamp = remove.getTimestamp();
                                                                if (remove.f108829b) {
                                                                    h hVar2 = remove.f108828a;
                                                                    remove.getTransformMatrix(jVar.f108823j);
                                                                    Matrix.setIdentityM(jVar.n, 0);
                                                                    Matrix.scaleM(jVar.n, 0, ((Float) jVar.o.first).floatValue(), ((Float) jVar.o.second).floatValue(), 1.0f);
                                                                    GLES20.glViewport(0, 0, jVar.f108825l, jVar.f108824k);
                                                                    jVar.f108819f.a(hVar2.c(), jVar.f108823j, jVar.n);
                                                                    hVar2.d();
                                                                    jVar.f108816c.a(timestamp);
                                                                    jVar.f108816c.f();
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    MethodCollector.o(6991);
                                }
                            }
                        }
                        MethodCollector.o(6991);
                        return;
                    case 3:
                        Message message2 = (Message) message.obj;
                        int i2 = message.arg1;
                        int i3 = message.arg2;
                        h hVar3 = null;
                        if (i2 == 0 && i3 == 0 && jVar.f108822i != null) {
                            hVar3 = jVar.f108822i.a();
                        } else if (jVar.f108821h != null) {
                            hVar3 = jVar.f108821h.a();
                        }
                        message2.obj = hVar3;
                        synchronized (message2) {
                            try {
                                message2.arg1 = 0;
                                message2.notify();
                            } finally {
                                MethodCollector.o(6991);
                            }
                        }
                        return;
                    case 4:
                        jVar.a();
                        MethodCollector.o(6991);
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        jVar.b();
                        MethodCollector.o(6991);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        if (jVar.f108826m == 4) {
                            jVar.f108826m = 2;
                        }
                        MethodCollector.o(6991);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        if (jVar.f108826m == 2) {
                            jVar.f108826m = 4;
                        }
                        MethodCollector.o(6991);
                        return;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        jVar.a();
                        Looper.myLooper().quit();
                        jVar.f108826m = 5;
                        MethodCollector.o(6991);
                        return;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        Object obj2 = message.obj;
                        jVar.f108815b = obj2;
                        if (obj2 != null) {
                            jVar.c();
                        }
                        MethodCollector.o(6991);
                        return;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        int i4 = message.arg1;
                        int i5 = message.arg2;
                        jVar.f108825l = i4;
                        jVar.f108824k = i5;
                        if (jVar.f108820g != null) {
                            jVar.f108820g.c();
                            jVar.f108820g.a(jVar.f108825l, jVar.f108824k);
                        }
                        if (jVar.f108819f != null) {
                            jVar.f108819f.c();
                            jVar.f108819f.a(jVar.f108825l, jVar.f108824k);
                        }
                        MethodCollector.o(6991);
                        return;
                    default:
                        super.handleMessage(message);
                        break;
                }
            }
            MethodCollector.o(6991);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        g();
        this.p = new d(obj);
        c();
        s sVar = new s(this.u, this.f108825l, this.f108824k);
        this.f108821h = sVar;
        sVar.f108863c = "MusMediaRender.TexQueue";
        s sVar2 = new s(this.u, 0, 0);
        this.f108822i = sVar2;
        sVar2.f108863c = "MusMediaRender.OESQueue";
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        MethodCollector.i(7350);
        synchronized (this.f108818e) {
            try {
                this.f108818e.add((k) surfaceTexture);
            } finally {
                MethodCollector.o(7350);
            }
        }
        if (this.f108826m == 4) {
            Message obtainMessage = this.f108817d.obtainMessage(2);
            obtainMessage.obj = null;
            this.f108817d.sendMessage(obtainMessage);
        }
    }

    public j(Object obj) {
        Float valueOf = Float.valueOf(1.0f);
        this.o = new Pair<>(valueOf, valueOf);
        this.f108818e = new ArrayList();
        this.r = new ArrayList();
        Thread thread = new Thread(this);
        this.q = thread;
        this.f108814a = null;
        this.f108815b = obj;
        this.s = false;
        this.f108826m = 3;
        thread.start();
        h();
        this.n = new float[16];
    }
}
