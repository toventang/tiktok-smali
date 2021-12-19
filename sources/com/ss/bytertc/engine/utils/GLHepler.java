package com.ss.bytertc.engine.utils;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import java.nio.FloatBuffer;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.GlShader;
import org.webrtc.GlTextureFrameBuffer;
import org.webrtc.GlUtil;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

public class GLHepler {
    private static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private final String TAG;
    private int frameBufferId;
    private Handler handler;
    private boolean mBInit;
    private EglBase mEglBase;
    private final String mFragmentShader;
    private GlShader mGlShader;
    private final String mVertorShader;
    private boolean released;
    private GlShader shader;
    private VideoFrame.TextureBuffer.Type shaderTextureType;
    private GlTextureFrameBuffer textureFrameBuffer;
    private final ThreadUtils.ThreadChecker threadChecker;

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        this.textureFrameBuffer.release();
    }

    static {
        Covode.recordClassIndex(101042);
    }

    private void initShader(VideoFrame.TextureBuffer.Type type) {
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        if (!this.mBInit) {
            this.mBInit = true;
            this.shaderTextureType = type;
            GlShader glShader2 = new GlShader("attribute vec4 vPosition;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n\nvoid main(){gl_Position = vPosition;\ntextureCoordinate = inputTextureCoordinate;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}");
            this.shader = glShader2;
            glShader2.useProgram();
            GLES20.glUniform1i(this.shader.getUniformLocation("s_texture"), 0);
            GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
            this.shader.setVertexAttribArray("vPosition", 2, DEVICE_RECTANGLE);
            this.shader.setVertexAttribArray("inputTextureCoordinate", 2, TEXTURE_RECTANGLE);
        }
    }

    public static GLHepler create(final String str, final EGLContext eGLContext) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler2 = new Handler(handlerThread.getLooper());
        return (GLHepler) ThreadUtils.invokeAtFrontUninterruptibly(handler2, new Callable<GLHepler>() {
            /* class com.ss.bytertc.engine.utils.GLHepler.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101044);
            }

            @Override // java.util.concurrent.Callable
            public final GLHepler call() {
                try {
                    return new GLHepler(eGLContext, handler2);
                } catch (RuntimeException e2) {
                    LogUtil.e("TextureHelper", str + " create failure", e2);
                    return null;
                }
            }
        });
    }

    private GLHepler(EGLContext eGLContext, Handler handler2) {
        this.TAG = "GLHepler";
        this.mVertorShader = "attribute vec4 vPosition;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n\nvoid main(){gl_Position = vPosition;\ntextureCoordinate = inputTextureCoordinate;\n}\n";
        this.mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}";
        ThreadUtils.ThreadChecker threadChecker2 = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker2;
        this.released = false;
        this.handler = handler2;
        EglBase createEgl14$$STATIC$$ = EglBase$$CC.createEgl14$$STATIC$$(eGLContext, EglBase.CONFIG_PIXEL_BUFFER);
        this.mEglBase = createEgl14$$STATIC$$;
        try {
            createEgl14$$STATIC$$.createDummyPbufferSurface();
            this.mEglBase.makeCurrent();
            new GlTextureFrameBuffer(6408);
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
            threadChecker2.detachThread();
        } catch (RuntimeException e2) {
            this.mEglBase.release();
            handler2.getLooper().quit();
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$deliverToTexture2D$0$GLHepler(int i2, int i3, int i4, int i5) {
        long currentTimeMillis = System.currentTimeMillis();
        this.threadChecker.checkIsOnValidThread();
        if (!this.released) {
            if (!this.mBInit) {
                initShader(VideoFrame.TextureBuffer.Type.OES);
                this.shader.useProgram();
                GLES20.glBindFramebuffer(36160, this.frameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
            }
            this.shader.useProgram();
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i3);
            GLES20.glViewport(0, 0, i4, i5);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glBindTexture(36197, 0);
            LogUtil.i("opnngl ToTexture2D", "usetime:" + (System.currentTimeMillis() - currentTimeMillis));
            return;
        }
        throw new IllegalStateException("YuvConverter.convert called on released object");
    }

    public void deliverToTexture2D(int i2, int i3, int i4, int i5, float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new GLHepler$$Lambda$0(this, i5, i4, i2, i3));
    }
}
