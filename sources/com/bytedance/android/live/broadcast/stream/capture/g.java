package com.bytedance.android.live.broadcast.stream.capture;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.utils.ThreadUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

public final class g implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer {

    /* renamed from: a  reason: collision with root package name */
    public GLSurfaceView f8547a;

    /* renamed from: b  reason: collision with root package name */
    public a f8548b;

    /* renamed from: c  reason: collision with root package name */
    public EGLContext f8549c;

    /* renamed from: d  reason: collision with root package name */
    public GLThread f8550d;

    /* renamed from: e  reason: collision with root package name */
    private int f8551e;

    /* renamed from: f  reason: collision with root package name */
    private int f8552f;

    /* renamed from: g  reason: collision with root package name */
    private int f8553g;

    /* renamed from: h  reason: collision with root package name */
    private int f8554h;

    /* renamed from: i  reason: collision with root package name */
    private int f8555i;

    /* renamed from: j  reason: collision with root package name */
    private int f8556j;

    /* renamed from: k  reason: collision with root package name */
    private int f8557k;

    /* renamed from: l  reason: collision with root package name */
    private FloatBuffer f8558l;

    /* renamed from: m  reason: collision with root package name */
    private FloatBuffer f8559m;
    private FloatBuffer n;
    private SurfaceTexture o;
    private List<f> p;
    private int q = 36197;

    public interface a {
        static {
            Covode.recordClassIndex(4390);
        }

        void a(Surface surface);
    }

    static {
        Covode.recordClassIndex(4388);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        GLThread gLThread = this.f8550d;
        if (gLThread != null) {
            gLThread.quit();
            this.f8550d = null;
        }
        super.finalize();
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f8547a.requestRender();
    }

    public final void a(int i2) {
        if (i2 == 36197 || i2 == 3553) {
            this.q = i2;
            return;
        }
        throw new RuntimeException("format is not support");
    }

    public final synchronized void a(f fVar) {
        MethodCollector.i(6963);
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.p.add(fVar);
        MethodCollector.o(6963);
    }

    public g(GLSurfaceView gLSurfaceView) {
        this.f8547a = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(2);
        this.f8547a.setPreserveEGLContextOnPause(true);
        this.f8547a.setEGLContextFactory(new GLSurfaceView.EGLContextFactory() {
            /* class com.bytedance.android.live.broadcast.stream.capture.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4389);
            }

            public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                int[] iArr = {12440, 2, 12344};
                EGLContext[] eGLContextArr = {null};
                if (g.this.f8550d == null) {
                    g.this.f8550d = new GLThread("ImageCaptureThread");
                    g.this.f8550d.start();
                }
                ThreadUtils.invokeAtFrontUninterruptibly(g.this.f8550d.getHandler(), new i(eGLContextArr));
                if (eGLContextArr[0] == null) {
                    eGLContextArr[0] = EGL10.EGL_NO_CONTEXT;
                }
                g.this.f8549c = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContextArr[0], iArr);
                return g.this.f8549c;
            }

            public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
                if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    com.bytedance.android.live.core.c.a.a(6, "DefaultContextFactory", "display:" + eGLDisplay + " appContext: " + eGLContext);
                    throw new RuntimeException("eglDestroyContext" + egl10.eglGetError());
                } else if (g.this.f8550d != null) {
                    g.this.f8550d.quit();
                    g.this.f8550d = null;
                }
            }
        });
        this.f8547a.setRenderer(this);
        this.f8547a.setRenderMode(0);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(j.f8568e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f8558l = asFloatBuffer;
        asFloatBuffer.put(j.f8568e).position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(j.f8564a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f8559m = asFloatBuffer2;
        asFloatBuffer2.put(j.f8564a).position(0);
        float[] fArr = j.f8566c;
        float[] fArr2 = {j.a(fArr[0]), fArr[1], j.a(fArr[2]), fArr[3], j.a(fArr[4]), fArr[5], j.a(fArr[6]), fArr[7]};
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.n = asFloatBuffer3;
        asFloatBuffer3.put(fArr2).position(0);
    }

    public final void onDrawFrame(GL10 gl10) {
        MethodCollector.i(6995);
        this.o.updateTexImage();
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f8551e);
        this.f8558l.position(0);
        GLES20.glVertexAttribPointer(this.f8552f, 2, 5126, false, 0, (Buffer) this.f8558l);
        GLES20.glEnableVertexAttribArray(this.f8552f);
        this.f8559m.position(0);
        GLES20.glVertexAttribPointer(this.f8554h, 2, 5126, false, 0, (Buffer) this.f8559m);
        GLES20.glEnableVertexAttribArray(this.f8554h);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f8555i);
        GLES20.glUniform1i(this.f8553g, 0);
        GLES20.glDrawArrays(5, 0, 4);
        OpenGLUtils.checkGlError("ImageCapture");
        int i2 = this.f8555i;
        if (3553 == this.q) {
            GLES20.glBindFramebuffer(36160, this.f8556j);
            this.n.position(0);
            GLES20.glVertexAttribPointer(this.f8554h, 2, 5126, false, 0, (Buffer) this.n);
            GLES20.glEnableVertexAttribArray(this.f8554h);
            GLES20.glDrawArrays(5, 0, 4);
            OpenGLUtils.checkGlError("ImageCapture");
            GLES20.glBindFramebuffer(36160, 0);
            i2 = this.f8557k;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, 0);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            try {
                List<f> list = this.p;
                if (list != null) {
                    for (f fVar : list) {
                        fVar.a(this.f8549c, i2, this.f8547a.getWidth(), this.f8547a.getHeight(), currentTimeMillis);
                    }
                    MethodCollector.o(6995);
                }
            } finally {
                MethodCollector.o(6995);
            }
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f8551e = OpenGLUtils.loadProgram("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nvarying vec2 textureCoordinate;\n\nvoid main()\n{\n   textureCoordinate = inputTextureCoordinate.xy;\n   gl_Position = position;\n}", "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\n\nvoid main()\n{\n gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        d.a("onSurfaceCreated: OES programId=" + this.f8551e);
        this.f8552f = GLES20.glGetAttribLocation(this.f8551e, "position");
        this.f8553g = GLES20.glGetUniformLocation(this.f8551e, "inputImageTexture");
        this.f8554h = GLES20.glGetAttribLocation(this.f8551e, "inputTextureCoordinate");
        this.f8555i = OpenGLUtils.getExternalOESTextureID();
        d.a("onSurfaceCreated: OES textureId=" + this.f8555i);
        OpenGLUtils.checkGlError("ImageCapture");
        if (3553 == this.q) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f8556j = iArr[0];
            d.a("onSurfaceCreated: frameBuffer=" + this.f8556j);
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            this.f8557k = iArr2[0];
            d.a("onSurfaceCreated: frameBufferTextureId=" + this.f8557k);
            int i2 = this.f8557k;
            int i3 = this.f8556j;
            int width = this.f8547a.getWidth();
            int height = this.f8547a.getHeight();
            GLES20.glBindTexture(3553, i2);
            GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, i3);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f8555i);
        this.o = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.f8547a.getWidth(), this.f8547a.getHeight());
        this.o.setOnFrameAvailableListener(this);
        this.f8547a.post(new h(this, new Surface(this.o)));
    }

    public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        GLES20.glViewport(0, 0, i2, i3);
    }
}
