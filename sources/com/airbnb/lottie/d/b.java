package com.airbnb.lottie.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.c;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.h;
import com.airbnb.lottie.i.g;
import com.airbnb.lottie.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f5325c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f5326a;

    /* renamed from: b  reason: collision with root package name */
    public c f5327b;

    /* renamed from: d  reason: collision with root package name */
    private String f5328d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, h> f5329e;

    static {
        Covode.recordClassIndex(2238);
    }

    public final void a() {
        MethodCollector.i(5557);
        try {
            synchronized (f5325c) {
                try {
                    for (Map.Entry<String, h> entry : this.f5329e.entrySet()) {
                        h value = entry.getValue();
                        Bitmap bitmap = value.f5660g;
                        if (bitmap != null) {
                            bitmap.recycle();
                            value.f5660g = null;
                        }
                    }
                } finally {
                    MethodCollector.o(5557);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.o(5557);
        }
    }

    public final void b() {
        MethodCollector.i(5558);
        try {
            synchronized (f5325c) {
                try {
                    for (Map.Entry<String, h> entry : this.f5329e.entrySet()) {
                        h value = entry.getValue();
                        if (value.f5660g != null) {
                            value.f5660g = null;
                        }
                    }
                } finally {
                    MethodCollector.o(5558);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.o(5558);
        }
    }

    public final Bitmap a(String str) {
        Bitmap bitmap;
        MethodCollector.i(5554);
        h hVar = this.f5329e.get(str);
        if (hVar == null) {
            MethodCollector.o(5554);
            return null;
        }
        Bitmap bitmap2 = hVar.f5660g;
        if (bitmap2 != null) {
            MethodCollector.o(5554);
            return bitmap2;
        }
        hVar.f5661h = false;
        hVar.f5662i = false;
        if (d.a.f5625a && d.a.f5630f && d.e.f5651c) {
            int i2 = hVar.f5654a;
            int i3 = hVar.f5655b;
            if (i2 >= 32 && i3 >= 32) {
                hVar.f5662i = true;
            }
        }
        c cVar = this.f5327b;
        if (cVar != null) {
            Bitmap a2 = cVar.a(hVar);
            if (a2 != null) {
                a(str, a2);
            }
            MethodCollector.o(5554);
            return a2;
        }
        String str2 = hVar.f5657d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (TextUtils.isEmpty(this.f5328d)) {
                    j.a.a().a(new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder"));
                    MethodCollector.o(5554);
                    return null;
                }
                InputStream open = this.f5326a.getAssets().open(this.f5328d + str2);
                if (d.a.f5625a) {
                    if (hVar.f5662i) {
                        options.inSampleSize = 2;
                    }
                    try {
                        bitmap = g.a(BitmapFactory.decodeStream(open, null, options), hVar.f5654a, hVar.f5655b, hVar);
                    } catch (IllegalArgumentException e2) {
                        if (!d.f5620a) {
                            MethodCollector.o(5554);
                            return null;
                        }
                        MethodCollector.o(5554);
                        throw e2;
                    } catch (OutOfMemoryError e3) {
                        if (!d.f5620a) {
                            MethodCollector.o(5554);
                            return null;
                        }
                        MethodCollector.o(5554);
                        throw e3;
                    }
                } else {
                    bitmap = BitmapFactory.decodeStream(open, null, options);
                }
                Bitmap a3 = a(str, bitmap);
                MethodCollector.o(5554);
                return a3;
            } catch (IOException unused) {
                MethodCollector.o(5554);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap a4 = a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                MethodCollector.o(5554);
                return a4;
            } catch (IllegalArgumentException unused2) {
                MethodCollector.o(5554);
                return null;
            }
        }
    }

    private Bitmap a(String str, Bitmap bitmap) {
        MethodCollector.i(5562);
        synchronized (f5325c) {
            try {
                this.f5329e.get(str).f5660g = bitmap;
            } finally {
                MethodCollector.o(5562);
            }
        }
        return bitmap;
    }

    public b(Drawable.Callback callback, String str, c cVar, Map<String, h> map) {
        this.f5328d = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f5328d;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f5328d += '/';
            }
        }
        if (!(callback instanceof View)) {
            this.f5329e = new HashMap();
            this.f5326a = null;
            return;
        }
        this.f5326a = ((View) callback).getContext();
        this.f5329e = map;
        this.f5327b = cVar;
    }
}
