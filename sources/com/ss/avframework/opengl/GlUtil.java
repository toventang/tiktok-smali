package com.ss.avframework.opengl;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class GlUtil {
    private static int sFilterType = -1;

    protected static native int nativeAttachThreadToOpenGl(long j2, int i2, long j3);

    public static native void nativeDetachThreadToOpenGl();

    public static native boolean nativeIsOpenGlThread();

    private GlUtil() {
    }

    static {
        Covode.recordClassIndex(100535);
    }

    public static boolean nativeAttachThreadToOpenGl() {
        MethodCollector.i(14535);
        if (nativeAttachThreadToOpenGl(GLThreadManager.getNativeEGLContext(), 0, 0) != 0) {
            MethodCollector.o(14535);
            return true;
        }
        MethodCollector.o(14535);
        return false;
    }

    public static int getFilterType(int i2) {
        int i3 = sFilterType;
        if (i3 == 9729 || i3 == 9728) {
            return i3;
        }
        return i2;
    }

    public static void setFilterType(int i2) {
        if (i2 == 9729 || i2 == 9728) {
            sFilterType = i2;
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw new RuntimeException(str + ": GLES20 error: " + glGetError);
        }
    }

    public static int generateTexture(int i2) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i3 = iArr[0];
        GLES20.glBindTexture(i2, i3);
        GLES20.glTexParameterf(i2, 10241, (float) getFilterType(9729));
        GLES20.glTexParameterf(i2, 10240, (float) getFilterType(9729));
        GLES20.glTexParameterf(i2, 10242, 33071.0f);
        GLES20.glTexParameterf(i2, 10243, 33071.0f);
        GLES20.glPixelStorei(3317, 2);
        checkNoGLES2Error("generateTexture");
        return i3;
    }

    public static int getFilterTypeFromName(String str) {
        str.hashCode();
        switch (str.hashCode()) {
            case -2025410270:
                if (!str.equals("linear_mipmap_linear")) {
                    return 9729;
                }
                return 9987;
            case -1580272728:
                if (!str.equals("nearest_mipmap_nearest")) {
                    return 9729;
                }
                return 9984;
            case -1009299967:
                if (!str.equals("linear_mipmap_nearest")) {
                    return 9729;
                }
                return 9985;
            case -796902757:
                if (!str.equals("nearest_mipmap_linear")) {
                    return 9729;
                }
                return 9986;
            case 1825779806:
                if (!str.equals("nearest")) {
                    return 9729;
                }
                return 9728;
            default:
                return 9729;
        }
    }

    public static void checkAnyGLES2Error(String str) {
        int i2 = Build.VERSION.SDK_INT;
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new AndroidRuntimeException("EGL error: " + str + " (code :" + eglGetError + ")");
        } else if (EGL14.eglGetCurrentDisplay() == EGL14.EGL_NO_DISPLAY) {
            throw new AndroidRuntimeException("Bad EGL display:".concat(String.valueOf(str)));
        } else if (EGL14.eglGetCurrentContext() != EGL14.EGL_NO_CONTEXT) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                throw new AndroidRuntimeException("GLES error:" + str + " (code :" + glGetError + ")");
            }
        } else {
            throw new AndroidRuntimeException("Bad EGL context:".concat(String.valueOf(str)));
        }
    }
}
