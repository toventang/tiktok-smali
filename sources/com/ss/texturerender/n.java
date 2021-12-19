package com.ss.texturerender;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.texturerender.a.d;
import com.ss.texturerender.a.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class n implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static String f151842a = "TextureRenderer";

    /* renamed from: b  reason: collision with root package name */
    protected EGLConfig f151843b;

    /* renamed from: c  reason: collision with root package name */
    protected EGLContext f151844c;

    /* renamed from: d  reason: collision with root package name */
    protected EGLDisplay f151845d;

    /* renamed from: e  reason: collision with root package name */
    protected EGLSurface f151846e;

    /* renamed from: f  reason: collision with root package name */
    protected volatile Handler f151847f;

    /* renamed from: g  reason: collision with root package name */
    protected Handler f151848g;

    /* renamed from: h  reason: collision with root package name */
    public volatile int f151849h;

    /* renamed from: i  reason: collision with root package name */
    public String f151850i;

    /* renamed from: j  reason: collision with root package name */
    protected final float[] f151851j = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    protected FloatBuffer f151852k;

    /* renamed from: l  reason: collision with root package name */
    protected i f151853l;

    /* renamed from: m  reason: collision with root package name */
    public g f151854m;
    protected List<p> n;
    protected long o;
    public int p;
    public d q;
    protected d r;
    private HandlerThread s;
    private final Object t = new Object();
    private a u;
    private b v;
    private Object w = new Object();

    public interface a {
        static {
            Covode.recordClassIndex(101264);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(101265);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: protected */
    public abstract void d(Message message);

    /* access modifiers changed from: protected */
    public abstract void e();

    /* access modifiers changed from: protected */
    public abstract void e(Message message);

    /* access modifiers changed from: protected */
    public abstract void f(Message message);

    static {
        Covode.recordClassIndex(101262);
    }

    public final VideoSurface f() {
        p i2;
        if (this.f151849h > 0 && (i2 = i()) != null) {
            return i2.getOffScreenSurface();
        }
        return null;
    }

    private void h() {
        synchronized (this.n) {
            if (this.n.size() > 0) {
                Iterator<p> it = this.n.iterator();
                while (it.hasNext()) {
                    it.next().release(true);
                    it.remove();
                }
            }
            l.a(f151842a, "delete textures : " + this.n.size());
            this.f151853l.a();
        }
    }

    private b j() {
        try {
            Message obtainMessage = this.f151847f.obtainMessage(9);
            Message message = new Message();
            obtainMessage.obj = message;
            try {
                synchronized (message) {
                    this.f151847f.sendMessageAtFrontOfQueue(obtainMessage);
                    message.wait(1000);
                }
                if (message.obj == null) {
                    if (this.f151847f.hasMessages(9)) {
                        this.f151850i = "The handler is busy for other operation timeout";
                    } else {
                        this.f151850i = "Try modify the wait timeOut";
                    }
                }
                return (b) message.obj;
            } catch (Exception e2) {
                l.a(f151842a, "texture render may exit, error:" + e2.toString());
                return null;
            }
        } catch (Exception unused) {
            l.a(f151842a, "texture render already exit");
            return null;
        }
    }

    public void g() {
        l.a(f151842a, this + "call release");
        synchronized (this) {
            if (this.f151849h == 0 || this.f151847f == null) {
                l.a(f151842a, this + "release return");
                return;
            }
            l.a(f151842a, this + "send deinit");
            this.f151847f.sendEmptyMessage(3);
            try {
                int i2 = Build.VERSION.SDK_INT;
                this.s.quitSafely();
            } catch (Exception unused) {
            }
            l.a(f151842a, this + "call release end");
        }
    }

    private p i() {
        synchronized (this.n) {
            Iterator<p> it = this.n.iterator();
            while (true) {
                p pVar = null;
                while (it.hasNext()) {
                    pVar = it.next();
                    if (pVar.isRelease() || pVar.isAlive()) {
                        if (!this.q.f151792a && !this.q.f151793b && (this.p & 4) == 0) {
                            l.a(f151842a, "still living");
                            return null;
                        }
                    } else if (pVar.canReuse(Looper.myLooper())) {
                        l.a(f151842a, "same looper reuse texture");
                        pVar.pause(false, false);
                        pVar.getOffScreenSurface();
                        return pVar;
                    } else {
                        l.a(f151842a, "can't reuse, delete = ".concat(String.valueOf(pVar)));
                        pVar.release(false);
                        it.remove();
                    }
                }
                b j2 = j();
                if (j2 != null) {
                    pVar = new p(j2, this.f151847f, this);
                    pVar.setOption(5, this.p);
                    pVar.bindEGLEnv(this.f151844c, this.f151845d, this.f151843b);
                    j2.b();
                    pVar.getOffScreenSurface();
                    this.n.add(pVar);
                }
                return pVar;
            }
        }
    }

    public final void a() {
        if (this.f151847f == null) {
            return;
        }
        if ((!this.q.f151792a && !this.q.f151793b) || (this.p & 4) != 0) {
            l.a(f151842a, "renderer =" + this + ", check expired");
            synchronized (this.n) {
                if (this.f151847f.hasMessages(8) || this.f151847f.hasMessages(9)) {
                    l.a(f151842a, "renderer is excuting");
                    this.f151847f.sendEmptyMessageDelayed(11, 120000);
                } else if (this.n.size() == 0) {
                    l.a(f151842a, "renderer is expired");
                    g();
                } else {
                    for (p pVar : this.n) {
                        if (!pVar.isRelease() && (pVar.isAlive() || !pVar.couldForceRelease())) {
                            l.a(f151842a, "a texture is still working ".concat(String.valueOf(pVar)));
                            this.f151847f.sendEmptyMessageDelayed(11, 120000);
                            return;
                        }
                    }
                    l.a(f151842a, "non live texture , renderer is expired");
                    g();
                }
            }
        }
    }

    public final void b() {
        l.a(f151842a, this + "deinit");
        a(0, true);
        e();
        h();
        d();
        if (this.f151845d != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f151845d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            if (this.f151846e != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f151845d, this.f151846e);
                this.f151846e = EGL14.EGL_NO_SURFACE;
            }
            if (this.f151844c != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f151845d, this.f151844c);
                this.f151844c = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglTerminate(this.f151845d);
            this.f151845d = EGL14.EGL_NO_DISPLAY;
            l.a(f151842a, this + "OpenGL deinit OK.");
        }
        this.f151847f = null;
        l.a(f151842a, this + "deinit done");
    }

    /* access modifiers changed from: package-private */
    public final void b(Message message) {
        if (message != null) {
            synchronized (message) {
                message.arg1 = this.f151849h;
                message.notify();
            }
        }
    }

    public final void a(Message message) {
        b a2 = this.f151853l.a(36197);
        if (a2 == null) {
            l.a(f151842a, "Create Texture failed.");
        }
        message.obj = a2;
        synchronized (message) {
            message.notify();
        }
    }

    public final void a(p pVar) {
        if (pVar != null) {
            l.a(f151842a, "resume texture =".concat(String.valueOf(pVar)));
            if (!pVar.isCurrentObject(this.o)) {
                pVar.makeCurrent();
                this.o = pVar.getOjbectId();
                l.a(f151842a, "change active drawing id = " + this.o);
            }
        }
    }

    public boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 6) {
            if (i2 != 7) {
                if (i2 != 8) {
                    return true;
                }
                int i3 = message.arg1;
                p pVar = (p) message.obj;
                if (pVar == null) {
                    return true;
                }
                pVar.notifyRenderFrame(i3);
                return true;
            } else if (this.v == null) {
                return true;
            } else {
                int i4 = message.arg1;
                if (message.arg1 != 0) {
                    return true;
                }
                this.f151848g.removeCallbacksAndMessages(null);
                this.f151848g = null;
                return true;
            }
        } else if (this.u == null) {
            return true;
        } else {
            int i5 = message.arg1;
            Object obj = message.obj;
            return true;
        }
    }

    public final void c(Message message) {
        l.a(f151842a, "handle clear surface");
        Message message2 = (Message) message.obj;
        if (this.f151849h <= 0) {
            l.a(f151842a, "state is invalid : " + this.f151849h);
            b(message2);
            return;
        }
        Parcelable parcelable = message.getData().getParcelable("surface");
        try {
            l.a(f151842a, this + ",create window surface from " + parcelable);
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f151845d, this.f151843b, parcelable, new int[]{12344}, 0);
            if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                l.a(f151842a, "create window surface failed" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                b(message2);
            } else if (!EGL14.eglMakeCurrent(this.f151845d, eglCreateWindowSurface, eglCreateWindowSurface, this.f151844c)) {
                l.a(f151842a, "make current failed = ".concat(String.valueOf(eglCreateWindowSurface)));
                b(message2);
            } else {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
                EGL14.eglSwapBuffers(this.f151845d, eglCreateWindowSurface);
                EGLDisplay eGLDisplay = this.f151845d;
                EGLSurface eGLSurface = this.f151846e;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f151844c);
                EGL14.eglDestroySurface(this.f151845d, eglCreateWindowSurface);
                b(message2);
            }
        } catch (Exception unused) {
            l.a(f151842a, "create current exception failed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r1 == android.opengl.EGL14.EGL_NO_SURFACE) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r17) {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.texturerender.n.a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        synchronized (this.t) {
            this.f151850i = str + ", reason = " + GLUtils.getEGLErrorString(EGL14.eglGetError());
            a(-1, false);
            if (this.u != null) {
                Message obtainMessage = this.f151848g.obtainMessage(6);
                obtainMessage.arg1 = 0;
                obtainMessage.obj = "EGL fail = " + str + ", reason = " + GLUtils.getEGLErrorString(EGL14.eglGetError());
                obtainMessage.sendToTarget();
            }
        }
    }

    public final boolean a(Surface surface) {
        Message obtainMessage = this.f151847f.obtainMessage(13);
        Bundle bundle = new Bundle();
        bundle.putParcelable("surface", surface);
        obtainMessage.setData(bundle);
        Message message = new Message();
        obtainMessage.obj = message;
        try {
            synchronized (message) {
                l.a(f151842a, "clear surface start");
                this.f151847f.sendMessage(obtainMessage);
                message.wait(1000);
                l.a(f151842a, "clear surface end : ret = " + message.arg1);
            }
            if (message.arg1 <= 0) {
                return false;
            }
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    private void a(int i2, boolean z) {
        Handler handler;
        if (this.f151849h != i2) {
            if (this.f151849h != -1 || i2 == 0) {
                l.a(f151842a, "state change from " + this.f151849h + " to " + i2);
                this.f151849h = i2;
                if (z) {
                    synchronized (this.t) {
                        if (this.v != null && (handler = this.f151848g) != null) {
                            Message obtainMessage = handler.obtainMessage(7);
                            obtainMessage.arg1 = i2;
                            obtainMessage.sendToTarget();
                        }
                    }
                }
            }
        }
    }

    public n(d dVar, int i2) {
        l.a(f151842a, "version :3.10.0 config:" + dVar + " type:" + i2);
        this.f151849h = 0;
        this.f151850i = null;
        this.f151846e = EGL14.EGL_NO_SURFACE;
        this.f151844c = EGL14.EGL_NO_CONTEXT;
        this.f151845d = EGL14.EGL_NO_DISPLAY;
        this.o = 0;
        this.q = new d();
        this.r = dVar;
        this.p = i2;
        this.f151853l = new i();
        this.n = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("TRThread_".concat(String.valueOf(i2)));
        this.s = handlerThread;
        handlerThread.start();
        this.f151847f = new Handler(this.s.getLooper()) {
            /* class com.ss.texturerender.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101263);
            }

            public final void handleMessage(Message message) {
                MethodCollector.i(10711);
                int i2 = message.what;
                if (i2 == 1) {
                    n.this.a(message.obj);
                    MethodCollector.o(10711);
                } else if (i2 == 2) {
                    n.this.f(message);
                    MethodCollector.o(10711);
                } else if (i2 == 3) {
                    n.this.b();
                    MethodCollector.o(10711);
                } else if (i2 == 4) {
                    n.this.e(message);
                    MethodCollector.o(10711);
                } else if (i2 == 13) {
                    n.this.c(message);
                    MethodCollector.o(10711);
                } else if (i2 != 14) {
                    switch (i2) {
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            n.this.a((Message) message.obj);
                            MethodCollector.o(10711);
                            return;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            n.this.a((p) message.obj);
                            MethodCollector.o(10711);
                            return;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            n.this.a();
                            MethodCollector.o(10711);
                            return;
                        default:
                            n.this.d(message);
                            MethodCollector.o(10711);
                            return;
                    }
                } else {
                    n nVar = n.this;
                    l.a(n.f151842a, "handle save frame");
                    Bundle data = message.getData();
                    if (data != null) {
                        p pVar = (p) data.getSerializable("texture");
                        if (pVar != null) {
                            Message message2 = (Message) message.obj;
                            if (nVar.f151849h <= 0) {
                                l.a(n.f151842a, "state is invalid : " + nVar.f151849h);
                                nVar.b(message2);
                                MethodCollector.o(10711);
                                return;
                            }
                            try {
                                int viewportWidth = pVar.getViewportWidth();
                                int viewportHeight = pVar.getViewportHeight();
                                if (viewportWidth == 0 || viewportHeight == 0) {
                                    l.a(n.f151842a, "texture size is invalid = " + viewportWidth + ", height =" + viewportHeight);
                                }
                                l.a(n.f151842a, "savexx frame = " + viewportWidth + ", " + viewportHeight);
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(viewportWidth * viewportHeight * 4);
                                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                                GLES20.glFinish();
                                GLES20.glReadPixels(0, 0, viewportWidth, viewportHeight, 6408, 5121, allocateDirect);
                                g.a("handleSaveFrame");
                                Bitmap createBitmap = Bitmap.createBitmap(viewportWidth, viewportHeight, Bitmap.Config.ARGB_8888);
                                allocateDirect.rewind();
                                createBitmap.copyPixelsFromBuffer(allocateDirect);
                                Matrix matrix = new Matrix();
                                matrix.postScale(1.0f, -1.0f);
                                message2.obj = Bitmap.createBitmap(createBitmap, 0, 0, viewportWidth, viewportHeight, matrix, true);
                                createBitmap.recycle();
                            } catch (Exception e2) {
                                l.a(n.f151842a, "save frame failed " + e2.getMessage());
                            }
                            nVar.b(message2);
                            MethodCollector.o(10711);
                            return;
                        }
                        RuntimeException runtimeException = new RuntimeException("update surface but missing texture");
                        MethodCollector.o(10711);
                        throw runtimeException;
                    }
                    RuntimeException runtimeException2 = new RuntimeException("update surface but missing bundle?");
                    MethodCollector.o(10711);
                    throw runtimeException2;
                }
            }
        };
        Message obtainMessage = this.f151847f.obtainMessage(1);
        obtainMessage.obj = this.w;
        synchronized (this.w) {
            obtainMessage.sendToTarget();
            try {
                this.w.wait(1000);
            } catch (InterruptedException unused) {
                throw new RuntimeException("EGL initial timeout");
            }
        }
        this.f151847f.sendMessageDelayed(this.f151847f.obtainMessage(11), 120000);
        l.a(f151842a, "construct done");
    }
}
