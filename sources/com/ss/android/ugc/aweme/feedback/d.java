package com.ss.android.ugc.aweme.feedback;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.c;
import h.f.b.l;
import java.io.File;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f95386a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(60404);
    }

    private static String a() {
        File a2 = e.a(b());
        if (a2 == null) {
            return "";
        }
        String path = a2.getPath();
        l.b(path, "");
        return path;
    }

    private static String b() {
        return "feedback" + File.separator + "upload";
    }

    public static void a(int i2) {
        if (i2 > 0) {
            e.e(a());
        }
    }

    public static String a(String str, File file, int i2) {
        MethodCollector.i(7750);
        l.d(str, "");
        l.d(file, "");
        int min = Math.min(i2, 720);
        if (min > 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                if (options.outWidth > min) {
                    options.inSampleSize = c.a(options, min, (options.outHeight * min) / options.outWidth);
                    options.inJustDecodeBounds = false;
                    Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                    l.b(decodeFile, "");
                    Bitmap rotateBitmap = BitmapUtils.rotateBitmap(decodeFile, BitmapUtils.readPictureDegree(str));
                    l.b(rotateBitmap, "");
                    if (rotateBitmap != null) {
                        String a2 = a();
                        if (BitmapUtils.saveBitmapToSD(rotateBitmap, a2, file.getName())) {
                            str = a2 + File.separator + file.getName();
                        }
                        rotateBitmap.recycle();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        MethodCollector.o(7750);
        return str;
    }
}
