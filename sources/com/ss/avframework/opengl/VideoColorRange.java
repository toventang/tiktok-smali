package com.ss.avframework.opengl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;

public class VideoColorRange {
    private static int Rgb2YuvFormulaColorRange = -1;
    private static int Yuv2RgbFormulaColorRange = -1;

    private static native int nativeCheckYuv2RgbFormulaColorRange(int i2);

    private static native int nativeCheckYuvFrameColorRange(ByteBuffer byteBuffer, int i2, int i3);

    static {
        Covode.recordClassIndex(100542);
    }

    public static int checkRgb2YuvFormulaColorRange() {
        int i2 = Rgb2YuvFormulaColorRange;
        if (i2 != -1) {
            return i2;
        }
        float[][] fArr = YuvConverter.RGB_TO_YUV_TRANSFORM_MATRIX;
        if (((fArr[0][0] * 1.0f) + (fArr[0][1] * 1.0f) + (fArr[0][2] * 1.0f) + fArr[0][3]) * 255.0f > 245.0f) {
            Rgb2YuvFormulaColorRange = 0;
        } else {
            Rgb2YuvFormulaColorRange = 1;
        }
        return Rgb2YuvFormulaColorRange;
    }

    public static int checkYuv2RgbFormulaColorRange(int i2) {
        MethodCollector.i(9551);
        if (Yuv2RgbFormulaColorRange == -1) {
            Yuv2RgbFormulaColorRange = nativeCheckYuv2RgbFormulaColorRange(i2);
        }
        int i3 = Yuv2RgbFormulaColorRange;
        MethodCollector.o(9551);
        return i3;
    }

    public static int checkYuvFrameColorRange(ByteBuffer byteBuffer, int i2, int i3) {
        MethodCollector.i(9381);
        if (byteBuffer == null || byteBuffer.capacity() < ((i2 * i3) * 3) / 2) {
            MethodCollector.o(9381);
            return -1;
        }
        if (!byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            allocateDirect.position(0);
            allocateDirect.put(byteBuffer);
            byteBuffer = allocateDirect;
        }
        int nativeCheckYuvFrameColorRange = nativeCheckYuvFrameColorRange(byteBuffer, i2, i3);
        MethodCollector.o(9381);
        return nativeCheckYuvFrameColorRange;
    }
}
