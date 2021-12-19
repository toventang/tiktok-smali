package com.ss.android.ugc.aweme.utils;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.tools.utils.h;
import java.util.concurrent.ExecutorService;

public final class it {

    /* renamed from: a  reason: collision with root package name */
    private static it f143113a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f143114b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f143115c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private LruCache<String, Bitmap> f143116d = new LruCache<String, Bitmap>(this.f143118f / 5) {
        /* class com.ss.android.ugc.aweme.utils.it.AnonymousClass1 */

        static {
            Covode.recordClassIndex(93683);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public final /* synthetic */ int sizeOf(String str, Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            return bitmap2.getRowBytes() * bitmap2.getHeight();
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private String f143117e = c.f115622a.getCacheDir().getPath();

    /* renamed from: f  reason: collision with root package name */
    private int f143118f = ((int) Runtime.getRuntime().totalMemory());

    static {
        Covode.recordClassIndex(93682);
    }

    public static it a() {
        if (f143113a == null) {
            f143113a = new it();
        }
        return f143113a;
    }

    private it() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 4;
        this.f143114b = g.a(a2.a());
    }

    public static Bitmap a(String str) {
        String a2 = h.a(i.f115645a, str);
        if (!com.ss.android.ugc.tools.utils.i.a(a2)) {
            return null;
        }
        return ThumbnailUtils.extractThumbnail(ThumbnailUtils.createVideoThumbnail(a2, 1), 90, 110, 2);
    }
}
