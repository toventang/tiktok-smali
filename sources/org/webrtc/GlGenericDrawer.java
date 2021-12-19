package org.webrtc;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.realx.base.RXLogging;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.webrtc.RendererCommon;

/* access modifiers changed from: package-private */
public class GlGenericDrawer implements RendererCommon.GlDrawer {
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private GlShader currentShader;
    private ShaderType currentShaderType;
    private final String genericFragmentSource;
    private int inPosLocation;
    private int inTcLocation;
    private final ShaderCallbacks shaderCallbacks;
    private int texMatrixLocation;
    private final String vertexShader;

    public interface ShaderCallbacks {
        static {
            Covode.recordClassIndex(106590);
        }

        void onNewShader(GlShader glShader);

        void onPrepareShader(GlShader glShader, float[] fArr, int i2, int i3, int i4, int i5);
    }

    public static int org_webrtc_GlGenericDrawer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void release() {
        GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
            this.currentShaderType = null;
        }
    }

    public enum ShaderType {
        OES,
        RGB,
        YUV;

        static {
            Covode.recordClassIndex(106591);
        }
    }

    static {
        Covode.recordClassIndex(106589);
    }

    /* access modifiers changed from: package-private */
    public GlShader createShader(ShaderType shaderType) {
        return new GlShader(this.vertexShader, createFragmentShaderString(this.genericFragmentSource, shaderType));
    }

    public GlGenericDrawer(String str, ShaderCallbacks shaderCallbacks2) {
        this("varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n", str, shaderCallbacks2);
    }

    static String createFragmentShaderString(String str, ShaderType shaderType) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (shaderType == ShaderType.OES) {
            sb.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb.append("precision mediump float;\n");
        sb.append("varying vec2 tc;\n");
        if (shaderType == ShaderType.YUV) {
            sb.append("uniform sampler2D y_tex;\n");
            sb.append("uniform sampler2D u_tex;\n");
            sb.append("uniform sampler2D v_tex;\n");
            sb.append("vec4 sample(vec2 p) {\n");
            sb.append("  float y = texture2D(y_tex, p).r * 1.16438;\n");
            sb.append("  float u = texture2D(u_tex, p).r;\n");
            sb.append("  float v = texture2D(v_tex, p).r;\n");
            sb.append("  return vec4(y + 1.59603 * v - 0.874202,\n");
            sb.append("    y - 0.391762 * u - 0.812968 * v + 0.531668,\n");
            sb.append("    y + 2.01723 * u - 1.08563, 1);\n");
            sb.append("}\n");
            sb.append(str);
        } else {
            if (shaderType == ShaderType.OES) {
                str2 = "samplerExternalOES";
            } else {
                str2 = "sampler2D";
            }
            sb.append("uniform ").append(str2).append(" tex;\n");
            sb.append(str.replace("sample(", "texture2D(tex, "));
        }
        return sb.toString();
    }

    public GlGenericDrawer(String str, String str2, ShaderCallbacks shaderCallbacks2) {
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.shaderCallbacks = shaderCallbacks2;
    }

    private void prepareShader(ShaderType shaderType, float[] fArr, int i2, int i3, int i4, int i5) {
        GlShader createShader;
        if (shaderType.equals(this.currentShaderType)) {
            createShader = this.currentShader;
        } else {
            this.currentShaderType = shaderType;
            GlShader glShader = this.currentShader;
            if (glShader != null) {
                glShader.release();
            }
            createShader = createShader(shaderType);
            this.currentShader = createShader;
            createShader.useProgram();
            if (shaderType == ShaderType.YUV) {
                GLES20.glUniform1i(createShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(createShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(createShader.getUniformLocation("v_tex"), 2);
            } else {
                GLES20.glUniform1i(createShader.getUniformLocation("tex"), 0);
            }
            GlUtil.checkNoGLES2Error("Create shader");
            this.shaderCallbacks.onNewShader(createShader);
            this.texMatrixLocation = createShader.getUniformLocation("tex_mat");
            this.inPosLocation = createShader.getAttribLocation("in_pos");
            this.inTcLocation = createShader.getAttribLocation("in_tc");
        }
        GlUtil.checkNoGLES2Error("before useProgram ");
        createShader.useProgram();
        GLES20.glEnableVertexAttribArray(this.inPosLocation);
        GLES20.glVertexAttribPointer(this.inPosLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GLES20.glEnableVertexAttribArray(this.inTcLocation);
        GLES20.glVertexAttribPointer(this.inTcLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_TEXTURE_BUFFER);
        GLES20.glUniformMatrix4fv(this.texMatrixLocation, 1, false, fArr, 0);
        this.shaderCallbacks.onPrepareShader(createShader, fArr, i2, i3, i4, i5);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawOes(int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int i8) {
        prepareShader(ShaderType.OES, fArr, i3, i4, i7, i8);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            org_webrtc_GlGenericDrawer_com_ss_android_ugc_aweme_lancet_LogLancet_e("GlGenericDrawer", "drawOes glBindTexture error: ".concat(String.valueOf(glGetError)));
            RXLogging.e("GlGenericDrawer", "drawOes glBindTexture error: ".concat(String.valueOf(glGetError)));
            return;
        }
        GLES20.glViewport(i5, i6, i7, i8);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
        GlUtil.checkNoGLES2Error("drawOes done");
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawRgb(int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int i8) {
        prepareShader(ShaderType.RGB, fArr, i3, i4, i7, i8);
        GlUtil.checkNoGLES2Error("after prepare shader");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i2);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            org_webrtc_GlGenericDrawer_com_ss_android_ugc_aweme_lancet_LogLancet_e("GlGenericDrawer", "drawRgb glBindTexture error: ".concat(String.valueOf(glGetError)));
            RXLogging.e("GlGenericDrawer", "drawRgb glBindTexture error: ".concat(String.valueOf(glGetError)));
            return;
        }
        GLES20.glViewport(i5, i6, i7, i8);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkNoGLES2Error("drawRgb done");
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        prepareShader(ShaderType.YUV, fArr, i2, i3, i6, i7);
        for (int i8 = 0; i8 < 3; i8++) {
            GLES20.glActiveTexture(33984 + i8);
            GLES20.glBindTexture(3553, iArr[i8]);
        }
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            org_webrtc_GlGenericDrawer_com_ss_android_ugc_aweme_lancet_LogLancet_e("GlGenericDrawer", "drawYuv glBindTexture error: ".concat(String.valueOf(glGetError)));
            RXLogging.e("GlGenericDrawer", "drawYuv glBindTexture error: ".concat(String.valueOf(glGetError)));
            return;
        }
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        int i9 = 0;
        do {
            GLES20.glActiveTexture(i9 + 33984);
            GLES20.glBindTexture(3553, 0);
            i9++;
        } while (i9 < 3);
        GlUtil.checkNoGLES2Error("drawYuv done");
    }
}
