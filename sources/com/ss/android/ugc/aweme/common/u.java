package com.ss.android.ugc.aweme.common;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import h.f.b.l;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f76488a = new u();

    public enum a {
        PNG,
        WEBP,
        MP4;

        static {
            Covode.recordClassIndex(47236);
        }
    }

    private u() {
    }

    static {
        Covode.recordClassIndex(47235);
    }

    public static File a(Context context, Bitmap bitmap) {
        MethodCollector.i(1731);
        l.d(bitmap, "");
        File file = null;
        try {
            a aVar = a.WEBP;
            file = a(context, aVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            if (aVar == a.WEBP) {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 0, byteArrayOutputStream);
            } else {
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArray);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        MethodCollector.o(1731);
        return file;
    }

    public static File a(Context context, a aVar) {
        File file;
        Exception e2;
        l.d(aVar, "");
        StringBuilder sb = new StringBuilder();
        File file2 = null;
        if (context != null) {
            if (d.f107194b == null || !d.f107197e) {
                d.f107194b = context.getCacheDir();
            }
            file = d.f107194b;
        } else {
            file = null;
        }
        sb.append(file);
        sb.append(File.separator);
        sb.append(UUID.randomUUID());
        int i2 = v.f76490a[aVar.ordinal()];
        if (i2 == 1) {
            sb.append(".png");
        } else if (i2 == 2) {
            sb.append(".webp");
        } else if (i2 == 3) {
            sb.append(".mp4");
        }
        try {
            File file3 = new File(sb.toString());
            try {
                file3.createNewFile();
                return file3;
            } catch (Exception e3) {
                e2 = e3;
                file2 = file3;
            }
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            return file2;
        }
    }
}
