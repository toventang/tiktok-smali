package com.ss.bytertc.engine.utils;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;

public class GLUtils {
    private static int[] ctxAttr = {12440, 2, 12344};
    private static int[] defaultEGLConfAttr = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};

    static {
        Covode.recordClassIndex(101045);
    }

    public static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new RuntimeException("Unable to initialize EGL14: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        throw new RuntimeException("Unable to get EGL14 display: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay) {
        return getEglConfig(eGLDisplay, defaultEGLConfAttr);
    }

    public static int loadShader(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw new RuntimeException("eglChooseConfig failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
        } else if (iArr2[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new RuntimeException("eglChooseConfig returned null");
        } else {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext) {
        return EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, ctxAttr, 0);
    }
}
