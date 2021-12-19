package com.ss.android.ugc.aweme.infoSticker.customsticker.helper;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.tools.utils.h;
import h.f.b.l;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104669a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(67072);
    }

    private static String a() {
        String e2 = g.a().g().c().e("custom_sticker");
        if (!new File(e2).exists()) {
            new File(e2).mkdirs();
        }
        return e2;
    }

    public static int a(String str) {
        try {
            ExifInterface c2 = h.c(str);
            if (c2 == null) {
                return 0;
            }
            int attributeInt = c2.getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e2) {
            bj.b("readPictureDegree failed: " + e2.getMessage());
            return 0;
        }
    }

    private static String b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        l.b(instance, "");
        return simpleDateFormat.format(instance.getTime()) + str;
    }

    private static File a(Bitmap.CompressFormat compressFormat) {
        String str;
        String a2 = a();
        if (compressFormat == Bitmap.CompressFormat.PNG) {
            str = a2 + File.separator + b(".png");
        } else {
            str = a2 + File.separator + b(".jpg");
        }
        return new File(str);
    }

    private static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable th) {
                e.a("CutoutImageHelper#saveImageBitmap failed. Msg:" + th.getMessage());
            }
        }
    }

    public static final File a(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        l.d(compressFormat, "");
        if (bitmap == null) {
            return null;
        }
        File a2 = a(compressFormat);
        a(bitmap, a2, compressFormat);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return a2;
    }

    private static boolean a(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        Throwable th;
        Exception e2;
        MethodCollector.i(4676);
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                a((OutputStream) null);
                MethodCollector.o(4676);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, 80, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                a(bufferedOutputStream2);
            } catch (Exception e3) {
                e2 = e3;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    e.a("CutoutImageHelper#saveImageBitmap failed. Msg:" + e2.getMessage());
                    a(bufferedOutputStream);
                    MethodCollector.o(4676);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    a(bufferedOutputStream);
                    MethodCollector.o(4676);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                a(bufferedOutputStream);
                MethodCollector.o(4676);
                throw th;
            }
            MethodCollector.o(4676);
            return z;
        } catch (Exception e4) {
            e2 = e4;
            e.a("CutoutImageHelper#saveImageBitmap failed. Msg:" + e2.getMessage());
            a(bufferedOutputStream);
            MethodCollector.o(4676);
            return z;
        }
    }
}
