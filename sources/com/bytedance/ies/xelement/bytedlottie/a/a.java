package com.bytedance.ies.xelement.bytedlottie.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.m.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36804a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(22091);
    }

    public static Bitmap a(String str) {
        MethodCollector.i(9610);
        Bitmap bitmap = null;
        if (str == null) {
            MethodCollector.o(9610);
            return null;
        } else if (!p.b(str, "data:", false) || !p.b(str, "data:image/", false) || !p.a((CharSequence) str, (CharSequence) ";base64,", false)) {
            MethodCollector.o(9610);
            return null;
        } else {
            try {
                byte[] decode = Base64.decode(p.b(str, new String[]{","}).get(1), 0);
                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            } catch (Exception unused) {
            }
            MethodCollector.o(9610);
            return bitmap;
        }
    }
}
