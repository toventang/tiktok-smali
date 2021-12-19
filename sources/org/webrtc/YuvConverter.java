package org.webrtc;

import android.graphics.Matrix;
import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.realx.base.RXLogging;
import java.nio.ByteBuffer;
import org.webrtc.GlGenericDrawer;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

public class YuvConverter {
    private final GlGenericDrawer drawer;
    private final GlTextureFrameBuffer i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
    private final ShaderCallbacks shaderCallbacks;
    private final ThreadUtils.ThreadChecker threadChecker;

    /* renamed from: org.webrtc.YuvConverter$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(106723);
        }
    }

    static {
        Covode.recordClassIndex(106721);
    }

    public static int org_webrtc_YuvConverter_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};
        private static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private float[] coeffs;
        private int coeffsLoc;
        private float stepSize;
        private int xUnitLoc;

        private ShaderCallbacks() {
        }

        public void setPlaneU() {
            this.coeffs = uCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneV() {
            this.coeffs = vCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneY() {
            this.coeffs = yCoeffs;
            this.stepSize = 1.0f;
        }

        static {
            Covode.recordClassIndex(106724);
        }

        /* synthetic */ ShaderCallbacks(AnonymousClass1 r1) {
            this();
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i2, int i3, int i4, int i5) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i6 = this.xUnitLoc;
            float f2 = this.stepSize;
            float f3 = (float) i2;
            GLES20.glUniform2f(i6, (fArr[0] * f2) / f3, (f2 * fArr[1]) / f3);
        }
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.threadChecker.detachThread();
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker2 = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker2;
        ShaderCallbacks shaderCallbacks2 = new ShaderCallbacks(null);
        this.shaderCallbacks = shaderCallbacks2;
        this.drawer = new GlGenericDrawer("uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n", shaderCallbacks2);
        threadChecker2.detachThread();
    }

    static final /* synthetic */ void lambda$convert$0$YuvConverter(ByteBuffer byteBuffer) {
        MethodCollector.i(10390);
        JniCommon.nativeFreeByteBuffer(byteBuffer);
        MethodCollector.o(10390);
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        MethodCollector.i(10236);
        this.threadChecker.checkIsOnValidThread();
        GlUtil.clearGLES2Error("YUVConverter");
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i2 = ((width + 63) / 64) * 64;
        int i3 = (height + 1) / 2;
        int i4 = height + i3;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i2 * i4) + i2);
        int i5 = i2 / 4;
        int i6 = (((width + 7) / 8) * 8) / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        this.i420TextureFrameBuffer.setSize(i5, i4);
        GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setPlaneY();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, 0, i6, height);
        this.shaderCallbacks.setPlaneU();
        int i7 = i6 / 2;
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, height, i7, i3);
        this.shaderCallbacks.setPlaneV();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, i5 / 2, height, i7, i3);
        GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, nativeAllocateByteBuffer);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            org_webrtc_YuvConverter_com_ss_android_ugc_aweme_lancet_LogLancet_e("YUVConverter", "error: ".concat(String.valueOf(glGetError)));
            RXLogging.e("YUVConverter", "convert i420 failed as opengl error ".concat(String.valueOf(glGetError)));
            if (1285 == glGetError || 1282 == glGetError) {
                if (nativeAllocateByteBuffer != null) {
                    JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                }
                MethodCollector.o(10236);
                return null;
            }
            RuntimeException runtimeException = new RuntimeException("YuvConverter.convert: GLES20 error: ".concat(String.valueOf(glGetError)));
            MethodCollector.o(10236);
            throw runtimeException;
        }
        GLES20.glBindFramebuffer(36160, 0);
        int i8 = (i2 * height) + 0;
        int i9 = i2 / 2;
        int i10 = i8 + i9;
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i8);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i8);
        int i11 = ((i3 - 1) * i2) + i9;
        nativeAllocateByteBuffer.limit(i8 + i11);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i10);
        nativeAllocateByteBuffer.limit(i10 + i11);
        JavaI420Buffer wrap = JavaI420Buffer.wrap(width, height, slice, i2, slice2, i2, nativeAllocateByteBuffer.slice(), i2, new YuvConverter$$Lambda$0(nativeAllocateByteBuffer));
        MethodCollector.o(10236);
        return wrap;
    }
}
