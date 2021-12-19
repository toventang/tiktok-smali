package com.facebook.h;

import com.bytedance.covode.number.Covode;
import com.facebook.common.e.a;
import com.facebook.imageutils.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f47621a = new c("JPEG", "jpeg");

    /* renamed from: b  reason: collision with root package name */
    public static final c f47622b = new c("PNG", "png");

    /* renamed from: c  reason: collision with root package name */
    public static final c f47623c = new c("GIF", "gif");

    /* renamed from: d  reason: collision with root package name */
    public static final c f47624d = new c("BMP", "bmp");

    /* renamed from: e  reason: collision with root package name */
    public static final c f47625e = new c("ICO", "ico");

    /* renamed from: f  reason: collision with root package name */
    public static final c f47626f = new c("WEBP_SIMPLE", "webp");

    /* renamed from: g  reason: collision with root package name */
    public static final c f47627g = new c("WEBP_LOSSLESS", "webp");

    /* renamed from: h  reason: collision with root package name */
    public static final c f47628h = new c("WEBP_EXTENDED", "webp");

    /* renamed from: i  reason: collision with root package name */
    public static final c f47629i = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");

    /* renamed from: j  reason: collision with root package name */
    public static final c f47630j = new c("WEBP_ANIMATED", "webp");

    /* renamed from: k  reason: collision with root package name */
    public static final c f47631k = new c("HEIF", "heif");

    /* renamed from: l  reason: collision with root package name */
    public static final c f47632l = null;

    static {
        Covode.recordClassIndex(28874);
    }

    public static boolean a(c cVar) {
        if (b(cVar) || cVar == f47630j) {
            return true;
        }
        return false;
    }

    public static boolean b(c cVar) {
        if (cVar == f47626f || cVar == f47627g || cVar == f47628h || cVar == f47629i) {
            return true;
        }
        return false;
    }

    public static boolean c(c cVar) {
        try {
            if (cVar == c.a()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            a.c("DefaultImageFormats", "isHeifFormat error", th);
            return false;
        }
    }
}
