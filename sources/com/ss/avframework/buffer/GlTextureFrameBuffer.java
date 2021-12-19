package com.ss.avframework.buffer;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Log;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.utils.AVLog;

public class GlTextureFrameBuffer {
    private int frameBufferId;
    private int height;
    private final int pixelFormat;
    private int textureId;
    private int width;

    static {
        Covode.recordClassIndex(99676);
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.textureId;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        int i2 = this.frameBufferId;
        if (i2 > 0) {
            GLES20.glBindFramebuffer(36160, i2);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        }
        int i3 = this.textureId;
        if (i3 > 0) {
            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
        }
        this.frameBufferId = 0;
        this.textureId = 0;
        this.width = 0;
        this.height = 0;
    }

    public GlTextureFrameBuffer(int i2) {
        String str;
        switch (i2) {
            case 6407:
            case 6408:
            case 6409:
                this.pixelFormat = i2;
                try {
                    this.textureId = GlUtil.generateTexture(3553);
                } catch (Exception e2) {
                    String str2 = "";
                    if (e2.getMessage() != null) {
                        str = "exception:" + e2.getMessage();
                    } else {
                        str = str2;
                    }
                    this.textureId = -1;
                    Thread currentThread = Thread.currentThread();
                    str2 = currentThread != null ? currentThread.getName() : str2;
                    String str3 = "none";
                    int i3 = Build.VERSION.SDK_INT;
                    try {
                        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                        if (eglGetCurrentContext != null) {
                            str3 = eglGetCurrentContext + " handle " + GLThreadManager.toNativeEGLContext(eglGetCurrentContext);
                        }
                    } catch (Exception e3) {
                        AVLog.ioe("OpenGL", "some error occurs:" + e3.getCause());
                    }
                    String a2 = a.a("[thread:%s context info:%s] create texture failed:%s", new Object[]{str3, str2, Log.getStackTraceString(new Throwable())});
                    AVLog.ioe("OpenGL", a2);
                    int glGetError = GLES20.glGetError();
                    int i4 = 0;
                    while (glGetError != 0) {
                        str = str + ", error code:" + glGetError;
                        glGetError = GLES20.glGetError();
                        i4++;
                        if (i4 >= 10) {
                            AVLog.logKibana(6, "OpenGL", a2 + ", [opengl errors:" + str + "],loopCount:" + i4, null);
                        }
                    }
                    AVLog.logKibana(6, "OpenGL", a2 + ", [opengl errors:" + str + "],loopCount:" + i4, null);
                }
                if (this.textureId == -1) {
                    this.textureId = GlUtil.generateTexture(3553);
                }
                this.width = 0;
                this.height = 0;
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.frameBufferId = iArr[0];
                return;
            default:
                throw new IllegalArgumentException("Invalid pixel format: ".concat(String.valueOf(i2)));
        }
    }

    public void setSize(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            throw new IllegalArgumentException("Invalid size: " + i2 + "x" + i3);
        } else if (i2 != this.width || i3 != this.height) {
            this.width = i2;
            this.height = i3;
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.textureId);
            int i4 = this.pixelFormat;
            GLES20.glTexImage2D(3553, 0, i4, i2, i3, 0, i4, 5121, null);
            GLES20.glBindTexture(3553, 0);
            GlUtil.checkNoGLES2Error("GlTextureFrameBuffer setSize");
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureId, 0);
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus == 36053) {
                GLES20.glBindFramebuffer(36160, 0);
                return;
            }
            throw new IllegalStateException("Framebuffer not complete, status: ".concat(String.valueOf(glCheckFramebufferStatus)));
        }
    }
}
