package com.ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

public final class d {

    public interface a {
        static {
            Covode.recordClassIndex(73882);
        }

        void a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(73877);
    }

    public static UrlModel a(Uri uri) {
        if (uri == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(uri.toString());
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    public static boolean a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return false;
        }
        return true;
    }

    public static Bitmap a(Bitmap bitmap, int i2, int i3) {
        MethodCollector.i(9992);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i2) / ((float) width), ((float) i3) / ((float) height));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmap.recycle();
        MethodCollector.o(9992);
        return createBitmap;
    }
}
