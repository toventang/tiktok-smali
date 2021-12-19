package com.ss.avframework.opengl;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import com.bytedance.covode.number.Covode;

public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    public interface GlDrawer {
        static {
            Covode.recordClassIndex(100538);
        }

        void drawOes(int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int i8);

        void drawRgb(int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int i8);

        void drawYuv(int[] iArr, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void release();
    }

    public interface RendererEvents {
        static {
            Covode.recordClassIndex(100539);
        }

        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i2, int i3, int i4);
    }

    static {
        Covode.recordClassIndex(100536);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.opengl.RendererCommon$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$opengl$RendererCommon$ScalingType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 100537(0x188b9, float:1.40882E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.avframework.opengl.RendererCommon$ScalingType[] r0 = com.ss.avframework.opengl.RendererCommon.ScalingType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.avframework.opengl.RendererCommon.AnonymousClass1.$SwitchMap$com$ss$avframework$opengl$RendererCommon$ScalingType = r2
                com.ss.avframework.opengl.RendererCommon$ScalingType r0 = com.ss.avframework.opengl.RendererCommon.ScalingType.SCALE_ASPECT_FIT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.avframework.opengl.RendererCommon.AnonymousClass1.$SwitchMap$com$ss$avframework$opengl$RendererCommon$ScalingType     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.avframework.opengl.RendererCommon$ScalingType r0 = com.ss.avframework.opengl.RendererCommon.ScalingType.SCALE_ASPECT_FILL     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.avframework.opengl.RendererCommon.AnonymousClass1.$SwitchMap$com$ss$avframework$opengl$RendererCommon$ScalingType     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.avframework.opengl.RendererCommon$ScalingType r0 = com.ss.avframework.opengl.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.opengl.RendererCommon.AnonymousClass1.<clinit>():void");
        }
    }

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED;

        static {
            Covode.recordClassIndex(100540);
        }
    }

    public static final float[] horizontalFlipMatrix() {
        return new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final float[] identityMatrix() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final float[] verticalFlipMatrix() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    }

    public static class VideoLayoutMeasure {
        private ScalingType scalingTypeMatchOrientation = ScalingType.SCALE_ASPECT_BALANCED;
        private ScalingType scalingTypeMismatchOrientation = ScalingType.SCALE_ASPECT_BALANCED;

        static {
            Covode.recordClassIndex(100541);
        }

        public void setScalingType(ScalingType scalingType) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType2;
        }

        public Point measure(int i2, int i3, int i4, int i5) {
            boolean z;
            ScalingType scalingType;
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i2);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i3);
            if (i4 == 0 || i5 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f2 = ((float) i4) / ((float) i5);
            float f3 = ((float) defaultSize) / ((float) defaultSize2);
            boolean z2 = true;
            if (f2 > 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (f3 <= 1.0f) {
                z2 = false;
            }
            if (z == z2) {
                scalingType = this.scalingTypeMatchOrientation;
            } else {
                scalingType = this.scalingTypeMismatchOrientation;
            }
            Point displaySize = RendererCommon.getDisplaySize(scalingType, f2, defaultSize, defaultSize2);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                displaySize.x = defaultSize;
            }
            if (View.MeasureSpec.getMode(i3) == 1073741824) {
                displaySize.y = defaultSize2;
            }
            return displaySize;
        }
    }

    private static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int i2 = AnonymousClass1.$SwitchMap$com$ss$avframework$opengl$RendererCommon$ScalingType[scalingType.ordinal()];
        if (i2 == 1) {
            return 1.0f;
        }
        if (i2 == 2) {
            return 0.0f;
        }
        if (i2 == 3) {
            return BALANCED_VISIBLE_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    private static void adjustOrigin(float[] fArr) {
        fArr[12] = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[13] = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[12] = fArr[12] + 0.5f;
        fArr[13] = fArr[13] + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    public static float[] multiplyMatrices(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        android.opengl.Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        return fArr3;
    }

    public static float[] rotateTextureMatrix(float[] fArr, float f2) {
        float[] fArr2 = new float[16];
        android.opengl.Matrix.setRotateM(fArr2, 0, f2, 0.0f, 0.0f, 1.0f);
        adjustOrigin(fArr2);
        return multiplyMatrices(fArr, fArr2);
    }

    public static float[] getLayoutMatrix(boolean z, float f2, float f3) {
        float f4;
        float f5;
        if (f3 > f2) {
            f5 = f2 / f3;
            f4 = 1.0f;
        } else {
            f4 = f3 / f2;
            f5 = 1.0f;
        }
        if (z) {
            f4 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f4, f5, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(ScalingType scalingType, float f2, int i2, int i3) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f2, i2, i3);
    }

    private static Point getDisplaySize(float f2, float f3, int i2, int i3) {
        if (f2 == 0.0f || f3 == 0.0f) {
            return new Point(i2, i3);
        }
        return new Point(Math.min(i2, Math.round((((float) i3) / f2) * f3)), Math.min(i3, Math.round((((float) i2) / f2) / f3)));
    }

    public static void calcWindRatio(boolean z, boolean z2, boolean z3, int i2, int i3, int i4, int i5, float[] fArr) {
        float f2;
        float f3;
        float f4;
        float f5 = ((float) i4) / ((float) i5);
        float f6 = ((float) i2) / ((float) i3);
        if (!z ? f5 >= f6 : f5 <= f6) {
            f2 = f5 / f6;
            f3 = 1.0f;
        } else {
            f3 = f6 / f5;
            f2 = 1.0f;
        }
        float f7 = -1.0f;
        if (z2) {
            f4 = -1.0f;
        } else {
            f4 = 1.0f;
        }
        android.opengl.Matrix.scaleM(fArr, 0, f2 * f4, 1.0f, 1.0f);
        if (!z3) {
            f7 = 1.0f;
        }
        android.opengl.Matrix.scaleM(fArr, 0, 1.0f, f3 * f7, 1.0f);
    }
}
