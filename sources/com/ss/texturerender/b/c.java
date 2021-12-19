package com.ss.texturerender.b;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.texturerender.a.d;
import com.ss.texturerender.a.i;
import com.ss.texturerender.a.j;
import com.ss.texturerender.a.o;
import com.ss.texturerender.b;
import com.ss.texturerender.b.a;
import com.ss.texturerender.g;
import com.ss.texturerender.l;
import com.ss.texturerender.m;
import com.ss.texturerender.n;
import com.ss.texturerender.p;
import com.ss.texturerender.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public final class c extends n {
    private static int N = 2;
    private static int O = 500;
    private static int P = 3;
    private boolean A;
    private r B = new r(m.a().f151841d);
    private i C;
    private b D;
    private b E;
    private int F;
    private int G;
    private float H = 0.5f;
    private boolean I;
    private o J;
    private j K;
    private r.a L;
    private boolean M;
    private a Q = new a();
    private a R = new a();
    private int S;
    private int T;
    private b U = new b();
    private p V;
    private HashMap<p, Message> W = new HashMap<>();
    public long s;
    private Surface t;
    private EGLSurface u = EGL14.EGL_NO_SURFACE;
    private boolean v;
    private float[] w;
    private float[] x;
    private Vector<a> y = new Vector<>(2);
    private int z;

    @Override // com.ss.texturerender.n
    public final void e() {
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static int f151822a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static int f151823b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static int f151824c = 3;

        /* renamed from: d  reason: collision with root package name */
        public p f151825d;

        /* renamed from: e  reason: collision with root package name */
        public int f151826e = f151822a;

        /* renamed from: f  reason: collision with root package name */
        public a.C4064a f151827f;

        static {
            Covode.recordClassIndex(101248);
        }

        public a(p pVar, a.C4064a aVar) {
            this.f151825d = pVar;
            this.f151827f = aVar;
        }
    }

    static {
        Covode.recordClassIndex(101247);
    }

    private int j() {
        if (this.u == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f151845d, this.u, 12375, iArr, 0);
        return iArr[0];
    }

    private int k() {
        if (this.u == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f151845d, this.u, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // com.ss.texturerender.n
    public final synchronized void g() {
        MethodCollector.i(12634);
        super.g();
        h();
        this.z = 0;
        this.U.c();
        MethodCollector.o(12634);
    }

    private void h() {
        Iterator<a> it = this.y.iterator();
        while (it.hasNext()) {
            a next = it.next();
            l.a("OverlayVideoTextureRenderer", "_dropAllFrames isMain:" + c(next.f151825d));
            b(next.f151825d);
            e(next.f151825d);
            it.remove();
        }
    }

    @Override // com.ss.texturerender.n
    public final void c() {
        if (this.f151849h != -1) {
            try {
                o oVar = this.J;
                if (oVar != null) {
                    oVar.a();
                }
                o oVar2 = new o();
                this.J = oVar2;
                oVar2.a((Bundle) null);
                j jVar = this.K;
                if (jVar != null) {
                    jVar.a();
                }
                j jVar2 = new j();
                this.K = jVar2;
                jVar2.a((Bundle) null);
                this.L = new r.a(this.f151847f);
            } catch (Exception e2) {
                a(e2.toString());
            }
            l.a("OverlayVideoTextureRenderer", "initGLComponents done render:".concat(String.valueOf(this)));
        }
    }

    @Override // com.ss.texturerender.n
    public final void d() {
        o oVar = this.J;
        if (oVar != null) {
            oVar.a();
            this.J = null;
        }
        j jVar = this.K;
        if (jVar != null) {
            jVar.a();
            this.K = null;
        }
        i iVar = this.C;
        if (iVar != null) {
            g.a(iVar.f151802a);
            this.C = null;
        }
        b bVar = this.D;
        if (bVar != null) {
            bVar.b();
            this.D = null;
        }
        b bVar2 = this.E;
        if (bVar2 != null) {
            bVar2.b();
            this.E = null;
        }
    }

    private void l() {
        int i2;
        long d2 = this.U.d();
        Iterator<a> it = this.y.iterator();
        while (it.hasNext()) {
            a next = it.next();
            long j2 = next.f151827f.pts - d2;
            if (j2 > ((long) O)) {
                if (c(next.f151825d)) {
                    i2 = this.S + 1;
                    this.S = i2;
                } else {
                    i2 = this.T + 1;
                    this.T = i2;
                }
                if (i2 <= P) {
                    next.f151826e = a.f151824c;
                } else {
                    next.f151826e = a.f151823b;
                }
            } else {
                long j3 = 1000000 * j2;
                if (j3 < this.B.f151870c * -2) {
                    next.f151826e = a.f151824c;
                } else if (j3 > this.B.f151870c) {
                    next.f151826e = a.f151823b;
                } else {
                    next.f151826e = a.f151822a;
                }
            }
            l.a("OverlayVideoTextureRenderer", "_avSyncByVsync pts:" + next.f151827f.pts + " master:" + d2 + " diff:" + j2 + " isMainSurface:" + c(next.f151825d) + " status:" + next.f151826e);
        }
        if (i()) {
            if (this.u == EGL14.EGL_NO_SURFACE) {
                l.a("OverlayVideoTextureRenderer", "no surface to render");
            } else if (!EGL14.eglSwapBuffers(this.f151845d, this.u)) {
                l.a("OverlayVideoTextureRenderer", this + "swap buffer failed");
            }
        }
        l.a("OverlayVideoTextureRenderer", "handleVsyncDraw end, ReadyVector size:" + this.y.size());
        if (this.y.isEmpty()) {
            r rVar = this.B;
            r.a aVar = this.L;
            l.a("VsyncHelper", "removeObserver");
            if (aVar != null) {
                Message obtainMessage = rVar.f151868a.obtainMessage(30);
                obtainMessage.obj = aVar;
                obtainMessage.sendToTarget();
            }
            this.A = false;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean i() {
        /*
        // Method dump skipped, instructions count: 668
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.texturerender.b.c.i():boolean");
    }

    private boolean c(p pVar) {
        if (pVar == this.V) {
            return true;
        }
        return false;
    }

    private static void b(p pVar) {
        try {
            pVar.lock();
            if (!pVar.isRelease()) {
                pVar.updateTexImage();
                pVar.unlock();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            pVar.unlock();
        }
    }

    private boolean d(p pVar) {
        Iterator<a> it = this.y.iterator();
        while (it.hasNext()) {
            if (it.next().f151825d == pVar) {
                return false;
            }
        }
        if (c(pVar)) {
            if (this.Q.f151817a.size() > 0) {
                return false;
            }
            return true;
        } else if (this.R.f151817a.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    private void e(p pVar) {
        MethodCollector.i(12876);
        Message message = this.W.get(pVar);
        if (message != null) {
            synchronized (message) {
                try {
                    l.a("OverlayVideoTextureRenderer", "notify st:" + pVar + " MainQueue:" + this.Q.toString() + " SubQueue:" + this.R.toString());
                    message.arg1 = Integer.MIN_VALUE;
                    message.notify();
                } finally {
                    MethodCollector.o(12876);
                }
            }
            return;
        }
        MethodCollector.o(12876);
    }

    @Override // com.ss.texturerender.n
    public final void f(Message message) {
        a.C4064a a2;
        long j2;
        p pVar = (p) message.obj;
        if (c(pVar)) {
            a2 = this.Q.a(pVar.getTimestamp());
        } else {
            a2 = this.R.a(pVar.getTimestamp());
        }
        long j3 = -1;
        if (a2 != null) {
            j2 = a2.pts - this.U.d();
        } else {
            j2 = -1;
        }
        StringBuilder append = new StringBuilder("handleFrameAvailable,st = ").append(pVar).append(" isMainSurface:").append(c(pVar)).append(" pts:");
        if (a2 != null) {
            j3 = a2.pts;
        }
        l.a("OverlayVideoTextureRenderer", append.append(j3).append(" master:").append(this.U.d()).append(" diff:").append(j2).toString());
        if (j2 < 0) {
            b(pVar);
            e(pVar);
            return;
        }
        if (!this.A) {
            this.B.a(this.L);
            this.A = true;
        }
        this.y.add(new a(pVar, a2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.util.HashMap<com.ss.texturerender.p, android.os.Message> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.texturerender.n
    public final void d(Message message) {
        MethodCollector.i(12761);
        boolean z2 = true;
        switch (message.what) {
            case 26:
                if (!c((p) message.obj)) {
                    MethodCollector.o(12761);
                    return;
                }
                int i2 = message.arg1;
                if (i2 == 1) {
                    this.U.a();
                    MethodCollector.o(12761);
                    return;
                } else if (i2 == 2) {
                    MethodCollector.o(12761);
                    return;
                } else if (i2 == 3) {
                    l.a("OverlayVideoTextureRenderer", "TEXTURE_STATE_STOP");
                    this.Q.f151817a.clear();
                    this.R.f151817a.clear();
                    this.U.c();
                    MethodCollector.o(12761);
                    return;
                } else if (i2 != 4) {
                    MethodCollector.o(12761);
                    return;
                } else {
                    this.U.b();
                    MethodCollector.o(12761);
                    return;
                }
            case 27:
                float f2 = message.getData().getFloat("overlay_ratio");
                l.a("OverlayVideoTextureRenderer", "SetOverlayRatio ratio:".concat(String.valueOf(f2)));
                if (f2 != this.H) {
                    this.H = f2;
                    this.I = true;
                    if (!this.A) {
                        this.B.a(this.L);
                        this.A = true;
                    }
                }
                MethodCollector.o(12761);
                return;
            case 28:
                l();
                MethodCollector.o(12761);
                return;
            case 31:
                if (message.arg1 != 1) {
                    z2 = false;
                }
                this.M = z2;
                l.a("OverlayVideoTextureRenderer", "MSG_SET_OVERLAY_SYNC mNeedSync:" + this.M);
                MethodCollector.o(12761);
                return;
            case 32:
                Bundle data = message.getData();
                p pVar = (p) data.getSerializable("texture");
                a.C4064a aVar = (a.C4064a) data.getSerializable("update_frame_time");
                if (c(pVar)) {
                    String string = data.getString("master_clock");
                    if (!TextUtils.isEmpty(string)) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - data.getLong("master_clock_diff");
                        this.U.a(Long.parseLong(string.trim()) + elapsedRealtime);
                    }
                }
                boolean d2 = d(pVar);
                if (d2) {
                    Message message2 = (Message) message.obj;
                    synchronized (message2) {
                        try {
                            message2.arg1 = (int) aVar.pts;
                            message.obj.notify();
                        } catch (Throwable th) {
                            MethodCollector.o(12761);
                            throw th;
                        }
                    }
                }
                this.W.put(pVar, message.obj);
                if (c(pVar)) {
                    this.Q.a(aVar);
                } else {
                    this.R.a(aVar);
                }
                l.a("OverlayVideoTextureRenderer", "MSG_UPDATE_FRAME_TIME needNotify:" + d2 + " MainQueue:" + this.Q.f151817a.size() + " SubQueue:" + this.R.f151817a.size());
                MethodCollector.o(12761);
                return;
            case 33:
                this.V = (p) message.obj;
                l.a("OverlayVideoTextureRenderer", "MSG_SET_MAIN_SURFACE st:" + this.V);
                break;
        }
        MethodCollector.o(12761);
    }

    @Override // com.ss.texturerender.n
    public final void e(Message message) {
        MethodCollector.i(12523);
        Bundle data = message.getData();
        if (data != null) {
            p pVar = (p) data.getSerializable("texture");
            if (pVar != null) {
                Surface updateSurface = pVar.getUpdateSurface();
                Surface surface = this.t;
                if (surface == null || surface != updateSurface) {
                    if (updateSurface == null) {
                        h();
                        if (this.t == null) {
                            l.a("OverlayVideoTextureRenderer", "reset null surface, return");
                            MethodCollector.o(12523);
                            return;
                        }
                    }
                } else if (updateSurface.toString().contains("SurfaceTexture")) {
                    l.a("OverlayVideoTextureRenderer", "set same surface, return");
                    MethodCollector.o(12523);
                    return;
                }
                if (this.u != EGL14.EGL_NO_SURFACE) {
                    l.a("OverlayVideoTextureRenderer", "destory previous surface = " + this.u);
                    if (updateSurface == null) {
                        l.a("OverlayVideoTextureRenderer", "make current to dummy surface due to non render surface");
                        EGL14.eglMakeCurrent(this.f151845d, this.f151846e, this.f151846e, this.f151844c);
                    }
                    boolean eglDestroySurface = EGL14.eglDestroySurface(this.f151845d, this.u);
                    this.u = EGL14.EGL_NO_SURFACE;
                    this.v = false;
                    l.a("OverlayVideoTextureRenderer", "destory previous surface done = " + this.u + " ret:" + eglDestroySurface);
                }
                if (updateSurface != null && updateSurface.isValid()) {
                    int[] iArr = {12344};
                    try {
                        l.a("OverlayVideoTextureRenderer", this + ",create window surface from " + updateSurface);
                        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f151845d, this.f151843b, updateSurface, iArr, 0);
                        this.u = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                            l.a("OverlayVideoTextureRenderer", "create window surface failed" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                            MethodCollector.o(12523);
                            return;
                        }
                        if (this.u == EGL14.EGL_NO_SURFACE) {
                            l.a("OverlayVideoTextureRenderer", "no surface for make current");
                        } else {
                            l.a("OverlayVideoTextureRenderer", this + " make current again");
                            GLES20.glFinish();
                            EGLDisplay eGLDisplay = this.f151845d;
                            EGLSurface eGLSurface = this.u;
                            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f151844c)) {
                                l.a("OverlayVideoTextureRenderer", "make current failed = " + this.u);
                            } else {
                                l.a("OverlayVideoTextureRenderer", this + "make current done");
                                this.v = true;
                            }
                        }
                        int length = j.o.length;
                        this.w = new float[length];
                        System.arraycopy(j.o, 0, this.w, 0, length);
                        this.x = new float[length];
                        System.arraycopy(j.o, 0, this.x, 0, length);
                    } catch (Exception unused) {
                        l.a("OverlayVideoTextureRenderer", "create current exception failed");
                        MethodCollector.o(12523);
                        return;
                    }
                }
                this.s = System.nanoTime();
                this.t = updateSurface;
                Object obj = message.obj;
                if (obj != null) {
                    synchronized (obj) {
                        try {
                            obj.notify();
                        } catch (Throwable th) {
                            MethodCollector.o(12523);
                            throw th;
                        }
                    }
                }
                l.a("OverlayVideoTextureRenderer", "set surface done, mEglSurface=" + this.u + " render:" + this);
                MethodCollector.o(12523);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("OverlayVideoTextureRenderer update surface but missing texture");
            MethodCollector.o(12523);
            throw runtimeException;
        }
        RuntimeException runtimeException2 = new RuntimeException("OverlayVideoTextureRenderer update surface but missing bundle?");
        MethodCollector.o(12523);
        throw runtimeException2;
    }

    public c(d dVar, int i2) {
        super(dVar, i2);
        l.a("OverlayVideoTextureRenderer", "OverlayVideoTextureRenderer");
    }
}
