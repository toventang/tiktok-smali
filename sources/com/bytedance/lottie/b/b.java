package com.bytedance.lottie.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.c;
import com.bytedance.lottie.j;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f40461d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f40462a;

    /* renamed from: b  reason: collision with root package name */
    public c f40463b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f40464c = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private String f40465e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, j> f40466f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f40467g;

    static {
        Covode.recordClassIndex(24870);
    }

    public final void a() {
        MethodCollector.i(1609);
        this.f40467g.removeMessages(1);
        synchronized (f40461d) {
            try {
                for (Map.Entry<String, j> entry : this.f40466f.entrySet()) {
                    j value = entry.getValue();
                    Bitmap bitmap = value.f40801g;
                    if (bitmap != null) {
                        bitmap.recycle();
                        value.f40801g = null;
                    }
                }
            } finally {
                MethodCollector.o(1609);
            }
        }
    }

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<b> f40468a;

        static {
            Covode.recordClassIndex(24871);
        }

        public final void handleMessage(Message message) {
            b bVar;
            super.handleMessage(message);
            if (message.what == 1 && (bVar = this.f40468a.get()) != null) {
                bVar.a();
            }
        }

        a(b bVar, Looper looper) {
            super(looper);
            this.f40468a = new WeakReference<>(bVar);
        }
    }

    public final Bitmap a(String str) {
        MethodCollector.i(1601);
        j jVar = this.f40466f.get(str);
        if (jVar == null) {
            MethodCollector.o(1601);
            return null;
        }
        Bitmap bitmap = jVar.f40801g;
        if (bitmap != null) {
            MethodCollector.o(1601);
            return bitmap;
        }
        c cVar = this.f40463b;
        if (cVar != null) {
            cVar.b();
            MethodCollector.o(1601);
            return null;
        }
        String str2 = jVar.f40798d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f40465e)) {
                    Bitmap a2 = a(str, BitmapFactory.decodeStream(this.f40462a.getAssets().open(this.f40465e + str2), null, options));
                    MethodCollector.o(1601);
                    return a2;
                }
                IllegalStateException illegalStateException = new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                MethodCollector.o(1601);
                throw illegalStateException;
            } catch (IOException unused) {
                MethodCollector.o(1601);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap a3 = a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                MethodCollector.o(1601);
                return a3;
            } catch (IllegalArgumentException unused2) {
                MethodCollector.o(1601);
                return null;
            }
        }
    }

    private Bitmap a(String str, Bitmap bitmap) {
        MethodCollector.i(1611);
        synchronized (f40461d) {
            try {
                if (!this.f40464c.contains(str)) {
                    this.f40466f.get(str).f40801g = bitmap;
                }
            } finally {
                MethodCollector.o(1611);
            }
        }
        return bitmap;
    }

    public b(Drawable.Callback callback, String str, c cVar, Map<String, j> map) {
        this.f40465e = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f40465e;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f40465e += '/';
            }
        }
        if (!(callback instanceof View)) {
            this.f40466f = new HashMap();
            this.f40462a = null;
            return;
        }
        this.f40462a = ((View) callback).getContext();
        this.f40466f = map;
        this.f40463b = cVar;
        this.f40467g = new a(this, Looper.getMainLooper());
    }
}
