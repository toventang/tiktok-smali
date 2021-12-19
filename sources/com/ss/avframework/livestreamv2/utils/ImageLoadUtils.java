package com.ss.avframework.livestreamv2.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImageLoadUtils {
    public static boolean isSampleSizeRound;
    public static int maxSide = 4096;

    public static int UpAlignPo2(int i2, int i3) {
        return ((i2 + i3) - 1) & ((i3 - 1) ^ -1);
    }

    public static int com_ss_avframework_livestreamv2_utils_ImageLoadUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public enum ImageRotation {
        INVALID(-1),
        ROTATION_0(0),
        ROTATION_90(90),
        ROTATION_180(LiveFeedRefreshTimeSetting.DEFAULT),
        ROTATION_270(270);
        
        private int value;

        public final int getRotation() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100490);
        }

        private ImageRotation(int i2) {
            this.value = i2;
        }
    }

    static {
        Covode.recordClassIndex(100489);
    }

    private static Bitmap makeDimensionEven(Bitmap bitmap) {
        boolean z;
        MethodCollector.i(13936);
        if (bitmap == null) {
            MethodCollector.o(13936);
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z2 = true;
            if ((bitmap.getWidth() & 1) == 1) {
                width = bitmap.getWidth() - 1;
                z = true;
            } else {
                z = false;
            }
            if ((bitmap.getHeight() & 1) == 1) {
                height = bitmap.getHeight() - 1;
            } else {
                z2 = z;
            }
            if (!z2) {
                MethodCollector.o(13936);
                return bitmap;
            } else if (width <= 0 || height <= 0) {
                MethodCollector.o(13936);
                return null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height);
                bitmap.recycle();
                MethodCollector.o(13936);
                return createBitmap;
            }
        } catch (OutOfMemoryError e2) {
            com_ss_avframework_livestreamv2_utils_ImageLoadUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e("makeDimensionEven", e2.getMessage());
            MethodCollector.o(13936);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0069, code lost:
        if (r4 == null) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getRotation(android.content.ContentResolver r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.utils.ImageLoadUtils.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i2, int i3) {
        return loadBitmapCompat(contentResolver, str, i2, i3, ImageRotation.INVALID, true);
    }

    public static Bitmap loadBitmapCompat(Context context, String str, int i2, int i3) {
        return loadBitmapCompat(context.getContentResolver(), str, i2, i3, ImageRotation.INVALID, true);
    }

    private static int calculateInSampleSize(ContentResolver contentResolver, String str, int i2, int i3) {
        MethodCollector.i(13886);
        if (i2 == -1 || i3 == -1) {
            MethodCollector.o(13886);
            return 1;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (!str.startsWith("content")) {
            BitmapFactory.decodeFile(str, options);
        } else {
            Uri parse = Uri.parse(str);
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (contentResolver == null) {
                try {
                    com_ss_avframework_livestreamv2_utils_ImageLoadUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e("ImageLoadUtils", "contentResolver should not be null after Android Q");
                    MethodCollector.o(13886);
                    return 1;
                } catch (FileNotFoundException e2) {
                    e2.printStackTrace();
                    if (0 != 0) {
                        parcelFileDescriptor.close();
                    }
                } catch (OutOfMemoryError e3) {
                    com_ss_avframework_livestreamv2_utils_ImageLoadUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e("loadBitmap", e3.getMessage());
                    if (0 != 0) {
                        parcelFileDescriptor.close();
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    MethodCollector.o(13886);
                    throw th;
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor == null) {
                    MethodCollector.o(13886);
                    return 1;
                }
                BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), new Rect(-1, -1, -1, -1), options);
                try {
                    openFileDescriptor.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        int i6 = 0;
        if (i3 <= i2) {
            i3 = i2;
            i2 = i3;
        }
        if (i4 > i5) {
            i5 = i4;
            i4 = i5;
        }
        if (i4 > i2 || i5 > i3) {
            float f2 = ((float) i5) / ((float) i3);
            float f3 = ((float) i4) / ((float) i2);
            if (isSampleSizeRound) {
                i6 = Math.round(Math.max(f3, f2));
                while (Math.max(i5, i4) / i6 > maxSide) {
                    i6 *= 2;
                }
            } else {
                i6 = (int) Math.max(f3, f2);
            }
        }
        int max = Math.max(1, i6);
        MethodCollector.o(13886);
        return max;
    }

    public static int[] calAutoScale(int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        int[] iArr = new int[2];
        if (i2 > 0 || i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (i6 == 90 || i6 == 270) {
            i5 = i4;
            i4 = i5;
        }
        if (z) {
            if (i2 <= 0) {
                i2 = (i3 * i4) / i5;
            }
            if (i3 <= 0) {
                i3 = (i5 * i2) / i4;
            }
            i4 = UpAlignPo2(i2, 2);
            i5 = UpAlignPo2(i3, 2);
        }
        if (i6 == 90 || i6 == 270) {
            i5 = i4;
            i4 = i5;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        return iArr;
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i2, int i3, ImageRotation imageRotation, boolean z) {
        return loadBitmapCompat(contentResolver, str, i2, i3, ImageRotation.INVALID, z, false);
    }

    public static Bitmap loadBitmap(String str, int i2, int i3, ImageRotation imageRotation, boolean z, boolean z2, boolean z3) {
        int i4;
        ExifInterface exifInterface;
        MethodCollector.i(13986);
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i2 > 0 && i3 > 0) {
            options.inSampleSize = calculateInSampleSize(null, str, i2, i3);
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile == null) {
                com_ss_avframework_livestreamv2_utils_ImageLoadUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e("loadBitmap", "BitmapFactory.decodeFile failed, imgPath".concat(String.valueOf(str)));
                MethodCollector.o(13986);
                return null;
            }
            if (z2) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, i2, i3, true);
                if (!createScaledBitmap.sameAs(decodeFile) && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createScaledBitmap;
            }
            if (imageRotation == ImageRotation.INVALID) {
                try {
                    exifInterface = new ExifInterface(str);
                } catch (IOException e2) {
                    e2.printStackTrace();
                    exifInterface = null;
                }
                if (exifInterface != null) {
                    int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
                    if (attributeInt == 3) {
                        i4 = LiveFeedRefreshTimeSetting.DEFAULT;
                    } else if (attributeInt == 6) {
                        i4 = 90;
                    } else if (attributeInt == 8) {
                        i4 = 270;
                    }
                }
                i4 = 0;
            } else {
                i4 = imageRotation.getRotation();
            }
            if (z3) {
                int[] calAutoScale = calAutoScale(i2, i3, decodeFile.getWidth(), decodeFile.getHeight(), i4);
                i2 = calAutoScale[0];
                i3 = calAutoScale[1];
            }
            if (z2) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeFile, i2, i3, true);
                if (!createScaledBitmap2.sameAs(decodeFile) && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createScaledBitmap2;
            }
            if (i4 != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i4);
                Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                if (!decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createBitmap;
            }
            if (z) {
                decodeFile = makeDimensionEven(decodeFile);
            }
            MethodCollector.o(13986);
            return decodeFile;
        } catch (OutOfMemoryError e3) {
            com_ss_avframework_livestreamv2_utils_ImageLoadUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e("loadBitmap", e3.getMessage());
            MethodCollector.o(13986);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090 A[SYNTHETIC, Splitter:B:31:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0117 A[SYNTHETIC, Splitter:B:68:0x0117] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadBitmapCompat(android.content.ContentResolver r15, java.lang.String r16, int r17, int r18, com.ss.avframework.livestreamv2.utils.ImageLoadUtils.ImageRotation r19, boolean r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.utils.ImageLoadUtils.loadBitmapCompat(android.content.ContentResolver, java.lang.String, int, int, com.ss.avframework.livestreamv2.utils.ImageLoadUtils$ImageRotation, boolean, boolean):android.graphics.Bitmap");
    }
}
