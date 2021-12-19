package com.bytedance.android.livesdk.utils;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;

public final class e {
    static {
        Covode.recordClassIndex(13178);
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, int i2) {
        if (i2 > 0) {
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int i3 = width * height;
            int[] iArr = new int[i3];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i4 = width - 1;
            int i5 = height - 1;
            int i6 = i2 + i2 + 1;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            int[] iArr4 = new int[i3];
            int[] iArr5 = new int[Math.max(width, height)];
            int i7 = (i6 + 1) >> 1;
            int i8 = i7 * i7;
            int i9 = i8 * 256;
            int[] iArr6 = new int[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                iArr6[i10] = i10 / i8;
            }
            int[] iArr7 = new int[2];
            iArr7[1] = 3;
            iArr7[0] = i6;
            int[][] iArr8 = (int[][]) Array.newInstance(int.class, iArr7);
            int i11 = i2 + 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < height; i14++) {
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                for (int i24 = -i2; i24 <= i2; i24++) {
                    int i25 = iArr[i12 + Math.min(i4, Math.max(i24, 0))];
                    int[] iArr9 = iArr8[i24 + i2];
                    iArr9[0] = (i25 & 16711680) >> 16;
                    iArr9[1] = (i25 & 65280) >> 8;
                    iArr9[2] = i25 & 255;
                    int abs = i11 - Math.abs(i24);
                    i23 += iArr9[0] * abs;
                    i15 += iArr9[1] * abs;
                    i16 += iArr9[2] * abs;
                    if (i24 > 0) {
                        i20 += iArr9[0];
                        i21 += iArr9[1];
                        i22 += iArr9[2];
                    } else {
                        i17 += iArr9[0];
                        i18 += iArr9[1];
                        i19 += iArr9[2];
                    }
                }
                int i26 = i2;
                for (int i27 = 0; i27 < width; i27++) {
                    iArr2[i12] = iArr6[i23];
                    iArr3[i12] = iArr6[i15];
                    iArr4[i12] = iArr6[i16];
                    int i28 = i23 - i17;
                    int i29 = i15 - i18;
                    int i30 = i16 - i19;
                    int[] iArr10 = iArr8[((i26 - i2) + i6) % i6];
                    int i31 = i17 - iArr10[0];
                    int i32 = i18 - iArr10[1];
                    int i33 = i19 - iArr10[2];
                    if (i14 == 0) {
                        iArr5[i27] = Math.min(i27 + i2 + 1, i4);
                    }
                    int i34 = iArr[i13 + iArr5[i27]];
                    iArr10[0] = (i34 & 16711680) >> 16;
                    iArr10[1] = (i34 & 65280) >> 8;
                    iArr10[2] = i34 & 255;
                    int i35 = i20 + iArr10[0];
                    int i36 = i21 + iArr10[1];
                    int i37 = i22 + iArr10[2];
                    i23 = i28 + i35;
                    i15 = i29 + i36;
                    i16 = i30 + i37;
                    i26 = (i26 + 1) % i6;
                    int[] iArr11 = iArr8[i26 % i6];
                    i17 = i31 + iArr11[0];
                    i18 = i32 + iArr11[1];
                    i19 = i33 + iArr11[2];
                    i20 = i35 - iArr11[0];
                    i21 = i36 - iArr11[1];
                    i22 = i37 - iArr11[2];
                    i12++;
                }
                i13 += width;
            }
            for (int i38 = 0; i38 < width; i38++) {
                int i39 = -i2;
                int i40 = i39 * width;
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                int i44 = 0;
                int i45 = 0;
                int i46 = 0;
                int i47 = 0;
                int i48 = 0;
                int i49 = 0;
                while (i39 <= i2) {
                    int max = Math.max(0, i40) + i38;
                    int[] iArr12 = iArr8[i39 + i2];
                    iArr12[0] = iArr2[max];
                    iArr12[1] = iArr3[max];
                    iArr12[2] = iArr4[max];
                    int abs2 = i11 - Math.abs(i39);
                    i48 += iArr2[max] * abs2;
                    i49 += iArr3[max] * abs2;
                    i41 += iArr4[max] * abs2;
                    if (i39 > 0) {
                        i45 += iArr12[0];
                        i46 += iArr12[1];
                        i47 += iArr12[2];
                    } else {
                        i42 += iArr12[0];
                        i43 += iArr12[1];
                        i44 += iArr12[2];
                    }
                    if (i39 < i5) {
                        i40 += width;
                    }
                    i39++;
                }
                int i50 = i2;
                int i51 = i38;
                for (int i52 = 0; i52 < height; i52++) {
                    iArr[i51] = (iArr[i51] & -16777216) | (iArr6[i48] << 16) | (iArr6[i49] << 8) | iArr6[i41];
                    int i53 = i48 - i42;
                    int i54 = i49 - i43;
                    int i55 = i41 - i44;
                    int[] iArr13 = iArr8[((i50 - i2) + i6) % i6];
                    int i56 = i42 - iArr13[0];
                    int i57 = i43 - iArr13[1];
                    int i58 = i44 - iArr13[2];
                    if (i38 == 0) {
                        iArr5[i52] = Math.min(i52 + i11, i5) * width;
                    }
                    int i59 = iArr5[i52] + i38;
                    iArr13[0] = iArr2[i59];
                    iArr13[1] = iArr3[i59];
                    iArr13[2] = iArr4[i59];
                    int i60 = i45 + iArr13[0];
                    int i61 = i46 + iArr13[1];
                    int i62 = i47 + iArr13[2];
                    i48 = i53 + i60;
                    i49 = i54 + i61;
                    i41 = i55 + i62;
                    i50 = (i50 + 1) % i6;
                    int[] iArr14 = iArr8[i50];
                    i42 = i56 + iArr14[0];
                    i43 = i57 + iArr14[1];
                    i44 = i58 + iArr14[2];
                    i45 = i60 - iArr14[0];
                    i46 = i61 - iArr14[1];
                    i47 = i62 - iArr14[2];
                    i51 += width;
                }
            }
            bitmap2.setPixels(iArr, 0, width, 0, 0, width, height);
        }
    }
}
