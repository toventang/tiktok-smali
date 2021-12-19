package org.webrtc;

import android.opengl.GLES20;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.Buffer;
import java.nio.FloatBuffer;

public class GlClearWorkaround {
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private GlShader currentShader;
    private boolean mHasInit;

    private GlShader createShader() {
        return new GlShader("#ifdef GL_ES\nprecision mediump float;\n#endif\nuniform float u_clear_depth;\nattribute vec4 a_position;\nvoid main(void) {\n  gl_Position = vec4(a_position.x, a_position.y, u_clear_depth, 1.0);\n}\n", "#ifdef GL_ES\nprecision mediump float;\n#endif\nuniform vec4 u_clear_color;\nvoid main(void) {\n  gl_FragColor = u_clear_color;\n}\n");
    }

    public synchronized void init() {
        MethodCollector.i(9082);
        this.mHasInit = true;
        MethodCollector.o(9082);
    }

    public synchronized void release() {
        MethodCollector.i(9083);
        this.mHasInit = false;
        GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
        }
        MethodCollector.o(9083);
    }

    public enum WORKAROUND_STATUS {
        kStatusUnknown,
        kStatusEnable,
        kStatusDisable;

        static {
            Covode.recordClassIndex(106588);
        }
    }

    static {
        Covode.recordClassIndex(106587);
    }

    public static WORKAROUND_STATUS isNeedWorkaround() {
        if (Build.VERSION.SDK_INT < 23) {
            return WORKAROUND_STATUS.kStatusEnable;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return WORKAROUND_STATUS.kStatusDisable;
        }
        String lowerCase = GLES20.glGetString(7936).toLowerCase();
        if (lowerCase.contains("mali") || lowerCase.contains("arm")) {
            return WORKAROUND_STATUS.kStatusEnable;
        }
        return WORKAROUND_STATUS.kStatusDisable;
    }

    private void prepareShader() {
        GlShader createShader = createShader();
        this.currentShader = createShader;
        createShader.useProgram();
        GlUtil.checkNoGLES2Error("Create shader");
        int attribLocation = createShader.getAttribLocation("a_position");
        GLES20.glEnableVertexAttribArray(attribLocation);
        GLES20.glVertexAttribPointer(attribLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    public synchronized void clear(int i2, int i3, int i4, float f2, float f3, float f4, float f5, float f6, int i5) {
        MethodCollector.i(9274);
        if (!this.mHasInit) {
            MethodCollector.o(9274);
            return;
        }
        if (this.currentShader == null) {
            prepareShader();
        }
        this.currentShader.useProgram();
        GLES20.glUniform1f(this.currentShader.getUniformLocation("u_clear_depth"), f6);
        GLES20.glUniform4f(this.currentShader.getUniformLocation("u_clear_color"), f2, f3, f4, f5);
        if ((i4 & 16384) == 0) {
            GLES20.glColorMask(false, false, false, false);
        }
        GlUtil.checkNoGLES2Error("before depth test");
        if ((i4 & 256) != 0) {
            GLES20.glEnable(2929);
            GLES20.glDepthFunc(519);
        } else {
            GLES20.glDisable(2929);
            GLES20.glDepthFunc(512);
        }
        GlUtil.checkNoGLES2Error("before stencil test");
        if ((i4 & 1024) != 0) {
            GLES20.glEnable(2960);
            GLES20.glStencilFunc(519, i5, 255);
            GLES20.glStencilOp(7680, 7680, 7681);
        } else {
            GLES20.glDisable(2960);
            GLES20.glStencilOp(7680, 7680, 7680);
            GLES20.glStencilMask(0);
        }
        GlUtil.checkNoGLES2Error("before clear workaround");
        GLES20.glDisable(2884);
        GLES20.glDisable(3042);
        GLES20.glDisable(32823);
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glDrawArrays(5, 0, 4);
        GlUtil.checkNoGLES2Error("after clear workaround");
        MethodCollector.o(9274);
    }
}
