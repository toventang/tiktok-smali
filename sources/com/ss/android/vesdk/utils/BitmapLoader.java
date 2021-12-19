package com.ss.android.vesdk.utils;

import android.content.ContentResolver;
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
import com.ss.android.vesdk.aa;
import com.ss.android.vesdk.an;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BitmapLoader {
    public static boolean isSampleSizeRound;
    public static int maxSide = 4096;

    public static int UpAlignPo2(int i2, int i3) {
        return ((i2 + i3) - 1) & ((i3 - 1) ^ -1);
    }

    public enum a {
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
            Covode.recordClassIndex(99606);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    static {
        Covode.recordClassIndex(99605);
    }

    private static Bitmap makeDimensionEven(Bitmap bitmap) {
        boolean z;
        MethodCollector.i(47);
        if (bitmap == null) {
            MethodCollector.o(47);
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
                MethodCollector.o(47);
                return bitmap;
            } else if (width <= 0 || height <= 0) {
                MethodCollector.o(47);
                return null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height);
                bitmap.recycle();
                MethodCollector.o(47);
                return createBitmap;
            }
        } catch (OutOfMemoryError e2) {
            e2.getMessage();
            MethodCollector.o(47);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[SYNTHETIC, Splitter:B:40:0x007d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point getPictureSize(android.content.ContentResolver r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.getPictureSize(android.content.ContentResolver, java.lang.String):android.graphics.Point");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0074, code lost:
        if (r4 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getRotation(android.content.ContentResolver r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static Bitmap loadBitmap(String str, int i2, int i3) {
        return loadBitmap(str, i2, i3, a.INVALID, true);
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i2, int i3) {
        return loadBitmapCompat(contentResolver, str, i2, i3, a.INVALID, true);
    }

    private static int calculateInSampleSize(ContentResolver contentResolver, String str, int i2, int i3) {
        MethodCollector.i(55);
        if (i2 == -1 || i3 == -1) {
            MethodCollector.o(55);
            return 1;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (!aa.d(str)) {
            BitmapFactory.decodeFile(str, options);
        } else {
            Uri parse = Uri.parse(str);
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (contentResolver == null) {
                try {
                    an.d("BitmapLoader", "contentResolver should not be null after Android Q");
                    MethodCollector.o(55);
                    return 1;
                } catch (FileNotFoundException e2) {
                    e2.printStackTrace();
                    if (0 != 0) {
                        parcelFileDescriptor.close();
                    }
                } catch (OutOfMemoryError e3) {
                    e3.getMessage();
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
                    MethodCollector.o(55);
                    throw th;
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor == null) {
                    MethodCollector.o(55);
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
        MethodCollector.o(55);
        return max;
    }

    public static Bitmap loadBitmap(String str, int i2, int i3, a aVar, boolean z) {
        return loadBitmap(str, i2, i3, a.INVALID, true, false);
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

    public static Bitmap loadBitmap(String str, int i2, int i3, a aVar, boolean z, boolean z2) {
        return loadBitmap(str, i2, i3, a.INVALID, z, z2, false);
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i2, int i3, a aVar, boolean z) {
        return loadBitmapCompat(contentResolver, str, i2, i3, a.INVALID, true, false);
    }

    public static Bitmap loadBitmap(String str, int i2, int i3, a aVar, boolean z, boolean z2, boolean z3) {
        int i4;
        ExifInterface exifInterface;
        MethodCollector.i(37);
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i2 > 0 && i3 > 0) {
            options.inSampleSize = calculateInSampleSize(null, str, i2, i3);
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile == null) {
                MethodCollector.o(37);
                return null;
            }
            if (aVar == a.INVALID) {
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
                i4 = aVar.getRotation();
            }
            if (z3) {
                int[] calAutoScale = calAutoScale(i2, i3, decodeFile.getWidth(), decodeFile.getHeight(), i4);
                i2 = calAutoScale[0];
                i3 = calAutoScale[1];
            }
            if (z2) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, i2, i3, true);
                if (!createScaledBitmap.sameAs(decodeFile) && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createScaledBitmap;
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
            MethodCollector.o(37);
            return decodeFile;
        } catch (OutOfMemoryError e3) {
            e3.getMessage();
            MethodCollector.o(37);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060 A[SYNTHETIC, Splitter:B:30:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d5 A[SYNTHETIC, Splitter:B:67:0x00d5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadBitmapCompat(android.content.ContentResolver r9, java.lang.String r10, int r11, int r12, com.ss.android.vesdk.utils.BitmapLoader.a r13, boolean r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.loadBitmapCompat(android.content.ContentResolver, java.lang.String, int, int, com.ss.android.vesdk.utils.BitmapLoader$a, boolean, boolean):android.graphics.Bitmap");
    }
}
