package com.ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

public class d extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* renamed from: h  reason: collision with root package name */
    public static final j f108236h = new j((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<d> f108237a = new WeakReference<>(this);

    /* renamed from: b  reason: collision with root package name */
    private i f108238b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f108239c;

    /* renamed from: g  reason: collision with root package name */
    com.ss.android.ugc.aweme.live.alphaplayer.a.b f108240g;

    /* renamed from: i  reason: collision with root package name */
    public m f108241i;

    /* renamed from: j  reason: collision with root package name */
    public e f108242j;

    /* renamed from: k  reason: collision with root package name */
    public f f108243k;

    /* renamed from: l  reason: collision with root package name */
    public g f108244l;

    /* renamed from: m  reason: collision with root package name */
    public k f108245m;
    public int n;
    public int o;
    public boolean p;

    public interface e {
        static {
            Covode.recordClassIndex(69364);
        }

        EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface f {
        static {
            Covode.recordClassIndex(69365);
        }

        EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface g {
        static {
            Covode.recordClassIndex(69366);
        }

        EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    public interface k {
        static {
            Covode.recordClassIndex(69370);
        }

        GL a();
    }

    public interface m {
        static {
            Covode.recordClassIndex(69372);
        }

        void onDrawFrame(GL10 gl10);

        void onSurfaceChanged(GL10 gl10, int i2, int i3);

        void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d$d  reason: collision with other inner class name */
    public static class C2777d implements g {
        static {
            Covode.recordClassIndex(69363);
        }

        private C2777d() {
        }

        /* synthetic */ C2777d(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.g
        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.g
        public final EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class j {

        /* renamed from: c  reason: collision with root package name */
        private static String f108295c = "GLThreadManager";

        /* renamed from: a  reason: collision with root package name */
        boolean f108296a;

        /* renamed from: b  reason: collision with root package name */
        i f108297b;

        /* renamed from: d  reason: collision with root package name */
        private boolean f108298d;

        /* renamed from: e  reason: collision with root package name */
        private int f108299e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f108300f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f108301g;

        private j() {
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            if (!this.f108298d) {
                this.f108298d = true;
            }
        }

        static {
            Covode.recordClassIndex(69369);
        }

        public final synchronized boolean a() {
            boolean z;
            MethodCollector.i(3898);
            z = this.f108301g;
            MethodCollector.o(3898);
            return z;
        }

        public final synchronized boolean b() {
            MethodCollector.i(3900);
            c();
            if (!this.f108296a) {
                MethodCollector.o(3900);
                return true;
            }
            MethodCollector.o(3900);
            return false;
        }

        /* synthetic */ j(byte b2) {
            this();
        }

        public final void b(i iVar) {
            if (this.f108297b == iVar) {
                this.f108297b = null;
            }
            notifyAll();
        }

        public final synchronized void a(i iVar) {
            MethodCollector.i(3895);
            iVar.f108282a = true;
            if (this.f108297b == iVar) {
                this.f108297b = null;
            }
            notifyAll();
            MethodCollector.o(3895);
        }

        public final synchronized void a(GL10 gl10) {
            boolean z;
            MethodCollector.i(3907);
            if (!this.f108300f) {
                c();
                String glGetString = gl10.glGetString(7937);
                boolean z2 = false;
                if (this.f108299e < 131072) {
                    if (!glGetString.startsWith("Q3Dimension MSM7500 ")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f108296a = z;
                    notifyAll();
                }
                if (!this.f108296a) {
                    z2 = true;
                }
                this.f108301g = z2;
                this.f108300f = true;
            }
            MethodCollector.o(3907);
        }
    }

    /* access modifiers changed from: package-private */
    public static class l extends Writer {

        /* renamed from: a  reason: collision with root package name */
        private StringBuilder f108302a = new StringBuilder();

        static {
            Covode.recordClassIndex(69371);
        }

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public final void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            a();
        }

        l() {
        }

        private void a() {
            if (this.f108302a.length() > 0) {
                StringBuilder sb = this.f108302a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                char c2 = cArr[i2 + i4];
                if (c2 == '\n') {
                    a();
                } else {
                    this.f108302a.append(c2);
                }
            }
        }
    }

    public int getDebugFlags() {
        return this.n;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.p;
    }

    public int getRenderMode() {
        return this.f108238b.b();
    }

    /* access modifiers changed from: package-private */
    public static class i extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public boolean f108282a;

        /* renamed from: b  reason: collision with root package name */
        boolean f108283b;

        /* renamed from: c  reason: collision with root package name */
        boolean f108284c;

        /* renamed from: d  reason: collision with root package name */
        boolean f108285d;

        /* renamed from: e  reason: collision with root package name */
        boolean f108286e;

        /* renamed from: f  reason: collision with root package name */
        boolean f108287f;

        /* renamed from: g  reason: collision with root package name */
        boolean f108288g;

        /* renamed from: h  reason: collision with root package name */
        int f108289h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f108290i = 0;

        /* renamed from: j  reason: collision with root package name */
        boolean f108291j = true;

        /* renamed from: k  reason: collision with root package name */
        boolean f108292k;

        /* renamed from: l  reason: collision with root package name */
        ArrayList<Runnable> f108293l = new ArrayList<>();

        /* renamed from: m  reason: collision with root package name */
        boolean f108294m = true;
        private boolean n;
        private boolean o;
        private boolean p;
        private int q = 1;
        private h r;
        private WeakReference<d> s;

        static {
            Covode.recordClassIndex(69368);
        }

        private void d() {
            if (this.f108288g) {
                this.f108288g = false;
                this.r.a();
            }
        }

        private void e() {
            if (this.f108287f) {
                this.r.b();
                this.f108287f = false;
                d.f108236h.b(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (this.f108284c || !this.f108285d || this.o || this.f108289h <= 0 || this.f108290i <= 0) {
                return false;
            }
            if (this.f108291j || this.q == 1) {
                return true;
            }
            return false;
        }

        public final int b() {
            int i2;
            MethodCollector.i(3226);
            synchronized (d.f108236h) {
                try {
                    i2 = this.q;
                } finally {
                    MethodCollector.o(3226);
                }
            }
            return i2;
        }

        public final void c() {
            MethodCollector.i(3237);
            synchronized (d.f108236h) {
                try {
                    this.n = true;
                    d.f108236h.notifyAll();
                    while (!this.f108282a) {
                        try {
                            d.f108236h.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } finally {
                    MethodCollector.o(3237);
                }
            }
        }

        public final void run() {
            setName("GLThread " + getId());
            try {
                f();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                d.f108236h.a(this);
                throw th;
            }
            d.f108236h.a(this);
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ba, code lost:
            if (r7 == null) goto L_0x01be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x01be, code lost:
            if (r15 == false) goto L_0x022c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c0, code lost:
            r10 = r19.r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c4, code lost:
            if (r10.f108277b == null) goto L_0x032a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c8, code lost:
            if (r10.f108278c == null) goto L_0x031d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x01cc, code lost:
            if (r10.f108280e == null) goto L_0x0310;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x01ce, code lost:
            r10.a();
            r0 = r10.f108276a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d9, code lost:
            if (r0 == null) goto L_0x021c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x01db, code lost:
            r10.f108279d = r0.f108244l.a(r10.f108277b, r10.f108278c, r10.f108280e, r0.getSurfaceTexture());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ef, code lost:
            if (r10.f108279d == null) goto L_0x01f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x01f5, code lost:
            if (r10.f108279d != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) goto L_0x0200;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x01f7, code lost:
            r10.f108277b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x01fc, code lost:
            r2 = com.ss.android.ugc.aweme.live.alphaplayer.d.f108236h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x01fe, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x020e, code lost:
            if (r10.f108277b.eglMakeCurrent(r10.f108278c, r10.f108279d, r10.f108279d, r10.f108281f) != false) goto L_0x022b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0210, code lost:
            com.ss.android.ugc.aweme.live.alphaplayer.d.h.b("eglMakeCurrent", r10.f108277b.eglGetError());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x021c, code lost:
            r10.f108279d = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
            r19.o = true;
            com.ss.android.ugc.aweme.live.alphaplayer.d.f108236h.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x0228, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x022b, code lost:
            r15 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x022c, code lost:
            if (r13 == false) goto L_0x0273;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x022e, code lost:
            r1 = r19.r;
            r4 = r1.f108281f.getGL();
            r8 = r1.f108276a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x023e, code lost:
            if (r8 == null) goto L_0x0268;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x0242, code lost:
            if (r8.f108245m == null) goto L_0x024a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x0244, code lost:
            r4 = r8.f108245m.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x024e, code lost:
            if ((r8.n & 3) == 0) goto L_0x0268;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0254, code lost:
            if ((r8.n & 1) == 0) goto L_0x0258;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0256, code lost:
            r2 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0258, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x025d, code lost:
            if ((r8.n & 2) == 0) goto L_0x0270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x025f, code lost:
            r0 = new com.ss.android.ugc.aweme.live.alphaplayer.d.l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0264, code lost:
            r4 = android.opengl.GLDebugHelper.wrap(r4, r2, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0268, code lost:
            r4 = (javax.microedition.khronos.opengles.GL10) r4;
            com.ss.android.ugc.aweme.live.alphaplayer.d.f108236h.a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0270, code lost:
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0272, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0273, code lost:
            if (r14 == false) goto L_0x0289;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0275, code lost:
            r0 = r19.s.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x027d, code lost:
            if (r0 == null) goto L_0x0288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x027f, code lost:
            r0.f108241i.onSurfaceCreated(r4, r19.r.f108280e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0288, code lost:
            r14 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0289, code lost:
            if (r12 == false) goto L_0x029b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x028b, code lost:
            r0 = r19.s.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0293, code lost:
            if (r0 == null) goto L_0x029a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0295, code lost:
            r0.f108241i.onSurfaceChanged(r4, r6, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x029a, code lost:
            r12 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x029b, code lost:
            r0 = r19.s.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x02a3, code lost:
            if (r0 == null) goto L_0x02aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x02a5, code lost:
            r0.f108241i.onDrawFrame(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x02aa, code lost:
            r8 = r19.r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x02b8, code lost:
            if (r8.f108277b.eglSwapBuffers(r8.f108278c, r8.f108279d) != false) goto L_0x02db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x02ba, code lost:
            r1 = r8.f108277b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x02c0, code lost:
            if (r1 == 12288) goto L_0x02db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x02c4, code lost:
            if (r1 == 12302) goto L_0x02d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x02c6, code lost:
            com.ss.android.ugc.aweme.live.alphaplayer.d.h.b("eglSwapBuffers", r1);
            r2 = com.ss.android.ugc.aweme.live.alphaplayer.d.f108236h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x02cd, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
            r19.o = true;
            com.ss.android.ugc.aweme.live.alphaplayer.d.f108236h.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x02d6, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x02d8, code lost:
            r18 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x02db, code lost:
            if (r11 == false) goto L_0x02df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x02dd, code lost:
            r17 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x0300, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x0307, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0308, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x030a, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(2641);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x030f, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x0310, code lost:
            r1 = new java.lang.RuntimeException("mEglConfig not initialized");
            com.bytedance.frameworks.apm.trace.MethodCollector.o(2641);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x031c, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x031d, code lost:
            r1 = new java.lang.RuntimeException("eglDisplay not initialized");
            com.bytedance.frameworks.apm.trace.MethodCollector.o(2641);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x0329, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x032a, code lost:
            r1 = new java.lang.RuntimeException("egl not initialized");
            com.bytedance.frameworks.apm.trace.MethodCollector.o(2641);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x0336, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void f() {
            /*
            // Method dump skipped, instructions count: 894
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.d.i.f():void");
        }

        i(WeakReference<d> weakReference) {
            this.s = weakReference;
        }

        public final void a(int i2) {
            MethodCollector.i(2643);
            if (i2 < 0 || i2 > 1) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("renderMode");
                MethodCollector.o(2643);
                throw illegalArgumentException;
            }
            synchronized (d.f108236h) {
                try {
                    this.q = i2;
                    d.f108236h.notifyAll();
                } finally {
                    MethodCollector.o(2643);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(69359);
    }

    private void a() {
        if (this.f108238b != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        try {
            i iVar = this.f108238b;
            if (iVar != null) {
                iVar.c();
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        i iVar = this.f108238b;
        if (iVar != null) {
            iVar.c();
        }
        this.f108239c = true;
        super.onDetachedFromWindow();
    }

    public void requestRender() {
        MethodCollector.i(4122);
        i iVar = this.f108238b;
        j jVar = f108236h;
        synchronized (jVar) {
            try {
                iVar.f108291j = true;
                jVar.notifyAll();
            } finally {
                MethodCollector.o(4122);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<d> f108276a;

        /* renamed from: b  reason: collision with root package name */
        EGL10 f108277b;

        /* renamed from: c  reason: collision with root package name */
        EGLDisplay f108278c;

        /* renamed from: d  reason: collision with root package name */
        EGLSurface f108279d;

        /* renamed from: e  reason: collision with root package name */
        EGLConfig f108280e;

        /* renamed from: f  reason: collision with root package name */
        EGLContext f108281f;

        static {
            Covode.recordClassIndex(69367);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            EGLSurface eGLSurface = this.f108279d;
            if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                EGL10 egl10 = this.f108277b;
                EGLDisplay eGLDisplay = this.f108278c;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                d dVar = this.f108276a.get();
                if (dVar != null) {
                    dVar.f108244l.a(this.f108277b, this.f108278c, this.f108279d);
                }
                this.f108279d = null;
            }
        }

        public final void b() {
            if (this.f108281f != null) {
                d dVar = this.f108276a.get();
                if (dVar != null) {
                    dVar.f108243k.a(this.f108277b, this.f108278c, this.f108281f);
                }
                this.f108281f = null;
            }
            EGLDisplay eGLDisplay = this.f108278c;
            if (eGLDisplay != null) {
                this.f108277b.eglTerminate(eGLDisplay);
                this.f108278c = null;
            }
        }

        public h(WeakReference<d> weakReference) {
            this.f108276a = weakReference;
        }

        public static void a(String str, int i2) {
            throw new RuntimeException(b(str, i2));
        }

        public static String b(String str, int i2) {
            return str + " failed: " + i2;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i2;
        super.onAttachedToWindow();
        if (this.f108239c && this.f108241i != null) {
            i iVar = this.f108238b;
            if (iVar != null) {
                i2 = iVar.b();
            } else {
                i2 = 1;
            }
            i iVar2 = new i(this.f108237a);
            this.f108238b = iVar2;
            if (i2 != 1) {
                iVar2.a(i2);
            }
            this.f108238b.start();
        }
        this.f108239c = false;
    }

    public void onPause() {
        MethodCollector.i(4201);
        i iVar = this.f108238b;
        j jVar = f108236h;
        synchronized (jVar) {
            try {
                iVar.f108283b = true;
                jVar.notifyAll();
                while (!iVar.f108282a && !iVar.f108284c) {
                    try {
                        f108236h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            } finally {
                MethodCollector.o(4201);
            }
        }
    }

    public void setDebugFlags(int i2) {
        this.n = i2;
    }

    public void setGLWrapper(k kVar) {
        this.f108245m = kVar;
    }

    public void setMonitor(com.ss.android.ugc.aweme.live.alphaplayer.a.b bVar) {
        this.f108240g = bVar;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.p = z;
    }

    public void setEGLConfigChooser(e eVar) {
        a();
        this.f108242j = eVar;
    }

    public void setEGLContextClientVersion(int i2) {
        a();
        this.o = i2;
    }

    public void setEGLContextFactory(f fVar) {
        a();
        this.f108243k = fVar;
    }

    public void setEGLWindowSurfaceFactory(g gVar) {
        a();
        this.f108244l = gVar;
    }

    public void setRenderMode(int i2) {
        this.f108238b.a(i2);
    }

    /* access modifiers changed from: package-private */
    public class c implements f {

        /* renamed from: b  reason: collision with root package name */
        private int f108274b;

        static {
            Covode.recordClassIndex(69362);
        }

        private c() {
            this.f108274b = 12440;
        }

        /* synthetic */ c(d dVar, byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.f
        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                h.a("eglDestroyContex", egl10.eglGetError());
            }
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.f
        public final EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f108274b, d.this.o, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (d.this.o == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new n(z));
    }

    public d(Context context) {
        super(context, null);
        MethodCollector.i(4038);
        setSurfaceTextureListener(this);
        MethodCollector.o(4038);
    }

    public final void a(Runnable runnable) {
        MethodCollector.i(4213);
        i iVar = this.f108238b;
        j jVar = f108236h;
        synchronized (jVar) {
            try {
                iVar.f108293l.add(runnable);
                jVar.notifyAll();
            } finally {
                MethodCollector.o(4213);
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        MethodCollector.i(4245);
        i iVar = this.f108238b;
        j jVar = f108236h;
        synchronized (jVar) {
            try {
                iVar.f108285d = false;
                jVar.notifyAll();
                while (!iVar.f108286e && !iVar.f108282a) {
                    try {
                        f108236h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(4245);
                throw th;
            }
        }
        MethodCollector.o(4245);
        return true;
    }

    public void setRenderer(m mVar) {
        a();
        if (this.f108242j == null) {
            this.f108242j = new n(true);
        }
        if (this.f108243k == null) {
            this.f108243k = new c(this, (byte) 0);
        }
        if (this.f108244l == null) {
            this.f108244l = new C2777d((byte) 0);
        }
        this.f108241i = mVar;
        i iVar = new i(this.f108237a);
        this.f108238b = iVar;
        iVar.start();
    }

    /* access modifiers changed from: package-private */
    public class n extends b {
        static {
            Covode.recordClassIndex(69373);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public n(boolean r4) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.live.alphaplayer.d.this = r3
                r1 = 0
                if (r4 == 0) goto L_0x000b
                r0 = 16
            L_0x0007:
                r2.<init>(r1, r0)
                return
            L_0x000b:
                r0 = 0
                goto L_0x0007
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.d.n.<init>(com.ss.android.ugc.aweme.live.alphaplayer.d, boolean):void");
        }
    }

    abstract class a implements e {

        /* renamed from: a  reason: collision with root package name */
        protected int[] f108252a;

        static {
            Covode.recordClassIndex(69360);
        }

        /* access modifiers changed from: package-private */
        public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public a(int[] iArr) {
            if (d.this.o == 2) {
                int[] iArr2 = new int[15];
                System.arraycopy(iArr, 0, iArr2, 0, 12);
                iArr2[12] = 12352;
                iArr2[13] = 4;
                iArr2[14] = 12344;
                iArr = iArr2;
            }
            this.f108252a = iArr;
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.e
        public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f108252a, null, 0, iArr)) {
                d dVar = d.this;
                String stackTraceString = Log.getStackTraceString(new IllegalArgumentException("eglChooseConfig failed"));
                if (dVar.f108240g != null) {
                    dVar.f108240g.a(false, "unknown", 0, 0, stackTraceString);
                }
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i2 = iArr[0];
            if (i2 > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                if (egl10.eglChooseConfig(eGLDisplay, this.f108252a, eGLConfigArr, i2, iArr)) {
                    EGLConfig a2 = a(egl10, eGLDisplay, eGLConfigArr);
                    if (a2 != null) {
                        return a2;
                    }
                    throw new IllegalArgumentException("No config chosen");
                }
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            throw new IllegalArgumentException("No configs match configSpec");
        }
    }

    private void a(int i2, int i3) {
        MethodCollector.i(4125);
        i iVar = this.f108238b;
        j jVar = f108236h;
        synchronized (jVar) {
            try {
                iVar.f108289h = i2;
                iVar.f108290i = i3;
                iVar.f108294m = true;
                iVar.f108291j = true;
                iVar.f108292k = false;
                jVar.notifyAll();
                while (!iVar.f108282a && !iVar.f108284c && !iVar.f108292k && iVar.f108287f && iVar.f108288g && iVar.a()) {
                    try {
                        f108236h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            } finally {
                MethodCollector.o(4125);
            }
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        a(i2, i3);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        MethodCollector.i(4234);
        i iVar = this.f108238b;
        j jVar = f108236h;
        synchronized (jVar) {
            try {
                iVar.f108285d = true;
                jVar.notifyAll();
                while (iVar.f108286e && !iVar.f108282a) {
                    try {
                        f108236h.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(4234);
                throw th;
            }
        }
        a(i2, i3);
        MethodCollector.o(4234);
    }

    /* access modifiers changed from: package-private */
    public class b extends a {

        /* renamed from: c  reason: collision with root package name */
        protected int f108261c = 8;

        /* renamed from: d  reason: collision with root package name */
        protected int f108262d = 8;

        /* renamed from: e  reason: collision with root package name */
        protected int f108263e = 8;

        /* renamed from: f  reason: collision with root package name */
        protected int f108264f;

        /* renamed from: g  reason: collision with root package name */
        protected int f108265g;

        /* renamed from: h  reason: collision with root package name */
        protected int f108266h;

        /* renamed from: j  reason: collision with root package name */
        private int[] f108268j = new int[1];

        static {
            Covode.recordClassIndex(69361);
        }

        public b(int i2, int i3) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i2, 12325, i3, 12326, 0, 12344});
            this.f108264f = i2;
            this.f108265g = i3;
            this.f108266h = 0;
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.a
        public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int a2 = a(egl10, eGLDisplay, eGLConfig, 12325);
                int a3 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a2 >= this.f108265g && a3 >= this.f108266h) {
                    int a4 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int a5 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a6 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a7 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a4 == this.f108261c && a5 == this.f108262d && a6 == this.f108263e && a7 == this.f108264f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i2, this.f108268j)) {
                return this.f108268j[0];
            }
            return 0;
        }
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        getSurfaceTexture();
        a(i4 - i2, i5 - i3);
    }
}
