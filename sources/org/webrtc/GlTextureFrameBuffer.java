package org.webrtc;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;

public class GlTextureFrameBuffer {
    private int frameBufferId;
    private int height;
    private final int pixelFormat;
    private int textureId;
    private int width;

    static {
        Covode.recordClassIndex(106597);
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
        GLES20.glDeleteTextures(1, new int[]{this.textureId}, 0);
        this.textureId = 0;
        GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        this.frameBufferId = 0;
        this.width = 0;
        this.height = 0;
    }

    public GlTextureFrameBuffer(int i2) {
        switch (i2) {
            case 6407:
            case 6408:
            case 6409:
                this.pixelFormat = i2;
                this.width = 0;
                this.height = 0;
                return;
            default:
                throw new IllegalArgumentException("Invalid pixel format: ".concat(String.valueOf(i2)));
        }
    }

    public void setSize(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Invalid size: " + i2 + "x" + i3);
        } else if (i2 != this.width || i3 != this.height) {
            this.width = i2;
            this.height = i3;
            if (this.textureId == 0) {
                this.textureId = GlUtil.generateTexture(3553);
            }
            if (this.frameBufferId == 0) {
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.frameBufferId = iArr[0];
            }
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
