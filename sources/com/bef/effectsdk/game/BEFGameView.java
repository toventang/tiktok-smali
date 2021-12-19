package com.bef.effectsdk.game;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import com.bef.effectsdk.OpenGLUtils;
import com.bef.effectsdk.game.NativeInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.Buffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

public class BEFGameView extends GLSurfaceView implements GLSurfaceView.Renderer, NativeInterface.NativeMessageListener {
    protected long mAnimationInterval;
    protected Queue<Runnable> mCacheMessages;
    protected double mCurrentFps;
    protected int mDstTexture;
    protected int mFBO;
    public boolean mFirstLoopGuard = true;
    protected long mFps;
    protected String mGameBundlePath = "";
    protected int mGlMatrixHandle;
    protected int mGlPosHandle;
    protected int mGlProgram;
    protected int mGlTextureSampleHandle;
    protected int mGlUvHandle;
    protected long mHandle;
    private long mLastTickInNanoSeconds;
    protected HashSet<MessageListener> mListeners;
    protected float[] mMatrix = new float[16];
    private boolean mMultipleTouchEnabled = true;
    protected boolean mNativeInited;
    protected int mSrcTexture;
    private long mStartTimeStampNanoSeconds;
    protected boolean mSwallowTouches;
    private int[] mTouch_ids = new int[10];
    private float[] mTouch_xs = new float[10];
    private float[] mTouch_ys = new float[10];

    public interface MessageListener {
        static {
            Covode.recordClassIndex(2883);
        }

        int onMsgReceived(long j2, long j3, long j4, String str);
    }

    static {
        Covode.recordClassIndex(2870);
    }

    public void destroyBEFGame() {
    }

