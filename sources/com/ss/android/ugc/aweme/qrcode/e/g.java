package com.ss.android.ugc.aweme.qrcode.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import c.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import java.io.IOException;

public final class g {
    static {
        Covode.recordClassIndex(77799);
    }

    public static Bitmap a(View view) {
        Bitmap bitmap;
        MethodCollector.i(437);
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        if (view.getDrawingCache() != null) {
            bitmap = Bitmap.createBitmap(view.getDrawingCache());
        } else {
            bitmap = null;
        }
        MethodCollector.o(437);
        return bitmap;
    }

    public static Uri a(View view, String str, Context context) {
        MethodCollector.i(432);
        Bitmap a2 = a(view);
        if (a2 == null) {
            MethodCollector.o(432);
            return null;
        }
        view.setDrawingCacheEnabled(false);
        if (context == null) {
            context = d.a();
        }
        try {
            Uri a3 = e.a(context, str, "image/png");
            if (a3 != null) {
                a2.compress(Bitmap.CompressFormat.PNG, 100, context.getContentResolver().openOutputStream(a3));
                MethodCollector.o(432);
                return a3;
            }
            IOException iOException = new IOException();
            MethodCollector.o(432);
            throw iOException;
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(432);
            return null;
        }
    }
}