    public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
    }

    public synchronized double getCurrentFps() {
        double d2;
        MethodCollector.i(668);
        d2 = this.mCurrentFps;
        MethodCollector.o(668);
        return d2;
    }

    public synchronized boolean getNativeInited() {
        boolean z;
        MethodCollector.i(674);
        z = this.mNativeInited;
        MethodCollector.o(674);
        return z;
    }

    public void pauseGame() {
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.game.BEFGameView.AnonymousClass3 */

            static {
                Covode.recordClassIndex(2875);
            }

            public void run() {
                if (BEFGameView.this.mHandle != 0) {
                    NativeInterface.pause(BEFGameView.this.mHandle);
                }
            }
        });
    }

    public void resumeGame() {
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.game.BEFGameView.AnonymousClass4 */

            static {
                Covode.recordClassIndex(2876);
            }

            public void run() {
                if (BEFGameView.this.mHandle != 0) {
                    NativeInterface.resume(BEFGameView.this.mHandle);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void deleteBuffers() {
        GLES20.glDeleteTextures(1, new int[]{this.mSrcTexture}, 0);
        GLES20.glDeleteTextures(1, new int[]{this.mDstTexture}, 0);
        GLES20.glDeleteBuffers(1, new int[]{this.mFBO}, 0);
    }

    /* access modifiers changed from: protected */
    public void initRenderObject() {
        int loadProgram = OpenGLUtils.loadProgram("attribute vec2 attUV;\nattribute vec2 attPosition;\nvarying vec2 textureCoord;\nuniform mat4 mvpMatrix;\n\nvoid main() {\n    gl_Position  = mvpMatrix * vec4(attPosition, 0.,1.);\n    textureCoord = attUV;\n}\n", "precision highp float;\n\nuniform sampler2D uTexture;\nvarying vec2 textureCoord;\nvoid main() {\n    gl_FragColor = texture2D(uTexture, textureCoord);\n}\n");
        this.mGlProgram = loadProgram;
        this.mGlUvHandle = GLES20.glGetAttribLocation(loadProgram, "attUV");
        this.mGlPosHandle = GLES20.glGetAttribLocation(this.mGlProgram, "attPosition");
        this.mGlMatrixHandle = GLES20.glGetUniformLocation(this.mGlProgram, "mvpMatrix");
        this.mGlTextureSampleHandle = GLES20.glGetUniformLocation(this.mGlProgram, "uTexture");
        getWidth();
        getHeight();
        this.mSrcTexture = RenderTextureUtils.generateBlankTexture(720, 1280);
        this.mDstTexture = RenderTextureUtils.generateBlankTexture(720, 1280);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i2 = iArr[0];
        this.mFBO = i2;
        GLES20.glBindFramebuffer(36160, i2);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mDstTexture, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* access modifiers changed from: protected */
    public void renderTextureToView() {
        GLES20.glBindFramebuffer(36160, 0);
        int width = getWidth();
        int height = getHeight();
        GLES20.glViewport(0, 0, width, height);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glUseProgram(this.mGlProgram);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.mDstTexture);
        GLES20.glUniform1i(this.mGlTextureSampleHandle, 0);
        Matrix.setIdentityM(this.mMatrix, 0);
        GLES20.glUniformMatrix4fv(this.mGlMatrixHandle, 1, false, this.mMatrix, 0);
        GLES20.glEnableVertexAttribArray(this.mGlPosHandle);
        float f2 = ((float) height) / 2.0f;
        GLES20.glVertexAttribPointer(this.mGlPosHandle, 2, 5126, false, 0, (Buffer) RenderTextureUtils.getVertexBufferWithParams(-1.0f, 1.0f, ((((((float) width) * 1.0f) / 720.0f) * 1280.0f) - f2) / f2, -1.0f));
        GLES20.glEnableVertexAttribArray(this.mGlUvHandle);
        GLES20.glVertexAttribPointer(this.mGlUvHandle, 2, 5126, false, 0, (Buffer) RenderTextureUtils.getUVBuffer());
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* access modifiers changed from: protected */
    public void setNativeInited(boolean z) {
        this.mNativeInited = z;
    }

    public void setSwallowTouches(boolean z) {
        this.mSwallowTouches = z;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
    }

    class BEFGameContextFactory implements GLSurfaceView.EGLContextFactory {
        private int EGL_CONTEXT_CLIENT_VERSION;

        static {
            Covode.recordClassIndex(2882);
        }

        public static int com_bef_effectsdk_game_BEFGameView$BEFGameContextFactory_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
            return 0;
        }

        private BEFGameContextFactory() {
            this.EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
        }

        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                com_bef_effectsdk_game_BEFGameView$BEFGameContextFactory_com_ss_android_ugc_aweme_lancet_LogLancet_e("BEFGameContextFactory", "BEFGame error: display:" + eGLDisplay + " context: " + eGLContext);
            }
            if (BEFGameView.this.getNativeInited()) {
                BEFGameView.this.setNativeInited(false);
                NativeInterface.destroy(BEFGameView.this.mHandle);
                BEFGameView.this.deleteBuffers();
            }
        }
    }

    public int addMessageListener(MessageListener messageListener) {
        if (messageListener == null) {
            return 3;
        }
        this.mListeners.add(messageListener);
        return 0;
    }

    public int removeMessageListener(MessageListener messageListener) {
        if (messageListener == null) {
            return 3;
        }
        this.mListeners.remove(messageListener);
        return 0;
    }

    /* access modifiers changed from: protected */
    public void render(double d2) {
        NativeInterface.setSize(this.mHandle, 720, 1280);
        renderGameToTexture(d2);
        renderTextureToView();
    }

    public void setGameBundlePath(final String str) {
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.game.BEFGameView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(2871);
            }

            public void run() {
                if (!BEFGameView.this.mGameBundlePath.equals(str)) {
                    BEFGameView.this.mGameBundlePath = str;
                    if (BEFGameView.this.getNativeInited()) {
                        NativeInterface.setGameBundlePath(BEFGameView.this.mHandle, str);
                        BEFGameView.this.mFirstLoopGuard = true;
                    }
                }
            }
        });
    }

    public void setFps(long j2) {
        if (j2 >= 60) {
            this.mFps = 60;
        } else {
            this.mFps = j2;
        }
        long j3 = this.mFps;
        this.mCurrentFps = (double) j3;
        this.mAnimationInterval = (long) ((1.0f / ((float) j3)) * 1.0E9f);
    }

    /* access modifiers changed from: protected */
    public void renderGameToTexture(double d2) {
        GLES20.glBindFramebuffer(36160, this.mFBO);
        GLES20.glViewport(0, 0, 720, 1280);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        NativeInterface.processFrame(this.mHandle, this.mSrcTexture, this.mDstTexture, d2);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public BEFGameView(Context context) {
        super(context);
        MethodCollector.i(369);
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderMediaOverlay(true);
        setEGLContextFactory(new BEFGameContextFactory());
        setRenderer(this);
        setRenderMode(1);
        this.mListeners = new HashSet<>();
        this.mCacheMessages = new LinkedList();
        setFps(60);
        MethodCollector.o(369);
    }

    public void onDrawFrame(GL10 gl10) {
        MethodCollector.i(742);
        if (!getNativeInited() || this.mGameBundlePath.isEmpty()) {
            MethodCollector.o(742);
            return;
        }
        if (this.mFirstLoopGuard) {
            this.mStartTimeStampNanoSeconds = System.nanoTime();
            this.mLastTickInNanoSeconds = System.nanoTime();
        }
        if (!this.mFirstLoopGuard) {
            while (!this.mCacheMessages.isEmpty()) {
                this.mCacheMessages.poll().run();
            }
        }
        double nanoTime = (double) System.nanoTime();
        double d2 = (double) this.mStartTimeStampNanoSeconds;
        Double.isNaN(nanoTime);
        Double.isNaN(d2);
        render((nanoTime - d2) / 1.0E9d);
        long nanoTime2 = System.nanoTime() - this.mLastTickInNanoSeconds;
        long j2 = this.mAnimationInterval;
        if (nanoTime2 < j2) {
            double d3 = (double) (j2 - nanoTime2);
            Double.isNaN(d3);
            try {
                Thread.sleep((long) ((d3 * 1.0d) / 1000000.0d));
            } catch (Exception unused) {
            }
        }
        double nanoTime3 = (double) (System.nanoTime() - this.mLastTickInNanoSeconds);
        Double.isNaN(nanoTime3);
        double d4 = 1.0d / ((nanoTime3 * 1.0d) / 1.0E9d);
        this.mCurrentFps = d4;
        long j3 = this.mFps;
        if (d4 >= ((double) j3)) {
            this.mCurrentFps = (double) j3;
        }
        this.mLastTickInNanoSeconds = System.nanoTime();
        this.mFirstLoopGuard = false;
        MethodCollector.o(742);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 10) {
            pointerCount = 10;
        }
        for (int i2 = 0; i2 < pointerCount; i2++) {
            this.mTouch_ids[i2] = motionEvent.getPointerId(i2);
            this.mTouch_xs[i2] = motionEvent.getX(i2);
            this.mTouch_ys[i2] = motionEvent.getY(i2);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, 1);
            final int[] iArr = {this.mTouch_ids[0]};
            final float[] fArr = {this.mTouch_xs[0]};
            final float[] fArr2 = {this.mTouch_ys[0]};
            queueEvent(new Runnable() {
                /* class com.bef.effectsdk.game.BEFGameView.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(2878);
                }

                public void run() {
                    NativeInterface.touchesBegin(BEFGameView.this.mHandle, iArr, fArr, fArr2);
                }
            });
            return true;
        } else if (action != 1) {
            if (action == 2) {
                convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
                if (!this.mMultipleTouchEnabled) {
                    final int[] iArr2 = {this.mTouch_ids[0]};
                    final float[] fArr3 = {this.mTouch_xs[0]};
                    final float[] fArr4 = {this.mTouch_ys[0]};
                    queueEvent(new Runnable() {
                        /* class com.bef.effectsdk.game.BEFGameView.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(2879);
                        }

                        public void run() {
                            NativeInterface.touchesMove(BEFGameView.this.mHandle, iArr2, fArr3, fArr4);
                        }
                    });
                } else {
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        final int[] iArr3 = {this.mTouch_ids[i3]};
                        final float[] fArr5 = {this.mTouch_xs[i3]};
                        final float[] fArr6 = {this.mTouch_ys[i3]};
                        queueEvent(new Runnable() {
                            /* class com.bef.effectsdk.game.BEFGameView.AnonymousClass8 */

                            static {
                                Covode.recordClassIndex(2880);
                            }

                            public void run() {
                                NativeInterface.touchesMove(BEFGameView.this.mHandle, iArr3, fArr5, fArr6);
                            }
                        });
                    }
                    return true;
                }
            } else if (action == 5) {
                int action2 = motionEvent.getAction() >> 8;
                if (this.mMultipleTouchEnabled || action2 == 0) {
                    convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
                    final int[] iArr4 = {this.mTouch_ids[action2]};
                    final float[] fArr7 = {this.mTouch_xs[action2]};
                    final float[] fArr8 = {this.mTouch_ys[action2]};
                    queueEvent(new Runnable() {
                        /* class com.bef.effectsdk.game.BEFGameView.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(2877);
                        }

                        public void run() {
                            NativeInterface.touchesBegin(BEFGameView.this.mHandle, iArr4, fArr7, fArr8);
                        }
                    });
                    return true;
                }
            } else if (action == 6) {
                int action3 = motionEvent.getAction() >> 8;
                if (this.mMultipleTouchEnabled || action3 == 0) {
                    convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
                    final int[] iArr5 = {this.mTouch_ids[action3]};
                    final float[] fArr9 = {this.mTouch_xs[action3]};
                    final float[] fArr10 = {this.mTouch_ys[action3]};
                    queueEvent(new Runnable() {
                        /* class com.bef.effectsdk.game.BEFGameView.AnonymousClass9 */

                        static {
                            Covode.recordClassIndex(2881);
                        }

                        public void run() {
                            NativeInterface.touchesEnd(BEFGameView.this.mHandle, iArr5, fArr9, fArr10);
                        }
                    });
                    return true;
                }
            }
            return this.mSwallowTouches;
        } else {
            convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, 1);
            final int[] iArr6 = {this.mTouch_ids[0]};
            final float[] fArr11 = {this.mTouch_xs[0]};
            final float[] fArr12 = {this.mTouch_ys[0]};
            queueEvent(new Runnable() {
                /* class com.bef.effectsdk.game.BEFGameView.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(2872);
                }

                public void run() {
                    NativeInterface.touchesEnd(BEFGameView.this.mHandle, iArr6, fArr11, fArr12);
                }
            });
            return true;
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.mStartTimeStampNanoSeconds = System.nanoTime();
        this.mLastTickInNanoSeconds = System.nanoTime();
        long[] jArr = new long[2];
        NativeInterface.createHandle(jArr);
        long j2 = jArr[0];
        this.mHandle = j2;
        NativeInterface.init(j2, 720, 1280);
        NativeInterface.addMessageListener(this.mHandle, this);
        initRenderObject();
        setNativeInited(true);
        if (!this.mGameBundlePath.isEmpty()) {
            NativeInterface.setGameBundlePath(this.mHandle, this.mGameBundlePath);
        }
    }

    /* access modifiers changed from: protected */
    public void convertTouchesToNormalizedPos(float[] fArr, float[] fArr2, int i2) {
        float width = (float) getWidth();
        float f2 = ((width * 1.0f) / 720.0f) * 1280.0f;
        float height = ((float) getHeight()) - f2;
        for (int i3 = 0; i3 < i2; i3++) {
            float f3 = fArr[i3];
            float f4 = fArr2[i3];
            fArr[i3] = ((f3 * 2.0f) / width) - 1.0f;
            fArr2[i3] = 1.0f - (((f4 - height) * 2.0f) / f2);
        }
    }

    @Override // com.bef.effectsdk.game.NativeInterface.NativeMessageListener
    public int nativeOnMsgReceived(long j2, long j3, long j4, String str) {
        Iterator<MessageListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onMsgReceived(j2, j3, j4, str);
        }
        return 0;
    }

    public int postMessage(final long j2, final long j3, final long j4, final String str) {
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.game.BEFGameView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(2873);
            }

            public void run() {
                BEFGameView.this.mCacheMessages.add(new Runnable() {
                    /* class com.bef.effectsdk.game.BEFGameView.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(2874);
                    }

                    public void run() {
                        NativeInterface.postMessage(BEFGameView.this.mHandle, j2, j3, j4, str);
                    }
                });
            }
        });
        return 0;
    }
}
